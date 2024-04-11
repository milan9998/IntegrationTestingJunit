public class InvoiceService {
    private PrinterServiceInterface printerService = null;
    public EmailServiceInterface emailService = null;

    public InvoiceService(PrinterServiceInterface printerService, EmailServiceInterface emailService) {
        this.printerService = printerService;
        this.emailService = emailService;
    }

    public void handleInvoice(Invoice invoice, CustomerInterface customer) {
        if (customer.prefersEmail()) {
            emailService.sendInvoice(invoice, customer.getEmail());
        } else {
            printerService.printInvoice(invoice);
        }

    }
}
