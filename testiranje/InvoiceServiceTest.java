import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {

    private InvoiceService invoiceService = null;
    private CustomerInterface customer = null;
    private Invoice invoice = null;
    private EmailServiceInterface emailService = null;
    private PrinterServiceInterface printerService = null;


    @Before
    public void setup() {
        customer = new CustomerStub();
        invoice = new Invoice();
        emailService = new EmailServiceStub();
        printerService = new PrinterServiceStub();
        invoiceService = new InvoiceService(printerService, emailService);


    }

    @Test
    public void testHandleInvoiceEmail() {
        customer.wantsEmail(true);
        invoiceService.handleInvoice(invoice, customer);
        Assert.assertFalse(printerService.anInvoiceWasPrinted());
        Assert.assertTrue(emailService.anInvoiceWasEmailed());
    }
    @Test
    public void testHandleInvoicePrinted(){

        customer.wantsEmail(false);
        invoiceService.handleInvoice(invoice,customer);
        Assert.assertFalse(emailService.anInvoiceWasEmailed());
        Assert.assertTrue(printerService.anInvoiceWasPrinted());
    }
}


