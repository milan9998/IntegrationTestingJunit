public interface PrinterServiceInterface {
    boolean isPrinterConfigured();
    boolean anInvoiceWasPrinted();
    void printInvoice(Invoice invoice);

}
