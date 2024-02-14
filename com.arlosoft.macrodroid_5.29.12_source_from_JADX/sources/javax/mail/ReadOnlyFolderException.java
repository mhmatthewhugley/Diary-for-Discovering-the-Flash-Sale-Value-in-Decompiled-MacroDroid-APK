package javax.mail;

public class ReadOnlyFolderException extends MessagingException {
    private static final long serialVersionUID = 5711829372799039325L;
    private transient Folder folder;

    public ReadOnlyFolderException(Folder folder2) {
        this(folder2, (String) null);
    }

    public Folder getFolder() {
        return this.folder;
    }

    public ReadOnlyFolderException(Folder folder2, String str) {
        super(str);
        this.folder = folder2;
    }

    public ReadOnlyFolderException(Folder folder2, String str, Exception exc) {
        super(str, exc);
        this.folder = folder2;
    }
}
