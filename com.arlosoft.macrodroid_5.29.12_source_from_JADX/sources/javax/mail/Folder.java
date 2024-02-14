package javax.mail;

import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Vector;
import java.util.concurrent.Executor;
import javax.mail.Flags;
import javax.mail.event.ConnectionEvent;
import javax.mail.event.ConnectionListener;
import javax.mail.event.FolderEvent;
import javax.mail.event.FolderListener;
import javax.mail.event.MailEvent;
import javax.mail.event.MessageChangedEvent;
import javax.mail.event.MessageChangedListener;
import javax.mail.event.MessageCountEvent;
import javax.mail.event.MessageCountListener;
import javax.mail.search.SearchTerm;

public abstract class Folder implements AutoCloseable {
    public static final int HOLDS_FOLDERS = 2;
    public static final int HOLDS_MESSAGES = 1;
    public static final int READ_ONLY = 1;
    public static final int READ_WRITE = 2;
    private volatile Vector<ConnectionListener> connectionListeners = null;
    private volatile Vector<FolderListener> folderListeners = null;
    private volatile Vector<MessageChangedListener> messageChangedListeners = null;
    private volatile Vector<MessageCountListener> messageCountListeners = null;
    protected int mode = -1;

    /* renamed from: q */
    private final EventQueue f61336q;
    protected Store store;

    protected Folder(Store store2) {
        this.store = store2;
        Session session = store2.getSession();
        String property = session.getProperties().getProperty("mail.event.scope", "folder");
        Executor executor = (Executor) session.getProperties().get("mail.event.executor");
        if (property.equalsIgnoreCase("application")) {
            this.f61336q = EventQueue.getApplicationEventQueue(executor);
        } else if (property.equalsIgnoreCase("session")) {
            this.f61336q = session.getEventQueue();
        } else if (property.equalsIgnoreCase("store")) {
            this.f61336q = store2.getEventQueue();
        } else {
            this.f61336q = new EventQueue(executor);
        }
    }

    private void queueEvent(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        this.f61336q.enqueue(mailEvent, (Vector) vector.clone());
    }

    public synchronized void addConnectionListener(ConnectionListener connectionListener) {
        if (this.connectionListeners == null) {
            this.connectionListeners = new Vector<>();
        }
        this.connectionListeners.addElement(connectionListener);
    }

    public synchronized void addFolderListener(FolderListener folderListener) {
        if (this.folderListeners == null) {
            this.folderListeners = new Vector<>();
        }
        this.folderListeners.addElement(folderListener);
    }

    public synchronized void addMessageChangedListener(MessageChangedListener messageChangedListener) {
        if (this.messageChangedListeners == null) {
            this.messageChangedListeners = new Vector<>();
        }
        this.messageChangedListeners.addElement(messageChangedListener);
    }

    public synchronized void addMessageCountListener(MessageCountListener messageCountListener) {
        if (this.messageCountListeners == null) {
            this.messageCountListeners = new Vector<>();
        }
        this.messageCountListeners.addElement(messageCountListener);
    }

    public abstract void appendMessages(Message[] messageArr) throws MessagingException;

    public void close() throws MessagingException {
        close(true);
    }

    public abstract void close(boolean z) throws MessagingException;

    public void copyMessages(Message[] messageArr, Folder folder) throws MessagingException {
        if (folder.exists()) {
            folder.appendMessages(messageArr);
            return;
        }
        throw new FolderNotFoundException(folder.getFullName() + " does not exist", folder);
    }

    public abstract boolean create(int i) throws MessagingException;

    public abstract boolean delete(boolean z) throws MessagingException;

    public abstract boolean exists() throws MessagingException;

    public abstract Message[] expunge() throws MessagingException;

    public void fetch(Message[] messageArr, FetchProfile fetchProfile) throws MessagingException {
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            this.f61336q.terminateQueue();
        } finally {
            super.finalize();
        }
    }

    public synchronized int getDeletedMessageCount() throws MessagingException {
        if (!isOpen()) {
            return -1;
        }
        int i = 0;
        int messageCount = getMessageCount();
        for (int i2 = 1; i2 <= messageCount; i2++) {
            try {
                if (getMessage(i2).isSet(Flags.Flag.DELETED)) {
                    i++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i;
    }

    public abstract Folder getFolder(String str) throws MessagingException;

    public abstract String getFullName();

    public abstract Message getMessage(int i) throws MessagingException;

    public abstract int getMessageCount() throws MessagingException;

    public synchronized Message[] getMessages(int i, int i2) throws MessagingException {
        Message[] messageArr;
        messageArr = new Message[((i2 - i) + 1)];
        for (int i3 = i; i3 <= i2; i3++) {
            messageArr[i3 - i] = getMessage(i3);
        }
        return messageArr;
    }

    public synchronized int getMode() {
        if (isOpen()) {
        } else {
            throw new IllegalStateException("Folder not open");
        }
        return this.mode;
    }

    public abstract String getName();

    public synchronized int getNewMessageCount() throws MessagingException {
        if (!isOpen()) {
            return -1;
        }
        int i = 0;
        int messageCount = getMessageCount();
        for (int i2 = 1; i2 <= messageCount; i2++) {
            try {
                if (getMessage(i2).isSet(Flags.Flag.RECENT)) {
                    i++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i;
    }

    public abstract Folder getParent() throws MessagingException;

    public abstract Flags getPermanentFlags();

    public abstract char getSeparator() throws MessagingException;

    public Store getStore() {
        return this.store;
    }

    public abstract int getType() throws MessagingException;

    public URLName getURLName() throws MessagingException {
        URLName uRLName = getStore().getURLName();
        String fullName = getFullName();
        StringBuilder sb = new StringBuilder();
        if (fullName != null) {
            sb.append(fullName);
        }
        return new URLName(uRLName.getProtocol(), uRLName.getHost(), uRLName.getPort(), sb.toString(), uRLName.getUsername(), (String) null);
    }

    public synchronized int getUnreadMessageCount() throws MessagingException {
        if (!isOpen()) {
            return -1;
        }
        int i = 0;
        int messageCount = getMessageCount();
        for (int i2 = 1; i2 <= messageCount; i2++) {
            try {
                if (!getMessage(i2).isSet(Flags.Flag.SEEN)) {
                    i++;
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return i;
    }

    public abstract boolean hasNewMessages() throws MessagingException;

    public abstract boolean isOpen();

    public boolean isSubscribed() {
        return true;
    }

    public Folder[] list() throws MessagingException {
        return list(TaskerPlugin.VARIABLE_PREFIX);
    }

    public abstract Folder[] list(String str) throws MessagingException;

    public Folder[] listSubscribed(String str) throws MessagingException {
        return list(str);
    }

    /* access modifiers changed from: protected */
    public void notifyConnectionListeners(int i) {
        if (this.connectionListeners != null) {
            queueEvent(new ConnectionEvent(this, i), this.connectionListeners);
        }
        if (i == 3) {
            this.f61336q.terminateQueue();
        }
    }

    /* access modifiers changed from: protected */
    public void notifyFolderListeners(int i) {
        if (this.folderListeners != null) {
            queueEvent(new FolderEvent(this, this, i), this.folderListeners);
        }
        this.store.notifyFolderListeners(i, this);
    }

    /* access modifiers changed from: protected */
    public void notifyFolderRenamedListeners(Folder folder) {
        if (this.folderListeners != null) {
            queueEvent(new FolderEvent(this, this, folder, 3), this.folderListeners);
        }
        this.store.notifyFolderRenamedListeners(this, folder);
    }

    /* access modifiers changed from: protected */
    public void notifyMessageAddedListeners(Message[] messageArr) {
        if (this.messageCountListeners != null) {
            queueEvent(new MessageCountEvent(this, 1, false, messageArr), this.messageCountListeners);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyMessageChangedListeners(int i, Message message) {
        if (this.messageChangedListeners != null) {
            queueEvent(new MessageChangedEvent(this, i, message), this.messageChangedListeners);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyMessageRemovedListeners(boolean z, Message[] messageArr) {
        if (this.messageCountListeners != null) {
            queueEvent(new MessageCountEvent(this, 2, z, messageArr), this.messageCountListeners);
        }
    }

    public abstract void open(int i) throws MessagingException;

    public synchronized void removeConnectionListener(ConnectionListener connectionListener) {
        if (this.connectionListeners != null) {
            this.connectionListeners.removeElement(connectionListener);
        }
    }

    public synchronized void removeFolderListener(FolderListener folderListener) {
        if (this.folderListeners != null) {
            this.folderListeners.removeElement(folderListener);
        }
    }

    public synchronized void removeMessageChangedListener(MessageChangedListener messageChangedListener) {
        if (this.messageChangedListeners != null) {
            this.messageChangedListeners.removeElement(messageChangedListener);
        }
    }

    public synchronized void removeMessageCountListener(MessageCountListener messageCountListener) {
        if (this.messageCountListeners != null) {
            this.messageCountListeners.removeElement(messageCountListener);
        }
    }

    public abstract boolean renameTo(Folder folder) throws MessagingException;

    public Message[] search(SearchTerm searchTerm) throws MessagingException {
        return search(searchTerm, getMessages());
    }

    public synchronized void setFlags(Message[] messageArr, Flags flags, boolean z) throws MessagingException {
        for (int i = 0; i < messageArr.length; i++) {
            try {
                messageArr[i].setFlags(flags, z);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    public void setSubscribed(boolean z) throws MessagingException {
        throw new MethodNotSupportedException();
    }

    public String toString() {
        String fullName = getFullName();
        if (fullName != null) {
            return fullName;
        }
        return super.toString();
    }

    public Folder[] listSubscribed() throws MessagingException {
        return listSubscribed(TaskerPlugin.VARIABLE_PREFIX);
    }

    public Message[] search(SearchTerm searchTerm, Message[] messageArr) throws MessagingException {
        ArrayList arrayList = new ArrayList();
        for (Message message : messageArr) {
            try {
                if (message.match(searchTerm)) {
                    arrayList.add(message);
                }
            } catch (MessageRemovedException unused) {
            }
        }
        return (Message[]) arrayList.toArray(new Message[arrayList.size()]);
    }

    public synchronized Message[] getMessages(int[] iArr) throws MessagingException {
        Message[] messageArr;
        int length = iArr.length;
        messageArr = new Message[length];
        for (int i = 0; i < length; i++) {
            messageArr[i] = getMessage(iArr[i]);
        }
        return messageArr;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setFlags(int r2, int r3, javax.mail.Flags r4, boolean r5) throws javax.mail.MessagingException {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            if (r2 > r3) goto L_0x0011
            javax.mail.Message r0 = r1.getMessage(r2)     // Catch:{ MessageRemovedException -> 0x000e, all -> 0x000b }
            r0.setFlags(r4, r5)     // Catch:{ MessageRemovedException -> 0x000e, all -> 0x000b }
            goto L_0x000e
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000e:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x0011:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Folder.setFlags(int, int, javax.mail.Flags, boolean):void");
    }

    public synchronized void setFlags(int[] iArr, Flags flags, boolean z) throws MessagingException {
        for (int i = 0; i < iArr.length; i++) {
            try {
                getMessage(iArr[i]).setFlags(flags, z);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    public synchronized Message[] getMessages() throws MessagingException {
        Message[] messageArr;
        if (isOpen()) {
            int messageCount = getMessageCount();
            messageArr = new Message[messageCount];
            for (int i = 1; i <= messageCount; i++) {
                messageArr[i - 1] = getMessage(i);
            }
        } else {
            throw new IllegalStateException("Folder not open");
        }
        return messageArr;
    }
}
