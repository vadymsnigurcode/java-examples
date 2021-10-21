package com.example.demo.Collections.PriorityQueue;

import com.example.demo.lambda.Predicate6.Predicate;

import java.util.ArrayDeque;
import java.util.Queue;

public class CategorizedHelpDesk {

    private Queue<Enquiry> enquiries = new ArrayDeque<>();

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

}
