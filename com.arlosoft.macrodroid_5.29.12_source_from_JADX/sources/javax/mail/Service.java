package javax.mail;

import java.util.EventListener;
import java.util.Vector;
import javax.mail.event.ConnectionEvent;
import javax.mail.event.ConnectionListener;
import javax.mail.event.MailEvent;

public abstract class Service implements AutoCloseable {
    private boolean connected = false;
    private final Vector<ConnectionListener> connectionListeners = new Vector<>();
    protected boolean debug = false;

    /* renamed from: q */
    private final EventQueue f61339q;
    /* access modifiers changed from: protected */
    public Session session;
    protected volatile URLName url = null;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected Service(javax.mail.Session r10, javax.mail.URLName r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.url = r0
            r1 = 0
            r9.debug = r1
            r9.connected = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r9.connectionListeners = r1
            r9.session = r10
            boolean r1 = r10.getDebug()
            r9.debug = r1
            r9.url = r11
            javax.mail.URLName r11 = r9.url
            if (r11 == 0) goto L_0x004a
            javax.mail.URLName r11 = r9.url
            java.lang.String r0 = r11.getProtocol()
            javax.mail.URLName r11 = r9.url
            java.lang.String r11 = r11.getHost()
            javax.mail.URLName r1 = r9.url
            int r1 = r1.getPort()
            javax.mail.URLName r2 = r9.url
            java.lang.String r2 = r2.getUsername()
            javax.mail.URLName r3 = r9.url
            java.lang.String r3 = r3.getPassword()
            javax.mail.URLName r4 = r9.url
            java.lang.String r4 = r4.getFile()
            r5 = r1
            r8 = r3
            r6 = r4
            r3 = r0
            r0 = r11
            goto L_0x0050
        L_0x004a:
            r1 = -1
            r2 = r0
            r3 = r2
            r6 = r3
            r8 = r6
            r5 = -1
        L_0x0050:
            if (r3 == 0) goto L_0x0088
            java.lang.String r11 = "mail."
            if (r0 != 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r1 = ".host"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r10.getProperty(r0)
        L_0x006e:
            if (r2 != 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r3)
            java.lang.String r11 = ".user"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r2 = r10.getProperty(r11)
        L_0x0088:
            if (r0 != 0) goto L_0x0092
            java.lang.String r11 = "mail.host"
            java.lang.String r11 = r10.getProperty(r11)
            r4 = r11
            goto L_0x0093
        L_0x0092:
            r4 = r0
        L_0x0093:
            if (r2 != 0) goto L_0x009b
            java.lang.String r11 = "mail.user"
            java.lang.String r2 = r10.getProperty(r11)
        L_0x009b:
            if (r2 != 0) goto L_0x00a5
            java.lang.String r11 = "user.name"
            java.lang.String r11 = java.lang.System.getProperty(r11)     // Catch:{ SecurityException -> 0x00a5 }
            r7 = r11
            goto L_0x00a6
        L_0x00a5:
            r7 = r2
        L_0x00a6:
            javax.mail.URLName r11 = new javax.mail.URLName
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.url = r11
            java.util.Properties r11 = r10.getProperties()
            java.lang.String r0 = "mail.event.scope"
            java.lang.String r1 = "folder"
            java.lang.String r11 = r11.getProperty(r0, r1)
            java.util.Properties r0 = r10.getProperties()
            java.lang.String r1 = "mail.event.executor"
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            java.lang.String r1 = "application"
            boolean r1 = r11.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00d5
            javax.mail.EventQueue r10 = javax.mail.EventQueue.getApplicationEventQueue(r0)
            r9.f61339q = r10
            goto L_0x00eb
        L_0x00d5:
            java.lang.String r1 = "session"
            boolean r11 = r11.equalsIgnoreCase(r1)
            if (r11 == 0) goto L_0x00e4
            javax.mail.EventQueue r10 = r10.getEventQueue()
            r9.f61339q = r10
            goto L_0x00eb
        L_0x00e4:
            javax.mail.EventQueue r10 = new javax.mail.EventQueue
            r10.<init>(r0)
            r9.f61339q = r10
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Service.<init>(javax.mail.Session, javax.mail.URLName):void");
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        this.connectionListeners.addElement(connectionListener);
    }

    public synchronized void close() throws MessagingException {
        setConnected(false);
        notifyConnectionListeners(3);
    }

    public void connect() throws MessagingException {
        connect((String) null, (String) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            this.f61339q.terminateQueue();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public EventQueue getEventQueue() {
        return this.f61339q;
    }

    /* access modifiers changed from: package-private */
    public Session getSession() {
        return this.session;
    }

    public URLName getURLName() {
        URLName uRLName = this.url;
        return (uRLName == null || (uRLName.getPassword() == null && uRLName.getFile() == null)) ? uRLName : new URLName(uRLName.getProtocol(), uRLName.getHost(), uRLName.getPort(), (String) null, uRLName.getUsername(), (String) null);
    }

    public synchronized boolean isConnected() {
        return this.connected;
    }

    /* access modifiers changed from: protected */
    public void notifyConnectionListeners(int i) {
        if (this.connectionListeners.size() > 0) {
            queueEvent(new ConnectionEvent(this, i), this.connectionListeners);
        }
        if (i == 3) {
            this.f61339q.terminateQueue();
        }
    }

    /* access modifiers changed from: protected */
    public boolean protocolConnect(String str, int i, String str2, String str3) throws MessagingException {
        return false;
    }

    /* access modifiers changed from: protected */
    public void queueEvent(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        this.f61339q.enqueue(mailEvent, (Vector) vector.clone());
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.connectionListeners.removeElement(connectionListener);
    }

    /* access modifiers changed from: protected */
    public synchronized void setConnected(boolean z) {
        this.connected = z;
    }

    /* access modifiers changed from: protected */
    public void setURLName(URLName uRLName) {
        this.url = uRLName;
    }

    public String toString() {
        URLName uRLName = getURLName();
        if (uRLName != null) {
            return uRLName.toString();
        }
        return super.toString();
    }

    public void connect(String str, String str2, String str3) throws MessagingException {
        connect(str, -1, str2, str3);
    }

    public void connect(String str, String str2) throws MessagingException {
        connect((String) null, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x011b A[SYNTHETIC, Splitter:B:61:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void connect(java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21) throws javax.mail.MessagingException {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            monitor-enter(r17)
            boolean r2 = r17.isConnected()     // Catch:{ all -> 0x018a }
            if (r2 != 0) goto L_0x0182
            javax.mail.URLName r2 = r1.url     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x0060
            javax.mail.URLName r2 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r2 = r2.getProtocol()     // Catch:{ all -> 0x018a }
            if (r18 != 0) goto L_0x001e
            javax.mail.URLName r4 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r4 = r4.getHost()     // Catch:{ all -> 0x018a }
            goto L_0x0020
        L_0x001e:
            r4 = r18
        L_0x0020:
            r5 = -1
            r6 = r19
            if (r6 != r5) goto L_0x002c
            javax.mail.URLName r5 = r1.url     // Catch:{ all -> 0x018a }
            int r5 = r5.getPort()     // Catch:{ all -> 0x018a }
            goto L_0x002d
        L_0x002c:
            r5 = r6
        L_0x002d:
            if (r0 != 0) goto L_0x003e
            javax.mail.URLName r0 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r0.getUsername()     // Catch:{ all -> 0x018a }
            if (r21 != 0) goto L_0x0053
            javax.mail.URLName r6 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r6 = r6.getPassword()     // Catch:{ all -> 0x018a }
            goto L_0x0055
        L_0x003e:
            if (r21 != 0) goto L_0x0053
            javax.mail.URLName r6 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r6 = r6.getUsername()     // Catch:{ all -> 0x018a }
            boolean r6 = r0.equals(r6)     // Catch:{ all -> 0x018a }
            if (r6 == 0) goto L_0x0053
            javax.mail.URLName r6 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r6 = r6.getPassword()     // Catch:{ all -> 0x018a }
            goto L_0x0055
        L_0x0053:
            r6 = r21
        L_0x0055:
            javax.mail.URLName r7 = r1.url     // Catch:{ all -> 0x018a }
            java.lang.String r7 = r7.getFile()     // Catch:{ all -> 0x018a }
            r13 = r2
            r2 = r5
            r12 = r6
            r14 = r7
            goto L_0x0069
        L_0x0060:
            r6 = r19
            r4 = r18
            r12 = r21
            r2 = r6
            r13 = 0
            r14 = 0
        L_0x0069:
            if (r13 == 0) goto L_0x00a7
            if (r4 != 0) goto L_0x0089
            javax.mail.Session r4 = r1.session     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r5.<init>()     // Catch:{ all -> 0x018a }
            java.lang.String r6 = "mail."
            r5.append(r6)     // Catch:{ all -> 0x018a }
            r5.append(r13)     // Catch:{ all -> 0x018a }
            java.lang.String r6 = ".host"
            r5.append(r6)     // Catch:{ all -> 0x018a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x018a }
            java.lang.String r4 = r4.getProperty(r5)     // Catch:{ all -> 0x018a }
        L_0x0089:
            if (r0 != 0) goto L_0x00a7
            javax.mail.Session r0 = r1.session     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r5.<init>()     // Catch:{ all -> 0x018a }
            java.lang.String r6 = "mail."
            r5.append(r6)     // Catch:{ all -> 0x018a }
            r5.append(r13)     // Catch:{ all -> 0x018a }
            java.lang.String r6 = ".user"
            r5.append(r6)     // Catch:{ all -> 0x018a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r0.getProperty(r5)     // Catch:{ all -> 0x018a }
        L_0x00a7:
            if (r4 != 0) goto L_0x00b1
            javax.mail.Session r4 = r1.session     // Catch:{ all -> 0x018a }
            java.lang.String r5 = "mail.host"
            java.lang.String r4 = r4.getProperty(r5)     // Catch:{ all -> 0x018a }
        L_0x00b1:
            if (r0 != 0) goto L_0x00bb
            javax.mail.Session r0 = r1.session     // Catch:{ all -> 0x018a }
            java.lang.String r5 = "mail.user"
            java.lang.String r0 = r0.getProperty(r5)     // Catch:{ all -> 0x018a }
        L_0x00bb:
            if (r0 != 0) goto L_0x00c5
            java.lang.String r5 = "user.name"
            java.lang.String r0 = java.lang.System.getProperty(r5)     // Catch:{ SecurityException -> 0x00c4 }
            goto L_0x00c5
        L_0x00c4:
        L_0x00c5:
            r11 = 1
            if (r12 != 0) goto L_0x010a
            javax.mail.URLName r5 = r1.url     // Catch:{ all -> 0x018a }
            if (r5 == 0) goto L_0x010a
            javax.mail.URLName r10 = new javax.mail.URLName     // Catch:{ all -> 0x018a }
            r16 = 0
            r5 = r10
            r6 = r13
            r7 = r4
            r8 = r2
            r9 = r14
            r3 = r10
            r10 = r0
            r15 = 1
            r11 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x018a }
            r1.setURLName(r3)     // Catch:{ all -> 0x018a }
            javax.mail.Session r3 = r1.session     // Catch:{ all -> 0x018a }
            javax.mail.URLName r5 = r17.getURLName()     // Catch:{ all -> 0x018a }
            javax.mail.PasswordAuthentication r3 = r3.getPasswordAuthentication(r5)     // Catch:{ all -> 0x018a }
            if (r3 == 0) goto L_0x0106
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = r3.getUserName()     // Catch:{ all -> 0x018a }
            java.lang.String r12 = r3.getPassword()     // Catch:{ all -> 0x018a }
            goto L_0x010b
        L_0x00f7:
            java.lang.String r5 = r3.getUserName()     // Catch:{ all -> 0x018a }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x018a }
            if (r5 == 0) goto L_0x010b
            java.lang.String r12 = r3.getPassword()     // Catch:{ all -> 0x018a }
            goto L_0x010b
        L_0x0106:
            r3 = r0
            r11 = r12
            r12 = 1
            goto L_0x010e
        L_0x010a:
            r15 = 1
        L_0x010b:
            r3 = r0
            r11 = r12
            r12 = 0
        L_0x010e:
            boolean r0 = r1.protocolConnect(r4, r2, r3, r11)     // Catch:{ AuthenticationFailedException -> 0x0115 }
            r16 = 0
            goto L_0x0119
        L_0x0115:
            r0 = move-exception
            r16 = r0
            r0 = 0
        L_0x0119:
            if (r0 != 0) goto L_0x013a
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r4)     // Catch:{ UnknownHostException -> 0x0121 }
            r6 = r5
            goto L_0x0122
        L_0x0121:
            r6 = 0
        L_0x0122:
            javax.mail.Session r5 = r1.session     // Catch:{ all -> 0x018a }
            r9 = 0
            r7 = r2
            r8 = r13
            r10 = r3
            javax.mail.PasswordAuthentication r5 = r5.requestPasswordAuthentication(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x018a }
            if (r5 == 0) goto L_0x013a
            java.lang.String r3 = r5.getUserName()     // Catch:{ all -> 0x018a }
            java.lang.String r11 = r5.getPassword()     // Catch:{ all -> 0x018a }
            boolean r0 = r1.protocolConnect(r4, r2, r3, r11)     // Catch:{ all -> 0x018a }
        L_0x013a:
            if (r0 != 0) goto L_0x015b
            if (r16 != 0) goto L_0x015a
            if (r3 == 0) goto L_0x0152
            if (r11 != 0) goto L_0x014a
            javax.mail.AuthenticationFailedException r0 = new javax.mail.AuthenticationFailedException     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "failed to connect, no password specified?"
            r0.<init>(r2)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x014a:
            javax.mail.AuthenticationFailedException r0 = new javax.mail.AuthenticationFailedException     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "failed to connect"
            r0.<init>(r2)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x0152:
            javax.mail.AuthenticationFailedException r0 = new javax.mail.AuthenticationFailedException     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "failed to connect, no user name specified?"
            r0.<init>(r2)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x015a:
            throw r16     // Catch:{ all -> 0x018a }
        L_0x015b:
            javax.mail.URLName r0 = new javax.mail.URLName     // Catch:{ all -> 0x018a }
            r5 = r0
            r6 = r13
            r7 = r4
            r8 = r2
            r9 = r14
            r10 = r3
            r2 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x018a }
            r1.setURLName(r0)     // Catch:{ all -> 0x018a }
            if (r12 == 0) goto L_0x017a
            javax.mail.Session r0 = r1.session     // Catch:{ all -> 0x018a }
            javax.mail.URLName r4 = r17.getURLName()     // Catch:{ all -> 0x018a }
            javax.mail.PasswordAuthentication r5 = new javax.mail.PasswordAuthentication     // Catch:{ all -> 0x018a }
            r5.<init>(r3, r2)     // Catch:{ all -> 0x018a }
            r0.setPasswordAuthentication(r4, r5)     // Catch:{ all -> 0x018a }
        L_0x017a:
            r1.setConnected(r15)     // Catch:{ all -> 0x018a }
            r1.notifyConnectionListeners(r15)     // Catch:{ all -> 0x018a }
            monitor-exit(r17)
            return
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "already connected"
            r0.<init>(r2)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Service.connect(java.lang.String, int, java.lang.String, java.lang.String):void");
    }
}
