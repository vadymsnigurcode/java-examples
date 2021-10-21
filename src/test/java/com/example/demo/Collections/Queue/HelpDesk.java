package com.example.demo.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category)
    {
        enquiries.offer(new Enquiry(customer,category));
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
