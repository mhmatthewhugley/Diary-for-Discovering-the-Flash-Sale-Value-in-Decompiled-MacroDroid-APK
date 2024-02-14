package p208a8;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;

/* renamed from: a8.b */
/* compiled from: DefaultFolder */
public class C11061b extends Folder {
    C11061b(C11067h hVar) {
        super(hVar);
    }

    public void appendMessages(Message[] messageArr) throws MessagingException {
        throw new MethodNotSupportedException("Append not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Folder mo62052b() throws MessagingException {
        return getStore().getFolder("INBOX");
    }

    public void close(boolean z) throws MessagingException {
        throw new MethodNotSupportedException("close");
    }

    public boolean create(int i) throws MessagingException {
        return false;
    }

    public boolean delete(boolean z) throws MessagingException {
        throw new MethodNotSupportedException("delete");
    }

    public boolean exists() {
        return true;
    }

    public Message[] expunge() throws MessagingException {
        throw new MethodNotSupportedException("expunge");
    }

    public Folder getFolder(String str) throws MessagingException {
        if (str.equalsIgnoreCase("INBOX")) {
            return mo62052b();
        }
        throw new MessagingException("only INBOX supported");
    }

    public String getFullName() {
        return "";
    }

    public Message getMessage(int i) throws MessagingException {
        throw new MethodNotSupportedException("getMessage");
    }

    public int getMessageCount() throws MessagingException {
        return 0;
    }

    public String getName() {
        return "";
    }

    public Folder getParent() {
        return null;
    }

    public Flags getPermanentFlags() {
        return new Flags();
    }

    public char getSeparator() {
        return '/';
    }

    public int getType() {
        return 2;
    }

    public boolean hasNewMessages() throws MessagingException {
        return false;
    }

    public boolean isOpen() {
        return false;
    }

    public Folder[] list(String str) throws MessagingException {
        return new Folder[]{mo62052b()};
    }

    public void open(int i) throws MessagingException {
        throw new MethodNotSupportedException("open");
    }

    public boolean renameTo(Folder folder) throws MessagingException {
        throw new MethodNotSupportedException("renameTo");
    }
}
