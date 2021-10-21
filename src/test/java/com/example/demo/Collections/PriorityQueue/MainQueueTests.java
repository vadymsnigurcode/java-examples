package com.example.demo.Collections.PriorityQueue;

import org.junit.jupiter.api.Test;

public class MainQueueTests {

    @Test
    public void testPriorityHelpDesk() {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);
        helpDesk.processAllEnquiries();
    }

}
