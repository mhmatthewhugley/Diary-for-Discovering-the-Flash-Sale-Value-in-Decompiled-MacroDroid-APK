package p438y7;

import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Quota;
import javax.mail.QuotaAwareStore;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.StoreClosedException;
import javax.mail.URLName;
import p430x7.C16853d;
import p430x7.C16854e;
import p447z7.C17055g;
import p447z7.C17063o;

/* renamed from: y7.i */
/* compiled from: IMAPStore */
public class C16960i extends Store implements QuotaAwareStore, C16854e {

    /* renamed from: A */
    private boolean f68311A;

    /* renamed from: B */
    private boolean f68312B;

    /* renamed from: C */
    private boolean f68313C;

    /* renamed from: D */
    private boolean f68314D;

    /* renamed from: E */
    private volatile boolean f68315E;

    /* renamed from: F */
    private volatile boolean f68316F;

    /* renamed from: G */
    private final Object f68317G;

    /* renamed from: H */
    private boolean f68318H;

    /* renamed from: I */
    private boolean f68319I;

    /* renamed from: J */
    protected MailLogger f68320J;

    /* renamed from: K */
    private boolean f68321K;

    /* renamed from: L */
    private volatile Constructor<?> f68322L;

    /* renamed from: M */
    private volatile Constructor<?> f68323M;

    /* renamed from: N */
    private C16854e f68324N;

    /* renamed from: a */
    protected final String f68325a;

    /* renamed from: c */
    protected final int f68326c;

    /* renamed from: d */
    private final int f68327d;

    /* renamed from: f */
    private boolean f68328f;

    /* renamed from: g */
    private final int f68329g;

    /* renamed from: o */
    private final int f68330o;

    /* renamed from: p */
    private volatile int f68331p;

    /* renamed from: s */
    private C17063o f68332s;

    /* renamed from: z */
    private boolean f68333z;

    /* renamed from: y7.i$a */
    /* compiled from: IMAPStore */
    static class C16961a {
        /* renamed from: a */
        static /* synthetic */ boolean m100189a(C16961a aVar) {
            throw null;
        }

        /* renamed from: b */
        static /* synthetic */ MailLogger m100190b(C16961a aVar) {
            throw null;
        }
    }

    static {
        Class<C16960i> cls = C16960i.class;
    }

    /* renamed from: F */
    private void m100163F(C17055g gVar) {
        if (gVar == null) {
            m100164c();
            return;
        }
        synchronized (this.f68317G) {
            this.f68315E = false;
        }
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:7|8|12|13|14|(1:16)|(1:20)|21|22|23|24|25|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004a */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m100164c() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = super.isConnected()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0010
            com.sun.mail.util.MailLogger r0 = r4.f68320J     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "IMAPStore cleanup, not connected"
            r0.fine(r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)
            return
        L_0x0010:
            java.lang.Object r0 = r4.f68317G     // Catch:{ all -> 0x0056 }
            monitor-enter(r0)     // Catch:{ all -> 0x0056 }
            boolean r1 = r4.f68316F     // Catch:{ all -> 0x0053 }
            r2 = 0
            r4.f68316F = r2     // Catch:{ all -> 0x0053 }
            r4.f68315E = r2     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            com.sun.mail.util.MailLogger r0 = r4.f68320J     // Catch:{ all -> 0x0056 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0056 }
            boolean r0 = r0.isLoggable(r2)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x003b
            com.sun.mail.util.MailLogger r0 = r4.f68320J     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r2.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "IMAPStore cleanup, force "
            r2.append(r3)     // Catch:{ all -> 0x0056 }
            r2.append(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0056 }
            r0.fine(r2)     // Catch:{ all -> 0x0056 }
        L_0x003b:
            if (r1 == 0) goto L_0x0041
            boolean r0 = r4.f68313C     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0044
        L_0x0041:
            r4.m100165e(r1)     // Catch:{ all -> 0x0056 }
        L_0x0044:
            r4.m100166f(r1)     // Catch:{ all -> 0x0056 }
            super.close()     // Catch:{ MessagingException -> 0x004a }
        L_0x004a:
            com.sun.mail.util.MailLogger r0 = r4.f68320J     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "IMAPStore cleanup done"
            r0.fine(r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)
            return
        L_0x0053:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16960i.m100164c():void");
    }

    private void checkConnected() {
        if (!super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    /* renamed from: e */
    private void m100165e(boolean z) {
        throw null;
    }

    /* renamed from: f */
    private void m100166f(boolean z) {
        throw null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0013 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p447z7.C17063o m100167o() throws javax.mail.MessagingException {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.checkConnected()     // Catch:{ all -> 0x0037 }
            r0 = 0
            z7.o r1 = r4.f68332s     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0033
            z7.g r0 = r4.m100168u()     // Catch:{ BadCommandException -> 0x0013, ConnectionException -> 0x0024, ProtocolException -> 0x0019 }
            z7.o r1 = r0.mo80294K()     // Catch:{ BadCommandException -> 0x0013, ConnectionException -> 0x0024, ProtocolException -> 0x0019 }
            r4.f68332s = r1     // Catch:{ BadCommandException -> 0x0013, ConnectionException -> 0x0024, ProtocolException -> 0x0019 }
        L_0x0013:
            r4.m100163F(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0033
        L_0x0017:
            r1 = move-exception
            goto L_0x002f
        L_0x0019:
            r1 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x0017 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0017 }
            throw r2     // Catch:{ all -> 0x0017 }
        L_0x0024:
            r1 = move-exception
            javax.mail.StoreClosedException r2 = new javax.mail.StoreClosedException     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0017 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0017 }
            throw r2     // Catch:{ all -> 0x0017 }
        L_0x002f:
            r4.m100163F(r0)     // Catch:{ all -> 0x0037 }
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0033:
            z7.o r0 = r4.f68332s     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)
            return r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16960i.m100167o():z7.o");
    }

    private String tracePassword(String str) {
        return this.f68319I ? str : str == null ? "<null>" : "<non-null>";
    }

    private String traceUser(String str) {
        return this.f68318H ? str : "<user name suppressed>";
    }

    /* renamed from: u */
    private C17055g m100168u() throws ProtocolException {
        throw null;
    }

    /* renamed from: z */
    private Folder[] m100169z(C17063o.C17064a[] aVarArr, String str) {
        int length = aVarArr.length;
        Folder[] folderArr = new Folder[length];
        for (int i = 0; i < length; i++) {
            String str2 = aVarArr[i].f68498a;
            if (str == null) {
                int length2 = str2.length();
                if (length2 > 0) {
                    int i2 = length2 - 1;
                    if (str2.charAt(i2) == aVarArr[i].f68499b) {
                        str2 = str2.substring(0, i2);
                    }
                }
            } else {
                str2 = str2 + str;
            }
            folderArr[i] = mo80175B(str2, aVarArr[i].f68499b, Boolean.valueOf(str == null));
        }
        return folderArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C16941c mo80174A(String str, char c) {
        return mo80175B(str, c, (Boolean) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p438y7.C16941c mo80175B(java.lang.String r5, char r6, java.lang.Boolean r7) {
        /*
            r4 = this;
            java.lang.reflect.Constructor<?> r0 = r4.f68322L
            if (r0 == 0) goto L_0x002a
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0020 }
            r1 = 0
            r0[r1] = r5     // Catch:{ Exception -> 0x0020 }
            r1 = 1
            java.lang.Character r2 = java.lang.Character.valueOf(r6)     // Catch:{ Exception -> 0x0020 }
            r0[r1] = r2     // Catch:{ Exception -> 0x0020 }
            r1 = 2
            r0[r1] = r4     // Catch:{ Exception -> 0x0020 }
            r1 = 3
            r0[r1] = r7     // Catch:{ Exception -> 0x0020 }
            java.lang.reflect.Constructor<?> r1 = r4.f68322L     // Catch:{ Exception -> 0x0020 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0020 }
            y7.c r0 = (p438y7.C16941c) r0     // Catch:{ Exception -> 0x0020 }
            goto L_0x002b
        L_0x0020:
            r0 = move-exception
            com.sun.mail.util.MailLogger r1 = r4.f68320J
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            java.lang.String r3 = "exception creating IMAPFolder class"
            r1.log((java.util.logging.Level) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x0032
            y7.c r0 = new y7.c
            r0.<init>(r5, r6, r4, r7)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16960i.mo80175B(java.lang.String, char, java.lang.Boolean):y7.c");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p438y7.C16941c mo80176C(p447z7.C17059k r5) {
        /*
            r4 = this;
            java.lang.reflect.Constructor<?> r0 = r4.f68323M
            if (r0 == 0) goto L_0x0020
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0016 }
            r1 = 0
            r0[r1] = r5     // Catch:{ Exception -> 0x0016 }
            r1 = 1
            r0[r1] = r4     // Catch:{ Exception -> 0x0016 }
            java.lang.reflect.Constructor<?> r1 = r4.f68323M     // Catch:{ Exception -> 0x0016 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0016 }
            y7.c r0 = (p438y7.C16941c) r0     // Catch:{ Exception -> 0x0016 }
            goto L_0x0021
        L_0x0016:
            r0 = move-exception
            com.sun.mail.util.MailLogger r1 = r4.f68320J
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            java.lang.String r3 = "exception creating IMAPFolder class LI"
            r1.log((java.util.logging.Level) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x0028
            y7.c r0 = new y7.c
            r0.<init>(r5, r4)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16960i.mo80176C(z7.k):y7.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo80177D(C17055g gVar) {
        if (gVar != null) {
            gVar.mo79993e(this.f68324N);
            gVar.mo79989a(this);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo80178E(C16941c cVar, C17055g gVar) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo80179G() {
        return this.f68311A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo80180b() {
        Properties properties = this.session.getProperties();
        return PropUtil.getBooleanProperty(properties, "mail." + this.f68325a + ".allowreadonlyselect", false);
    }

    public synchronized void close() throws MessagingException {
        m100164c();
        m100165e(true);
        m100166f(true);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!this.f68314D) {
            synchronized (this.f68317G) {
                this.f68315E = true;
                this.f68316F = true;
            }
            this.f68313C = true;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo80181g() {
        return this.f68330o;
    }

    public synchronized Folder getDefaultFolder() throws MessagingException {
        checkConnected();
        return new C16937a(this);
    }

    public synchronized Folder getFolder(String str) throws MessagingException {
        checkConnected();
        return mo80174A(str, 65535);
    }

    public Folder[] getPersonalNamespaces() throws MessagingException {
        C17063o.C17064a[] aVarArr;
        C17063o o = m100167o();
        if (o == null || (aVarArr = o.f68495a) == null) {
            return super.getPersonalNamespaces();
        }
        return m100169z(aVarArr, (String) null);
    }

    public synchronized Quota[] getQuota(String str) throws MessagingException {
        Quota[] B;
        checkConnected();
        try {
            C17055g u = m100168u();
            B = u.mo80285B(str);
            m100163F(u);
        } catch (BadCommandException e) {
            throw new MessagingException("QUOTA not supported", e);
        } catch (ConnectionException e2) {
            throw new StoreClosedException(this, e2.getMessage());
        } catch (ProtocolException e3) {
            throw new MessagingException(e3.getMessage(), e3);
        } catch (Throwable th) {
            m100163F((C17055g) null);
            throw th;
        }
        return B;
    }

    /* access modifiers changed from: package-private */
    public Session getSession() {
        return this.session;
    }

    public Folder[] getSharedNamespaces() throws MessagingException {
        C17063o.C17064a[] aVarArr;
        C17063o o = m100167o();
        if (o == null || (aVarArr = o.f68497c) == null) {
            return super.getSharedNamespaces();
        }
        return m100169z(aVarArr, (String) null);
    }

    public Folder[] getUserNamespaces(String str) throws MessagingException {
        C17063o.C17064a[] aVarArr;
        C17063o o = m100167o();
        if (o == null || (aVarArr = o.f68496b) == null) {
            return super.getUserNamespaces(str);
        }
        return m100169z(aVarArr, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public MailLogger mo80182h() {
        return C16961a.m100190b((C16961a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo80183i() {
        return this.f68327d;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isConnected() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = super.isConnected()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x000a
            r0 = 0
            monitor-exit(r2)
            return r0
        L_0x000a:
            r0 = 0
            z7.g r0 = r2.m100168u()     // Catch:{ ProtocolException -> 0x0012, all -> 0x0016 }
            r0.mo80295L()     // Catch:{ ProtocolException -> 0x0012, all -> 0x0016 }
        L_0x0012:
            r2.m100163F(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x001b
        L_0x0016:
            r1 = move-exception
            r2.m100163F(r0)     // Catch:{ all -> 0x0021 }
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x001b:
            boolean r0 = super.isConnected()     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16960i.isConnected():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C17055g mo80184j() throws ProtocolException {
        C17055g u = m100168u();
        u.mo79993e(this);
        u.mo79989a(this.f68324N);
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo80185m() {
        return this.f68321K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo80186p() {
        return this.f68312B;
    }

    /* access modifiers changed from: protected */
    public synchronized boolean protocolConnect(String str, int i, String str2, String str3) throws MessagingException {
        if (str != null && str3 != null && str2 != null) {
            if (i != -1) {
                this.f68331p = i;
            } else {
                Properties properties = this.session.getProperties();
                this.f68331p = PropUtil.getIntProperty(properties, "mail." + this.f68325a + ".port", this.f68331p);
            }
            if (this.f68331p == -1) {
                this.f68331p = this.f68326c;
            }
            throw null;
        } else if (this.f68320J.isLoggable(Level.FINE)) {
            MailLogger mailLogger = this.f68320J;
            mailLogger.fine("protocolConnect returning false, host=" + str + ", user=" + traceUser(str2) + ", password=" + tracePassword(str3));
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C17055g mo80187r(C16941c cVar) throws MessagingException {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo80188s() {
        return this.f68329g;
    }

    public synchronized void setQuota(Quota quota) throws MessagingException {
        checkConnected();
        C17055g gVar = null;
        try {
            gVar = m100168u();
            gVar.mo80302S(quota);
            m100163F(gVar);
        } catch (BadCommandException e) {
            throw new MessagingException("QUOTA not supported", e);
        } catch (ConnectionException e2) {
            throw new StoreClosedException(this, e2.getMessage());
        } catch (ProtocolException e3) {
            throw new MessagingException(e3.getMessage(), e3);
        } catch (Throwable th) {
            m100163F(gVar);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo80189v(C16853d dVar) {
        if (this.f68333z) {
            notifyStoreListeners(1000, dVar.toString());
        }
        String a = dVar.mo79994a();
        boolean z = false;
        if (a.startsWith("[")) {
            int indexOf = a.indexOf(93);
            if (indexOf > 0 && a.substring(0, indexOf + 1).equalsIgnoreCase("[ALERT]")) {
                z = true;
            }
            a = a.substring(indexOf + 1).trim();
        }
        if (z) {
            notifyStoreListeners(1, a);
        } else if (dVar.mo80000g() && a.length() > 0) {
            notifyStoreListeners(2, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo80190w() {
        return C16961a.m100189a((C16961a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo80191x() {
        return this.f68328f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo80192y() {
        throw null;
    }

    public synchronized Folder getFolder(URLName uRLName) throws MessagingException {
        checkConnected();
        return mo80174A(uRLName.getFile(), 65535);
    }
}
