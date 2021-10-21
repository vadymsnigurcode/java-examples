package com.example.demo.Collections.Queue;

import org.junit.jupiter.api.Test;

public class MainQueueTests {

    @Test
    public void testHelpDesk() {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.processAllEnquiries();
    }

    @Test
    public void testCategorizedHelpDesk() {
        CategorizedHelpDesk categorizedHelpDesk = new CategorizedHelpDesk();

        categorizedHelpDesk.enquire(Customer.JACK, Category.PHONE);
        categorizedHelpDesk.enquire(Customer.JILL, Category.PRINTER);
        categorizedHelpDesk.processPrinterEnquiry();
        categorizedHelpDesk.processGeneralEnquiry();
        categorizedHelpDesk.processPrinterEnquiry();
    }

    @Test
    public void testCategorizedHelpDeskByPredicate() {
        CategorizedHelpDesk categorizedHelpDesk = new CategorizedHelpDesk();

        categorizedHelpDesk.enquire(Customer.JACK, Category.PHONE);
        categorizedHelpDesk.enquire(Customer.JILL, Category.PRINTER);
        categorizedHelpDesk.processPrinterEnquiryByPredicate();
        categorizedHelpDesk.processGeneralEnquiryByPredicate();
        categorizedHelpDesk.processPrinterEnquiryByPredicate();
    }
}
