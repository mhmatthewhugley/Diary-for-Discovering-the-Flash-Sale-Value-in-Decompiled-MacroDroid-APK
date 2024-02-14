package javax.mail;

public class FolderClosedException extends MessagingException {
    private static final long serialVersionUID = 1687879213433302315L;
    private transient Folder folder;

    public FolderClosedException(Folder folder2) {
        this(folder2, (String) null);
    }

    public Folder getFolder() {
        return this.folder;
    }

    public FolderClosedException(Folder folder2, String str) {
        super(str);
        this.folder = folder2;
    }

    public FolderClosedException(Folder folder2, String str, Exception exc) {
        super(str, exc);
        this.folder = folder2;
    }
}
