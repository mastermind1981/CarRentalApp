package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Invoice;

/**
 * Created by student on 2015/05/05.
 */
public class InvoiceFactory {
    public static Invoice createInvoice(long invoiceNumber, int amountPaid, int amountOwed){
        Invoice invoice = new Invoice
                .Builder(invoiceNumber)
                .amountOwed(amountOwed)
                .amountPaid(amountPaid)
                .build();
        return invoice;

    }
}
