package p208a8;

import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.util.logging.Level;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderNotFoundException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;

/* renamed from: a8.c */
/* compiled from: POP3Folder */
public class C11062c extends Folder {

    /* renamed from: A */
    private volatile C11076l f53908A = null;

    /* renamed from: B */
    private boolean f53909B;

    /* renamed from: C */
    MailLogger f53910C;

    /* renamed from: a */
    private String f53911a;

    /* renamed from: c */
    private C11067h f53912c;

    /* renamed from: d */
    private volatile C11068i f53913d;

    /* renamed from: f */
    private int f53914f;

    /* renamed from: g */
    private int f53915g;

    /* renamed from: o */
    private boolean f53916o = false;

    /* renamed from: p */
    private volatile boolean f53917p = false;

    /* renamed from: s */
    private C11063d[] f53918s;

    /* renamed from: z */
    private boolean f53919z = false;

    protected C11062c(C11067h hVar, String str) {
        super(hVar);
        this.f53911a = str;
        this.f53912c = hVar;
        if (str.equalsIgnoreCase("INBOX")) {
            this.f53916o = true;
        }
        this.f53910C = new MailLogger(getClass(), "DEBUG POP3", hVar.getSession().getDebug(), hVar.getSession().getDebugOut());
    }

    /* renamed from: b */
    private void m74547b() throws IllegalStateException {
        if (this.f53917p) {
            throw new IllegalStateException("Folder is Open");
        }
    }

    /* renamed from: c */
    private void m74548c() throws IllegalStateException {
        if (!this.f53917p) {
            throw new IllegalStateException("Folder is not Open");
        }
    }

    /* renamed from: e */
    private void m74549e() throws IllegalStateException {
        int i;
        if (!this.f53917p || !((i = this.mode) == 1 || i == 2)) {
            throw new IllegalStateException("Folder is not Readable");
        }
    }

    public void appendMessages(Message[] messageArr) throws MessagingException {
        throw new MethodNotSupportedException("Append not supported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        r5.f53913d = null;
        r5.f53912c.mo62099f(r5);
        r5.f53918s = null;
        r5.f53917p = false;
        notifyConnectionListeners(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        if (r5.f53908A != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        r5.f53908A.mo62139a();
        r5.f53908A = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009b, code lost:
        throw r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081 A[Catch:{ IOException -> 0x003b, all -> 0x0081, IOException -> 0x009c, all -> 0x0081 }, ExcHandler: all (r6v5 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:4:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void close(boolean r6) throws javax.mail.MessagingException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m74548c()     // Catch:{ all -> 0x00b6 }
            r0 = 3
            r1 = 0
            r2 = 0
            a8.h r3 = r5.f53912c     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            boolean r3 = r3.f53931G     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r5.f53909B     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r3 != 0) goto L_0x0016
            a8.i r3 = r5.f53913d     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            r3.mo62116Q()     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
        L_0x0016:
            if (r6 == 0) goto L_0x0047
            int r6 = r5.mode     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            r3 = 2
            if (r6 != r3) goto L_0x0047
            boolean r6 = r5.f53909B     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r6 != 0) goto L_0x0047
            r6 = 0
        L_0x0022:
            a8.d[] r3 = r5.f53918s     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            int r4 = r3.length     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r6 >= r4) goto L_0x0047
            r3 = r3[r6]     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r3 == 0) goto L_0x0044
            javax.mail.Flags$Flag r4 = javax.mail.Flags.Flag.DELETED     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            boolean r3 = r3.isSet(r4)     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r3 == 0) goto L_0x0044
            a8.i r3 = r5.f53913d     // Catch:{ IOException -> 0x003b, all -> 0x0081 }
            int r4 = r6 + 1
            r3.mo62128r(r4)     // Catch:{ IOException -> 0x003b, all -> 0x0081 }
            goto L_0x0044
        L_0x003b:
            r6 = move-exception
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            java.lang.String r4 = "Exception deleting messages during close"
            r3.<init>(r4, r6)     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            throw r3     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
        L_0x0044:
            int r6 = r6 + 1
            goto L_0x0022
        L_0x0047:
            r6 = 0
        L_0x0048:
            a8.d[] r3 = r5.f53918s     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            int r4 = r3.length     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r6 >= r4) goto L_0x0058
            r3 = r3[r6]     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r3 == 0) goto L_0x0055
            r4 = 1
            r3.mo62080b(r4)     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x0048
        L_0x0058:
            boolean r6 = r5.f53909B     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            if (r6 == 0) goto L_0x0062
            a8.i r6 = r5.f53913d     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            r6.mo62127q()     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            goto L_0x0067
        L_0x0062:
            a8.i r6 = r5.f53913d     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
            r6.mo62113K()     // Catch:{ IOException -> 0x009c, all -> 0x0081 }
        L_0x0067:
            r5.f53913d = r2     // Catch:{ all -> 0x00b6 }
            a8.h r6 = r5.f53912c     // Catch:{ all -> 0x00b6 }
            r6.mo62099f(r5)     // Catch:{ all -> 0x00b6 }
            r5.f53918s = r2     // Catch:{ all -> 0x00b6 }
            r5.f53917p = r1     // Catch:{ all -> 0x00b6 }
            r5.notifyConnectionListeners(r0)     // Catch:{ all -> 0x00b6 }
            a8.l r6 = r5.f53908A     // Catch:{ all -> 0x00b6 }
            if (r6 == 0) goto L_0x00b4
            a8.l r6 = r5.f53908A     // Catch:{ all -> 0x00b6 }
            r6.mo62139a()     // Catch:{ all -> 0x00b6 }
        L_0x007e:
            r5.f53908A = r2     // Catch:{ all -> 0x00b6 }
            goto L_0x00b4
        L_0x0081:
            r6 = move-exception
            r5.f53913d = r2     // Catch:{ all -> 0x00b6 }
            a8.h r3 = r5.f53912c     // Catch:{ all -> 0x00b6 }
            r3.mo62099f(r5)     // Catch:{ all -> 0x00b6 }
            r5.f53918s = r2     // Catch:{ all -> 0x00b6 }
            r5.f53917p = r1     // Catch:{ all -> 0x00b6 }
            r5.notifyConnectionListeners(r0)     // Catch:{ all -> 0x00b6 }
            a8.l r0 = r5.f53908A     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009b
            a8.l r0 = r5.f53908A     // Catch:{ all -> 0x00b6 }
            r0.mo62139a()     // Catch:{ all -> 0x00b6 }
            r5.f53908A = r2     // Catch:{ all -> 0x00b6 }
        L_0x009b:
            throw r6     // Catch:{ all -> 0x00b6 }
        L_0x009c:
            r5.f53913d = r2     // Catch:{ all -> 0x00b6 }
            a8.h r6 = r5.f53912c     // Catch:{ all -> 0x00b6 }
            r6.mo62099f(r5)     // Catch:{ all -> 0x00b6 }
            r5.f53918s = r2     // Catch:{ all -> 0x00b6 }
            r5.f53917p = r1     // Catch:{ all -> 0x00b6 }
            r5.notifyConnectionListeners(r0)     // Catch:{ all -> 0x00b6 }
            a8.l r6 = r5.f53908A     // Catch:{ all -> 0x00b6 }
            if (r6 == 0) goto L_0x00b4
            a8.l r6 = r5.f53908A     // Catch:{ all -> 0x00b6 }
            r6.mo62139a()     // Catch:{ all -> 0x00b6 }
            goto L_0x007e
        L_0x00b4:
            monitor-exit(r5)
            return
        L_0x00b6:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11062c.close(boolean):void");
    }

    public boolean create(int i) throws MessagingException {
        return false;
    }

    public boolean delete(boolean z) throws MessagingException {
        throw new MethodNotSupportedException("delete");
    }

    public boolean exists() {
        return this.f53916o;
    }

    public Message[] expunge() throws MessagingException {
        throw new MethodNotSupportedException("Expunge not supported");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p208a8.C11063d mo62072f(javax.mail.Folder r4, int r5) throws javax.mail.MessagingException {
        /*
            r3 = this;
            a8.h r4 = r3.f53912c
            java.lang.reflect.Constructor<?> r4 = r4.f53930F
            if (r4 == 0) goto L_0x001a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x001a }
            r1 = 0
            r0[r1] = r3     // Catch:{ Exception -> 0x001a }
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x001a }
            r0[r1] = r2     // Catch:{ Exception -> 0x001a }
            java.lang.Object r4 = r4.newInstance(r0)     // Catch:{ Exception -> 0x001a }
            a8.d r4 = (p208a8.C11063d) r4     // Catch:{ Exception -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != 0) goto L_0x0022
            a8.d r4 = new a8.d
            r4.<init>(r3, r5)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11062c.mo62072f(javax.mail.Folder, int):a8.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void fetch(javax.mail.Message[] r7, javax.mail.FetchProfile r8) throws javax.mail.MessagingException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.m74549e()     // Catch:{ all -> 0x0074 }
            boolean r0 = r6.f53919z     // Catch:{ all -> 0x0074 }
            r1 = 0
            if (r0 != 0) goto L_0x0058
            a8.h r0 = r6.f53912c     // Catch:{ all -> 0x0074 }
            boolean r0 = r0.f53934J     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0058
            javax.mail.UIDFolder$FetchProfileItem r0 = javax.mail.UIDFolder.FetchProfileItem.UID     // Catch:{ all -> 0x0074 }
            boolean r0 = r8.contains((javax.mail.FetchProfile.Item) r0)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0058
            a8.d[] r0 = r6.f53918s     // Catch:{ all -> 0x0074 }
            int r0 = r0.length     // Catch:{ all -> 0x0074 }
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0074 }
            a8.i r3 = r6.f53913d     // Catch:{ EOFException -> 0x004a, IOException -> 0x0041 }
            boolean r3 = r3.mo62123d0(r2)     // Catch:{ EOFException -> 0x004a, IOException -> 0x0041 }
            if (r3 != 0) goto L_0x0026
            monitor-exit(r6)
            return
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 >= r0) goto L_0x003d
            r4 = r2[r3]     // Catch:{ all -> 0x0074 }
            if (r4 != 0) goto L_0x002e
            goto L_0x003a
        L_0x002e:
            int r4 = r3 + 1
            javax.mail.Message r4 = r6.getMessage(r4)     // Catch:{ all -> 0x0074 }
            a8.d r4 = (p208a8.C11063d) r4     // Catch:{ all -> 0x0074 }
            r5 = r2[r3]     // Catch:{ all -> 0x0074 }
            r4.f53923d = r5     // Catch:{ all -> 0x0074 }
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x003d:
            r0 = 1
            r6.f53919z = r0     // Catch:{ all -> 0x0074 }
            goto L_0x0058
        L_0x0041:
            r7 = move-exception
            javax.mail.MessagingException r8 = new javax.mail.MessagingException     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "error getting UIDL"
            r8.<init>(r0, r7)     // Catch:{ all -> 0x0074 }
            throw r8     // Catch:{ all -> 0x0074 }
        L_0x004a:
            r7 = move-exception
            r6.close(r1)     // Catch:{ all -> 0x0074 }
            javax.mail.FolderClosedException r8 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0074 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x0074 }
            throw r8     // Catch:{ all -> 0x0074 }
        L_0x0058:
            javax.mail.FetchProfile$Item r0 = javax.mail.FetchProfile.Item.ENVELOPE     // Catch:{ all -> 0x0074 }
            boolean r8 = r8.contains((javax.mail.FetchProfile.Item) r0)     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x0072
        L_0x0060:
            int r8 = r7.length     // Catch:{ all -> 0x0074 }
            if (r1 >= r8) goto L_0x0072
            r8 = r7[r1]     // Catch:{ MessageRemovedException -> 0x006f }
            a8.d r8 = (p208a8.C11063d) r8     // Catch:{ MessageRemovedException -> 0x006f }
            java.lang.String r0 = ""
            r8.getHeader(r0)     // Catch:{ MessageRemovedException -> 0x006f }
            r8.getSize()     // Catch:{ MessageRemovedException -> 0x006f }
        L_0x006f:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x0072:
            monitor-exit(r6)
            return
        L_0x0074:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11062c.fetch(javax.mail.Message[], javax.mail.FetchProfile):void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        this.f53909B = !this.f53912c.f53939O;
        try {
            if (this.f53917p) {
                close(false);
            }
        } finally {
            super.finalize();
            this.f53909B = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11076l mo62075g() {
        return this.f53908A;
    }

    public Folder getFolder(String str) throws MessagingException {
        throw new MessagingException("not a directory");
    }

    public String getFullName() {
        return this.f53911a;
    }

    public synchronized Message getMessage(int i) throws MessagingException {
        C11063d dVar;
        m74548c();
        int i2 = i - 1;
        dVar = this.f53918s[i2];
        if (dVar == null) {
            dVar = mo62072f(this, i);
            this.f53918s[i2] = dVar;
        }
        return dVar;
    }

    public synchronized int getMessageCount() throws MessagingException {
        if (!this.f53917p) {
            return -1;
        }
        m74549e();
        return this.f53914f;
    }

    public String getName() {
        return this.f53911a;
    }

    public Folder getParent() {
        return new C11061b(this.f53912c);
    }

    public Flags getPermanentFlags() {
        return new Flags();
    }

    public char getSeparator() {
        return 0;
    }

    public int getType() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C11068i mo62076h() throws MessagingException {
        C11068i iVar = this.f53913d;
        m74548c();
        return iVar;
    }

    public boolean hasNewMessages() throws MessagingException {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        close(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOpen() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f53917p     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            a8.i r0 = r3.f53913d     // Catch:{ IOException -> 0x001b }
            boolean r0 = r0.mo62112J()     // Catch:{ IOException -> 0x001b }
            if (r0 == 0) goto L_0x0013
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0013:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x001b }
            java.lang.String r2 = "NOOP failed"
            r0.<init>(r2)     // Catch:{ IOException -> 0x001b }
            throw r0     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            r3.close(r1)     // Catch:{ MessagingException -> 0x001e }
        L_0x001e:
            monitor-exit(r3)
            return r1
        L_0x0020:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208a8.C11062c.isOpen():boolean");
    }

    public Folder[] list(String str) throws MessagingException {
        throw new MessagingException("not a directory");
    }

    /* access modifiers changed from: protected */
    public void notifyMessageChangedListeners(int i, Message message) {
        super.notifyMessageChangedListeners(i, message);
    }

    public synchronized void open(int i) throws MessagingException {
        C11067h hVar;
        m74547b();
        if (this.f53916o) {
            try {
                this.f53913d = this.f53912c.mo62101g(this);
                C11075k V = this.f53913d.mo62118V();
                this.f53914f = V.f53980a;
                this.f53915g = V.f53981b;
                this.mode = i;
                if (this.f53912c.f53936L) {
                    this.f53908A = new C11076l(this.f53912c.f53937M);
                }
                this.f53917p = true;
                this.f53918s = new C11063d[this.f53914f];
                this.f53919z = false;
                notifyConnectionListeners(1);
            } catch (IOException e) {
                this.f53910C.log(Level.FINE, "failed to create file cache", (Throwable) e);
                throw e;
            } catch (IOException e2) {
                try {
                    if (this.f53913d != null) {
                        this.f53913d.mo62113K();
                    }
                    this.f53913d = null;
                    hVar = this.f53912c;
                } catch (IOException unused) {
                    this.f53913d = null;
                    hVar = this.f53912c;
                } catch (Throwable th) {
                    this.f53913d = null;
                    this.f53912c.mo62099f(this);
                    throw th;
                }
                hVar.mo62099f(this);
                throw new MessagingException("Open failed", e2);
            }
        } else {
            throw new FolderNotFoundException((Folder) this, "folder is not INBOX");
        }
    }

    public boolean renameTo(Folder folder) throws MessagingException {
        throw new MethodNotSupportedException("renameTo");
    }
}
