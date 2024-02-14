package p438y7;

import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.FolderNotFoundException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.ReadOnlyFolderException;
import javax.mail.StoreClosedException;
import javax.mail.UIDFolder;
import javax.mail.event.MailEvent;
import javax.mail.event.MessageChangedEvent;
import javax.mail.event.MessageCountListener;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchException;
import javax.mail.search.SearchTerm;
import p430x7.C16853d;
import p430x7.C16854e;
import p438y7.C16967o;
import p447z7.C17052d;
import p447z7.C17054f;
import p447z7.C17055g;
import p447z7.C17056h;
import p447z7.C17059k;
import p447z7.C17060l;
import p447z7.C17061m;
import p447z7.C17062n;
import p447z7.C17067r;
import p447z7.C17068s;
import p447z7.C17069t;

/* renamed from: y7.c */
/* compiled from: IMAPFolder */
public class C16941c extends Folder implements UIDFolder, C16854e {

    /* renamed from: A */
    protected volatile C17055g f68217A;

    /* renamed from: B */
    protected C16963k f68218B;

    /* renamed from: C */
    protected final Object f68219C;

    /* renamed from: D */
    protected Hashtable<Long, C16955e> f68220D;

    /* renamed from: E */
    private volatile boolean f68221E;

    /* renamed from: F */
    private boolean f68222F;

    /* renamed from: G */
    private int f68223G;

    /* renamed from: H */
    private volatile int f68224H;

    /* renamed from: I */
    private volatile int f68225I;

    /* renamed from: J */
    private int f68226J;

    /* renamed from: K */
    private long f68227K;

    /* renamed from: L */
    private long f68228L;

    /* renamed from: M */
    private boolean f68229M;

    /* renamed from: N */
    private volatile long f68230N;

    /* renamed from: O */
    private boolean f68231O;

    /* renamed from: P */
    private C17067r f68232P;

    /* renamed from: Q */
    private long f68233Q;

    /* renamed from: R */
    private boolean f68234R;

    /* renamed from: S */
    protected MailLogger f68235S;

    /* renamed from: T */
    private MailLogger f68236T;

    /* renamed from: a */
    protected volatile String f68237a;

    /* renamed from: c */
    protected String f68238c;

    /* renamed from: d */
    protected int f68239d;

    /* renamed from: f */
    protected char f68240f;

    /* renamed from: g */
    protected Flags f68241g;

    /* renamed from: o */
    protected Flags f68242o;

    /* renamed from: p */
    protected volatile boolean f68243p;

    /* renamed from: s */
    protected boolean f68244s;

    /* renamed from: z */
    protected volatile String[] f68245z;

    /* renamed from: y7.c$a */
    /* compiled from: IMAPFolder */
    class C16942a implements C16953l {

        /* renamed from: a */
        final /* synthetic */ Flags f68246a;

        /* renamed from: b */
        final /* synthetic */ Date f68247b;

        /* renamed from: c */
        final /* synthetic */ C16964l f68248c;

        C16942a(Flags flags, Date date, C16964l lVar) {
            this.f68246a = flags;
            this.f68247b = date;
            this.f68248c = lVar;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            gVar.mo80310f(C16941c.this.f68237a, this.f68246a, this.f68247b, this.f68248c);
            return null;
        }
    }

    /* renamed from: y7.c$b */
    /* compiled from: IMAPFolder */
    class C16943b implements C16953l {

        /* renamed from: a */
        final /* synthetic */ String f68250a;

        C16943b(String str) {
            this.f68250a = str;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            return gVar.mo80290G("", this.f68250a);
        }
    }

    /* renamed from: y7.c$c */
    /* compiled from: IMAPFolder */
    class C16944c implements C16953l {

        /* renamed from: a */
        final /* synthetic */ boolean f68252a;

        /* renamed from: b */
        final /* synthetic */ char f68253b;

        /* renamed from: c */
        final /* synthetic */ String f68254c;

        C16944c(boolean z, char c, String str) {
            this.f68252a = z;
            this.f68253b = c;
            this.f68254c = str;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            if (this.f68252a) {
                return gVar.mo80292I("", C16941c.this.f68237a + this.f68253b + this.f68254c);
            }
            return gVar.mo80290G("", C16941c.this.f68237a + this.f68253b + this.f68254c);
        }
    }

    /* renamed from: y7.c$d */
    /* compiled from: IMAPFolder */
    class C16945d implements C16953l {
        C16945d() {
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            if (gVar.mo80289F()) {
                return gVar.mo80290G(C16941c.this.f68237a, "");
            }
            return gVar.mo80290G("", C16941c.this.f68237a);
        }
    }

    /* renamed from: y7.c$e */
    /* compiled from: IMAPFolder */
    class C16946e implements C16953l {

        /* renamed from: a */
        final /* synthetic */ String f68257a;

        C16946e(String str) {
            this.f68257a = str;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            return gVar.mo80292I("", this.f68257a);
        }
    }

    /* renamed from: y7.c$f */
    /* compiled from: IMAPFolder */
    class C16947f implements C16953l {

        /* renamed from: a */
        final /* synthetic */ boolean f68259a;

        C16947f(boolean z) {
            this.f68259a = z;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            if (this.f68259a) {
                gVar.mo80306W(C16941c.this.f68237a);
                return null;
            }
            gVar.mo80309Z(C16941c.this.f68237a);
            return null;
        }
    }

    /* renamed from: y7.c$g */
    /* compiled from: IMAPFolder */
    class C16948g implements C16953l {

        /* renamed from: a */
        final /* synthetic */ int f68261a;

        /* renamed from: b */
        final /* synthetic */ char f68262b;

        C16948g(int i, char c) {
            this.f68261a = i;
            this.f68262b = c;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            C17059k[] G;
            if ((this.f68261a & 1) == 0) {
                gVar.mo80313i(C16941c.this.f68237a + this.f68262b);
            } else {
                gVar.mo80313i(C16941c.this.f68237a);
                if (!((this.f68261a & 2) == 0 || (G = gVar.mo80290G("", C16941c.this.f68237a)) == null || G[0].f68477c)) {
                    gVar.mo80314j(C16941c.this.f68237a);
                    throw new ProtocolException("Unsupported type");
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: y7.c$h */
    /* compiled from: IMAPFolder */
    class C16949h implements C16953l {

        /* renamed from: a */
        final /* synthetic */ String f68264a;

        C16949h(String str) {
            this.f68264a = str;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            return gVar.mo80290G("", this.f68264a);
        }
    }

    /* renamed from: y7.c$i */
    /* compiled from: IMAPFolder */
    class C16950i implements C16953l {
        C16950i() {
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            gVar.mo80314j(C16941c.this.f68237a);
            return Boolean.TRUE;
        }
    }

    /* renamed from: y7.c$j */
    /* compiled from: IMAPFolder */
    class C16951j implements C16953l {

        /* renamed from: a */
        final /* synthetic */ Folder f68267a;

        C16951j(Folder folder) {
            this.f68267a = folder;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            gVar.mo80298O(C16941c.this.f68237a, this.f68267a.getFullName());
            return Boolean.TRUE;
        }
    }

    /* renamed from: y7.c$k */
    /* compiled from: IMAPFolder */
    public static class C16952k extends FetchProfile.Item {

        /* renamed from: a */
        public static final C16952k f68269a = new C16952k("HEADERS");
        @Deprecated

        /* renamed from: b */
        public static final C16952k f68270b = new C16952k("SIZE");

        /* renamed from: c */
        public static final C16952k f68271c = new C16952k("MESSAGE");

        /* renamed from: d */
        public static final C16952k f68272d = new C16952k("INTERNALDATE");

        protected C16952k(String str) {
            super(str);
        }
    }

    /* renamed from: y7.c$l */
    /* compiled from: IMAPFolder */
    public interface C16953l {
        /* renamed from: a */
        Object mo80128a(C17055g gVar) throws ProtocolException;
    }

    static {
        Class<C16941c> cls = C16941c.class;
    }

    protected C16941c(String str, char c, C16960i iVar, Boolean bool) {
        super(iVar);
        int indexOf;
        this.f68244s = false;
        this.f68219C = new Object();
        this.f68221E = false;
        this.f68222F = true;
        this.f68223G = 0;
        this.f68224H = -1;
        this.f68225I = -1;
        this.f68226J = -1;
        this.f68227K = -1;
        this.f68228L = -1;
        this.f68229M = false;
        this.f68230N = -1;
        this.f68231O = true;
        this.f68232P = null;
        this.f68233Q = 0;
        this.f68234R = false;
        Objects.requireNonNull(str, "Folder name is null");
        this.f68237a = str;
        this.f68240f = c;
        this.f68235S = new MailLogger(getClass(), "DEBUG IMAP", iVar.getSession().getDebug(), iVar.getSession().getDebugOut());
        this.f68236T = iVar.mo80182h();
        this.f68244s = false;
        if (c != 65535 && c != 0 && (indexOf = this.f68237a.indexOf(c)) > 0 && indexOf == this.f68237a.length() - 1) {
            this.f68237a = this.f68237a.substring(0, indexOf);
            this.f68244s = true;
        }
        if (bool != null) {
            this.f68244s = bool.booleanValue();
        }
    }

    /* renamed from: D */
    private C17067r m100065D() throws ProtocolException {
        int s = ((C16960i) this.store).mo80188s();
        if (s > 0 && this.f68232P != null && System.currentTimeMillis() - this.f68233Q < ((long) s)) {
            return this.f68232P;
        }
        C17055g gVar = null;
        try {
            C17055g E = mo80132E();
            try {
                C17067r T = E.mo80303T(this.f68237a, (String[]) null);
                if (s > 0) {
                    this.f68232P = T;
                    this.f68233Q = System.currentTimeMillis();
                }
                mo80139Q(E);
                return T;
            } catch (Throwable th) {
                th = th;
                gVar = E;
                mo80139Q(gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mo80139Q(gVar);
            throw th;
        }
    }

    /* renamed from: H */
    private boolean m100066H() {
        return (this.f68239d & 2) != 0;
    }

    /* renamed from: I */
    private boolean m100067I(Throwable th) {
        return (th instanceof Exception) || (th instanceof LinkageError);
    }

    /* renamed from: K */
    private MessagingException m100068K(String str, ProtocolException protocolException) {
        MessagingException messagingException = new MessagingException(str, protocolException);
        try {
            this.f68217A.mo80291H();
        } catch (Throwable th) {
            m100070b(messagingException, th);
        }
        return messagingException;
    }

    /* renamed from: N */
    private Message m100069N(C17054f fVar) {
        C16955e A = mo80129A(fVar.mo80331t());
        if (A == null) {
            return A;
        }
        boolean z = false;
        C17068s sVar = (C17068s) fVar.mo80282x(C17068s.class);
        boolean z2 = true;
        if (sVar != null) {
            long x = A.mo80170x();
            long j = sVar.f68511a;
            if (x != j) {
                A.mo80159L(j);
                if (this.f68220D == null) {
                    this.f68220D = new Hashtable<>();
                }
                this.f68220D.put(Long.valueOf(sVar.f68511a), A);
                z = true;
            }
        }
        C17060l lVar = (C17060l) fVar.mo80282x(C17060l.class);
        if (lVar != null) {
            long d = A.mo80160d();
            long j2 = lVar.f68482a;
            if (d != j2) {
                A.mo80157J(j2);
                z = true;
            }
        }
        C17052d dVar = (C17052d) fVar.mo80282x(C17052d.class);
        if (dVar != null) {
            A.mo80162f(dVar);
        } else {
            z2 = z;
        }
        A.mo80171y(fVar.mo80280v());
        if (!z2) {
            return null;
        }
        return A;
    }

    /* renamed from: b */
    private void m100070b(Throwable th, Throwable th2) {
        if (m100067I(th2)) {
            th.addSuppressed(th2);
            return;
        }
        th2.addSuppressed(th);
        if (th2 instanceof Error) {
            throw ((Error) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw new RuntimeException("unexpected exception", th2);
        }
    }

    /* renamed from: f */
    private void m100071f(Flags flags) throws MessagingException {
        if (this.mode != 2) {
            throw new IllegalStateException("Cannot change flags on READ_ONLY folder: " + this.f68237a);
        }
    }

    /* renamed from: i */
    private void m100072i(boolean z) {
        mo80138O(z);
        this.f68218B = null;
        this.f68220D = null;
        this.f68243p = false;
        this.f68245z = null;
        this.f68221E = false;
        this.f68223G = 0;
        this.f68219C.notifyAll();
        notifyConnectionListeners(3);
    }

    /* renamed from: j */
    private MessagingException m100073j(MessagingException messagingException) {
        try {
            this.f68217A.mo80311g();
            mo80138O(true);
        } catch (ProtocolException e) {
            m100070b(messagingException, m100068K(e.getMessage(), e));
            mo80138O(false);
        } catch (Throwable th) {
            m100070b(messagingException, th);
        }
        return messagingException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a6, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100074m(boolean r5, boolean r6) throws javax.mail.MessagingException {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f68219C
            monitor-enter(r0)
            boolean r1 = r4.f68221E     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x0014
            boolean r1 = r4.f68222F     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = "This operation is not allowed on a closed folder"
            r5.<init>(r6)     // Catch:{ all -> 0x00bc }
            throw r5     // Catch:{ all -> 0x00bc }
        L_0x0014:
            r1 = 1
            r4.f68222F = r1     // Catch:{ all -> 0x00bc }
            boolean r2 = r4.f68221E     // Catch:{ all -> 0x00bc }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return
        L_0x001d:
            r4.mo80141U()     // Catch:{ ProtocolException -> 0x00a9 }
            r2 = 0
            if (r6 == 0) goto L_0x0038
            com.sun.mail.util.MailLogger r5 = r4.f68235S     // Catch:{ ProtocolException -> 0x00a9 }
            java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ ProtocolException -> 0x00a9 }
            java.lang.String r2 = "forcing folder {0} to close"
            java.lang.String r3 = r4.f68237a     // Catch:{ ProtocolException -> 0x00a9 }
            r5.log((java.util.logging.Level) r6, (java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ ProtocolException -> 0x00a9 }
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            if (r5 == 0) goto L_0x009e
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            r5.mo80315k()     // Catch:{ ProtocolException -> 0x00a9 }
            goto L_0x009e
        L_0x0038:
            javax.mail.Store r6 = r4.store     // Catch:{ ProtocolException -> 0x00a9 }
            y7.i r6 = (p438y7.C16960i) r6     // Catch:{ ProtocolException -> 0x00a9 }
            boolean r6 = r6.mo80192y()     // Catch:{ ProtocolException -> 0x00a9 }
            if (r6 == 0) goto L_0x005e
            com.sun.mail.util.MailLogger r6 = r4.f68235S     // Catch:{ ProtocolException -> 0x00a9 }
            java.lang.String r2 = "pool is full, not adding an Authenticated connection"
            r6.fine(r2)     // Catch:{ ProtocolException -> 0x00a9 }
            if (r5 == 0) goto L_0x0054
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            if (r5 == 0) goto L_0x0054
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            r5.mo80311g()     // Catch:{ ProtocolException -> 0x00a9 }
        L_0x0054:
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            if (r5 == 0) goto L_0x009e
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            r5.mo80291H()     // Catch:{ ProtocolException -> 0x00a9 }
            goto L_0x009e
        L_0x005e:
            if (r5 != 0) goto L_0x0095
            int r5 = r4.mode     // Catch:{ ProtocolException -> 0x00a9 }
            r6 = 2
            if (r5 != r6) goto L_0x0095
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x0093 }
            if (r5 == 0) goto L_0x0079
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x0093 }
            java.lang.String r6 = "UNSELECT"
            boolean r5 = r5.mo80286C(r6)     // Catch:{ ProtocolException -> 0x0093 }
            if (r5 == 0) goto L_0x0079
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x0093 }
            r5.mo80308Y()     // Catch:{ ProtocolException -> 0x0093 }
            goto L_0x009e
        L_0x0079:
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x0093 }
            if (r5 == 0) goto L_0x009e
            z7.g r5 = r4.f68217A     // Catch:{ CommandFailedException -> 0x0086 }
            java.lang.String r6 = r4.f68237a     // Catch:{ CommandFailedException -> 0x0086 }
            r5.mo80317m(r6)     // Catch:{ CommandFailedException -> 0x0086 }
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r5 == 0) goto L_0x009e
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x0093 }
            if (r5 == 0) goto L_0x009e
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x0093 }
            r5.mo80311g()     // Catch:{ ProtocolException -> 0x0093 }
            goto L_0x009e
        L_0x0093:
            r1 = 0
            goto L_0x009e
        L_0x0095:
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            if (r5 == 0) goto L_0x009e
            z7.g r5 = r4.f68217A     // Catch:{ ProtocolException -> 0x00a9 }
            r5.mo80311g()     // Catch:{ ProtocolException -> 0x00a9 }
        L_0x009e:
            boolean r5 = r4.f68221E     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x00a5
            r4.m100072i(r1)     // Catch:{ all -> 0x00bc }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return
        L_0x00a7:
            r5 = move-exception
            goto L_0x00b4
        L_0x00a9:
            r5 = move-exception
            javax.mail.MessagingException r6 = new javax.mail.MessagingException     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x00a7 }
            r6.<init>(r2, r5)     // Catch:{ all -> 0x00a7 }
            throw r6     // Catch:{ all -> 0x00a7 }
        L_0x00b4:
            boolean r6 = r4.f68221E     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x00bb
            r4.m100072i(r1)     // Catch:{ all -> 0x00bc }
        L_0x00bb:
            throw r5     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.m100074m(boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m100075o(javax.mail.Message[] r4, javax.mail.Folder r5, boolean r6) throws javax.mail.MessagingException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo80144g()     // Catch:{ all -> 0x0096 }
            int r0 = r4.length     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            javax.mail.Store r0 = r5.getStore()     // Catch:{ all -> 0x0096 }
            javax.mail.Store r1 = r3.store     // Catch:{ all -> 0x0096 }
            if (r0 != r1) goto L_0x0087
            java.lang.Object r0 = r3.f68219C     // Catch:{ all -> 0x0096 }
            monitor-enter(r0)     // Catch:{ all -> 0x0096 }
            z7.g r1 = r3.mo80131C()     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            r2 = 0
            z7.n[] r4 = p438y7.C16967o.m100204a(r4, r2)     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            if (r4 == 0) goto L_0x0032
            if (r6 == 0) goto L_0x0029
            java.lang.String r6 = r5.getFullName()     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            r1.mo80293J(r4, r6)     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            goto L_0x0030
        L_0x0029:
            java.lang.String r6 = r5.getFullName()     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            r1.mo80312h(r4, r6)     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            goto L_0x008c
        L_0x0032:
            javax.mail.MessageRemovedException r4 = new javax.mail.MessageRemovedException     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            java.lang.String r6 = "Messages have been removed"
            r4.<init>(r6)     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
            throw r4     // Catch:{ CommandFailedException -> 0x0052, ConnectionException -> 0x0047, ProtocolException -> 0x003c }
        L_0x003a:
            r4 = move-exception
            goto L_0x0085
        L_0x003c:
            r4 = move-exception
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch:{ all -> 0x003a }
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x003a }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x003a }
            throw r5     // Catch:{ all -> 0x003a }
        L_0x0047:
            r4 = move-exception
            javax.mail.FolderClosedException r5 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x003a }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x003a }
            throw r5     // Catch:{ all -> 0x003a }
        L_0x0052:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "TRYCREATE"
            int r6 = r6.indexOf(r1)     // Catch:{ all -> 0x003a }
            r1 = -1
            if (r6 == r1) goto L_0x007b
            javax.mail.FolderNotFoundException r4 = new javax.mail.FolderNotFoundException     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r6.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r5.getFullName()     // Catch:{ all -> 0x003a }
            r6.append(r1)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = " does not exist"
            r6.append(r1)     // Catch:{ all -> 0x003a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x003a }
            r4.<init>((javax.mail.Folder) r5, (java.lang.String) r6)     // Catch:{ all -> 0x003a }
            throw r4     // Catch:{ all -> 0x003a }
        L_0x007b:
            javax.mail.MessagingException r5 = new javax.mail.MessagingException     // Catch:{ all -> 0x003a }
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x003a }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x003a }
            throw r5     // Catch:{ all -> 0x003a }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r4     // Catch:{ all -> 0x0096 }
        L_0x0087:
            if (r6 != 0) goto L_0x008e
            super.copyMessages(r4, r5)     // Catch:{ all -> 0x0096 }
        L_0x008c:
            monitor-exit(r3)
            return
        L_0x008e:
            javax.mail.MessagingException r4 = new javax.mail.MessagingException     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "Move between stores not supported"
            r4.<init>(r5)     // Catch:{ all -> 0x0096 }
            throw r4     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.m100075o(javax.mail.Message[], javax.mail.Folder, boolean):void");
    }

    /* renamed from: p */
    private String m100076p(String[] strArr, boolean z) {
        StringBuilder sb;
        if (z) {
            sb = new StringBuilder("BODY.PEEK[HEADER.FIELDS (");
        } else {
            sb = new StringBuilder("RFC822.HEADER.LINES (");
        }
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(strArr[i]);
        }
        if (z) {
            sb.append(")]");
        } else {
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: r */
    private Message[] m100077r(long[] jArr) {
        C16955e[] eVarArr = new C16955e[jArr.length];
        for (int i = 0; i < jArr.length; i = i + 1 + 1) {
            C16955e eVar = null;
            Hashtable<Long, C16955e> hashtable = this.f68220D;
            if (hashtable != null) {
                eVar = hashtable.get(Long.valueOf(jArr[i]));
            }
            if (eVar == null) {
                eVar = mo80136L(-1);
                eVar.mo80159L(jArr[i]);
                eVar.setExpunged(true);
            }
            eVarArr[i] = eVar;
        }
        return eVarArr;
    }

    /* renamed from: v */
    private synchronized Folder[] m100078v(String str, boolean z) throws MessagingException {
        mo80143e();
        int i = 0;
        if (this.f68245z == null || m100066H()) {
            char separator = getSeparator();
            C17059k[] kVarArr = (C17059k[]) mo80147u(new C16944c(z, separator, str));
            if (kVarArr == null) {
                return new Folder[0];
            }
            if (kVarArr.length > 0) {
                String str2 = kVarArr[0].f68475a;
                if (str2.equals(this.f68237a + separator)) {
                    i = 1;
                }
            }
            C16941c[] cVarArr = new C16941c[(kVarArr.length - i)];
            C16960i iVar = (C16960i) this.store;
            for (int i2 = i; i2 < kVarArr.length; i2++) {
                cVarArr[i2 - i] = iVar.mo80176C(kVarArr[i2]);
            }
            return cVarArr;
        }
        return new Folder[0];
    }

    /* renamed from: y */
    private int m100079y(C17059k[] kVarArr, String str) {
        int i = 0;
        while (i < kVarArr.length && !kVarArr[i].f68475a.equals(str)) {
            i++;
        }
        if (i >= kVarArr.length) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C16955e mo80129A(int i) {
        if (i <= this.f68218B.mo80205k()) {
            return this.f68218B.mo80201e(i);
        }
        if (!this.f68235S.isLoggable(Level.FINE)) {
            return null;
        }
        MailLogger mailLogger = this.f68235S;
        mailLogger.fine("ignoring message number " + i + " outside range " + this.f68218B.mo80205k());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C16955e[] mo80130B(int[] iArr) {
        int length = iArr.length;
        C16955e[] eVarArr = new C16955e[length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            eVarArr[i2] = mo80129A(iArr[i2]);
            if (eVarArr[i2] == null) {
                i++;
            }
        }
        if (i <= 0) {
            return eVarArr;
        }
        C16955e[] eVarArr2 = new C16955e[(iArr.length - i)];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (eVarArr[i4] != null) {
                eVarArr2[i3] = eVarArr[i4];
                i3++;
            }
        }
        return eVarArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C17055g mo80131C() throws ProtocolException {
        mo80141U();
        if (this.f68217A != null) {
            return this.f68217A;
        }
        throw new ConnectionException("Connection closed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public synchronized C17055g mo80132E() throws ProtocolException {
        this.f68236T.fine("getStoreProtocol() borrowing a connection");
        return ((C16960i) this.store).mo80184j();
    }

    /* renamed from: F */
    public void mo80133F(C16853d dVar) {
        if (dVar.mo79999f() || dVar.mo79997d() || dVar.mo79995b() || dVar.mo79996c()) {
            ((C16960i) this.store).mo80189v(dVar);
        }
        int i = 0;
        if (dVar.mo79996c()) {
            if (this.f68221E) {
                m100072i(false);
            }
        } else if (dVar.mo79999f()) {
            dVar.mo80008r();
            if (dVar.mo80004l() == 91 && dVar.mo80001i().equalsIgnoreCase("HIGHESTMODSEQ")) {
                this.f68230N = dVar.mo80005n();
            }
            dVar.mo80007q();
        } else if (dVar.mo80000g()) {
            if (!(dVar instanceof C17056h)) {
                this.f68235S.fine("UNEXPECTED RESPONSE : " + dVar.toString());
                return;
            }
            C17056h hVar = (C17056h) dVar;
            if (hVar.mo80332u("EXISTS")) {
                int t = hVar.mo80331t();
                int i2 = this.f68226J;
                if (t > i2) {
                    int i3 = t - i2;
                    Message[] messageArr = new Message[i3];
                    this.f68218B.mo80198a(i3, i2 + 1);
                    int i4 = this.f68224H;
                    this.f68226J += i3;
                    this.f68224H += i3;
                    if (this.f68234R) {
                        while (i < i3) {
                            i4++;
                            messageArr[i] = this.f68218B.mo80200d(i4);
                            i++;
                        }
                        notifyMessageAddedListeners(messageArr);
                    }
                }
            } else if (hVar.mo80332u("EXPUNGE")) {
                int t2 = hVar.mo80331t();
                if (t2 <= this.f68226J) {
                    Message[] messageArr2 = null;
                    if (this.f68231O && this.f68234R) {
                        Message[] messageArr3 = {mo80129A(t2)};
                        if (messageArr3[0] != null) {
                            messageArr2 = messageArr3;
                        }
                    }
                    this.f68218B.mo80199c(t2);
                    this.f68226J--;
                    if (messageArr2 != null) {
                        notifyMessageRemovedListeners(false, messageArr2);
                    }
                }
            } else if (hVar.mo80332u("VANISHED")) {
                if (hVar.mo80003k() == null) {
                    C17069t[] a = C17069t.m100406a(hVar.mo80001i());
                    this.f68226J = (int) (((long) this.f68226J) - C17069t.m100407c(a));
                    Message[] r = m100077r(C17069t.m100409e(a));
                    int length = r.length;
                    while (i < length) {
                        Message message = r[i];
                        if (message.getMessageNumber() > 0) {
                            this.f68218B.mo80199c(message.getMessageNumber());
                        }
                        i++;
                    }
                    if (this.f68231O && this.f68234R) {
                        notifyMessageRemovedListeners(true, r);
                    }
                }
            } else if (hVar.mo80332u("FETCH")) {
                Message N = m100069N((C17054f) hVar);
                if (N != null) {
                    notifyMessageChangedListeners(1, N);
                }
            } else if (hVar.mo80332u("RECENT")) {
                this.f68225I = hVar.mo80331t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo80134G(C16853d[] dVarArr) {
        for (int i = 0; i < dVarArr.length; i++) {
            if (dVarArr[i] != null) {
                mo80133F(dVarArr[i]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo80135J(boolean z) throws ProtocolException {
        if (this.f68217A != null) {
            if (System.currentTimeMillis() - this.f68217A.mo79990b() > 1000) {
                mo80141U();
                if (this.f68217A != null) {
                    this.f68217A.mo80295L();
                }
            }
            if (z && ((C16960i) this.store).mo80190w()) {
                C17055g gVar = null;
                try {
                    gVar = ((C16960i) this.store).mo80184j();
                    if (System.currentTimeMillis() - gVar.mo79990b() > 1000) {
                        gVar.mo80295L();
                    }
                } finally {
                    ((C16960i) this.store).mo80177D(gVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C16955e mo80136L(int i) {
        return new C16955e(this, i);
    }

    /* renamed from: M */
    public synchronized List<MailEvent> mo80137M(int i, C16966n nVar) throws MessagingException {
        C17061m mVar;
        ArrayList arrayList;
        Message N;
        mo80142c();
        this.f68217A = ((C16960i) this.store).mo80187r(this);
        synchronized (this.f68219C) {
            this.f68217A.mo79989a(this);
            if (nVar != null) {
                try {
                    if (nVar == C16966n.f68346d) {
                        if (!this.f68217A.mo80288E("CONDSTORE") && !this.f68217A.mo80288E("QRESYNC")) {
                            if (this.f68217A.mo80286C("CONDSTORE")) {
                                this.f68217A.mo80316l("CONDSTORE");
                            } else {
                                this.f68217A.mo80316l("QRESYNC");
                            }
                        }
                    } else if (!this.f68217A.mo80288E("QRESYNC")) {
                        this.f68217A.mo80316l("QRESYNC");
                    }
                } catch (CommandFailedException e) {
                    mo80143e();
                    if ((this.f68239d & 1) == 0) {
                        throw new MessagingException("folder cannot contain messages");
                    }
                    throw new MessagingException(e.getMessage(), e);
                } catch (ProtocolException e2) {
                    throw m100068K(e2.getMessage(), e2);
                } catch (Throwable th) {
                    this.f68243p = false;
                    this.f68245z = null;
                    this.f68239d = 0;
                    mo80138O(true);
                    throw th;
                }
            }
            if (i == 1) {
                mVar = this.f68217A.mo80318n(this.f68237a, nVar);
            } else {
                mVar = this.f68217A.mo80301R(this.f68237a, nVar);
            }
            int i2 = mVar.f68491i;
            if (i2 != i) {
                if (i != 2 || i2 != 1 || !((C16960i) this.store).mo80180b()) {
                    throw m100073j(new ReadOnlyFolderException(this, "Cannot open in desired mode"));
                }
            }
            this.f68221E = true;
            this.f68222F = false;
            this.mode = mVar.f68491i;
            this.f68241g = mVar.f68483a;
            this.f68242o = mVar.f68484b;
            int i3 = mVar.f68485c;
            this.f68226J = i3;
            this.f68224H = i3;
            this.f68225I = mVar.f68486d;
            this.f68227K = mVar.f68487e;
            this.f68228L = mVar.f68488f;
            this.f68229M = mVar.f68489g;
            this.f68230N = mVar.f68490h;
            this.f68218B = new C16963k(this, (C16960i) this.store, this.f68224H);
            if (mVar.f68492j != null) {
                arrayList = new ArrayList();
                for (C17056h next : mVar.f68492j) {
                    if (next.mo80332u("VANISHED")) {
                        String[] k = next.mo80003k();
                        if (k != null && k.length == 1) {
                            if (k[0].equalsIgnoreCase("EARLIER")) {
                                long[] f = C17069t.m100410f(C17069t.m100406a(next.mo80001i()), this.f68228L);
                                if (f != null && f.length > 0) {
                                    arrayList.add(new C16965m(this, f));
                                }
                            }
                        }
                    } else if (next.mo80332u("FETCH") && (N = m100069N((C17054f) next)) != null) {
                        arrayList.add(new MessageChangedEvent(this, 1, N));
                    }
                }
            } else {
                arrayList = null;
            }
        }
        this.f68243p = true;
        this.f68245z = null;
        this.f68239d = 1;
        notifyConnectionListeners(1);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo80138O(boolean z) {
        if (this.f68217A != null) {
            this.f68217A.mo79993e(this);
            if (z) {
                ((C16960i) this.store).mo80178E(this, this.f68217A);
            } else {
                this.f68217A.mo80315k();
                ((C16960i) this.store).mo80178E(this, (C17055g) null);
            }
            this.f68217A = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public synchronized void mo80139Q(C17055g gVar) {
        if (gVar != this.f68217A) {
            ((C16960i) this.store).mo80177D(gVar);
        } else {
            this.f68235S.fine("releasing our protocol as store protocol?");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public synchronized void mo80140S(ConnectionException connectionException) throws FolderClosedException, StoreClosedException {
        if ((this.f68217A == null || connectionException.mo66404a() != this.f68217A) && (this.f68217A != null || this.f68222F)) {
            throw new StoreClosedException(this.store, connectionException.getMessage());
        }
        throw new FolderClosedException(this, connectionException.getMessage());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo80141U() throws ProtocolException {
        while (true) {
            int i = this.f68223G;
            if (i != 0) {
                if (i == 1) {
                    this.f68235S.finest("waitIfIdle: abort IDLE");
                    this.f68217A.mo80287D();
                    this.f68223G = 2;
                } else {
                    this.f68235S.log(Level.FINEST, "waitIfIdle: idleState {0}", (Object) Integer.valueOf(i));
                }
                try {
                    MailLogger mailLogger = this.f68235S;
                    Level level = Level.FINEST;
                    if (mailLogger.isLoggable(level)) {
                        MailLogger mailLogger2 = this.f68235S;
                        mailLogger2.finest("waitIfIdle: wait to be not idle: " + Thread.currentThread());
                    }
                    this.f68219C.wait();
                    if (this.f68235S.isLoggable(level)) {
                        MailLogger mailLogger3 = this.f68235S;
                        mailLogger3.finest("waitIfIdle: wait done, idleState " + this.f68223G + ": " + Thread.currentThread());
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new ProtocolException("Interrupted waitIfIdle", e);
                }
            } else {
                return;
            }
        }
    }

    public synchronized void addMessageCountListener(MessageCountListener messageCountListener) {
        super.addMessageCountListener(messageCountListener);
        this.f68234R = true;
    }

    public synchronized void appendMessages(Message[] messageArr) throws MessagingException {
        mo80143e();
        int g = ((C16960i) this.store).mo80181g();
        for (Message message : messageArr) {
            Date receivedDate = message.getReceivedDate();
            if (receivedDate == null) {
                receivedDate = message.getSentDate();
            }
            try {
                mo80146s(new C16942a(message.getFlags(), receivedDate, new C16964l(message, message.getSize() > g ? 0 : g)));
            } catch (IOException e) {
                throw new MessagingException("IOException while appending messages", e);
            } catch (MessageRemovedException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80142c() {
        if (this.f68221E) {
            throw new IllegalStateException("This operation is not allowed on an open folder");
        }
    }

    public synchronized void close(boolean z) throws MessagingException {
        m100074m(z, false);
    }

    public synchronized void copyMessages(Message[] messageArr, Folder folder) throws MessagingException {
        m100075o(messageArr, folder, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean create(int r4) throws javax.mail.MessagingException {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = r4 & 1
            r1 = 0
            if (r0 != 0) goto L_0x000b
            char r0 = r3.getSeparator()     // Catch:{ all -> 0x0025 }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            y7.c$g r2 = new y7.c$g     // Catch:{ all -> 0x0025 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0025 }
            java.lang.Object r4 = r3.mo80147u(r2)     // Catch:{ all -> 0x0025 }
            if (r4 != 0) goto L_0x0019
            monitor-exit(r3)
            return r1
        L_0x0019:
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0023
            r0 = 1
            r3.notifyFolderListeners(r0)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r3)
            return r4
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.create(int):boolean");
    }

    public synchronized boolean delete(boolean z) throws MessagingException {
        mo80142c();
        if (z) {
            Folder[] list = list();
            for (Folder delete : list) {
                delete.delete(z);
            }
        }
        if (mo80147u(new C16950i()) == null) {
            return false;
        }
        this.f68243p = false;
        this.f68245z = null;
        notifyFolderListeners(2);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo80143e() throws MessagingException {
        if (!this.f68243p && !exists()) {
            throw new FolderNotFoundException((Folder) this, this.f68237a + " not found");
        }
    }

    public synchronized boolean exists() throws MessagingException {
        String str;
        if (!this.f68244s || this.f68240f == 0) {
            str = this.f68237a;
        } else {
            str = this.f68237a + this.f68240f;
        }
        C17059k[] kVarArr = (C17059k[]) mo80146s(new C16943b(str));
        if (kVarArr != null) {
            int y = m100079y(kVarArr, str);
            this.f68237a = kVarArr[y].f68475a;
            this.f68240f = kVarArr[y].f68476b;
            int length = this.f68237a.length();
            if (this.f68240f != 0 && length > 0) {
                int i = length - 1;
                if (this.f68237a.charAt(i) == this.f68240f) {
                    this.f68237a = this.f68237a.substring(0, i);
                }
            }
            this.f68239d = 0;
            if (kVarArr[y].f68477c) {
                this.f68239d = 0 | 2;
            }
            if (kVarArr[y].f68478d) {
                this.f68239d |= 1;
            }
            this.f68243p = true;
            this.f68245z = kVarArr[y].f68480f;
        } else {
            this.f68243p = this.f68221E;
            this.f68245z = null;
        }
        return this.f68243p;
    }

    public synchronized Message[] expunge() throws MessagingException {
        return mo80149x((Message[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01bf, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void fetch(javax.mail.Message[] r17, javax.mail.FetchProfile r18) throws javax.mail.MessagingException {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            monitor-enter(r16)
            java.lang.Object r2 = r1.f68219C     // Catch:{ all -> 0x01d1 }
            monitor-enter(r2)     // Catch:{ all -> 0x01d1 }
            r16.mo80144g()     // Catch:{ all -> 0x01ce }
            z7.g r3 = r1.f68217A     // Catch:{ all -> 0x01ce }
            boolean r3 = r3.mo80289F()     // Catch:{ all -> 0x01ce }
            z7.g r4 = r1.f68217A     // Catch:{ all -> 0x01ce }
            z7.e[] r4 = r4.mo80284A()     // Catch:{ all -> 0x01ce }
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d1 }
            r2.<init>()     // Catch:{ all -> 0x01d1 }
            javax.mail.FetchProfile$Item r5 = javax.mail.FetchProfile.Item.ENVELOPE     // Catch:{ all -> 0x01d1 }
            boolean r5 = r0.contains((javax.mail.FetchProfile.Item) r5)     // Catch:{ all -> 0x01d1 }
            r7 = 0
            if (r5 == 0) goto L_0x002f
            java.lang.String r5 = r16.mo80150z()     // Catch:{ all -> 0x01d1 }
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            r5 = 0
            goto L_0x0030
        L_0x002f:
            r5 = 1
        L_0x0030:
            javax.mail.FetchProfile$Item r8 = javax.mail.FetchProfile.Item.FLAGS     // Catch:{ all -> 0x01d1 }
            boolean r8 = r0.contains((javax.mail.FetchProfile.Item) r8)     // Catch:{ all -> 0x01d1 }
            if (r8 == 0) goto L_0x0043
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "FLAGS"
            goto L_0x003f
        L_0x003d:
            java.lang.String r5 = " FLAGS"
        L_0x003f:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            r5 = 0
        L_0x0043:
            javax.mail.FetchProfile$Item r8 = javax.mail.FetchProfile.Item.CONTENT_INFO     // Catch:{ all -> 0x01d1 }
            boolean r8 = r0.contains((javax.mail.FetchProfile.Item) r8)     // Catch:{ all -> 0x01d1 }
            if (r8 == 0) goto L_0x0056
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = "BODYSTRUCTURE"
            goto L_0x0052
        L_0x0050:
            java.lang.String r5 = " BODYSTRUCTURE"
        L_0x0052:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            r5 = 0
        L_0x0056:
            javax.mail.UIDFolder$FetchProfileItem r8 = javax.mail.UIDFolder.FetchProfileItem.UID     // Catch:{ all -> 0x01d1 }
            boolean r8 = r0.contains((javax.mail.FetchProfile.Item) r8)     // Catch:{ all -> 0x01d1 }
            if (r8 == 0) goto L_0x0069
            if (r5 == 0) goto L_0x0063
            java.lang.String r5 = "UID"
            goto L_0x0065
        L_0x0063:
            java.lang.String r5 = " UID"
        L_0x0065:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            r5 = 0
        L_0x0069:
            y7.c$k r8 = p438y7.C16941c.C16952k.f68269a     // Catch:{ all -> 0x01d1 }
            boolean r8 = r0.contains((javax.mail.FetchProfile.Item) r8)     // Catch:{ all -> 0x01d1 }
            if (r8 == 0) goto L_0x008b
            if (r3 == 0) goto L_0x007e
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = "BODY.PEEK[HEADER]"
            goto L_0x007a
        L_0x0078:
            java.lang.String r5 = " BODY.PEEK[HEADER]"
        L_0x007a:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            goto L_0x0088
        L_0x007e:
            if (r5 == 0) goto L_0x0083
            java.lang.String r5 = "RFC822.HEADER"
            goto L_0x0085
        L_0x0083:
            java.lang.String r5 = " RFC822.HEADER"
        L_0x0085:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
        L_0x0088:
            r5 = 0
            r8 = 1
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            y7.c$k r9 = p438y7.C16941c.C16952k.f68271c     // Catch:{ all -> 0x01d1 }
            boolean r9 = r0.contains((javax.mail.FetchProfile.Item) r9)     // Catch:{ all -> 0x01d1 }
            if (r9 == 0) goto L_0x00ad
            if (r3 == 0) goto L_0x00a1
            if (r5 == 0) goto L_0x009b
            java.lang.String r5 = "BODY.PEEK[]"
            goto L_0x009d
        L_0x009b:
            java.lang.String r5 = " BODY.PEEK[]"
        L_0x009d:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            goto L_0x00ab
        L_0x00a1:
            if (r5 == 0) goto L_0x00a6
            java.lang.String r5 = "RFC822"
            goto L_0x00a8
        L_0x00a6:
            java.lang.String r5 = " RFC822"
        L_0x00a8:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
        L_0x00ab:
            r5 = 0
            r8 = 1
        L_0x00ad:
            javax.mail.FetchProfile$Item r9 = javax.mail.FetchProfile.Item.SIZE     // Catch:{ all -> 0x01d1 }
            boolean r9 = r0.contains((javax.mail.FetchProfile.Item) r9)     // Catch:{ all -> 0x01d1 }
            if (r9 != 0) goto L_0x00bd
            y7.c$k r9 = p438y7.C16941c.C16952k.f68270b     // Catch:{ all -> 0x01d1 }
            boolean r9 = r0.contains((javax.mail.FetchProfile.Item) r9)     // Catch:{ all -> 0x01d1 }
            if (r9 == 0) goto L_0x00c8
        L_0x00bd:
            if (r5 == 0) goto L_0x00c2
            java.lang.String r5 = "RFC822.SIZE"
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r5 = " RFC822.SIZE"
        L_0x00c4:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            r5 = 0
        L_0x00c8:
            y7.c$k r9 = p438y7.C16941c.C16952k.f68272d     // Catch:{ all -> 0x01d1 }
            boolean r9 = r0.contains((javax.mail.FetchProfile.Item) r9)     // Catch:{ all -> 0x01d1 }
            if (r9 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = "INTERNALDATE"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r5 = " INTERNALDATE"
        L_0x00d7:
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
            r5 = 0
        L_0x00db:
            r9 = 0
            if (r8 != 0) goto L_0x00f4
            java.lang.String[] r10 = r18.getHeaderNames()     // Catch:{ all -> 0x01d1 }
            int r11 = r10.length     // Catch:{ all -> 0x01d1 }
            if (r11 <= 0) goto L_0x00f5
            if (r5 != 0) goto L_0x00ec
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
        L_0x00ec:
            java.lang.String r3 = r1.m100076p(r10, r3)     // Catch:{ all -> 0x01d1 }
            r2.append(r3)     // Catch:{ all -> 0x01d1 }
            goto L_0x00f5
        L_0x00f4:
            r10 = r9
        L_0x00f5:
            r3 = 0
        L_0x00f6:
            int r5 = r4.length     // Catch:{ all -> 0x01d1 }
            if (r3 >= r5) goto L_0x011c
            r5 = r4[r3]     // Catch:{ all -> 0x01d1 }
            javax.mail.FetchProfile$Item r5 = r5.mo80278a()     // Catch:{ all -> 0x01d1 }
            boolean r5 = r0.contains((javax.mail.FetchProfile.Item) r5)     // Catch:{ all -> 0x01d1 }
            if (r5 == 0) goto L_0x0119
            int r5 = r2.length()     // Catch:{ all -> 0x01d1 }
            if (r5 == 0) goto L_0x0110
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
        L_0x0110:
            r5 = r4[r3]     // Catch:{ all -> 0x01d1 }
            java.lang.String r5 = r5.mo80279b()     // Catch:{ all -> 0x01d1 }
            r2.append(r5)     // Catch:{ all -> 0x01d1 }
        L_0x0119:
            int r3 = r3 + 1
            goto L_0x00f6
        L_0x011c:
            y7.e$a r3 = new y7.e$a     // Catch:{ all -> 0x01d1 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x01d1 }
            java.lang.Object r4 = r1.f68219C     // Catch:{ all -> 0x01d1 }
            monitor-enter(r4)     // Catch:{ all -> 0x01d1 }
            r16.mo80144g()     // Catch:{ all -> 0x01cb }
            r5 = r17
            z7.n[] r3 = p438y7.C16967o.m100205b(r5, r3)     // Catch:{ all -> 0x01cb }
            if (r3 != 0) goto L_0x0132
            monitor-exit(r4)     // Catch:{ all -> 0x01cb }
            monitor-exit(r16)
            return
        L_0x0132:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01cb }
            r5.<init>()     // Catch:{ all -> 0x01cb }
            z7.g r11 = r16.mo80131C()     // Catch:{ ConnectionException -> 0x01c0, CommandFailedException -> 0x014f, ProtocolException -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectionException -> 0x01c0, CommandFailedException -> 0x014f, ProtocolException -> 0x0144 }
            x7.d[] r9 = r11.mo80321q(r3, r2)     // Catch:{ ConnectionException -> 0x01c0, CommandFailedException -> 0x014f, ProtocolException -> 0x0144 }
            goto L_0x0150
        L_0x0144:
            r0 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x01cb }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x01cb }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01cb }
            throw r2     // Catch:{ all -> 0x01cb }
        L_0x014f:
        L_0x0150:
            if (r9 != 0) goto L_0x0155
            monitor-exit(r4)     // Catch:{ all -> 0x01cb }
            monitor-exit(r16)
            return
        L_0x0155:
            r2 = 0
        L_0x0156:
            int r3 = r9.length     // Catch:{ all -> 0x01cb }
            if (r2 >= r3) goto L_0x01ab
            r3 = r9[r2]     // Catch:{ all -> 0x01cb }
            if (r3 != 0) goto L_0x015e
            goto L_0x01a8
        L_0x015e:
            r3 = r9[r2]     // Catch:{ all -> 0x01cb }
            boolean r3 = r3 instanceof p447z7.C17054f     // Catch:{ all -> 0x01cb }
            if (r3 != 0) goto L_0x016a
            r3 = r9[r2]     // Catch:{ all -> 0x01cb }
            r5.add(r3)     // Catch:{ all -> 0x01cb }
            goto L_0x01a8
        L_0x016a:
            r3 = r9[r2]     // Catch:{ all -> 0x01cb }
            z7.f r3 = (p447z7.C17054f) r3     // Catch:{ all -> 0x01cb }
            int r11 = r3.mo80331t()     // Catch:{ all -> 0x01cb }
            y7.e r11 = r1.mo80129A(r11)     // Catch:{ all -> 0x01cb }
            int r12 = r3.mo80283y()     // Catch:{ all -> 0x01cb }
            r13 = 0
            r14 = 0
        L_0x017c:
            if (r13 >= r12) goto L_0x019a
            z7.j r15 = r3.mo80281w(r13)     // Catch:{ all -> 0x01cb }
            boolean r6 = r15 instanceof javax.mail.Flags     // Catch:{ all -> 0x01cb }
            if (r6 == 0) goto L_0x0192
            javax.mail.FetchProfile$Item r6 = javax.mail.FetchProfile.Item.FLAGS     // Catch:{ all -> 0x01cb }
            boolean r6 = r0.contains((javax.mail.FetchProfile.Item) r6)     // Catch:{ all -> 0x01cb }
            if (r6 == 0) goto L_0x0190
            if (r11 != 0) goto L_0x0192
        L_0x0190:
            r14 = 1
            goto L_0x0197
        L_0x0192:
            if (r11 == 0) goto L_0x0197
            r11.mo80172z(r15, r10, r8)     // Catch:{ all -> 0x01cb }
        L_0x0197:
            int r13 = r13 + 1
            goto L_0x017c
        L_0x019a:
            if (r11 == 0) goto L_0x01a3
            java.util.Map r6 = r3.mo80280v()     // Catch:{ all -> 0x01cb }
            r11.mo80171y(r6)     // Catch:{ all -> 0x01cb }
        L_0x01a3:
            if (r14 == 0) goto L_0x01a8
            r5.add(r3)     // Catch:{ all -> 0x01cb }
        L_0x01a8:
            int r2 = r2 + 1
            goto L_0x0156
        L_0x01ab:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x01cb }
            if (r0 != 0) goto L_0x01bd
            int r0 = r5.size()     // Catch:{ all -> 0x01cb }
            x7.d[] r0 = new p430x7.C16853d[r0]     // Catch:{ all -> 0x01cb }
            r5.toArray(r0)     // Catch:{ all -> 0x01cb }
            r1.mo80134G(r0)     // Catch:{ all -> 0x01cb }
        L_0x01bd:
            monitor-exit(r4)     // Catch:{ all -> 0x01cb }
            monitor-exit(r16)
            return
        L_0x01c0:
            r0 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01cb }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x01cb }
            throw r2     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cb }
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.fetch(javax.mail.Message[], javax.mail.FetchProfile):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo80144g() throws FolderClosedException {
        if (this.f68221E) {
            return;
        }
        if (this.f68222F) {
            throw new IllegalStateException("This operation is not allowed on a closed folder");
        }
        throw new FolderClosedException(this, "Lost folder connection to server");
    }

    public synchronized int getDeletedMessageCount() throws MessagingException {
        int length;
        if (!this.f68221E) {
            mo80143e();
            return -1;
        }
        Flags flags = new Flags();
        flags.add(Flags.Flag.DELETED);
        try {
            synchronized (this.f68219C) {
                length = mo80131C().mo80299P(new FlagTerm(flags, true)).length;
            }
            return length;
        } catch (ConnectionException e) {
            throw new FolderClosedException(this, e.getMessage());
        } catch (ProtocolException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        }
    }

    public synchronized Folder getFolder(String str) throws MessagingException {
        char separator;
        if (this.f68245z != null) {
            if (!m100066H()) {
                throw new MessagingException("Cannot contain subfolders");
            }
        }
        separator = getSeparator();
        return ((C16960i) this.store).mo80174A(this.f68237a + separator + str, separator);
    }

    public String getFullName() {
        return this.f68237a;
    }

    public synchronized Message getMessage(int i) throws MessagingException {
        mo80144g();
        mo80145h(i);
        return this.f68218B.mo80200d(i);
    }

    public synchronized Message getMessageByUID(long j) throws MessagingException {
        mo80144g();
        C16955e eVar = null;
        try {
            synchronized (this.f68219C) {
                Long valueOf = Long.valueOf(j);
                Hashtable<Long, C16955e> hashtable = this.f68220D;
                if (hashtable != null) {
                    eVar = hashtable.get(valueOf);
                    if (eVar != null) {
                        return eVar;
                    }
                } else {
                    this.f68220D = new Hashtable<>();
                }
                mo80131C().mo80327w(j);
                Hashtable<Long, C16955e> hashtable2 = this.f68220D;
                if (hashtable2 == null || (eVar = hashtable2.get(valueOf)) == null) {
                    return eVar;
                }
                return eVar;
            }
        } catch (ConnectionException e) {
            throw new FolderClosedException(this, e.getMessage());
        } catch (ProtocolException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        }
    }

    public synchronized int getMessageCount() throws MessagingException {
        C17055g gVar;
        synchronized (this.f68219C) {
            if (this.f68221E) {
                try {
                    mo80135J(true);
                    int i = this.f68224H;
                    return i;
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this, e.getMessage());
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } else {
                mo80143e();
                try {
                    return m100065D().f68505a;
                } catch (ProtocolException e3) {
                    throw new MessagingException(e3.getMessage(), e3);
                } catch (BadCommandException unused) {
                    gVar = null;
                    gVar = mo80132E();
                    C17061m m = gVar.mo80317m(this.f68237a);
                    gVar.mo80311g();
                    int i2 = m.f68485c;
                    mo80139Q(gVar);
                    return i2;
                } catch (ConnectionException e4) {
                    throw new StoreClosedException(this.store, e4.getMessage());
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                } catch (Throwable th) {
                    mo80139Q(gVar);
                    throw th;
                }
            }
        }
    }

    public synchronized Message[] getMessages() throws MessagingException {
        Message[] messageArr;
        mo80144g();
        int messageCount = getMessageCount();
        messageArr = new Message[messageCount];
        for (int i = 1; i <= messageCount; i++) {
            messageArr[i - 1] = this.f68218B.mo80200d(i);
        }
        return messageArr;
    }

    public synchronized Message[] getMessagesByUID(long j, long j2) throws MessagingException {
        Message[] messageArr;
        mo80144g();
        try {
            synchronized (this.f68219C) {
                if (this.f68220D == null) {
                    this.f68220D = new Hashtable<>();
                }
                long[] y = mo80131C().mo80329y(j, j2);
                ArrayList arrayList = new ArrayList();
                for (long valueOf : y) {
                    Message message = this.f68220D.get(Long.valueOf(valueOf));
                    if (message != null) {
                        arrayList.add(message);
                    }
                }
                messageArr = (Message[]) arrayList.toArray(new Message[arrayList.size()]);
            }
        } catch (ConnectionException e) {
            throw new FolderClosedException(this, e.getMessage());
        } catch (ProtocolException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        }
        return messageArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getName() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f68238c     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r3.f68237a     // Catch:{ MessagingException -> 0x0019 }
            java.lang.String r1 = r3.f68237a     // Catch:{ MessagingException -> 0x0019 }
            char r2 = r3.getSeparator()     // Catch:{ MessagingException -> 0x0019 }
            int r1 = r1.lastIndexOf(r2)     // Catch:{ MessagingException -> 0x0019 }
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)     // Catch:{ MessagingException -> 0x0019 }
            r3.f68238c = r0     // Catch:{ MessagingException -> 0x0019 }
        L_0x0019:
            java.lang.String r0 = r3.f68238c     // Catch:{ all -> 0x001d }
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.getName():java.lang.String");
    }

    public synchronized int getNewMessageCount() throws MessagingException {
        C17055g gVar;
        synchronized (this.f68219C) {
            if (this.f68221E) {
                try {
                    mo80135J(true);
                    int i = this.f68225I;
                    return i;
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this, e.getMessage());
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            } else {
                mo80143e();
                try {
                    return m100065D().f68506b;
                } catch (ProtocolException e3) {
                    throw new MessagingException(e3.getMessage(), e3);
                } catch (BadCommandException unused) {
                    gVar = null;
                    gVar = mo80132E();
                    C17061m m = gVar.mo80317m(this.f68237a);
                    gVar.mo80311g();
                    int i2 = m.f68486d;
                    mo80139Q(gVar);
                    return i2;
                } catch (ConnectionException e4) {
                    throw new StoreClosedException(this.store, e4.getMessage());
                } catch (ProtocolException e5) {
                    throw new MessagingException(e5.getMessage(), e5);
                } catch (Throwable th) {
                    mo80139Q(gVar);
                    throw th;
                }
            }
        }
    }

    public synchronized Folder getParent() throws MessagingException {
        char separator = getSeparator();
        int lastIndexOf = this.f68237a.lastIndexOf(separator);
        if (lastIndexOf != -1) {
            return ((C16960i) this.store).mo80174A(this.f68237a.substring(0, lastIndexOf), separator);
        }
        return new C16937a((C16960i) this.store);
    }

    public synchronized Flags getPermanentFlags() {
        Flags flags = this.f68242o;
        if (flags == null) {
            return null;
        }
        return (Flags) flags.clone();
    }

    public synchronized char getSeparator() throws MessagingException {
        if (this.f68240f == 65535) {
            C17059k[] kVarArr = (C17059k[]) mo80146s(new C16945d());
            if (kVarArr != null) {
                this.f68240f = kVarArr[0].f68476b;
            } else {
                this.f68240f = '/';
            }
        }
        return this.f68240f;
    }

    public synchronized int getType() throws MessagingException {
        if (!this.f68221E) {
            mo80143e();
        } else if (this.f68245z == null) {
            exists();
        }
        return this.f68239d;
    }

    public synchronized long getUID(Message message) throws MessagingException {
        if (message.getFolder() == this) {
            mo80144g();
            if (message instanceof C16955e) {
                C16955e eVar = (C16955e) message;
                long x = eVar.mo80170x();
                if (x != -1) {
                    return x;
                }
                synchronized (this.f68219C) {
                    try {
                        C17055g C = mo80131C();
                        eVar.mo80163q();
                        C17068s z = C.mo80330z(eVar.mo80169w());
                        if (z != null) {
                            x = z.f68511a;
                            eVar.mo80159L(x);
                            if (this.f68220D == null) {
                                this.f68220D = new Hashtable<>();
                            }
                            this.f68220D.put(Long.valueOf(x), eVar);
                        }
                    } catch (ConnectionException e) {
                        throw new FolderClosedException(this, e.getMessage());
                    } catch (ProtocolException e2) {
                        throw new MessagingException(e2.getMessage(), e2);
                    }
                }
                return x;
            }
            throw new MessagingException("message is not an IMAPMessage");
        }
        throw new NoSuchElementException("Message does not belong to this folder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x003f A[SYNTHETIC, Splitter:B:29:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0043 A[SYNTHETIC, Splitter:B:33:0x0043] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x002d=Splitter:B:22:0x002d, B:38:0x004f=Splitter:B:38:0x004f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0058=Splitter:B:42:0x0058, B:13:0x001a=Splitter:B:13:0x001a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long getUIDNext() throws javax.mail.MessagingException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f68221E     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0009
            long r0 = r5.f68228L     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0009:
            r0 = 0
            z7.g r1 = r5.mo80132E()     // Catch:{ BadCommandException -> 0x004b, ConnectionException -> 0x0037, ProtocolException -> 0x0029, all -> 0x0024 }
            java.lang.String r2 = "UIDNEXT"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ BadCommandException -> 0x0022, ConnectionException -> 0x0020, ProtocolException -> 0x001e }
            java.lang.String r3 = r5.f68237a     // Catch:{ BadCommandException -> 0x0022, ConnectionException -> 0x0020, ProtocolException -> 0x001e }
            z7.r r0 = r1.mo80303T(r3, r2)     // Catch:{ BadCommandException -> 0x0022, ConnectionException -> 0x0020, ProtocolException -> 0x001e }
        L_0x001a:
            r5.mo80139Q(r1)     // Catch:{ all -> 0x005c }
            goto L_0x003d
        L_0x001e:
            r0 = move-exception
            goto L_0x002d
        L_0x0020:
            r2 = move-exception
            goto L_0x0039
        L_0x0022:
            r0 = move-exception
            goto L_0x004f
        L_0x0024:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0058
        L_0x0029:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002d:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0057 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0057 }
            throw r2     // Catch:{ all -> 0x0057 }
        L_0x0037:
            r2 = move-exception
            r1 = r0
        L_0x0039:
            r5.mo80140S(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x001a
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            long r0 = r0.f68507c     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0043:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "Cannot obtain UIDNext"
            r0.<init>(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x004b:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x004f:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "Cannot obtain UIDNext"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0057 }
            throw r2     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            r5.mo80139Q(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.getUIDNext():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x003f A[SYNTHETIC, Splitter:B:29:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0043 A[SYNTHETIC, Splitter:B:33:0x0043] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x002d=Splitter:B:22:0x002d, B:38:0x004f=Splitter:B:38:0x004f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0058=Splitter:B:42:0x0058, B:13:0x001a=Splitter:B:13:0x001a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long getUIDValidity() throws javax.mail.MessagingException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f68221E     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0009
            long r0 = r5.f68227K     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0009:
            r0 = 0
            z7.g r1 = r5.mo80132E()     // Catch:{ BadCommandException -> 0x004b, ConnectionException -> 0x0037, ProtocolException -> 0x0029, all -> 0x0024 }
            java.lang.String r2 = "UIDVALIDITY"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ BadCommandException -> 0x0022, ConnectionException -> 0x0020, ProtocolException -> 0x001e }
            java.lang.String r3 = r5.f68237a     // Catch:{ BadCommandException -> 0x0022, ConnectionException -> 0x0020, ProtocolException -> 0x001e }
            z7.r r0 = r1.mo80303T(r3, r2)     // Catch:{ BadCommandException -> 0x0022, ConnectionException -> 0x0020, ProtocolException -> 0x001e }
        L_0x001a:
            r5.mo80139Q(r1)     // Catch:{ all -> 0x005c }
            goto L_0x003d
        L_0x001e:
            r0 = move-exception
            goto L_0x002d
        L_0x0020:
            r2 = move-exception
            goto L_0x0039
        L_0x0022:
            r0 = move-exception
            goto L_0x004f
        L_0x0024:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0058
        L_0x0029:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002d:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0057 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0057 }
            throw r2     // Catch:{ all -> 0x0057 }
        L_0x0037:
            r2 = move-exception
            r1 = r0
        L_0x0039:
            r5.mo80140S(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x001a
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            long r0 = r0.f68508d     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0043:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "Cannot obtain UIDValidity"
            r0.<init>(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x004b:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x004f:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "Cannot obtain UIDValidity"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0057 }
            throw r2     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            r5.mo80139Q(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.getUIDValidity():long");
    }

    public synchronized int getUnreadMessageCount() throws MessagingException {
        int length;
        if (!this.f68221E) {
            mo80143e();
            try {
                return m100065D().f68509e;
            } catch (BadCommandException unused) {
                return -1;
            } catch (ConnectionException e) {
                throw new StoreClosedException(this.store, e.getMessage());
            } catch (ProtocolException e2) {
                throw new MessagingException(e2.getMessage(), e2);
            }
        } else {
            Flags flags = new Flags();
            flags.add(Flags.Flag.SEEN);
            try {
                synchronized (this.f68219C) {
                    length = mo80131C().mo80299P(new FlagTerm(flags, false)).length;
                }
                return length;
            } catch (ConnectionException e3) {
                throw new FolderClosedException(this, e3.getMessage());
            } catch (ProtocolException e4) {
                throw new MessagingException(e4.getMessage(), e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo80145h(int i) throws MessagingException {
        if (i < 1) {
            throw new IndexOutOfBoundsException("message number < 1");
        } else if (i > this.f68224H) {
            synchronized (this.f68219C) {
                try {
                    mo80135J(false);
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this, e.getMessage());
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            }
            if (i > this.f68224H) {
                throw new IndexOutOfBoundsException(i + " > " + this.f68224H);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0014, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002e, code lost:
        if (r5.f68244s == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        if (r5.f68240f == 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        r0 = r5.f68237a + r5.f68240f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r0 = r5.f68237a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        r1 = (p447z7.C17059k[]) mo80147u(new p438y7.C16941c.C16949h(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        if (r1 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        r0 = m100079y(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        if (r1[r0].f68479e != 1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0068, code lost:
        if (r1[r0].f68479e != 2) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (m100065D().f68506b <= 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0075, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0077, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0082, code lost:
        throw new javax.mail.MessagingException(r0.getMessage(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008f, code lost:
        throw new javax.mail.StoreClosedException(r5.store, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0091, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00aa, code lost:
        throw new javax.mail.FolderNotFoundException((javax.mail.Folder) r5, r5.f68237a + " not found");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean hasNewMessages() throws javax.mail.MessagingException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.f68219C     // Catch:{ all -> 0x00ae }
            monitor-enter(r0)     // Catch:{ all -> 0x00ae }
            boolean r1 = r5.f68221E     // Catch:{ all -> 0x00ab }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002b
            r5.mo80135J(r3)     // Catch:{ ConnectionException -> 0x0020, ProtocolException -> 0x0015 }
            int r1 = r5.f68225I     // Catch:{ all -> 0x00ab }
            if (r1 <= 0) goto L_0x0012
            r2 = 1
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            monitor-exit(r5)
            return r2
        L_0x0015:
            r1 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x00ab }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00ab }
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x0020:
            r1 = move-exception
            javax.mail.FolderClosedException r2 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00ab }
            r2.<init>(r5, r1)     // Catch:{ all -> 0x00ab }
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            boolean r0 = r5.f68244s     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0048
            char r0 = r5.f68240f     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r0.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = r5.f68237a     // Catch:{ all -> 0x00ae }
            r0.append(r1)     // Catch:{ all -> 0x00ae }
            char r1 = r5.f68240f     // Catch:{ all -> 0x00ae }
            r0.append(r1)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ae }
            goto L_0x004a
        L_0x0048:
            java.lang.String r0 = r5.f68237a     // Catch:{ all -> 0x00ae }
        L_0x004a:
            y7.c$h r1 = new y7.c$h     // Catch:{ all -> 0x00ae }
            r1.<init>(r0)     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r5.mo80147u(r1)     // Catch:{ all -> 0x00ae }
            z7.k[] r1 = (p447z7.C17059k[]) r1     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0092
            int r0 = r5.m100079y(r1, r0)     // Catch:{ all -> 0x00ae }
            r4 = r1[r0]     // Catch:{ all -> 0x00ae }
            int r4 = r4.f68479e     // Catch:{ all -> 0x00ae }
            if (r4 != r3) goto L_0x0063
            monitor-exit(r5)
            return r3
        L_0x0063:
            r0 = r1[r0]     // Catch:{ all -> 0x00ae }
            int r0 = r0.f68479e     // Catch:{ all -> 0x00ae }
            r1 = 2
            if (r0 != r1) goto L_0x006c
            monitor-exit(r5)
            return r2
        L_0x006c:
            z7.r r0 = r5.m100065D()     // Catch:{ BadCommandException -> 0x0090, ConnectionException -> 0x0083, ProtocolException -> 0x0078 }
            int r0 = r0.f68506b     // Catch:{ BadCommandException -> 0x0090, ConnectionException -> 0x0083, ProtocolException -> 0x0078 }
            if (r0 <= 0) goto L_0x0076
            monitor-exit(r5)
            return r3
        L_0x0076:
            monitor-exit(r5)
            return r2
        L_0x0078:
            r0 = move-exception
            javax.mail.MessagingException r1 = new javax.mail.MessagingException     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00ae }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00ae }
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x0083:
            r0 = move-exception
            javax.mail.StoreClosedException r1 = new javax.mail.StoreClosedException     // Catch:{ all -> 0x00ae }
            javax.mail.Store r2 = r5.store     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ae }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00ae }
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x0090:
            monitor-exit(r5)
            return r2
        L_0x0092:
            javax.mail.FolderNotFoundException r0 = new javax.mail.FolderNotFoundException     // Catch:{ all -> 0x00ae }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r1.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = r5.f68237a     // Catch:{ all -> 0x00ae }
            r1.append(r2)     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = " not found"
            r1.append(r2)     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ae }
            r0.<init>((javax.mail.Folder) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ab:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.hasNewMessages():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(3:7|8|9)|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOpen() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.f68219C     // Catch:{ all -> 0x0014 }
            monitor-enter(r0)     // Catch:{ all -> 0x0014 }
            boolean r1 = r2.f68221E     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x000c
            r1 = 0
            r2.mo80135J(r1)     // Catch:{ ProtocolException -> 0x000c }
        L_0x000c:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            boolean r0 = r2.f68221E     // Catch:{ all -> 0x0014 }
            monitor-exit(r2)
            return r0
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.isOpen():boolean");
    }

    public synchronized boolean isSubscribed() {
        String str;
        C17059k[] kVarArr = null;
        if (!this.f68244s || this.f68240f == 0) {
            str = this.f68237a;
        } else {
            str = this.f68237a + this.f68240f;
        }
        try {
            kVarArr = (C17059k[]) mo80148w(new C16946e(str));
        } catch (ProtocolException unused) {
        }
        if (kVarArr == null) {
            return false;
        }
        return kVarArr[m100079y(kVarArr, str)].f68478d;
    }

    public Folder[] list(String str) throws MessagingException {
        return m100078v(str, false);
    }

    public Folder[] listSubscribed(String str) throws MessagingException {
        return m100078v(str, true);
    }

    public synchronized void open(int i) throws MessagingException {
        mo80137M(i, (C16966n) null);
    }

    public synchronized boolean renameTo(Folder folder) throws MessagingException {
        mo80142c();
        mo80143e();
        if (folder.getStore() != this.store) {
            throw new MessagingException("Can't rename across Stores");
        } else if (mo80147u(new C16951j(folder)) == null) {
            return false;
        } else {
            this.f68243p = false;
            this.f68245z = null;
            notifyFolderRenamedListeners(folder);
            return true;
        }
    }

    /* renamed from: s */
    public Object mo80146s(C16953l lVar) throws MessagingException {
        try {
            return mo80148w(lVar);
        } catch (ConnectionException e) {
            mo80140S(e);
            return null;
        } catch (ProtocolException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        }
    }

    public synchronized Message[] search(SearchTerm searchTerm) throws MessagingException {
        C16955e[] eVarArr;
        mo80144g();
        eVarArr = null;
        try {
            synchronized (this.f68219C) {
                int[] P = mo80131C().mo80299P(searchTerm);
                if (P != null) {
                    eVarArr = mo80130B(P);
                }
            }
        } catch (CommandFailedException unused) {
            return super.search(searchTerm);
        } catch (SearchException e) {
            if (!((C16960i) this.store).mo80179G()) {
                return super.search(searchTerm);
            }
            throw e;
        } catch (ConnectionException e2) {
            throw new FolderClosedException(this, e2.getMessage());
        } catch (ProtocolException e3) {
            throw new MessagingException(e3.getMessage(), e3);
        }
        return eVarArr;
    }

    public synchronized void setFlags(Message[] messageArr, Flags flags, boolean z) throws MessagingException {
        mo80144g();
        m100071f(flags);
        if (messageArr.length != 0) {
            synchronized (this.f68219C) {
                try {
                    C17055g C = mo80131C();
                    C17062n[] b = C16967o.m100205b(messageArr, (C16967o.C16969b) null);
                    if (b != null) {
                        C.mo80305V(b, flags, z);
                    } else {
                        throw new MessageRemovedException("Messages have been removed");
                    }
                } catch (ConnectionException e) {
                    throw new FolderClosedException(this, e.getMessage());
                } catch (ProtocolException e2) {
                    throw new MessagingException(e2.getMessage(), e2);
                }
            }
        }
    }

    public synchronized void setSubscribed(boolean z) throws MessagingException {
        mo80147u(new C16947f(z));
    }

    /* renamed from: u */
    public Object mo80147u(C16953l lVar) throws MessagingException {
        try {
            return mo80148w(lVar);
        } catch (CommandFailedException unused) {
            return null;
        } catch (ConnectionException e) {
            mo80140S(e);
            return null;
        } catch (ProtocolException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public synchronized Object mo80148w(C16953l lVar) throws ProtocolException {
        Object a;
        if (this.f68217A != null) {
            synchronized (this.f68219C) {
                a = lVar.mo80128a(mo80131C());
            }
            return a;
        }
        C17055g gVar = null;
        try {
            gVar = mo80132E();
            return lVar.mo80128a(gVar);
        } finally {
            mo80139Q(gVar);
        }
    }

    /* renamed from: x */
    public synchronized Message[] mo80149x(Message[] messageArr) throws MessagingException {
        C16955e[] eVarArr;
        mo80144g();
        if (messageArr != null) {
            FetchProfile fetchProfile = new FetchProfile();
            fetchProfile.add((FetchProfile.Item) UIDFolder.FetchProfileItem.UID);
            fetch(messageArr, fetchProfile);
        }
        synchronized (this.f68219C) {
            this.f68231O = false;
            try {
                C17055g C = mo80131C();
                if (messageArr != null) {
                    C.mo80307X(C16967o.m100206c(messageArr));
                } else {
                    C.mo80319o();
                }
                this.f68231O = true;
                if (messageArr != null) {
                    eVarArr = this.f68218B.mo80203h(messageArr);
                } else {
                    eVarArr = this.f68218B.mo80202g();
                }
                if (this.f68220D != null) {
                    for (C16955e x : eVarArr) {
                        long x2 = x.mo80170x();
                        if (x2 != -1) {
                            this.f68220D.remove(Long.valueOf(x2));
                        }
                    }
                }
                this.f68224H = this.f68218B.mo80205k();
            } catch (CommandFailedException e) {
                if (this.mode != 2) {
                    throw new IllegalStateException("Cannot expunge READ_ONLY folder: " + this.f68237a);
                }
                throw new MessagingException(e.getMessage(), e);
            } catch (ConnectionException e2) {
                throw new FolderClosedException(this, e2.getMessage());
            } catch (ProtocolException e3) {
                throw new MessagingException(e3.getMessage(), e3);
            } catch (Throwable th) {
                this.f68231O = true;
                throw th;
            }
        }
        if (eVarArr.length > 0) {
            notifyMessageRemovedListeners(true, eVarArr);
        }
        return eVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo80150z() {
        return "ENVELOPE INTERNALDATE RFC822.SIZE";
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized javax.mail.Message[] search(javax.mail.search.SearchTerm r5, javax.mail.Message[] r6) throws javax.mail.MessagingException {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.mo80144g()     // Catch:{ all -> 0x0051 }
            int r0 = r6.length     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return r6
        L_0x0009:
            java.lang.Object r0 = r4.f68219C     // Catch:{ CommandFailedException -> 0x004b, SearchException -> 0x0045, ConnectionException -> 0x003a, ProtocolException -> 0x002f }
            monitor-enter(r0)     // Catch:{ CommandFailedException -> 0x004b, SearchException -> 0x0045, ConnectionException -> 0x003a, ProtocolException -> 0x002f }
            z7.g r1 = r4.mo80131C()     // Catch:{ all -> 0x002c }
            r2 = 0
            z7.n[] r3 = p438y7.C16967o.m100205b(r6, r2)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0024
            int[] r1 = r1.mo80300Q(r3, r5)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0021
            y7.e[] r2 = r4.mo80130B(r1)     // Catch:{ all -> 0x002c }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            monitor-exit(r4)
            return r2
        L_0x0024:
            javax.mail.MessageRemovedException r1 = new javax.mail.MessageRemovedException     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "Messages have been removed"
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1     // Catch:{ CommandFailedException -> 0x004b, SearchException -> 0x0045, ConnectionException -> 0x003a, ProtocolException -> 0x002f }
        L_0x002f:
            r5 = move-exception
            javax.mail.MessagingException r6 = new javax.mail.MessagingException     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x0051 }
            r6.<init>(r0, r5)     // Catch:{ all -> 0x0051 }
            throw r6     // Catch:{ all -> 0x0051 }
        L_0x003a:
            r5 = move-exception
            javax.mail.FolderClosedException r6 = new javax.mail.FolderClosedException     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0051 }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0051 }
            throw r6     // Catch:{ all -> 0x0051 }
        L_0x0045:
            javax.mail.Message[] r5 = super.search(r5, r6)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)
            return r5
        L_0x004b:
            javax.mail.Message[] r5 = super.search(r5, r6)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)
            return r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p438y7.C16941c.search(javax.mail.search.SearchTerm, javax.mail.Message[]):javax.mail.Message[]");
    }

    public synchronized void setFlags(int i, int i2, Flags flags, boolean z) throws MessagingException {
        mo80144g();
        Message[] messageArr = new Message[((i2 - i) + 1)];
        int i3 = 0;
        while (i <= i2) {
            messageArr[i3] = getMessage(i);
            i++;
            i3++;
        }
        setFlags(messageArr, flags, z);
    }

    public synchronized Message[] getMessagesByUID(long[] jArr) throws MessagingException {
        long[] jArr2;
        Message[] messageArr;
        mo80144g();
        try {
            synchronized (this.f68219C) {
                if (this.f68220D != null) {
                    ArrayList arrayList = new ArrayList();
                    for (long j : jArr) {
                        if (!this.f68220D.containsKey(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                        }
                    }
                    int size = arrayList.size();
                    jArr2 = new long[size];
                    for (int i = 0; i < size; i++) {
                        jArr2[i] = ((Long) arrayList.get(i)).longValue();
                    }
                } else {
                    this.f68220D = new Hashtable<>();
                    jArr2 = jArr;
                }
                if (jArr2.length > 0) {
                    mo80131C().mo80328x(jArr2);
                }
                messageArr = new Message[jArr.length];
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    messageArr[i2] = this.f68220D.get(Long.valueOf(jArr[i2]));
                }
            }
        } catch (ConnectionException e) {
            throw new FolderClosedException(this, e.getMessage());
        } catch (ProtocolException e2) {
            throw new MessagingException(e2.getMessage(), e2);
        }
        return messageArr;
    }

    public synchronized void setFlags(int[] iArr, Flags flags, boolean z) throws MessagingException {
        mo80144g();
        Message[] messageArr = new Message[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            messageArr[i] = getMessage(iArr[i]);
        }
        setFlags(messageArr, flags, z);
    }

    protected C16941c(C17059k kVar, C16960i iVar) {
        this(kVar.f68475a, kVar.f68476b, iVar, (Boolean) null);
        if (kVar.f68477c) {
            this.f68239d |= 2;
        }
        if (kVar.f68478d) {
            this.f68239d |= 1;
        }
        this.f68243p = true;
        this.f68245z = kVar.f68480f;
    }
}
