public class EmailServiceStub implements EmailServiceInterface{
    boolean anInvoiceWasSent= false;

    @Override
    public boolean isEmailConfigured() {
        return true;
    }

    @Override
    public void sendInvoice(Invoice invoice, String email) {
        anInvoiceWasSent= true;
    }

    @Override
    public boolean anInvoiceWasEmailed() {
        return anInvoiceWasSent;
    }
}
