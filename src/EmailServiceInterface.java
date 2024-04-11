public interface EmailServiceInterface {
    boolean isEmailConfigured();

    void sendInvoice(Invoice invoice, String email);

    boolean anInvoiceWasEmailed();
}
