package com.example.demo.Collections.PriorityQueue;

import com.example.demo.lambda.Predicate6.Predicate;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY
            = new Comparator<Enquiry>() {
        public int compare(final Enquiry o1, final Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public boolean enquire(final Customer customer, final Category type)
    {
        return enquiries.offer(new Enquiry(customer,type));
    }

    public void processPrinterEnquiry()
    {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() == Category.PRINTER)
        {
            enquiries.remove();
            enquiry.getCustomer().reply("Is it out of paper?");
        }
        else
        {
            System.out.println("No work to do, let's have some coffee!");
        }
    }
    public void processGeneralEnquiry()
    {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() != Category.PRINTER)
        {
            enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off an on again?");
        }
        else
        {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processGeneralEnquiryByPredicate()
    {
        Predicate<Enquiry> predicate = enq-> enq.getCategory()!= Category.PRINTER;
        String message = "Have you tried turning it off an on again?";

        processEnquiry(predicate, message);
    }

    public void processPrinterEnquiryByPredicate()
    {

        processEnquiry(enq-> enq.getCategory()== Category.PRINTER, "Is it out of paper?");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processAllEnquiries()
    {
        // first way
//        while (!enquiries.isEmpty()) {
//            final Enquiry enquiry = enquiries.remove();
//            enquiry.getCustomer().reply("Have you tried turning it off an on again?");
//        }
        // second way

        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off an on again?");
        }
    }
}
