package p438y7;

import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.util.ReadableMime;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.UIDFolder;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import p430x7.C16853d;
import p438y7.C16941c;
import p438y7.C16967o;
import p447z7.C17049a;
import p447z7.C17050b;
import p447z7.C17051c;
import p447z7.C17053e;
import p447z7.C17054f;
import p447z7.C17055g;
import p447z7.C17057i;
import p447z7.C17058j;
import p447z7.C17060l;
import p447z7.C17065p;
import p447z7.C17066q;
import p447z7.C17068s;

/* renamed from: y7.e */
/* compiled from: IMAPMessage */
public class C16955e extends MimeMessage implements ReadableMime {

    /* renamed from: a */
    protected C17050b f68284a;

    /* renamed from: b */
    protected C17051c f68285b;

    /* renamed from: c */
    protected Map<String, Object> f68286c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Date f68287d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f68288e = -1;

    /* renamed from: f */
    private Boolean f68289f;

    /* renamed from: g */
    private volatile long f68290g = -1;

    /* renamed from: h */
    private volatile long f68291h = -1;

    /* renamed from: i */
    protected String f68292i;

    /* renamed from: j */
    private String f68293j;

    /* renamed from: k */
    private String f68294k;

    /* renamed from: l */
    private String f68295l;

    /* renamed from: m */
    private volatile boolean f68296m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile boolean f68297n = false;

    /* renamed from: o */
    private Hashtable<String, String> f68298o = new Hashtable<>(1);

    /* renamed from: y7.e$a */
    /* compiled from: IMAPMessage */
    public static class C16956a implements C16967o.C16969b {

        /* renamed from: a */
        private boolean f68299a = false;

        /* renamed from: b */
        private boolean f68300b = false;

        /* renamed from: c */
        private boolean f68301c = false;

        /* renamed from: d */
        private boolean f68302d = false;

        /* renamed from: e */
        private boolean f68303e = false;

        /* renamed from: f */
        private boolean f68304f = false;

        /* renamed from: g */
        private boolean f68305g = false;

        /* renamed from: h */
        private boolean f68306h = false;

        /* renamed from: i */
        private String[] f68307i = null;

        /* renamed from: j */
        private Set<C17053e> f68308j = new HashSet();

        public C16956a(FetchProfile fetchProfile, C17053e[] eVarArr) {
            if (fetchProfile.contains(FetchProfile.Item.ENVELOPE)) {
                this.f68299a = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.FLAGS)) {
                this.f68300b = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.CONTENT_INFO)) {
                this.f68301c = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.SIZE)) {
                this.f68304f = true;
            }
            if (fetchProfile.contains((FetchProfile.Item) UIDFolder.FetchProfileItem.UID)) {
                this.f68302d = true;
            }
            if (fetchProfile.contains((FetchProfile.Item) C16941c.C16952k.f68269a)) {
                this.f68303e = true;
            }
            if (fetchProfile.contains((FetchProfile.Item) C16941c.C16952k.f68270b)) {
                this.f68304f = true;
            }
            if (fetchProfile.contains((FetchProfile.Item) C16941c.C16952k.f68271c)) {
                this.f68305g = true;
            }
            if (fetchProfile.contains((FetchProfile.Item) C16941c.C16952k.f68272d)) {
                this.f68306h = true;
            }
            this.f68307i = fetchProfile.getHeaderNames();
            for (int i = 0; i < eVarArr.length; i++) {
                if (fetchProfile.contains(eVarArr[i].mo80278a())) {
                    this.f68308j.add(eVarArr[i]);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x0090  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo80173a(p438y7.C16955e r7) {
            /*
                r6 = this;
                boolean r0 = r6.f68299a
                r1 = 1
                if (r0 == 0) goto L_0x0012
                z7.c r0 = r7.m100125b()
                if (r0 != 0) goto L_0x0012
                boolean r0 = r7.f68297n
                if (r0 != 0) goto L_0x0012
                return r1
            L_0x0012:
                boolean r0 = r6.f68300b
                if (r0 == 0) goto L_0x001d
                javax.mail.Flags r0 = r7.m100126c()
                if (r0 != 0) goto L_0x001d
                return r1
            L_0x001d:
                boolean r0 = r6.f68301c
                if (r0 == 0) goto L_0x002e
                z7.b r0 = r7.m100124a()
                if (r0 != 0) goto L_0x002e
                boolean r0 = r7.f68297n
                if (r0 != 0) goto L_0x002e
                return r1
            L_0x002e:
                boolean r0 = r6.f68302d
                r2 = -1
                if (r0 == 0) goto L_0x003d
                long r4 = r7.mo80170x()
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x003d
                return r1
            L_0x003d:
                boolean r0 = r6.f68303e
                if (r0 == 0) goto L_0x0048
                boolean r0 = r7.m100136p()
                if (r0 != 0) goto L_0x0048
                return r1
            L_0x0048:
                boolean r0 = r6.f68304f
                if (r0 == 0) goto L_0x005b
                long r4 = r7.f68288e
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x005b
                boolean r0 = r7.f68297n
                if (r0 != 0) goto L_0x005b
                return r1
            L_0x005b:
                boolean r0 = r6.f68305g
                if (r0 == 0) goto L_0x0066
                boolean r0 = r7.f68297n
                if (r0 != 0) goto L_0x0066
                return r1
            L_0x0066:
                boolean r0 = r6.f68306h
                if (r0 == 0) goto L_0x0071
                java.util.Date r0 = r7.f68287d
                if (r0 != 0) goto L_0x0071
                return r1
            L_0x0071:
                r0 = 0
                r2 = 0
            L_0x0073:
                java.lang.String[] r3 = r6.f68307i
                int r4 = r3.length
                if (r2 >= r4) goto L_0x0084
                r3 = r3[r2]
                boolean r3 = r7.m100116B(r3)
                if (r3 != 0) goto L_0x0081
                return r1
            L_0x0081:
                int r2 = r2 + 1
                goto L_0x0073
            L_0x0084:
                java.util.Set<z7.e> r2 = r6.f68308j
                java.util.Iterator r2 = r2.iterator()
            L_0x008a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00a5
                java.lang.Object r3 = r2.next()
                z7.e r3 = (p447z7.C17053e) r3
                java.util.Map<java.lang.String, java.lang.Object> r4 = r7.f68286c
                if (r4 == 0) goto L_0x00a4
                java.lang.String r3 = r3.mo80279b()
                java.lang.Object r3 = r4.get(r3)
                if (r3 != 0) goto L_0x008a
            L_0x00a4:
                return r1
            L_0x00a5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p438y7.C16955e.C16956a.mo80173a(y7.e):boolean");
        }
    }

    protected C16955e(C16941c cVar, int i) {
        super((Folder) cVar, i);
        this.flags = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean m100116B(String str) {
        if (this.f68296m) {
            return true;
        }
        return this.f68298o.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    /* renamed from: D */
    private synchronized void m100117D() throws MessagingException {
        if (this.f68284a == null) {
            synchronized (mo80166t()) {
                try {
                    C17055g v = mo80168v();
                    mo80163q();
                    C17050b t = v.mo80324t(mo80169w());
                    this.f68284a = t;
                    if (t == null) {
                        mo80164r();
                        throw new MessagingException("Unable to load BODYSTRUCTURE");
                    }
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.folder, e.getMessage());
                } catch (ProtocolException e2) {
                    mo80164r();
                    throw new MessagingException(e2.getMessage(), e2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        return;
    }

    /* renamed from: E */
    private synchronized void m100118E() throws MessagingException {
        if (this.f68285b == null) {
            synchronized (mo80166t()) {
                try {
                    C17055g v = mo80168v();
                    mo80163q();
                    int w = mo80169w();
                    C16853d[] p = v.mo80320p(w, "ENVELOPE INTERNALDATE RFC822.SIZE");
                    for (int i = 0; i < p.length; i++) {
                        if (p[i] != null && (p[i] instanceof C17054f)) {
                            if (((C17054f) p[i]).mo80331t() == w) {
                                C17054f fVar = (C17054f) p[i];
                                int y = fVar.mo80283y();
                                for (int i2 = 0; i2 < y; i2++) {
                                    C17058j w2 = fVar.mo80281w(i2);
                                    if (w2 instanceof C17051c) {
                                        this.f68285b = (C17051c) w2;
                                    } else if (w2 instanceof C17057i) {
                                        this.f68287d = ((C17057i) w2).mo80333a();
                                    } else if (w2 instanceof C17066q) {
                                        this.f68288e = ((C17066q) w2).f68504a;
                                    }
                                }
                            }
                        }
                    }
                    v.mo79992d(p);
                    v.mo79991c(p[p.length - 1]);
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.folder, e.getMessage());
                } catch (ProtocolException e2) {
                    mo80164r();
                    throw new MessagingException(e2.getMessage(), e2);
                }
            }
            if (this.f68285b == null) {
                throw new MessagingException("Failed to load IMAP envelope");
            }
        }
    }

    /* renamed from: F */
    private synchronized void m100119F() throws MessagingException {
        if (this.flags == null) {
            synchronized (mo80166t()) {
                try {
                    C17055g v = mo80168v();
                    mo80163q();
                    Flags u = v.mo80325u(mo80169w());
                    this.flags = u;
                    if (u == null) {
                        this.flags = new Flags();
                    }
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.folder, e.getMessage());
                } catch (ProtocolException e2) {
                    mo80164r();
                    throw new MessagingException(e2.getMessage(), e2);
                }
            }
        }
    }

    /* renamed from: G */
    private synchronized void m100120G() throws MessagingException {
        if (!this.f68296m) {
            ByteArrayInputStream byteArrayInputStream = null;
            synchronized (mo80166t()) {
                try {
                    C17055g v = mo80168v();
                    mo80163q();
                    if (v.mo80289F()) {
                        C17049a M = v.mo80296M(mo80169w(), m100123M("HEADER"));
                        if (M != null) {
                            byteArrayInputStream = M.mo80273b();
                        }
                    } else {
                        C17065p v2 = v.mo80326v(mo80169w(), "HEADER");
                        if (v2 != null) {
                            byteArrayInputStream = v2.mo80334a();
                        }
                    }
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this.folder, e.getMessage());
                } catch (ProtocolException e2) {
                    mo80164r();
                    throw new MessagingException(e2.getMessage(), e2);
                }
            }
            if (byteArrayInputStream != null) {
                this.headers = new InternetHeaders(byteArrayInputStream);
                this.f68296m = true;
                return;
            }
            throw new MessagingException("Cannot load header");
        }
    }

    /* renamed from: H */
    private void m100121H(String str) {
        this.f68298o.put(str.toUpperCase(Locale.ENGLISH), str);
    }

    /* renamed from: I */
    private void m100122I(boolean z) {
        this.f68296m = z;
    }

    /* renamed from: M */
    private String m100123M(String str) {
        if (this.f68292i == null) {
            return str;
        }
        return this.f68292i + "." + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C17050b m100124a() {
        return this.f68284a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17051c m100125b() {
        return this.f68285b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Flags m100126c() {
        return this.flags;
    }

    /* renamed from: g */
    private InternetAddress[] m100127g(InternetAddress[] internetAddressArr) {
        if (internetAddressArr == null) {
            return null;
        }
        return (InternetAddress[]) internetAddressArr.clone();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m100136p() {
        return this.f68296m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo80155A() {
        return ((C16960i) this.folder.getStore()).mo80191x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo80156C() throws FolderClosedException {
        C17055g gVar = ((C16941c) this.folder).f68217A;
        if (gVar != null) {
            return gVar.mo80289F();
        }
        throw new FolderClosedException(this.folder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo80157J(long j) {
        this.f68291h = j;
    }

    /* renamed from: K */
    public synchronized void mo80158K(boolean z) {
        this.f68289f = Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo80159L(long j) {
        this.f68290g = j;
    }

    public void addFrom(Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo80160d() {
        return this.f68291h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Session mo80161e() {
        return this.session;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo80162f(Flags flags) {
        this.flags = flags;
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        mo80163q();
        m100120G();
        return super.getAllHeaderLines();
    }

    public Enumeration<Header> getAllHeaders() throws MessagingException {
        mo80163q();
        m100120G();
        return super.getAllHeaders();
    }

    public String getContentID() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getContentID();
        }
        m100117D();
        return this.f68284a.f68447p;
    }

    public String[] getContentLanguage() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getContentLanguage();
        }
        m100117D();
        String[] strArr = this.f68284a.f68437C;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    public String getContentMD5() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getContentMD5();
        }
        m100117D();
        return this.f68284a.f68449z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r0 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        mo80164r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return new java.io.ByteArrayInputStream(new byte[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream getContentStream() throws javax.mail.MessagingException {
        /*
            r6 = this;
            boolean r0 = r6.f68297n
            if (r0 == 0) goto L_0x0009
            java.io.InputStream r0 = super.getContentStream()
            return r0
        L_0x0009:
            r0 = 0
            boolean r1 = r6.mo80167u()
            java.lang.Object r2 = r6.mo80166t()
            monitor-enter(r2)
            z7.g r3 = r6.mo80168v()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            r6.mo80163q()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            boolean r4 = r3.mo80289F()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            if (r4 == 0) goto L_0x0042
            int r4 = r6.mo80165s()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            r5 = -1
            if (r4 == r5) goto L_0x0042
            y7.d r0 = new y7.d     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            java.lang.String r3 = "TEXT"
            java.lang.String r3 = r6.m100123M(r3)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            z7.b r4 = r6.f68284a     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            if (r4 == 0) goto L_0x003d
            boolean r4 = r6.mo80155A()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            if (r4 != 0) goto L_0x003d
            z7.b r4 = r6.f68284a     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            int r5 = r4.f68445g     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
        L_0x003d:
            r0.<init>(r6, r3, r5, r1)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            return r0
        L_0x0042:
            boolean r4 = r3.mo80289F()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            if (r4 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0059
            int r1 = r6.mo80169w()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            java.lang.String r4 = "TEXT"
            java.lang.String r4 = r6.m100123M(r4)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            z7.a r1 = r3.mo80296M(r1, r4)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            goto L_0x0067
        L_0x0059:
            int r1 = r6.mo80169w()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            java.lang.String r4 = "TEXT"
            java.lang.String r4 = r6.m100123M(r4)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            z7.a r1 = r3.mo80322r(r1, r4)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
        L_0x0067:
            if (r1 == 0) goto L_0x007e
            java.io.ByteArrayInputStream r0 = r1.mo80273b()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            goto L_0x007e
        L_0x006e:
            int r1 = r6.mo80169w()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            java.lang.String r4 = "TEXT"
            z7.p r1 = r3.mo80326v(r1, r4)     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
            if (r1 == 0) goto L_0x007e
            java.io.ByteArrayInputStream r0 = r1.mo80334a()     // Catch:{ ConnectionException -> 0x009d, ProtocolException -> 0x008f }
        L_0x007e:
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x008c
            r6.mo80164r()
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
        L_0x008c:
            return r0
        L_0x008d:
            r0 = move-exception
            goto L_0x00aa
        L_0x008f:
            r0 = move-exception
            r6.mo80164r()     // Catch:{ all -> 0x008d }
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch:{ all -> 0x008d }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x008d }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x008d }
            throw r1     // Catch:{ all -> 0x008d }
        L_0x009d:
            r0 = move-exception
            javax.mail.FolderClosedException r1 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x008d }
            javax.mail.Folder r3 = r6.folder     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x008d }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x008d }
            throw r1     // Catch:{ all -> 0x008d }
        L_0x00aa:
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16955e.getContentStream():java.io.InputStream");
    }

    public synchronized String getContentType() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getContentType();
        }
        if (this.f68293j == null) {
            m100117D();
            C17050b bVar = this.f68284a;
            this.f68293j = new ContentType(bVar.f68441a, bVar.f68442c, bVar.f68435A).toString();
        }
        return this.f68293j;
    }

    public synchronized DataHandler getDataHandler() throws MessagingException {
        String str;
        mo80163q();
        if (this.f61343dh == null && !this.f68297n) {
            m100117D();
            if (this.f68293j == null) {
                C17050b bVar = this.f68284a;
                this.f68293j = new ContentType(bVar.f68441a, bVar.f68442c, bVar.f68435A).toString();
            }
            if (this.f68284a.mo80276a()) {
                this.f61343dh = new DataHandler((DataSource) new C16957f(this, this.f68284a.f68438D, this.f68292i, this));
            } else if (this.f68284a.mo80277b() && mo80156C() && this.f68284a.f68439E != null) {
                C17050b bVar2 = this.f68284a;
                C17050b bVar3 = bVar2.f68438D[0];
                C17051c cVar = bVar2.f68439E;
                if (this.f68292i == null) {
                    str = "1";
                } else {
                    str = this.f68292i + ".1";
                }
                this.f61343dh = new DataHandler(new C16958g(this, bVar3, cVar, str), this.f68293j);
            }
        }
        return super.getDataHandler();
    }

    public String getDescription() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getDescription();
        }
        String str = this.f68295l;
        if (str != null) {
            return str;
        }
        m100117D();
        String str2 = this.f68284a.f68448s;
        if (str2 == null) {
            return null;
        }
        try {
            this.f68295l = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.f68295l = this.f68284a.f68448s;
        }
        return this.f68295l;
    }

    public String getDisposition() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getDisposition();
        }
        m100117D();
        return this.f68284a.f68446o;
    }

    public String getEncoding() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getEncoding();
        }
        m100117D();
        return this.f68284a.f68443d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = r2.f68284a.f68435A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getFileName() throws javax.mail.MessagingException {
        /*
            r2 = this;
            r2.mo80163q()
            boolean r0 = r2.f68297n
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = super.getFileName()
            return r0
        L_0x000c:
            r0 = 0
            r2.m100117D()
            z7.b r1 = r2.f68284a
            javax.mail.internet.ParameterList r1 = r1.f68436B
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "filename"
            java.lang.String r0 = r1.get(r0)
        L_0x001c:
            if (r0 != 0) goto L_0x002a
            z7.b r1 = r2.f68284a
            javax.mail.internet.ParameterList r1 = r1.f68435A
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.get(r0)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16955e.getFileName():java.lang.String");
    }

    public synchronized Flags getFlags() throws MessagingException {
        mo80163q();
        m100119F();
        return super.getFlags();
    }

    public Address[] getFrom() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getFrom();
        }
        m100118E();
        C17051c cVar = this.f68285b;
        InternetAddress[] internetAddressArr = cVar.f68455d;
        if (internetAddressArr == null || internetAddressArr.length == 0) {
            internetAddressArr = cVar.f68456f;
        }
        return m100127g(internetAddressArr);
    }

    public String[] getHeader(String str) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        mo80163q();
        if (m100116B(str)) {
            return this.headers.getHeader(str);
        }
        synchronized (mo80166t()) {
            try {
                C17055g v = mo80168v();
                mo80163q();
                if (v.mo80289F()) {
                    C17049a M = v.mo80296M(mo80169w(), m100123M("HEADER.FIELDS (" + str + ")"));
                    if (M != null) {
                        byteArrayInputStream = M.mo80273b();
                    }
                } else {
                    C17065p v2 = v.mo80326v(mo80169w(), "HEADER.LINES (" + str + ")");
                    if (v2 != null) {
                        byteArrayInputStream = v2.mo80334a();
                    }
                }
                byteArrayInputStream = null;
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                mo80164r();
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
        if (byteArrayInputStream == null) {
            return null;
        }
        if (this.headers == null) {
            this.headers = new InternetHeaders();
        }
        this.headers.load(byteArrayInputStream);
        m100121H(str);
        return this.headers.getHeader(str);
    }

    public int getLineCount() throws MessagingException {
        mo80163q();
        m100117D();
        return this.f68284a.f68444f;
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        mo80163q();
        m100120G();
        return super.getMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        mo80163q();
        m100120G();
        return super.getMatchingHeaders(strArr);
    }

    public String getMessageID() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getMessageID();
        }
        m100118E();
        return this.f68285b.f68461z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r4 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        mo80164r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return new java.io.ByteArrayInputStream(new byte[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream getMimeStream() throws javax.mail.MessagingException {
        /*
            r5 = this;
            boolean r0 = r5.mo80167u()
            java.lang.Object r1 = r5.mo80166t()
            monitor-enter(r1)
            z7.g r2 = r5.mo80168v()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            r5.mo80163q()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            boolean r3 = r2.mo80289F()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            if (r3 == 0) goto L_0x0026
            int r3 = r5.mo80165s()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            r4 = -1
            if (r3 == r4) goto L_0x0026
            y7.d r2 = new y7.d     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            java.lang.String r3 = r5.f68292i     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            r2.<init>(r5, r3, r4, r0)     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0026:
            boolean r3 = r2.mo80289F()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            r4 = 0
            if (r3 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x003a
            int r0 = r5.mo80169w()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            java.lang.String r3 = r5.f68292i     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            z7.a r0 = r2.mo80296M(r0, r3)     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            goto L_0x0044
        L_0x003a:
            int r0 = r5.mo80169w()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            java.lang.String r3 = r5.f68292i     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            z7.a r0 = r2.mo80322r(r0, r3)     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
        L_0x0044:
            if (r0 == 0) goto L_0x005a
            java.io.ByteArrayInputStream r0 = r0.mo80273b()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            r4 = r0
            goto L_0x005a
        L_0x004c:
            int r0 = r5.mo80169w()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            z7.p r0 = r2.mo80326v(r0, r4)     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
            if (r0 == 0) goto L_0x005a
            java.io.ByteArrayInputStream r4 = r0.mo80334a()     // Catch:{ ConnectionException -> 0x0079, ProtocolException -> 0x006b }
        L_0x005a:
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            if (r4 != 0) goto L_0x0068
            r5.mo80164r()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r0 = 0
            byte[] r0 = new byte[r0]
            r4.<init>(r0)
        L_0x0068:
            return r4
        L_0x0069:
            r0 = move-exception
            goto L_0x0086
        L_0x006b:
            r0 = move-exception
            r5.mo80164r()     // Catch:{ all -> 0x0069 }
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0069 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0069 }
            throw r2     // Catch:{ all -> 0x0069 }
        L_0x0079:
            r0 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x0069 }
            javax.mail.Folder r3 = r5.folder     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0069 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0069 }
            throw r2     // Catch:{ all -> 0x0069 }
        L_0x0086:
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16955e.getMimeStream():java.io.InputStream");
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        mo80163q();
        m100120G();
        return super.getNonMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        mo80163q();
        m100120G();
        return super.getNonMatchingHeaders(strArr);
    }

    public Date getReceivedDate() throws MessagingException {
        mo80163q();
        if (this.f68287d == null) {
            m100118E();
        }
        if (this.f68287d == null) {
            return null;
        }
        return new Date(this.f68287d.getTime());
    }

    public Address[] getRecipients(Message.RecipientType recipientType) throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getRecipients(recipientType);
        }
        m100118E();
        if (recipientType == Message.RecipientType.f61338TO) {
            return m100127g(this.f68285b.f68458o);
        }
        if (recipientType == Message.RecipientType.f61337CC) {
            return m100127g(this.f68285b.f68459p);
        }
        if (recipientType == Message.RecipientType.BCC) {
            return m100127g(this.f68285b.f68460s);
        }
        return super.getRecipients(recipientType);
    }

    public Address[] getReplyTo() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getReplyTo();
        }
        m100118E();
        InternetAddress[] internetAddressArr = this.f68285b.f68457g;
        if (internetAddressArr == null || internetAddressArr.length == 0) {
            return getFrom();
        }
        return m100127g(internetAddressArr);
    }

    public Address getSender() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getSender();
        }
        m100118E();
        InternetAddress[] internetAddressArr = this.f68285b.f68456f;
        if (internetAddressArr == null || internetAddressArr.length <= 0) {
            return null;
        }
        return internetAddressArr[0];
    }

    public Date getSentDate() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getSentDate();
        }
        m100118E();
        if (this.f68285b.f68453a == null) {
            return null;
        }
        return new Date(this.f68285b.f68453a.getTime());
    }

    public int getSize() throws MessagingException {
        mo80163q();
        if (this.f68288e == -1) {
            m100118E();
        }
        long j = this.f68288e;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public String getSubject() throws MessagingException {
        mo80163q();
        if (this.f68297n) {
            return super.getSubject();
        }
        String str = this.f68294k;
        if (str != null) {
            return str;
        }
        m100118E();
        String str2 = this.f68285b.f68454c;
        if (str2 == null) {
            return null;
        }
        try {
            this.f68294k = MimeUtility.decodeText(MimeUtility.unfold(str2));
        } catch (UnsupportedEncodingException unused) {
            this.f68294k = this.f68285b.f68454c;
        }
        return this.f68294k;
    }

    public synchronized boolean isSet(Flags.Flag flag) throws MessagingException {
        mo80163q();
        m100119F();
        return super.isSet(flag);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo80163q() throws MessageRemovedException {
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014 A[RETURN] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80164r() throws javax.mail.MessageRemovedException, javax.mail.FolderClosedException {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mo80166t()
            monitor-enter(r0)
            z7.g r1 = r4.mo80168v()     // Catch:{ ConnectionException -> 0x001b, ProtocolException -> 0x000f }
            r1.mo80295L()     // Catch:{ ConnectionException -> 0x001b, ProtocolException -> 0x000f }
            goto L_0x000f
        L_0x000d:
            r1 = move-exception
            goto L_0x0028
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            boolean r0 = r4.expunged
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            javax.mail.MessageRemovedException r0 = new javax.mail.MessageRemovedException
            r0.<init>()
            throw r0
        L_0x001b:
            r1 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x000d }
            javax.mail.Folder r3 = r4.folder     // Catch:{ all -> 0x000d }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x000d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16955e.mo80164r():void");
    }

    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int mo80165s() {
        return ((C16960i) this.folder.getStore()).mo80183i();
    }

    public void setContentID(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setContentLanguage(String[] strArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setContentMD5(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setDescription(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setDisposition(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    /* access modifiers changed from: protected */
    public void setExpunged(boolean z) {
        super.setExpunged(z);
    }

    public void setFileName(String str) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public synchronized void setFlags(Flags flags, boolean z) throws MessagingException {
        synchronized (mo80166t()) {
            try {
                C17055g v = mo80168v();
                mo80163q();
                v.mo80304U(mo80169w(), flags, z);
            } catch (ConnectionException e) {
                throw new FolderClosedException(this.folder, e.getMessage());
            } catch (ProtocolException e2) {
                throw new MessagingException(e2.getMessage(), e2);
            }
        }
    }

    public void setFrom(Address address) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    /* access modifiers changed from: protected */
    public void setMessageNumber(int i) {
        super.setMessageNumber(i);
    }

    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setReplyTo(Address[] addressArr) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setSender(Address address) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setSentDate(Date date) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setSubject(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Object mo80166t() {
        return ((C16941c) this.folder).f68219C;
    }

    /* renamed from: u */
    public synchronized boolean mo80167u() {
        Boolean bool = this.f68289f;
        if (bool == null) {
            return ((C16960i) this.folder.getStore()).mo80186p();
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C17055g mo80168v() throws ProtocolException, FolderClosedException {
        ((C16941c) this.folder).mo80141U();
        C17055g gVar = ((C16941c) this.folder).f68217A;
        if (gVar != null) {
            return gVar;
        }
        throw new FolderClosedException(this.folder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo80169w() {
        return ((C16941c) this.folder).f68218B.mo80204i(getMessageNumber());
    }

    public void writeTo(OutputStream outputStream) throws IOException, MessagingException {
        if (this.f68297n) {
            super.writeTo(outputStream);
            return;
        }
        InputStream mimeStream = getMimeStream();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = mimeStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            mimeStream.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public long mo80170x() {
        return this.f68290g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo80171y(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            if (this.f68286c == null) {
                this.f68286c = new HashMap();
            }
            this.f68286c.putAll(map);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo80172z(C17058j jVar, String[] strArr, boolean z) throws MessagingException {
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        if (jVar instanceof Flags) {
            this.flags = (Flags) jVar;
        } else if (jVar instanceof C17051c) {
            this.f68285b = (C17051c) jVar;
        } else if (jVar instanceof C17057i) {
            this.f68287d = ((C17057i) jVar).mo80333a();
        } else if (jVar instanceof C17066q) {
            this.f68288e = ((C17066q) jVar).f68504a;
        } else if (jVar instanceof C17060l) {
            this.f68291h = ((C17060l) jVar).f68482a;
        } else if (jVar instanceof C17050b) {
            this.f68284a = (C17050b) jVar;
        } else if (jVar instanceof C17068s) {
            C17068s sVar = (C17068s) jVar;
            this.f68290g = sVar.f68511a;
            Folder folder = this.folder;
            if (((C16941c) folder).f68220D == null) {
                ((C16941c) folder).f68220D = new Hashtable<>();
            }
            ((C16941c) this.folder).f68220D.put(Long.valueOf(sVar.f68511a), this);
        } else {
            boolean z3 = jVar instanceof C17065p;
            if (!z3 && !(jVar instanceof C17049a)) {
                return false;
            }
            if (z3) {
                C17065p pVar = (C17065p) jVar;
                byteArrayInputStream = pVar.mo80334a();
                z2 = pVar.mo80335b();
            } else {
                C17049a aVar = (C17049a) jVar;
                byteArrayInputStream = aVar.mo80273b();
                z2 = aVar.mo80275d();
            }
            if (!z2) {
                try {
                    this.f68288e = (long) byteArrayInputStream.available();
                } catch (IOException unused) {
                }
                parse(byteArrayInputStream);
                this.f68297n = true;
                m100122I(true);
            } else {
                InternetHeaders internetHeaders = new InternetHeaders();
                if (byteArrayInputStream != null) {
                    internetHeaders.load(byteArrayInputStream);
                }
                if (this.headers == null || z) {
                    this.headers = internetHeaders;
                } else {
                    Enumeration<Header> allHeaders = internetHeaders.getAllHeaders();
                    while (allHeaders.hasMoreElements()) {
                        Header nextElement = allHeaders.nextElement();
                        if (!m100116B(nextElement.getName())) {
                            this.headers.addHeader(nextElement.getName(), nextElement.getValue());
                        }
                    }
                }
                if (z) {
                    m100122I(true);
                } else {
                    for (String H : strArr) {
                        m100121H(H);
                    }
                }
            }
        }
        return true;
    }

    protected C16955e(Session session) {
        super(session);
    }

    public String getHeader(String str, String str2) throws MessagingException {
        mo80163q();
        if (getHeader(str) == null) {
            return null;
        }
        return this.headers.getHeader(str, str2);
    }
}
