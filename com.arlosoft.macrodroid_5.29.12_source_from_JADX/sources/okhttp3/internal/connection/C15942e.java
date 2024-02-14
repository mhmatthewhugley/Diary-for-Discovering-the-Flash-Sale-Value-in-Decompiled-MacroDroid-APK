package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15898a;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15923f;
import okhttp3.C15925g;
import okhttp3.C15971p;
import okhttp3.C15975r;
import okhttp3.C15989v;
import okhttp3.C16002z;
import p226cd.C11173a;
import p297ja.C13339u;
import p372qc.C16279b;
import p408uc.C16691g;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001A\u0018\u00002\u00020\u0001:\u00029pB\u001f\u0012\u0006\u0010f\u001a\u00020a\u0012\u0006\u0010k\u001a\u00020\u0011\u0012\u0006\u0010m\u001a\u00020\u0014¢\u0006\u0004\bn\u0010oJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000f\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J;\u0010+\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b-\u0010\u0007J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b/\u00100J\u0006\u00101\u001a\u00020\u0002J\u0017\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0014H\u0000¢\u0006\u0004\b3\u00104J\u0006\u00105\u001a\u00020\u0014J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010@\u001a\u00020<8\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010KR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010M\u001a\u0004\u0018\u00010%8\u0006@BX\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010RR(\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010M\u001a\u0004\u0018\u00010\"8\u0000@BX\u000e¢\u0006\f\n\u0004\b5\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010RR\u0016\u0010Z\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010RR\u0016\u0010[\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010RR\u0016\u0010\\\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0018\u0010(\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010TR$\u0010`\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u0010O\u001a\u0004\b^\u0010Q\"\u0004\bX\u0010_R\u0017\u0010f\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010k\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010m\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010R\u001a\u0004\bN\u0010l¨\u0006q"}, mo71668d2 = {"Lokhttp3/internal/connection/e;", "Lokhttp3/e;", "Lja/u;", "e", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "C", "Lokhttp3/v;", "url", "Lokhttp3/a;", "g", "", "D", "f", "Lokhttp3/b0;", "m", "cancel", "", "I", "Lokhttp3/d0;", "execute", "Lokhttp3/f;", "responseCallback", "u1", "s", "()Lokhttp3/d0;", "request", "newExchangeFinder", "h", "Luc/g;", "chain", "Lokhttp3/internal/connection/c;", "t", "(Luc/g;)Lokhttp3/internal/connection/c;", "Lokhttp3/internal/connection/f;", "connection", "c", "exchange", "requestDone", "responseDone", "u", "(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "v", "Ljava/net/Socket;", "y", "()Ljava/net/Socket;", "B", "closeExchange", "k", "(Z)V", "z", "x", "()Ljava/lang/String;", "Lokhttp3/internal/connection/h;", "a", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/r;", "Lokhttp3/r;", "o", "()Lokhttp3/r;", "eventListener", "okhttp3/internal/connection/e$c", "Lokhttp3/internal/connection/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/internal/connection/d;", "Lokhttp3/internal/connection/d;", "exchangeFinder", "<set-?>", "p", "Lokhttp3/internal/connection/f;", "n", "()Lokhttp3/internal/connection/f;", "Z", "timeoutEarlyExit", "Lokhttp3/internal/connection/c;", "q", "()Lokhttp3/internal/connection/c;", "interceptorScopedExchange", "A", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "F", "getConnectionToCancel", "(Lokhttp3/internal/connection/f;)V", "connectionToCancel", "Lokhttp3/z;", "G", "Lokhttp3/z;", "l", "()Lokhttp3/z;", "client", "H", "Lokhttp3/b0;", "r", "()Lokhttp3/b0;", "originalRequest", "()Z", "forWebSocket", "<init>", "(Lokhttp3/z;Lokhttp3/b0;Z)V", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.e */
/* compiled from: RealCall.kt */
public final class C15942e implements C15917e {

    /* renamed from: A */
    private boolean f65666A;

    /* renamed from: B */
    private boolean f65667B;

    /* renamed from: C */
    private boolean f65668C = true;

    /* renamed from: D */
    private volatile boolean f65669D;

    /* renamed from: E */
    private volatile C15938c f65670E;

    /* renamed from: F */
    private volatile C15946f f65671F;

    /* renamed from: G */
    private final C16002z f65672G;

    /* renamed from: H */
    private final C15904b0 f65673H;

    /* renamed from: I */
    private final boolean f65674I;

    /* renamed from: a */
    private final C15951h f65675a;

    /* renamed from: c */
    private final C15975r f65676c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15945c f65677d;

    /* renamed from: f */
    private final AtomicBoolean f65678f = new AtomicBoolean();

    /* renamed from: g */
    private Object f65679g;

    /* renamed from: o */
    private C15941d f65680o;

    /* renamed from: p */
    private C15946f f65681p;

    /* renamed from: s */
    private boolean f65682s;

    /* renamed from: z */
    private C15938c f65683z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo71668d2 = {"Lokhttp3/internal/connection/e$a;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/e;", "other", "Lja/u;", "e", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "Lokhttp3/f;", "Lokhttp3/f;", "responseCallback", "", "d", "()Ljava/lang/String;", "host", "b", "()Lokhttp3/internal/connection/e;", "call", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/f;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.e$a */
    /* compiled from: RealCall.kt */
    public final class C15943a implements Runnable {

        /* renamed from: a */
        private volatile AtomicInteger f65684a = new AtomicInteger(0);

        /* renamed from: c */
        private final C15923f f65685c;

        /* renamed from: d */
        final /* synthetic */ C15942e f65686d;

        public C15943a(C15942e eVar, C15923f fVar) {
            C13706o.m87929f(fVar, "responseCallback");
            this.f65686d = eVar;
            this.f65685c = fVar;
        }

        /* renamed from: a */
        public final void mo76114a(ExecutorService executorService) {
            C13706o.m87929f(executorService, "executorService");
            C15971p o = this.f65686d.mo76101l().mo76348o();
            if (!C16279b.f66629h || !Thread.holdsLock(o)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f65686d.mo76110v(interruptedIOException);
                    this.f65685c.onFailure(this.f65686d, interruptedIOException);
                    this.f65686d.mo76101l().mo76348o().mo76195g(this);
                } catch (Throwable th) {
                    this.f65686d.mo76101l().mo76348o().mo76195g(this);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C13706o.m87928e(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(o);
                throw new AssertionError(sb.toString());
            }
        }

        /* renamed from: b */
        public final C15942e mo76115b() {
            return this.f65686d;
        }

        /* renamed from: c */
        public final AtomicInteger mo76116c() {
            return this.f65684a;
        }

        /* renamed from: d */
        public final String mo76117d() {
            return this.f65686d.mo76106r().mo75920j().mo76269i();
        }

        /* renamed from: e */
        public final void mo76118e(C15943a aVar) {
            C13706o.m87929f(aVar, "other");
            this.f65684a = aVar.f65684a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.internal.connection.e r1 = r6.f65686d
                java.lang.String r1 = r1.mo76111x()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                okhttp3.internal.connection.e r3 = r6.f65686d     // Catch:{ all -> 0x00c9 }
                okhttp3.internal.connection.e$c r3 = r3.f65677d     // Catch:{ all -> 0x00c9 }
                r3.mo62376t()     // Catch:{ all -> 0x00c9 }
                okhttp3.internal.connection.e r3 = r6.f65686d     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                okhttp3.d0 r0 = r3.mo76107s()     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                r3 = 1
                okhttp3.f r4 = r6.f65685c     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                okhttp3.internal.connection.e r5 = r6.f65686d     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                okhttp3.internal.connection.e r0 = r6.f65686d     // Catch:{ all -> 0x00c9 }
                okhttp3.z r0 = r0.mo76101l()     // Catch:{ all -> 0x00c9 }
                okhttp3.p r0 = r0.mo76348o()     // Catch:{ all -> 0x00c9 }
            L_0x0049:
                r0.mo76195g(r6)     // Catch:{ all -> 0x00c9 }
                goto L_0x00b7
            L_0x004d:
                r0 = move-exception
                goto L_0x0054
            L_0x004f:
                r0 = move-exception
                goto L_0x0081
            L_0x0051:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0054:
                okhttp3.internal.connection.e r4 = r6.f65686d     // Catch:{ all -> 0x007c }
                r4.cancel()     // Catch:{ all -> 0x007c }
                if (r3 != 0) goto L_0x007b
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                r4.append(r0)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r3.<init>(r4)     // Catch:{ all -> 0x007c }
                p297ja.C13315b.m85661a(r3, r0)     // Catch:{ all -> 0x007c }
                okhttp3.f r4 = r6.f65685c     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.e r5 = r6.f65686d     // Catch:{ all -> 0x007c }
                r4.onFailure(r5, r3)     // Catch:{ all -> 0x007c }
            L_0x007b:
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                goto L_0x00bb
            L_0x007e:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0081:
                if (r3 == 0) goto L_0x00a5
                xc.h$a r3 = p435xc.C16926h.f68190c     // Catch:{ all -> 0x007c }
                xc.h r3 = r3.mo80117g()     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.e r5 = r6.f65686d     // Catch:{ all -> 0x007c }
                java.lang.String r5 = r5.m96107D()     // Catch:{ all -> 0x007c }
                r4.append(r5)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r5 = 4
                r3.mo80113j(r4, r5, r0)     // Catch:{ all -> 0x007c }
                goto L_0x00ac
            L_0x00a5:
                okhttp3.f r3 = r6.f65685c     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.e r4 = r6.f65686d     // Catch:{ all -> 0x007c }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x007c }
            L_0x00ac:
                okhttp3.internal.connection.e r0 = r6.f65686d     // Catch:{ all -> 0x00c9 }
                okhttp3.z r0 = r0.mo76101l()     // Catch:{ all -> 0x00c9 }
                okhttp3.p r0 = r0.mo76348o()     // Catch:{ all -> 0x00c9 }
                goto L_0x0049
            L_0x00b7:
                r1.setName(r2)
                return
            L_0x00bb:
                okhttp3.internal.connection.e r3 = r6.f65686d     // Catch:{ all -> 0x00c9 }
                okhttp3.z r3 = r3.mo76101l()     // Catch:{ all -> 0x00c9 }
                okhttp3.p r3 = r3.mo76348o()     // Catch:{ all -> 0x00c9 }
                r3.mo76195g(r6)     // Catch:{ all -> 0x00c9 }
                throw r0     // Catch:{ all -> 0x00c9 }
            L_0x00c9:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15942e.C15943a.run():void");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lokhttp3/internal/connection/e$b;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/e;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lokhttp3/internal/connection/e;Ljava/lang/Object;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.e$b */
    /* compiled from: RealCall.kt */
    public static final class C15944b extends WeakReference<C15942e> {

        /* renamed from: a */
        private final Object f65687a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15944b(C15942e eVar, Object obj) {
            super(eVar);
            C13706o.m87929f(eVar, "referent");
            this.f65687a = obj;
        }

        /* renamed from: a */
        public final Object mo76120a() {
            return this.f65687a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo71668d2 = {"okhttp3/internal/connection/e$c", "Lcd/a;", "Lja/u;", "z", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.e$c */
    /* compiled from: RealCall.kt */
    public static final class C15945c extends C11173a {

        /* renamed from: m */
        final /* synthetic */ C15942e f65688m;

        C15945c(C15942e eVar) {
            this.f65688m = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo62381z() {
            this.f65688m.cancel();
        }
    }

    public C15942e(C16002z zVar, C15904b0 b0Var, boolean z) {
        C13706o.m87929f(zVar, "client");
        C13706o.m87929f(b0Var, "originalRequest");
        this.f65672G = zVar;
        this.f65673H = b0Var;
        this.f65674I = z;
        this.f65675a = zVar.mo76345k().mo76164a();
        this.f65676c = zVar.mo76350q().mo76227a(this);
        C15945c cVar = new C15945c(this);
        cVar.mo62526g((long) zVar.mo76342f(), TimeUnit.MILLISECONDS);
        C13339u uVar = C13339u.f61331a;
        this.f65677d = cVar;
    }

    /* renamed from: C */
    private final <E extends IOException> E m96106C(E e) {
        if (this.f65682s || !this.f65677d.mo62377u()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final String m96107D() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo76003I() ? "canceled " : "");
        sb.append(this.f65674I ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(mo76111x());
        return sb.toString();
    }

    /* renamed from: d */
    private final <E extends IOException> E m96110d(E e) {
        Socket y;
        boolean z = C16279b.f66629h;
        if (!z || !Thread.holdsLock(this)) {
            C15946f fVar = this.f65681p;
            if (fVar != null) {
                if (!z || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        y = mo76112y();
                    }
                    if (this.f65681p == null) {
                        if (y != null) {
                            C16279b.m97657k(y);
                        }
                        this.f65676c.mo76211k(this, fVar);
                    } else {
                        if (!(y == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    C13706o.m87928e(currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(fVar);
                    throw new AssertionError(sb.toString());
                }
            }
            E C = m96106C(e);
            if (e != null) {
                C15975r rVar = this.f65676c;
                C13706o.m87926c(C);
                rVar.mo76204d(this, C);
            } else {
                this.f65676c.mo76203c(this);
            }
            return C;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        C13706o.m87928e(currentThread2, "Thread.currentThread()");
        sb2.append(currentThread2.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: e */
    private final void m96111e() {
        this.f65679g = C16926h.f68190c.mo80117g().mo80089h("response.body().close()");
        this.f65676c.mo76205e(this);
    }

    /* renamed from: g */
    private final C15898a m96112g(C15989v vVar) {
        C15925g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.mo76270j()) {
            SSLSocketFactory H = this.f65672G.mo76337H();
            hostnameVerifier = this.f65672G.mo76354u();
            sSLSocketFactory = H;
            gVar = this.f65672G.mo76343g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C15898a(vVar.mo76269i(), vVar.mo76274n(), this.f65672G.mo76349p(), this.f65672G.mo76336G(), sSLSocketFactory, hostnameVerifier, gVar, this.f65672G.mo76332B(), this.f65672G.mo76331A(), this.f65672G.mo76358z(), this.f65672G.mo76346l(), this.f65672G.mo76333C());
    }

    /* renamed from: A */
    public final void mo76094A(C15946f fVar) {
        this.f65671F = fVar;
    }

    /* renamed from: B */
    public final void mo76095B() {
        if (!this.f65682s) {
            this.f65682s = true;
            this.f65677d.mo62377u();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: I */
    public boolean mo76003I() {
        return this.f65669D;
    }

    /* renamed from: c */
    public final void mo76096c(C15946f fVar) {
        C13706o.m87929f(fVar, "connection");
        if (!C16279b.f66629h || Thread.holdsLock(fVar)) {
            if (this.f65681p == null) {
                this.f65681p = fVar;
                fVar.mo76132o().add(new C15944b(this, this.f65679g));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }

    public void cancel() {
        if (!this.f65669D) {
            this.f65669D = true;
            C15938c cVar = this.f65670E;
            if (cVar != null) {
                cVar.mo76070b();
            }
            C15946f fVar = this.f65671F;
            if (fVar != null) {
                fVar.mo76129e();
            }
            this.f65676c.mo76206f(this);
        }
    }

    public C15915d0 execute() {
        if (this.f65678f.compareAndSet(false, true)) {
            this.f65677d.mo62376t();
            m96111e();
            try {
                this.f65672G.mo76348o().mo76193c(this);
                return mo76107s();
            } finally {
                this.f65672G.mo76348o().mo76196h(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: f */
    public C15942e clone() {
        return new C15942e(this.f65672G, this.f65673H, this.f65674I);
    }

    /* renamed from: h */
    public final void mo76099h(C15904b0 b0Var, boolean z) {
        C13706o.m87929f(b0Var, "request");
        if (this.f65683z == null) {
            synchronized (this) {
                if (!(!this.f65667B)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f65666A) {
                    C13339u uVar = C13339u.f61331a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.f65680o = new C15941d(this.f65675a, m96112g(b0Var.mo75920j()), this, this.f65676c);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: k */
    public final void mo76100k(boolean z) {
        C15938c cVar;
        synchronized (this) {
            if (this.f65668C) {
                C13339u uVar = C13339u.f61331a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f65670E) != null) {
            cVar.mo76072d();
        }
        this.f65683z = null;
    }

    /* renamed from: l */
    public final C16002z mo76101l() {
        return this.f65672G;
    }

    /* renamed from: m */
    public C15904b0 mo76006m() {
        return this.f65673H;
    }

    /* renamed from: n */
    public final C15946f mo76102n() {
        return this.f65681p;
    }

    /* renamed from: o */
    public final C15975r mo76103o() {
        return this.f65676c;
    }

    /* renamed from: p */
    public final boolean mo76104p() {
        return this.f65674I;
    }

    /* renamed from: q */
    public final C15938c mo76105q() {
        return this.f65683z;
    }

    /* renamed from: r */
    public final C15904b0 mo76106r() {
        return this.f65673H;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a1  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C15915d0 mo76107s() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.z r0 = r11.f65672G
            java.util.List r0 = r0.mo76355v()
            boolean unused = kotlin.collections.C13624y.m87797z(r2, r0)
            uc.j r0 = new uc.j
            okhttp3.z r1 = r11.f65672G
            r0.<init>(r1)
            r2.add(r0)
            uc.a r0 = new uc.a
            okhttp3.z r1 = r11.f65672G
            okhttp3.n r1 = r1.mo76347n()
            r0.<init>(r1)
            r2.add(r0)
            sc.a r0 = new sc.a
            okhttp3.z r1 = r11.f65672G
            r1.mo76341e()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.C15936a.f65634a
            r2.add(r0)
            boolean r0 = r11.f65674I
            if (r0 != 0) goto L_0x0046
            okhttp3.z r0 = r11.f65672G
            java.util.List r0 = r0.mo76356x()
            boolean unused = kotlin.collections.C13624y.m87797z(r2, r0)
        L_0x0046:
            uc.b r0 = new uc.b
            boolean r1 = r11.f65674I
            r0.<init>(r1)
            r2.add(r0)
            uc.g r10 = new uc.g
            r3 = 0
            r4 = 0
            okhttp3.b0 r5 = r11.f65673H
            okhttp3.z r0 = r11.f65672G
            int r6 = r0.mo76344h()
            okhttp3.z r0 = r11.f65672G
            int r7 = r0.mo76334D()
            okhttp3.z r0 = r11.f65672G
            int r8 = r0.mo76338K()
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            okhttp3.b0 r1 = r11.f65673H     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            okhttp3.d0 r1 = r10.mo76309a(r1)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            boolean r2 = r11.mo76003I()     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            if (r2 != 0) goto L_0x007e
            r11.mo76110v(r9)
            return r1
        L_0x007e:
            p372qc.C16279b.m97656j(r1)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            throw r1     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            goto L_0x009f
        L_0x008b:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r11.mo76110v(r0)     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x009b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009c }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009b:
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            r1 = r0
            r0 = 1
        L_0x009f:
            if (r0 != 0) goto L_0x00a4
            r11.mo76110v(r9)
        L_0x00a4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15942e.mo76107s():okhttp3.d0");
    }

    /* renamed from: t */
    public final C15938c mo76108t(C16691g gVar) {
        C13706o.m87929f(gVar, "chain");
        synchronized (this) {
            if (!this.f65668C) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f65667B)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f65666A) {
                C13339u uVar = C13339u.f61331a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C15941d dVar = this.f65680o;
        C13706o.m87926c(dVar);
        C15938c cVar = new C15938c(this, this.f65676c, dVar, dVar.mo76089a(this.f65672G, gVar));
        this.f65683z = cVar;
        this.f65670E = cVar;
        synchronized (this) {
            this.f65666A = true;
            this.f65667B = true;
        }
        if (!this.f65669D) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003e A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003f A[Catch:{ all -> 0x0019 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo76109u(okhttp3.internal.connection.C15938c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            okhttp3.internal.connection.c r0 = r2.f65670E
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f65666A     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x005a
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.f65667B     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f65666A = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f65667B = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f65666A     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f65667B     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f65667B     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f65668C     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            ja.u r4 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0052
            r3 = 0
            r2.f65670E = r3
            okhttp3.internal.connection.f r3 = r2.f65681p
            if (r3 == 0) goto L_0x0052
            r3.mo76137t()
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            java.io.IOException r3 = r2.m96110d(r6)
            return r3
        L_0x0059:
            return r6
        L_0x005a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C15942e.mo76109u(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: u1 */
    public void mo76007u1(C15923f fVar) {
        C13706o.m87929f(fVar, "responseCallback");
        if (this.f65678f.compareAndSet(false, true)) {
            m96111e();
            this.f65672G.mo76348o().mo76192b(new C15943a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: v */
    public final IOException mo76110v(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f65668C) {
                this.f65668C = false;
                if (!this.f65666A && !this.f65667B) {
                    z = true;
                }
            }
            C13339u uVar = C13339u.f61331a;
        }
        return z ? m96110d(iOException) : iOException;
    }

    /* renamed from: x */
    public final String mo76111x() {
        return this.f65673H.mo75920j().mo76276p();
    }

    /* renamed from: y */
    public final Socket mo76112y() {
        C15946f fVar = this.f65681p;
        C13706o.m87926c(fVar);
        if (!C16279b.f66629h || Thread.holdsLock(fVar)) {
            List<Reference<C15942e>> o = fVar.mo76132o();
            Iterator<Reference<C15942e>> it = o.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C13706o.m87924a((C15942e) it.next().get(), this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                o.remove(i);
                this.f65681p = null;
                if (o.isEmpty()) {
                    fVar.mo76122C(System.nanoTime());
                    if (this.f65675a.mo76149c(fVar)) {
                        return fVar.mo76124E();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C13706o.m87928e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: z */
    public final boolean mo76113z() {
        C15941d dVar = this.f65680o;
        C13706o.m87926c(dVar);
        return dVar.mo76091e();
    }
}
