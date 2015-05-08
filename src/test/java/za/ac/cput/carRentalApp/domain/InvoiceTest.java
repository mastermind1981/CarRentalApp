package za.ac.cput.carRentalApp.domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.InvoiceFactory;

/**
 * Created by student on 2015/04/26.
 */
public class InvoiceTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void creatInvoice() throws Exception {
        long invoiceNumber  = 0;
        int amountPaid = 0;
        int amountOwed = 0;

        Invoice invoice = InvoiceFactory.createInvoice(invoiceNumber, amountPaid, amountOwed);
        Assert.assertEquals(15 , invoice.getAmountOwed());
    }

    @Test
    public void updateInvoice() throws Exception {
        long invoiceNumber  = 0;
        int amountPaid = 0;
        int amountOwed = 0;

        Invoice invoice = InvoiceFactory
                .createInvoice(invoiceNumber, amountPaid, amountOwed);

        Invoice invoice1 = new Invoice
                .Builder(invoiceNumber)
                .amountOwed(amountOwed)
                .amountPaid(amountPaid)
                .build();

        Assert.assertEquals(15 , invoice1.getAmountOwed());

    }

    @After
    public void tearDown() throws Exception {


    }
}
