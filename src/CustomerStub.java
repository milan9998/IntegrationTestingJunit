
public class CustomerStub implements CustomerInterface{
    private boolean prefersEmail;


    @Override
    public boolean prefersEmail() {
        return prefersEmail;
    }

    @Override
    public void wantsEmail(boolean wantsEmail) {
        this.prefersEmail = wantsEmail;

    }

    @Override
    public String getEmail() {
        return "pronicmilan@gmail.com";
    }
}
