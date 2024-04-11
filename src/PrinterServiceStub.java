public class PrinterServiceStub implements PrinterServiceInterface{

    boolean anInvoiceWasPrinted= false;
    @Override
    public boolean isPrinterConfigured() {
        return false;
    }

    @Override
    public boolean anInvoiceWasPrinted() {

        return anInvoiceWasPrinted;
    }

    @Override
    public void printInvoice(Invoice invoice) {
        anInvoiceWasPrinted = true;

    }
}
