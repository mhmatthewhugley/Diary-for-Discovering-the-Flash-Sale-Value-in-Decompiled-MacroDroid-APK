package javax.mail;

public class StoreClosedException extends MessagingException {
    private static final long serialVersionUID = -3145392336120082655L;
    private transient Store store;

    public StoreClosedException(Store store2) {
        this(store2, (String) null);
    }

    public Store getStore() {
        return this.store;
    }

    public StoreClosedException(Store store2, String str) {
        super(str);
        this.store = store2;
    }

    public StoreClosedException(Store store2, String str, Exception exc) {
        super(str, exc);
        this.store = store2;
    }
}
