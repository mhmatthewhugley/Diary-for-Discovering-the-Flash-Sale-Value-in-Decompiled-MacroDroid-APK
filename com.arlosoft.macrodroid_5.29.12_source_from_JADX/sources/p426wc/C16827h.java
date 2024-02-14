package p426wc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15986u;
import okhttp3.internal.http2.StreamResetException;
import p226cd.C11173a;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11210w;
import p226cd.C11212y;
import p226cd.C11213z;
import p297ja.C13339u;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004 \u001c!\u0011B3\b\u0000\u0012\u0006\u0010R\u001a\u00020\u0015\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010[\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\\\u0010]J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010\u001dR*\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010*\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R*\u0010-\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R*\u00100\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001e\u0010\u0014\u001a\u000603R\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001e\u00108\u001a\u000607R\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001e\u0010=\u001a\u00060<R\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001e\u0010A\u001a\u00060<R\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0011\u0010O\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0017\u0010R\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010W\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006^"}, mo71668d2 = {"Lwc/h;", "", "Lwc/a;", "errorCode", "Ljava/io/IOException;", "errorException", "", "e", "Lokhttp3/u;", "C", "Lcd/z;", "v", "E", "Lcd/w;", "n", "rstStatusCode", "Lja/u;", "d", "f", "Lcd/d;", "source", "", "length", "w", "headers", "inFinished", "x", "y", "b", "()V", "", "delta", "a", "c", "D", "<set-?>", "readBytesTotal", "J", "l", "()J", "A", "(J)V", "readBytesAcknowledged", "k", "z", "writeBytesTotal", "r", "B", "writeBytesMaximum", "q", "setWriteBytesMaximum$okhttp", "Lwc/h$c;", "Lwc/h$c;", "p", "()Lwc/h$c;", "Lwc/h$b;", "sink", "Lwc/h$b;", "o", "()Lwc/h$b;", "Lwc/h$d;", "readTimeout", "Lwc/h$d;", "m", "()Lwc/h$d;", "writeTimeout", "s", "Lwc/a;", "h", "()Lwc/a;", "setErrorCode$okhttp", "(Lwc/a;)V", "Ljava/io/IOException;", "i", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "id", "I", "j", "()I", "Lwc/e;", "connection", "Lwc/e;", "g", "()Lwc/e;", "outFinished", "<init>", "(ILwc/e;ZZLokhttp3/u;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.h */
/* compiled from: Http2Stream.kt */
public final class C16827h {

    /* renamed from: o */
    public static final C16828a f67964o = new C16828a((C13695i) null);

    /* renamed from: a */
    private long f67965a;

    /* renamed from: b */
    private long f67966b;

    /* renamed from: c */
    private long f67967c;

    /* renamed from: d */
    private long f67968d;

    /* renamed from: e */
    private final ArrayDeque<C15986u> f67969e;

    /* renamed from: f */
    private boolean f67970f;

    /* renamed from: g */
    private final C16830c f67971g;

    /* renamed from: h */
    private final C16829b f67972h;

    /* renamed from: i */
    private final C16831d f67973i = new C16831d();

    /* renamed from: j */
    private final C16831d f67974j = new C16831d();

    /* renamed from: k */
    private C16794a f67975k;

    /* renamed from: l */
    private IOException f67976l;

    /* renamed from: m */
    private final int f67977m;

    /* renamed from: n */
    private final C16802e f67978n;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lwc/h$a;", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.h$a */
    /* compiled from: Http2Stream.kt */
    public static final class C16828a {
        private C16828a() {
        }

        public /* synthetic */ C16828a(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, mo71668d2 = {"Lwc/h$b;", "Lcd/w;", "", "outFinishedOnLastFrame", "Lja/u;", "b", "Lcd/b;", "source", "", "byteCount", "X", "flush", "Lcd/z;", "q", "close", "closed", "Z", "c", "()Z", "setClosed", "(Z)V", "finished", "e", "setFinished", "<init>", "(Lwc/h;Z)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.h$b */
    /* compiled from: Http2Stream.kt */
    public final class C16829b implements C11210w {

        /* renamed from: a */
        private final C11179b f67979a = new C11179b();

        /* renamed from: c */
        private C15986u f67980c;

        /* renamed from: d */
        private boolean f67981d;

        /* renamed from: f */
        private boolean f67982f;

        public C16829b(boolean z) {
            this.f67982f = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        private final void m99770b(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (C16827h.this) {
                C16827h.this.mo79907s().mo62376t();
                while (C16827h.this.mo79906r() >= C16827h.this.mo79905q() && !this.f67982f && !this.f67981d && C16827h.this.mo79896h() == null) {
                    try {
                        C16827h.this.mo79888D();
                    } catch (Throwable th) {
                        C16827h.this.mo79907s().mo79922A();
                        throw th;
                    }
                }
                C16827h.this.mo79907s().mo79922A();
                C16827h.this.mo79892c();
                min = Math.min(C16827h.this.mo79905q() - C16827h.this.mo79906r(), this.f67979a.mo62399D());
                C16827h hVar = C16827h.this;
                hVar.mo79886B(hVar.mo79906r() + min);
                z2 = z && min == this.f67979a.mo62399D();
                C13339u uVar = C13339u.f61331a;
            }
            C16827h.this.mo79907s().mo62376t();
            try {
                C16827h.this.mo79895g().mo79839p0(C16827h.this.mo79898j(), z2, this.f67979a, min);
            } finally {
                C16827h.this.mo79907s().mo79922A();
            }
        }

        /* renamed from: X */
        public void mo62384X(C11179b bVar, long j) throws IOException {
            C13706o.m87929f(bVar, "source");
            C16827h hVar = C16827h.this;
            if (!C16279b.f66629h || !Thread.holdsLock(hVar)) {
                this.f67979a.mo62384X(bVar, j);
                while (this.f67979a.mo62399D() >= 16384) {
                    m99770b(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: c */
        public final boolean mo79915c() {
            return this.f67981d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.f67983g.mo79903o().f67982f != false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.f67979a.mo62399D() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.f67980c == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            if (r4 == false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            if (r10.f67979a.mo62399D() <= 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            m99770b(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = r10.f67983g.mo79895g();
            r2 = r10.f67983g.mo79898j();
            r4 = r10.f67980c;
            kotlin.jvm.internal.C13706o.m87926c(r4);
            r0.mo79840q0(r2, r1, p372qc.C16279b.m97635K(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
            if (r0 == false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
            if (r10.f67979a.mo62399D() <= 0) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
            m99770b(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
            if (r1 == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
            r10.f67983g.mo79895g().mo79839p0(r10.f67983g.mo79898j(), true, (p226cd.C11179b) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
            r0 = r10.f67983g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            r10.f67981d = true;
            r1 = p297ja.C13339u.f61331a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
            r10.f67983g.mo79895g().flush();
            r10.f67983g.mo79891b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r10 = this;
                wc.h r0 = p426wc.C16827h.this
                boolean r1 = p372qc.C16279b.f66629h
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                kotlin.jvm.internal.C13706o.m87928e(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                wc.h r0 = p426wc.C16827h.this
                monitor-enter(r0)
                boolean r1 = r10.f67981d     // Catch:{ all -> 0x00da }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                wc.h r1 = p426wc.C16827h.this     // Catch:{ all -> 0x00da }
                wc.a r1 = r1.mo79896h()     // Catch:{ all -> 0x00da }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                ja.u r4 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00da }
                monitor-exit(r0)
                wc.h r0 = p426wc.C16827h.this
                wc.h$b r0 = r0.mo79903o()
                boolean r0 = r0.f67982f
                if (r0 != 0) goto L_0x00c0
                cd.b r0 = r10.f67979a
                long r4 = r0.mo62399D()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = 1
                goto L_0x006b
            L_0x006a:
                r0 = 0
            L_0x006b:
                okhttp3.u r4 = r10.f67980c
                if (r4 == 0) goto L_0x0071
                r4 = 1
                goto L_0x0072
            L_0x0071:
                r4 = 0
            L_0x0072:
                if (r4 == 0) goto L_0x009b
            L_0x0074:
                cd.b r0 = r10.f67979a
                long r4 = r0.mo62399D()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r10.m99770b(r2)
                goto L_0x0074
            L_0x0082:
                wc.h r0 = p426wc.C16827h.this
                wc.e r0 = r0.mo79895g()
                wc.h r2 = p426wc.C16827h.this
                int r2 = r2.mo79898j()
                okhttp3.u r4 = r10.f67980c
                kotlin.jvm.internal.C13706o.m87926c(r4)
                java.util.List r4 = p372qc.C16279b.m97635K(r4)
                r0.mo79840q0(r2, r1, r4)
                goto L_0x00c0
            L_0x009b:
                if (r0 == 0) goto L_0x00ab
            L_0x009d:
                cd.b r0 = r10.f67979a
                long r0 = r0.mo62399D()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x00c0
                r10.m99770b(r3)
                goto L_0x009d
            L_0x00ab:
                if (r1 == 0) goto L_0x00c0
                wc.h r0 = p426wc.C16827h.this
                wc.e r4 = r0.mo79895g()
                wc.h r0 = p426wc.C16827h.this
                int r5 = r0.mo79898j()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.mo79839p0(r5, r6, r7, r8)
            L_0x00c0:
                wc.h r0 = p426wc.C16827h.this
                monitor-enter(r0)
                r10.f67981d = r3     // Catch:{ all -> 0x00d7 }
                ja.u r1 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00d7 }
                monitor-exit(r0)
                wc.h r0 = p426wc.C16827h.this
                wc.e r0 = r0.mo79895g()
                r0.flush()
                wc.h r0 = p426wc.C16827h.this
                r0.mo79891b()
                return
            L_0x00d7:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00da:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p426wc.C16827h.C16829b.close():void");
        }

        /* renamed from: e */
        public final boolean mo79916e() {
            return this.f67982f;
        }

        public void flush() throws IOException {
            C16827h hVar = C16827h.this;
            if (!C16279b.f66629h || !Thread.holdsLock(hVar)) {
                synchronized (C16827h.this) {
                    C16827h.this.mo79892c();
                    C13339u uVar = C13339u.f61331a;
                }
                while (this.f67979a.mo62399D() > 0) {
                    m99770b(false);
                    C16827h.this.mo79895g().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: q */
        public C11213z mo62388q() {
            return C16827h.this.mo79907s();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006%"}, mo71668d2 = {"Lwc/h$c;", "Lcd/y;", "", "read", "Lja/u;", "h", "Lcd/b;", "sink", "byteCount", "m0", "Lcd/d;", "source", "e", "(Lcd/d;J)V", "Lcd/z;", "q", "close", "Lokhttp3/u;", "trailers", "Lokhttp3/u;", "getTrailers", "()Lokhttp3/u;", "g", "(Lokhttp3/u;)V", "", "closed", "Z", "b", "()Z", "setClosed$okhttp", "(Z)V", "finished", "c", "f", "maxByteCount", "<init>", "(Lwc/h;JZ)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.h$c */
    /* compiled from: Http2Stream.kt */
    public final class C16830c implements C11212y {

        /* renamed from: a */
        private final C11179b f67984a = new C11179b();

        /* renamed from: c */
        private final C11179b f67985c = new C11179b();

        /* renamed from: d */
        private C15986u f67986d;

        /* renamed from: f */
        private boolean f67987f;

        /* renamed from: g */
        private final long f67988g;

        /* renamed from: o */
        private boolean f67989o;

        public C16830c(long j, boolean z) {
            this.f67988g = j;
            this.f67989o = z;
        }

        /* renamed from: h */
        private final void m99775h(long j) {
            C16827h hVar = C16827h.this;
            if (!C16279b.f66629h || !Thread.holdsLock(hVar)) {
                C16827h.this.mo79895g().mo79838n0(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: b */
        public final boolean mo79917b() {
            return this.f67987f;
        }

        /* renamed from: c */
        public final boolean mo79918c() {
            return this.f67989o;
        }

        public void close() throws IOException {
            long D;
            synchronized (C16827h.this) {
                this.f67987f = true;
                D = this.f67985c.mo62399D();
                this.f67985c.mo62424b();
                C16827h hVar = C16827h.this;
                if (hVar != null) {
                    hVar.notifyAll();
                    C13339u uVar = C13339u.f61331a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (D > 0) {
                m99775h(D);
            }
            C16827h.this.mo79891b();
        }

        /* renamed from: e */
        public final void mo79919e(C11186d dVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C13706o.m87929f(dVar, "source");
            C16827h hVar = C16827h.this;
            if (!C16279b.f66629h || !Thread.holdsLock(hVar)) {
                while (j > 0) {
                    synchronized (C16827h.this) {
                        z = this.f67989o;
                        z2 = true;
                        z3 = this.f67985c.mo62399D() + j > this.f67988g;
                        C13339u uVar = C13339u.f61331a;
                    }
                    if (z3) {
                        dVar.skip(j);
                        C16827h.this.mo79894f(C16794a.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        dVar.skip(j);
                        return;
                    } else {
                        long m0 = dVar.mo62392m0(this.f67984a, j);
                        if (m0 != -1) {
                            j -= m0;
                            synchronized (C16827h.this) {
                                if (this.f67987f) {
                                    j2 = this.f67984a.mo62399D();
                                    this.f67984a.mo62424b();
                                } else {
                                    if (this.f67985c.mo62399D() != 0) {
                                        z2 = false;
                                    }
                                    this.f67985c.mo62396A1(this.f67984a);
                                    if (z2) {
                                        C16827h hVar2 = C16827h.this;
                                        if (hVar2 != null) {
                                            hVar2.notifyAll();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                m99775h(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: f */
        public final void mo79920f(boolean z) {
            this.f67989o = z;
        }

        /* renamed from: g */
        public final void mo79921g(C15986u uVar) {
            this.f67986d = uVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) throws IOException {
            Throwable th;
            long j2;
            boolean z;
            C11179b bVar2 = bVar;
            long j3 = j;
            C13706o.m87929f(bVar2, "sink");
            if (j3 >= 0) {
                do {
                    th = null;
                    synchronized (C16827h.this) {
                        C16827h.this.mo79901m().mo62376t();
                        try {
                            if (C16827h.this.mo79896h() != null) {
                                th = C16827h.this.mo79897i();
                                if (th == null) {
                                    C16794a h = C16827h.this.mo79896h();
                                    C13706o.m87926c(h);
                                    th = new StreamResetException(h);
                                }
                            }
                            if (!this.f67987f) {
                                if (this.f67985c.mo62399D() > 0) {
                                    C11179b bVar3 = this.f67985c;
                                    j2 = bVar3.mo62392m0(bVar2, Math.min(j3, bVar3.mo62399D()));
                                    C16827h hVar = C16827h.this;
                                    hVar.mo79885A(hVar.mo79900l() + j2);
                                    long l = C16827h.this.mo79900l() - C16827h.this.mo79899k();
                                    if (th == null && l >= ((long) (C16827h.this.mo79895g().mo79817G().mo79950c() / 2))) {
                                        C16827h.this.mo79895g().mo79844y0(C16827h.this.mo79898j(), l);
                                        C16827h hVar2 = C16827h.this;
                                        hVar2.mo79914z(hVar2.mo79900l());
                                    }
                                } else if (this.f67989o || th != null) {
                                    j2 = -1;
                                } else {
                                    C16827h.this.mo79888D();
                                    j2 = -1;
                                    z = true;
                                    C16827h.this.mo79901m().mo79922A();
                                    C13339u uVar = C13339u.f61331a;
                                }
                                z = false;
                                C16827h.this.mo79901m().mo79922A();
                                C13339u uVar2 = C13339u.f61331a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            C16827h.this.mo79901m().mo79922A();
                            throw th2;
                        }
                    }
                } while (z);
                if (j2 != -1) {
                    m99775h(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    C13706o.m87926c(th);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
            }
        }

        /* renamed from: q */
        public C11213z mo62393q() {
            return C16827h.this.mo79901m();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, mo71668d2 = {"Lwc/h$d;", "Lcd/a;", "Lja/u;", "z", "Ljava/io/IOException;", "cause", "v", "A", "<init>", "(Lwc/h;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.h$d */
    /* compiled from: Http2Stream.kt */
    public final class C16831d extends C11173a {
        public C16831d() {
        }

        /* renamed from: A */
        public final void mo79922A() throws IOException {
            if (mo62377u()) {
                throw mo62378v((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public IOException mo62378v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo62381z() {
            C16827h.this.mo79894f(C16794a.CANCEL);
            C16827h.this.mo79895g().mo79832e0();
        }
    }

    public C16827h(int i, C16802e eVar, boolean z, boolean z2, C15986u uVar) {
        C13706o.m87929f(eVar, "connection");
        this.f67977m = i;
        this.f67978n = eVar;
        this.f67968d = (long) eVar.mo79818H().mo79950c();
        ArrayDeque<C15986u> arrayDeque = new ArrayDeque<>();
        this.f67969e = arrayDeque;
        this.f67971g = new C16830c((long) eVar.mo79817G().mo79950c(), z2);
        this.f67972h = new C16829b(z);
        if (uVar != null) {
            if (!mo79908t()) {
                arrayDeque.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo79908t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: e */
    private final boolean m99739e(C16794a aVar, IOException iOException) {
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f67975k != null) {
                    return false;
                }
                if (this.f67971g.mo79918c() && this.f67972h.mo79916e()) {
                    return false;
                }
                this.f67975k = aVar;
                this.f67976l = iOException;
                notifyAll();
                C13339u uVar = C13339u.f61331a;
                this.f67978n.mo79830c0(this.f67977m);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: A */
    public final void mo79885A(long j) {
        this.f67965a = j;
    }

    /* renamed from: B */
    public final void mo79886B(long j) {
        this.f67967c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r2.f67973i.mo79922A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.C15986u mo79887C() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            wc.h$d r0 = r2.f67973i     // Catch:{ all -> 0x004b }
            r0.mo62376t()     // Catch:{ all -> 0x004b }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.u> r0 = r2.f67969e     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0016
            wc.a r0 = r2.f67975k     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0016
            r2.mo79888D()     // Catch:{ all -> 0x0044 }
            goto L_0x0006
        L_0x0016:
            wc.h$d r0 = r2.f67973i     // Catch:{ all -> 0x004b }
            r0.mo79922A()     // Catch:{ all -> 0x004b }
            java.util.ArrayDeque<okhttp3.u> r0 = r2.f67969e     // Catch:{ all -> 0x004b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<okhttp3.u> r0 = r2.f67969e     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)     // Catch:{ all -> 0x004b }
            okhttp3.u r0 = (okhttp3.C15986u) r0     // Catch:{ all -> 0x004b }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.f67976l     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004b }
            wc.a r1 = r2.f67975k     // Catch:{ all -> 0x004b }
            kotlin.jvm.internal.C13706o.m87926c(r1)     // Catch:{ all -> 0x004b }
            r0.<init>(r1)     // Catch:{ all -> 0x004b }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0044:
            r0 = move-exception
            wc.h$d r1 = r2.f67973i     // Catch:{ all -> 0x004b }
            r1.mo79922A()     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wc.C16827h.mo79887C():okhttp3.u");
    }

    /* renamed from: D */
    public final void mo79888D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final C11213z mo79889E() {
        return this.f67974j;
    }

    /* renamed from: a */
    public final void mo79890a(long j) {
        this.f67968d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo79891b() throws IOException {
        boolean z;
        boolean u;
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f67971g.mo79918c() && this.f67971g.mo79917b() && (this.f67972h.mo79916e() || this.f67972h.mo79915c());
                u = mo79909u();
                C13339u uVar = C13339u.f61331a;
            }
            if (z) {
                mo79893d(C16794a.CANCEL, (IOException) null);
            } else if (!u) {
                this.f67978n.mo79830c0(this.f67977m);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C13706o.m87928e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo79892c() throws IOException {
        if (this.f67972h.mo79915c()) {
            throw new IOException("stream closed");
        } else if (this.f67972h.mo79916e()) {
            throw new IOException("stream finished");
        } else if (this.f67975k != null) {
            Throwable th = this.f67976l;
            if (th == null) {
                C16794a aVar = this.f67975k;
                C13706o.m87926c(aVar);
                th = new StreamResetException(aVar);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo79893d(C16794a aVar, IOException iOException) throws IOException {
        C13706o.m87929f(aVar, "rstStatusCode");
        if (m99739e(aVar, iOException)) {
            this.f67978n.mo79842w0(this.f67977m, aVar);
        }
    }

    /* renamed from: f */
    public final void mo79894f(C16794a aVar) {
        C13706o.m87929f(aVar, "errorCode");
        if (m99739e(aVar, (IOException) null)) {
            this.f67978n.mo79843x0(this.f67977m, aVar);
        }
    }

    /* renamed from: g */
    public final C16802e mo79895g() {
        return this.f67978n;
    }

    /* renamed from: h */
    public final synchronized C16794a mo79896h() {
        return this.f67975k;
    }

    /* renamed from: i */
    public final IOException mo79897i() {
        return this.f67976l;
    }

    /* renamed from: j */
    public final int mo79898j() {
        return this.f67977m;
    }

    /* renamed from: k */
    public final long mo79899k() {
        return this.f67966b;
    }

    /* renamed from: l */
    public final long mo79900l() {
        return this.f67965a;
    }

    /* renamed from: m */
    public final C16831d mo79901m() {
        return this.f67973i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p226cd.C11210w mo79902n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f67970f     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo79908t()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            wc.h$b r0 = r2.f67972h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wc.C16827h.mo79902n():cd.w");
    }

    /* renamed from: o */
    public final C16829b mo79903o() {
        return this.f67972h;
    }

    /* renamed from: p */
    public final C16830c mo79904p() {
        return this.f67971g;
    }

    /* renamed from: q */
    public final long mo79905q() {
        return this.f67968d;
    }

    /* renamed from: r */
    public final long mo79906r() {
        return this.f67967c;
    }

    /* renamed from: s */
    public final C16831d mo79907s() {
        return this.f67974j;
    }

    /* renamed from: t */
    public final boolean mo79908t() {
        if (this.f67978n.mo79812B() == ((this.f67977m & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final synchronized boolean mo79909u() {
        if (this.f67975k != null) {
            return false;
        }
        if ((this.f67971g.mo79918c() || this.f67971g.mo79917b()) && ((this.f67972h.mo79916e() || this.f67972h.mo79915c()) && this.f67970f)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final C11213z mo79910v() {
        return this.f67973i;
    }

    /* renamed from: w */
    public final void mo79911w(C11186d dVar, int i) throws IOException {
        C13706o.m87929f(dVar, "source");
        if (!C16279b.f66629h || !Thread.holdsLock(this)) {
            this.f67971g.mo79919e(dVar, (long) i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79912x(okhttp3.C15986u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            boolean r0 = p372qc.C16279b.f66629h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f67970f     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            wc.h$c r0 = r2.f67971g     // Catch:{ all -> 0x006d }
            r0.mo79921g(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x004b:
            r2.f67970f = r1     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque<okhttp3.u> r0 = r2.f67969e     // Catch:{ all -> 0x006d }
            r0.add(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            wc.h$c r3 = r2.f67971g     // Catch:{ all -> 0x006d }
            r3.mo79920f(r1)     // Catch:{ all -> 0x006d }
        L_0x0059:
            boolean r3 = r2.mo79909u()     // Catch:{ all -> 0x006d }
            r2.notifyAll()     // Catch:{ all -> 0x006d }
            ja.u r4 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            wc.e r3 = r2.f67978n
            int r4 = r2.f67977m
            r3.mo79830c0(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wc.C16827h.mo79912x(okhttp3.u, boolean):void");
    }

    /* renamed from: y */
    public final synchronized void mo79913y(C16794a aVar) {
        C13706o.m87929f(aVar, "errorCode");
        if (this.f67975k == null) {
            this.f67975k = aVar;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void mo79914z(long j) {
        this.f67966b = j;
    }
}
