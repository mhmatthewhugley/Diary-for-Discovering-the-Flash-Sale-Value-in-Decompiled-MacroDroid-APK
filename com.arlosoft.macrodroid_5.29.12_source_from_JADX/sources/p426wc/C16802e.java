package p426wc;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13682c0;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11188e;
import p297ja.C13339u;
import p370qa.C16254a;
import p372qc.C16279b;
import p399tc.C16613a;
import p399tc.C16615c;
import p399tc.C16616d;
import p399tc.C16617e;
import p426wc.C16823g;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004z{|\fB\u0011\b\u0000\u0012\u0006\u0010w\u001a\u00020v¢\u0006\u0004\bx\u0010yJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0014J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010%\u001a\u00020!J\b\u00100\u001a\u00020\rH\u0016J)\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b4\u00105J\u001c\u00109\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u000207H\u0007J\u000e\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0014J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b@\u0010AJ-\u0010C\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bC\u0010DJ/\u0010G\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bI\u0010$R\u001a\u0010J\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0000X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0R8\u0000X\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u0010\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\ba\u0010\u0010\u001a\u0004\bb\u0010^\"\u0004\bc\u0010`R\u0017\u0010e\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\"\u0010i\u001a\u00020d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010f\u001a\u0004\bj\u0010h\"\u0004\bk\u0010lR$\u0010n\u001a\u00020\u00142\u0006\u0010m\u001a\u00020\u00148\u0006@BX\u000e¢\u0006\f\n\u0004\bn\u0010U\u001a\u0004\bo\u0010pR\u0017\u0010r\u001a\u00020q8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010u¨\u0006}"}, mo71668d2 = {"Lwc/e;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lwc/b;", "requestHeaders", "", "out", "Lwc/h;", "N", "Ljava/io/IOException;", "e", "Lja/u;", "A", "id", "I", "streamId", "c0", "(I)Lwc/h;", "", "read", "n0", "(J)V", "O", "outFinished", "alternating", "q0", "(IZLjava/util/List;)V", "Lcd/b;", "buffer", "byteCount", "p0", "Lwc/a;", "errorCode", "x0", "(ILwc/a;)V", "statusCode", "w0", "unacknowledgedBytesRead", "y0", "(IJ)V", "reply", "payload1", "payload2", "t0", "flush", "j0", "close", "connectionCode", "streamCode", "cause", "z", "(Lwc/a;Lwc/a;Ljava/io/IOException;)V", "sendConnectionPreface", "Ltc/e;", "taskRunner", "k0", "nowNs", "M", "e0", "()V", "Z", "(I)Z", "U", "(ILjava/util/List;)V", "inFinished", "S", "(ILjava/util/List;Z)V", "Lcd/d;", "source", "Q", "(ILcd/d;IZ)V", "W", "client", "B", "()Z", "Lwc/e$d;", "listener", "Lwc/e$d;", "E", "()Lwc/e$d;", "", "streams", "Ljava/util/Map;", "J", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "lastGoodStreamId", "D", "()I", "f0", "(I)V", "nextStreamId", "F", "setNextStreamId$okhttp", "Lwc/l;", "okHttpSettings", "Lwc/l;", "G", "()Lwc/l;", "peerSettings", "H", "h0", "(Lwc/l;)V", "<set-?>", "writeBytesMaximum", "K", "()J", "Lwc/i;", "writer", "Lwc/i;", "L", "()Lwc/i;", "Lwc/e$b;", "builder", "<init>", "(Lwc/e$b;)V", "b", "c", "d", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.e */
/* compiled from: Http2Connection.kt */
public final class C16802e implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: T */
    public static final C16839l f67835T;

    /* renamed from: U */
    public static final C16805c f67836U = new C16805c((C13695i) null);

    /* renamed from: A */
    private final C16616d f67837A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C16616d f67838B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C16836k f67839C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public long f67840D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f67841E;

    /* renamed from: F */
    private long f67842F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public long f67843G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public long f67844H;

    /* renamed from: I */
    private long f67845I;

    /* renamed from: J */
    private final C16839l f67846J;

    /* renamed from: K */
    private C16839l f67847K;

    /* renamed from: L */
    private long f67848L;

    /* renamed from: M */
    private long f67849M;

    /* renamed from: N */
    private long f67850N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f67851O;

    /* renamed from: P */
    private final Socket f67852P;

    /* renamed from: Q */
    private final C16832i f67853Q;

    /* renamed from: R */
    private final C16809e f67854R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final Set<Integer> f67855S;

    /* renamed from: a */
    private final boolean f67856a;

    /* renamed from: c */
    private final C16806d f67857c;

    /* renamed from: d */
    private final Map<Integer, C16827h> f67858d = new LinkedHashMap();

    /* renamed from: f */
    private final String f67859f;

    /* renamed from: g */
    private int f67860g;

    /* renamed from: o */
    private int f67861o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f67862p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C16617e f67863s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C16616d f67864z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"wc/e$a", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$a */
    /* compiled from: TaskQueue.kt */
    public static final class C16803a extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67865e;

        /* renamed from: f */
        final /* synthetic */ C16802e f67866f;

        /* renamed from: g */
        final /* synthetic */ long f67867g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16803a(String str, String str2, C16802e eVar, long j) {
            super(str2, false, 2, (C13695i) null);
            this.f67865e = str;
            this.f67866f = eVar;
            this.f67867g = j;
        }

        /* renamed from: f */
        public long mo76151f() {
            boolean z;
            synchronized (this.f67866f) {
                if (this.f67866f.f67841E < this.f67866f.f67840D) {
                    z = true;
                } else {
                    C16802e eVar = this.f67866f;
                    eVar.f67840D = eVar.f67840D + 1;
                    z = false;
                }
            }
            if (z) {
                this.f67866f.m99598A((IOException) null);
                return -1;
            }
            this.f67866f.mo79841t0(false, 1, 0);
            return this.f67867g;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bE\u0010FJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, mo71668d2 = {"Lwc/e$b;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lcd/d;", "source", "Lcd/c;", "sink", "m", "Lwc/e$d;", "listener", "k", "", "pingIntervalMillis", "l", "Lwc/e;", "a", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lcd/d;", "i", "()Lcd/d;", "setSource$okhttp", "(Lcd/d;)V", "Lcd/c;", "g", "()Lcd/c;", "setSink$okhttp", "(Lcd/c;)V", "Lwc/e$d;", "d", "()Lwc/e$d;", "setListener$okhttp", "(Lwc/e$d;)V", "Lwc/k;", "pushObserver", "Lwc/k;", "f", "()Lwc/k;", "setPushObserver$okhttp", "(Lwc/k;)V", "I", "e", "()I", "setPingIntervalMillis$okhttp", "(I)V", "", "client", "Z", "b", "()Z", "setClient$okhttp", "(Z)V", "Ltc/e;", "taskRunner", "Ltc/e;", "j", "()Ltc/e;", "<init>", "(ZLtc/e;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$b */
    /* compiled from: Http2Connection.kt */
    public static final class C16804b {

        /* renamed from: a */
        public Socket f67868a;

        /* renamed from: b */
        public String f67869b;

        /* renamed from: c */
        public C11186d f67870c;

        /* renamed from: d */
        public C11184c f67871d;

        /* renamed from: e */
        private C16806d f67872e = C16806d.f67877a;

        /* renamed from: f */
        private C16836k f67873f = C16836k.f68007a;

        /* renamed from: g */
        private int f67874g;

        /* renamed from: h */
        private boolean f67875h;

        /* renamed from: i */
        private final C16617e f67876i;

        public C16804b(boolean z, C16617e eVar) {
            C13706o.m87929f(eVar, "taskRunner");
            this.f67875h = z;
            this.f67876i = eVar;
        }

        /* renamed from: a */
        public final C16802e mo79846a() {
            return new C16802e(this);
        }

        /* renamed from: b */
        public final boolean mo79847b() {
            return this.f67875h;
        }

        /* renamed from: c */
        public final String mo79848c() {
            String str = this.f67869b;
            if (str == null) {
                C13706o.m87945v("connectionName");
            }
            return str;
        }

        /* renamed from: d */
        public final C16806d mo79849d() {
            return this.f67872e;
        }

        /* renamed from: e */
        public final int mo79850e() {
            return this.f67874g;
        }

        /* renamed from: f */
        public final C16836k mo79851f() {
            return this.f67873f;
        }

        /* renamed from: g */
        public final C11184c mo79852g() {
            C11184c cVar = this.f67871d;
            if (cVar == null) {
                C13706o.m87945v("sink");
            }
            return cVar;
        }

        /* renamed from: h */
        public final Socket mo79853h() {
            Socket socket = this.f67868a;
            if (socket == null) {
                C13706o.m87945v("socket");
            }
            return socket;
        }

        /* renamed from: i */
        public final C11186d mo79854i() {
            C11186d dVar = this.f67870c;
            if (dVar == null) {
                C13706o.m87945v("source");
            }
            return dVar;
        }

        /* renamed from: j */
        public final C16617e mo79855j() {
            return this.f67876i;
        }

        /* renamed from: k */
        public final C16804b mo79856k(C16806d dVar) {
            C13706o.m87929f(dVar, "listener");
            this.f67872e = dVar;
            return this;
        }

        /* renamed from: l */
        public final C16804b mo79857l(int i) {
            this.f67874g = i;
            return this;
        }

        /* renamed from: m */
        public final C16804b mo79858m(Socket socket, String str, C11186d dVar, C11184c cVar) throws IOException {
            String str2;
            C13706o.m87929f(socket, "socket");
            C13706o.m87929f(str, "peerName");
            C13706o.m87929f(dVar, "source");
            C13706o.m87929f(cVar, "sink");
            this.f67868a = socket;
            if (this.f67875h) {
                str2 = C16279b.f66630i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f67869b = str2;
            this.f67870c = dVar;
            this.f67871d = cVar;
            return this;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, mo71668d2 = {"Lwc/e$c;", "", "Lwc/l;", "DEFAULT_SETTINGS", "Lwc/l;", "a", "()Lwc/l;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$c */
    /* compiled from: Http2Connection.kt */
    public static final class C16805c {
        private C16805c() {
        }

        public /* synthetic */ C16805c(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16839l mo79859a() {
            return C16802e.f67835T;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, mo71668d2 = {"Lwc/e$d;", "", "Lwc/h;", "stream", "Lja/u;", "c", "Lwc/e;", "connection", "Lwc/l;", "settings", "b", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$d */
    /* compiled from: Http2Connection.kt */
    public static abstract class C16806d {

        /* renamed from: a */
        public static final C16806d f67877a = new C16807a();

        /* renamed from: b */
        public static final C16808b f67878b = new C16808b((C13695i) null);

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"wc/e$d$a", "Lwc/e$d;", "Lwc/h;", "stream", "Lja/u;", "c", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.e$d$a */
        /* compiled from: Http2Connection.kt */
        public static final class C16807a extends C16806d {
            C16807a() {
            }

            /* renamed from: c */
            public void mo76128c(C16827h hVar) throws IOException {
                C13706o.m87929f(hVar, "stream");
                hVar.mo79893d(C16794a.REFUSED_STREAM, (IOException) null);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lwc/e$d$b;", "", "Lwc/e$d;", "REFUSE_INCOMING_STREAMS", "Lwc/e$d;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.e$d$b */
        /* compiled from: Http2Connection.kt */
        public static final class C16808b {
            private C16808b() {
            }

            public /* synthetic */ C16808b(C13695i iVar) {
                this();
            }
        }

        /* renamed from: b */
        public void mo76127b(C16802e eVar, C16839l lVar) {
            C13706o.m87929f(eVar, "connection");
            C13706o.m87929f(lVar, "settings");
        }

        /* renamed from: c */
        public abstract void mo76128c(C16827h hVar) throws IOException;
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\t\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¨\u00061"}, mo71668d2 = {"Lwc/e$e;", "Lwc/g$c;", "Lkotlin/Function0;", "Lja/u;", "j", "", "inFinished", "", "streamId", "Lcd/d;", "source", "length", "w", "associatedStreamId", "", "Lwc/b;", "headerBlock", "a", "Lwc/a;", "errorCode", "b", "clearPrevious", "Lwc/l;", "settings", "c", "h", "v", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "Lcd/e;", "debugData", "g", "", "windowSizeIncrement", "d", "streamDependency", "weight", "exclusive", "x", "promisedStreamId", "requestHeaders", "u", "Lwc/g;", "reader", "<init>", "(Lwc/e;Lwc/g;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$e */
    /* compiled from: Http2Connection.kt */
    public final class C16809e implements C16823g.C16826c, C16254a<C13339u> {

        /* renamed from: a */
        private final C16823g f67879a;

        /* renamed from: c */
        final /* synthetic */ C16802e f67880c;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, mo71668d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Ltc/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.e$e$a */
        /* compiled from: TaskQueue.kt */
        public static final class C16810a extends C16613a {

            /* renamed from: e */
            final /* synthetic */ String f67881e;

            /* renamed from: f */
            final /* synthetic */ boolean f67882f;

            /* renamed from: g */
            final /* synthetic */ C16809e f67883g;

            /* renamed from: h */
            final /* synthetic */ C13684d0 f67884h;

            /* renamed from: i */
            final /* synthetic */ boolean f67885i;

            /* renamed from: j */
            final /* synthetic */ C16839l f67886j;

            /* renamed from: k */
            final /* synthetic */ C13682c0 f67887k;

            /* renamed from: l */
            final /* synthetic */ C13684d0 f67888l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16810a(String str, boolean z, String str2, boolean z2, C16809e eVar, C13684d0 d0Var, boolean z3, C16839l lVar, C13682c0 c0Var, C13684d0 d0Var2) {
                super(str2, z2);
                this.f67881e = str;
                this.f67882f = z;
                this.f67883g = eVar;
                this.f67884h = d0Var;
                this.f67885i = z3;
                this.f67886j = lVar;
                this.f67887k = c0Var;
                this.f67888l = d0Var2;
            }

            /* renamed from: f */
            public long mo76151f() {
                this.f67883g.f67880c.mo79815E().mo76127b(this.f67883g.f67880c, (C16839l) this.f67884h.element);
                return -1;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, mo71668d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Ltc/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.e$e$b */
        /* compiled from: TaskQueue.kt */
        public static final class C16811b extends C16613a {

            /* renamed from: e */
            final /* synthetic */ String f67889e;

            /* renamed from: f */
            final /* synthetic */ boolean f67890f;

            /* renamed from: g */
            final /* synthetic */ C16827h f67891g;

            /* renamed from: h */
            final /* synthetic */ C16809e f67892h;

            /* renamed from: i */
            final /* synthetic */ C16827h f67893i;

            /* renamed from: j */
            final /* synthetic */ int f67894j;

            /* renamed from: k */
            final /* synthetic */ List f67895k;

            /* renamed from: l */
            final /* synthetic */ boolean f67896l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16811b(String str, boolean z, String str2, boolean z2, C16827h hVar, C16809e eVar, C16827h hVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f67889e = str;
                this.f67890f = z;
                this.f67891g = hVar;
                this.f67892h = eVar;
                this.f67893i = hVar2;
                this.f67894j = i;
                this.f67895k = list;
                this.f67896l = z3;
            }

            /* renamed from: f */
            public long mo76151f() {
                try {
                    this.f67892h.f67880c.mo79815E().mo76128c(this.f67891g);
                    return -1;
                } catch (IOException e) {
                    C16926h g = C16926h.f68190c.mo80117g();
                    g.mo80113j("Http2Connection.Listener failure for " + this.f67892h.f67880c.mo79813C(), 4, e);
                    try {
                        this.f67891g.mo79893d(C16794a.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.e$e$c */
        /* compiled from: TaskQueue.kt */
        public static final class C16812c extends C16613a {

            /* renamed from: e */
            final /* synthetic */ String f67897e;

            /* renamed from: f */
            final /* synthetic */ boolean f67898f;

            /* renamed from: g */
            final /* synthetic */ C16809e f67899g;

            /* renamed from: h */
            final /* synthetic */ int f67900h;

            /* renamed from: i */
            final /* synthetic */ int f67901i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16812c(String str, boolean z, String str2, boolean z2, C16809e eVar, int i, int i2) {
                super(str2, z2);
                this.f67897e = str;
                this.f67898f = z;
                this.f67899g = eVar;
                this.f67900h = i;
                this.f67901i = i2;
            }

            /* renamed from: f */
            public long mo76151f() {
                this.f67899g.f67880c.mo79841t0(true, this.f67900h, this.f67901i);
                return -1;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.e$e$d */
        /* compiled from: TaskQueue.kt */
        public static final class C16813d extends C16613a {

            /* renamed from: e */
            final /* synthetic */ String f67902e;

            /* renamed from: f */
            final /* synthetic */ boolean f67903f;

            /* renamed from: g */
            final /* synthetic */ C16809e f67904g;

            /* renamed from: h */
            final /* synthetic */ boolean f67905h;

            /* renamed from: i */
            final /* synthetic */ C16839l f67906i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16813d(String str, boolean z, String str2, boolean z2, C16809e eVar, boolean z3, C16839l lVar) {
                super(str2, z2);
                this.f67902e = str;
                this.f67903f = z;
                this.f67904g = eVar;
                this.f67905h = z3;
                this.f67906i = lVar;
            }

            /* renamed from: f */
            public long mo76151f() {
                this.f67904g.mo79865h(this.f67905h, this.f67906i);
                return -1;
            }
        }

        public C16809e(C16802e eVar, C16823g gVar) {
            C13706o.m87929f(gVar, "reader");
            this.f67880c = eVar;
            this.f67879a = gVar;
        }

        /* renamed from: a */
        public void mo79860a(boolean z, int i, int i2, List<C16796b> list) {
            boolean z2 = z;
            int i3 = i;
            List<C16796b> list2 = list;
            C13706o.m87929f(list2, "headerBlock");
            if (this.f67880c.mo79829Z(i3)) {
                this.f67880c.mo79826S(i3, list2, z2);
                return;
            }
            synchronized (this.f67880c) {
                C16827h I = this.f67880c.mo79819I(i3);
                if (I != null) {
                    C13339u uVar = C13339u.f61331a;
                    I.mo79912x(C16279b.m97636L(list), z2);
                } else if (!this.f67880c.f67862p) {
                    if (i3 > this.f67880c.mo79814D()) {
                        if (i3 % 2 != this.f67880c.mo79816F() % 2) {
                            C16827h hVar = new C16827h(i, this.f67880c, false, z, C16279b.m97636L(list));
                            this.f67880c.mo79833f0(i3);
                            this.f67880c.mo79820J().put(Integer.valueOf(i), hVar);
                            String str = this.f67880c.mo79813C() + '[' + i3 + "] onStream";
                            this.f67880c.f67863s.mo79492i().mo79482i(new C16811b(str, true, str, true, hVar, this, I, i, list, z), 0);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo79861b(int i, C16794a aVar) {
            C13706o.m87929f(aVar, "errorCode");
            if (this.f67880c.mo79829Z(i)) {
                this.f67880c.mo79828W(i, aVar);
                return;
            }
            C16827h c0 = this.f67880c.mo79830c0(i);
            if (c0 != null) {
                c0.mo79913y(aVar);
            }
        }

        /* renamed from: c */
        public void mo79862c(boolean z, C16839l lVar) {
            C13706o.m87929f(lVar, "settings");
            String str = this.f67880c.mo79813C() + " applyAndAckSettings";
            this.f67880c.f67864z.mo79482i(new C16813d(str, true, str, true, this, z, lVar), 0);
        }

        /* renamed from: d */
        public void mo79863d(int i, long j) {
            if (i == 0) {
                synchronized (this.f67880c) {
                    C16802e eVar = this.f67880c;
                    eVar.f67851O = eVar.mo79821K() + j;
                    C16802e eVar2 = this.f67880c;
                    if (eVar2 != null) {
                        eVar2.notifyAll();
                        C13339u uVar = C13339u.f61331a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            C16827h I = this.f67880c.mo79819I(i);
            if (I != null) {
                synchronized (I) {
                    I.mo79890a(j);
                    C13339u uVar2 = C13339u.f61331a;
                }
            }
        }

        /* renamed from: g */
        public void mo79864g(int i, C16794a aVar, C11188e eVar) {
            int i2;
            C16827h[] hVarArr;
            C13706o.m87929f(aVar, "errorCode");
            C13706o.m87929f(eVar, "debugData");
            eVar.mo62485C();
            synchronized (this.f67880c) {
                Object[] array = this.f67880c.mo79820J().values().toArray(new C16827h[0]);
                if (array != null) {
                    hVarArr = (C16827h[]) array;
                    this.f67880c.f67862p = true;
                    C13339u uVar = C13339u.f61331a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C16827h hVar : hVarArr) {
                if (hVar.mo79898j() > i && hVar.mo79908t()) {
                    hVar.mo79913y(C16794a.REFUSED_STREAM);
                    this.f67880c.mo79830c0(hVar.mo79898j());
                }
            }
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: h */
        public final void mo79865h(boolean r22, p426wc.C16839l r23) {
            /*
                r21 = this;
                r12 = r21
                r0 = r23
                java.lang.String r1 = "settings"
                kotlin.jvm.internal.C13706o.m87929f(r0, r1)
                kotlin.jvm.internal.c0 r13 = new kotlin.jvm.internal.c0
                r13.<init>()
                kotlin.jvm.internal.d0 r14 = new kotlin.jvm.internal.d0
                r14.<init>()
                kotlin.jvm.internal.d0 r15 = new kotlin.jvm.internal.d0
                r15.<init>()
                wc.e r1 = r12.f67880c
                wc.i r16 = r1.mo79822L()
                monitor-enter(r16)
                wc.e r11 = r12.f67880c     // Catch:{ all -> 0x0108 }
                monitor-enter(r11)     // Catch:{ all -> 0x0108 }
                wc.e r1 = r12.f67880c     // Catch:{ all -> 0x0103 }
                wc.l r1 = r1.mo79818H()     // Catch:{ all -> 0x0103 }
                if (r22 == 0) goto L_0x002c
                r2 = r0
                goto L_0x0039
            L_0x002c:
                wc.l r2 = new wc.l     // Catch:{ all -> 0x0103 }
                r2.<init>()     // Catch:{ all -> 0x0103 }
                r2.mo79954g(r1)     // Catch:{ all -> 0x0103 }
                r2.mo79954g(r0)     // Catch:{ all -> 0x0103 }
                ja.u r3 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0103 }
            L_0x0039:
                r15.element = r2     // Catch:{ all -> 0x0103 }
                int r2 = r2.mo79950c()     // Catch:{ all -> 0x0103 }
                long r2 = (long) r2     // Catch:{ all -> 0x0103 }
                int r1 = r1.mo79950c()     // Catch:{ all -> 0x0103 }
                long r4 = (long) r1     // Catch:{ all -> 0x0103 }
                long r2 = r2 - r4
                r13.element = r2     // Catch:{ all -> 0x0103 }
                r10 = 0
                r8 = 0
                int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0079
                wc.e r1 = r12.f67880c     // Catch:{ all -> 0x0103 }
                java.util.Map r1 = r1.mo79820J()     // Catch:{ all -> 0x0103 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0103 }
                if (r1 == 0) goto L_0x005c
                goto L_0x0079
            L_0x005c:
                wc.e r1 = r12.f67880c     // Catch:{ all -> 0x0103 }
                java.util.Map r1 = r1.mo79820J()     // Catch:{ all -> 0x0103 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0103 }
                wc.h[] r2 = new p426wc.C16827h[r10]     // Catch:{ all -> 0x0103 }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0103 }
                if (r1 == 0) goto L_0x0071
                wc.h[] r1 = (p426wc.C16827h[]) r1     // Catch:{ all -> 0x0103 }
                goto L_0x007a
            L_0x0071:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0103 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x0103 }
                throw r0     // Catch:{ all -> 0x0103 }
            L_0x0079:
                r1 = 0
            L_0x007a:
                r14.element = r1     // Catch:{ all -> 0x0103 }
                wc.e r1 = r12.f67880c     // Catch:{ all -> 0x0103 }
                T r2 = r15.element     // Catch:{ all -> 0x0103 }
                wc.l r2 = (p426wc.C16839l) r2     // Catch:{ all -> 0x0103 }
                r1.mo79835h0(r2)     // Catch:{ all -> 0x0103 }
                wc.e r1 = r12.f67880c     // Catch:{ all -> 0x0103 }
                tc.d r7 = r1.f67838B     // Catch:{ all -> 0x0103 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
                r1.<init>()     // Catch:{ all -> 0x0103 }
                wc.e r2 = r12.f67880c     // Catch:{ all -> 0x0103 }
                java.lang.String r2 = r2.mo79813C()     // Catch:{ all -> 0x0103 }
                r1.append(r2)     // Catch:{ all -> 0x0103 }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x0103 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0103 }
                r5 = 1
                wc.e$e$a r6 = new wc.e$e$a     // Catch:{ all -> 0x0103 }
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r15
                r8 = r22
                r9 = r23
                r19 = 0
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0101 }
                r1 = r17
                r0 = r18
                r2 = 0
                r0.mo79482i(r1, r2)     // Catch:{ all -> 0x0101 }
                ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0101 }
                monitor-exit(r20)     // Catch:{ all -> 0x0108 }
                wc.e r0 = r12.f67880c     // Catch:{ IOException -> 0x00d6 }
                wc.i r0 = r0.mo79822L()     // Catch:{ IOException -> 0x00d6 }
                T r1 = r15.element     // Catch:{ IOException -> 0x00d6 }
                wc.l r1 = (p426wc.C16839l) r1     // Catch:{ IOException -> 0x00d6 }
                r0.mo79925b(r1)     // Catch:{ IOException -> 0x00d6 }
                goto L_0x00dc
            L_0x00d6:
                r0 = move-exception
                wc.e r1 = r12.f67880c     // Catch:{ all -> 0x0108 }
                r1.m99598A(r0)     // Catch:{ all -> 0x0108 }
            L_0x00dc:
                ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0108 }
                monitor-exit(r16)
                T r0 = r14.element
                r1 = r0
                wc.h[] r1 = (p426wc.C16827h[]) r1
                if (r1 == 0) goto L_0x0100
                wc.h[] r0 = (p426wc.C16827h[]) r0
                kotlin.jvm.internal.C13706o.m87926c(r0)
                int r1 = r0.length
                r10 = 0
            L_0x00ed:
                if (r10 >= r1) goto L_0x0100
                r2 = r0[r10]
                monitor-enter(r2)
                long r3 = r13.element     // Catch:{ all -> 0x00fd }
                r2.mo79890a(r3)     // Catch:{ all -> 0x00fd }
                ja.u r3 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00fd }
                monitor-exit(r2)
                int r10 = r10 + 1
                goto L_0x00ed
            L_0x00fd:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0100:
                return
            L_0x0101:
                r0 = move-exception
                goto L_0x0106
            L_0x0103:
                r0 = move-exception
                r20 = r11
            L_0x0106:
                monitor-exit(r20)     // Catch:{ all -> 0x0108 }
                throw r0     // Catch:{ all -> 0x0108 }
            L_0x0108:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.C16809e.mo79865h(boolean, wc.l):void");
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo79866j();
            return C13339u.f61331a;
        }

        /* renamed from: j */
        public void mo79866j() {
            C16794a aVar;
            C16794a aVar2 = C16794a.INTERNAL_ERROR;
            e = null;
            try {
                this.f67879a.mo79876e(this);
                while (this.f67879a.mo79874c(false, this)) {
                }
                aVar = C16794a.NO_ERROR;
                try {
                    this.f67880c.mo79845z(aVar, C16794a.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C16794a aVar3 = C16794a.PROTOCOL_ERROR;
                        this.f67880c.mo79845z(aVar3, aVar3, e);
                        C16279b.m97656j(this.f67879a);
                    } catch (Throwable th) {
                        th = th;
                        this.f67880c.mo79845z(aVar, aVar2, e);
                        C16279b.m97656j(this.f67879a);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                aVar = aVar2;
                C16794a aVar32 = C16794a.PROTOCOL_ERROR;
                this.f67880c.mo79845z(aVar32, aVar32, e);
                C16279b.m97656j(this.f67879a);
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                this.f67880c.mo79845z(aVar, aVar2, e);
                C16279b.m97656j(this.f67879a);
                throw th;
            }
            C16279b.m97656j(this.f67879a);
        }

        /* renamed from: k */
        public void mo79867k(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f67880c) {
                    if (i == 1) {
                        C16802e eVar = this.f67880c;
                        eVar.f67841E = eVar.f67841E + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            C16802e eVar2 = this.f67880c;
                            eVar2.f67844H = eVar2.f67844H + 1;
                            C16802e eVar3 = this.f67880c;
                            if (eVar3 != null) {
                                eVar3.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        C13339u uVar = C13339u.f61331a;
                    } else {
                        C16802e eVar4 = this.f67880c;
                        eVar4.f67843G = eVar4.f67843G + 1;
                    }
                }
                return;
            }
            String str = this.f67880c.mo79813C() + " ping";
            this.f67880c.f67864z.mo79482i(new C16812c(str, true, str, true, this, i, i2), 0);
        }

        /* renamed from: u */
        public void mo79868u(int i, int i2, List<C16796b> list) {
            C13706o.m87929f(list, "requestHeaders");
            this.f67880c.mo79827U(i2, list);
        }

        /* renamed from: v */
        public void mo79869v() {
        }

        /* renamed from: w */
        public void mo79870w(boolean z, int i, C11186d dVar, int i2) throws IOException {
            C13706o.m87929f(dVar, "source");
            if (this.f67880c.mo79829Z(i)) {
                this.f67880c.mo79825Q(i, dVar, i2, z);
                return;
            }
            C16827h I = this.f67880c.mo79819I(i);
            if (I == null) {
                this.f67880c.mo79843x0(i, C16794a.PROTOCOL_ERROR);
                long j = (long) i2;
                this.f67880c.mo79838n0(j);
                dVar.skip(j);
                return;
            }
            I.mo79911w(dVar, i2);
            if (z) {
                I.mo79912x(C16279b.f66623b, true);
            }
        }

        /* renamed from: x */
        public void mo79871x(int i, int i2, int i3, boolean z) {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$f */
    /* compiled from: TaskQueue.kt */
    public static final class C16814f extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67907e;

        /* renamed from: f */
        final /* synthetic */ boolean f67908f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67909g;

        /* renamed from: h */
        final /* synthetic */ int f67910h;

        /* renamed from: i */
        final /* synthetic */ C11179b f67911i;

        /* renamed from: j */
        final /* synthetic */ int f67912j;

        /* renamed from: k */
        final /* synthetic */ boolean f67913k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16814f(String str, boolean z, String str2, boolean z2, C16802e eVar, int i, C11179b bVar, int i2, boolean z3) {
            super(str2, z2);
            this.f67907e = str;
            this.f67908f = z;
            this.f67909g = eVar;
            this.f67910h = i;
            this.f67911i = bVar;
            this.f67912j = i2;
            this.f67913k = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo76151f() {
            /*
                r5 = this;
                wc.e r0 = r5.f67909g     // Catch:{ IOException -> 0x003e }
                wc.k r0 = r0.f67839C     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f67910h     // Catch:{ IOException -> 0x003e }
                cd.b r2 = r5.f67911i     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f67912j     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f67913k     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.mo79945b(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                wc.e r1 = r5.f67909g     // Catch:{ IOException -> 0x003e }
                wc.i r1 = r1.mo79822L()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f67910h     // Catch:{ IOException -> 0x003e }
                wc.a r3 = p426wc.C16794a.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.mo79935i(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f67913k     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                wc.e r0 = r5.f67909g     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                wc.e r1 = r5.f67909g     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f67855S     // Catch:{ all -> 0x003b }
                int r2 = r5.f67910h     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.C16814f.mo76151f():long");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$g */
    /* compiled from: TaskQueue.kt */
    public static final class C16815g extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67914e;

        /* renamed from: f */
        final /* synthetic */ boolean f67915f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67916g;

        /* renamed from: h */
        final /* synthetic */ int f67917h;

        /* renamed from: i */
        final /* synthetic */ List f67918i;

        /* renamed from: j */
        final /* synthetic */ boolean f67919j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16815g(String str, boolean z, String str2, boolean z2, C16802e eVar, int i, List list, boolean z3) {
            super(str2, z2);
            this.f67914e = str;
            this.f67915f = z;
            this.f67916g = eVar;
            this.f67917h = i;
            this.f67918i = list;
            this.f67919j = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo76151f() {
            /*
                r4 = this;
                wc.e r0 = r4.f67916g
                wc.k r0 = r0.f67839C
                int r1 = r4.f67917h
                java.util.List r2 = r4.f67918i
                boolean r3 = r4.f67919j
                boolean r0 = r0.mo79947d(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                wc.e r1 = r4.f67916g     // Catch:{ IOException -> 0x003c }
                wc.i r1 = r1.mo79822L()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f67917h     // Catch:{ IOException -> 0x003c }
                wc.a r3 = p426wc.C16794a.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.mo79935i(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f67919j     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                wc.e r0 = r4.f67916g     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                wc.e r1 = r4.f67916g     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f67855S     // Catch:{ all -> 0x0039 }
                int r2 = r4.f67917h     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.C16815g.mo76151f():long");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$h */
    /* compiled from: TaskQueue.kt */
    public static final class C16816h extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67920e;

        /* renamed from: f */
        final /* synthetic */ boolean f67921f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67922g;

        /* renamed from: h */
        final /* synthetic */ int f67923h;

        /* renamed from: i */
        final /* synthetic */ List f67924i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16816h(String str, boolean z, String str2, boolean z2, C16802e eVar, int i, List list) {
            super(str2, z2);
            this.f67920e = str;
            this.f67921f = z;
            this.f67922g = eVar;
            this.f67923h = i;
            this.f67924i = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo76151f() {
            /*
                r3 = this;
                wc.e r0 = r3.f67922g
                wc.k r0 = r0.f67839C
                int r1 = r3.f67923h
                java.util.List r2 = r3.f67924i
                boolean r0 = r0.mo79946c(r1, r2)
                if (r0 == 0) goto L_0x0034
                wc.e r0 = r3.f67922g     // Catch:{ IOException -> 0x0034 }
                wc.i r0 = r0.mo79822L()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f67923h     // Catch:{ IOException -> 0x0034 }
                wc.a r2 = p426wc.C16794a.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.mo79935i(r1, r2)     // Catch:{ IOException -> 0x0034 }
                wc.e r0 = r3.f67922g     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                wc.e r1 = r3.f67922g     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f67855S     // Catch:{ all -> 0x0031 }
                int r2 = r3.f67923h     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.C16816h.mo76151f():long");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$i */
    /* compiled from: TaskQueue.kt */
    public static final class C16817i extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67925e;

        /* renamed from: f */
        final /* synthetic */ boolean f67926f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67927g;

        /* renamed from: h */
        final /* synthetic */ int f67928h;

        /* renamed from: i */
        final /* synthetic */ C16794a f67929i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16817i(String str, boolean z, String str2, boolean z2, C16802e eVar, int i, C16794a aVar) {
            super(str2, z2);
            this.f67925e = str;
            this.f67926f = z;
            this.f67927g = eVar;
            this.f67928h = i;
            this.f67929i = aVar;
        }

        /* renamed from: f */
        public long mo76151f() {
            this.f67927g.f67839C.mo79944a(this.f67928h, this.f67929i);
            synchronized (this.f67927g) {
                this.f67927g.f67855S.remove(Integer.valueOf(this.f67928h));
                C13339u uVar = C13339u.f61331a;
            }
            return -1;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$j */
    /* compiled from: TaskQueue.kt */
    public static final class C16818j extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67930e;

        /* renamed from: f */
        final /* synthetic */ boolean f67931f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67932g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16818j(String str, boolean z, String str2, boolean z2, C16802e eVar) {
            super(str2, z2);
            this.f67930e = str;
            this.f67931f = z;
            this.f67932g = eVar;
        }

        /* renamed from: f */
        public long mo76151f() {
            this.f67932g.mo79841t0(false, 2, 0);
            return -1;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$k */
    /* compiled from: TaskQueue.kt */
    public static final class C16819k extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67933e;

        /* renamed from: f */
        final /* synthetic */ boolean f67934f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67935g;

        /* renamed from: h */
        final /* synthetic */ int f67936h;

        /* renamed from: i */
        final /* synthetic */ C16794a f67937i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16819k(String str, boolean z, String str2, boolean z2, C16802e eVar, int i, C16794a aVar) {
            super(str2, z2);
            this.f67933e = str;
            this.f67934f = z;
            this.f67935g = eVar;
            this.f67936h = i;
            this.f67937i = aVar;
        }

        /* renamed from: f */
        public long mo76151f() {
            try {
                this.f67935g.mo79842w0(this.f67936h, this.f67937i);
                return -1;
            } catch (IOException e) {
                this.f67935g.m99598A(e);
                return -1;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo71668d2 = {"tc/c", "Ltc/a;", "", "f", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.e$l */
    /* compiled from: TaskQueue.kt */
    public static final class C16820l extends C16613a {

        /* renamed from: e */
        final /* synthetic */ String f67938e;

        /* renamed from: f */
        final /* synthetic */ boolean f67939f;

        /* renamed from: g */
        final /* synthetic */ C16802e f67940g;

        /* renamed from: h */
        final /* synthetic */ int f67941h;

        /* renamed from: i */
        final /* synthetic */ long f67942i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16820l(String str, boolean z, String str2, boolean z2, C16802e eVar, int i, long j) {
            super(str2, z2);
            this.f67938e = str;
            this.f67939f = z;
            this.f67940g = eVar;
            this.f67941h = i;
            this.f67942i = j;
        }

        /* renamed from: f */
        public long mo76151f() {
            try {
                this.f67940g.mo79822L().mo79928d(this.f67941h, this.f67942i);
                return -1;
            } catch (IOException e) {
                this.f67940g.m99598A(e);
                return -1;
            }
        }
    }

    static {
        C16839l lVar = new C16839l();
        lVar.mo79955h(7, 65535);
        lVar.mo79955h(5, 16384);
        f67835T = lVar;
    }

    public C16802e(C16804b bVar) {
        C13706o.m87929f(bVar, "builder");
        boolean b = bVar.mo79847b();
        this.f67856a = b;
        this.f67857c = bVar.mo79849d();
        String c = bVar.mo79848c();
        this.f67859f = c;
        this.f67861o = bVar.mo79847b() ? 3 : 2;
        C16617e j = bVar.mo79855j();
        this.f67863s = j;
        C16616d i = j.mo79492i();
        this.f67864z = i;
        this.f67837A = j.mo79492i();
        this.f67838B = j.mo79492i();
        this.f67839C = bVar.mo79851f();
        C16839l lVar = new C16839l();
        if (bVar.mo79847b()) {
            lVar.mo79955h(7, 16777216);
        }
        C13339u uVar = C13339u.f61331a;
        this.f67846J = lVar;
        C16839l lVar2 = f67835T;
        this.f67847K = lVar2;
        this.f67851O = (long) lVar2.mo79950c();
        this.f67852P = bVar.mo79853h();
        this.f67853Q = new C16832i(bVar.mo79852g(), b);
        this.f67854R = new C16809e(this, new C16823g(bVar.mo79854i(), b));
        this.f67855S = new LinkedHashSet();
        if (bVar.mo79850e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) bVar.mo79850e());
            String str = c + " ping";
            i.mo79482i(new C16803a(str, str, this, nanos), nanos);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m99598A(IOException iOException) {
        C16794a aVar = C16794a.PROTOCOL_ERROR;
        mo79845z(aVar, aVar, iOException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p426wc.C16827h m99599N(int r11, java.util.List<p426wc.C16796b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            wc.i r7 = r10.f67853Q
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0084 }
            int r0 = r10.f67861o     // Catch:{ all -> 0x0081 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            wc.a r0 = p426wc.C16794a.REFUSED_STREAM     // Catch:{ all -> 0x0081 }
            r10.mo79836j0(r0)     // Catch:{ all -> 0x0081 }
        L_0x0013:
            boolean r0 = r10.f67862p     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x007b
            int r8 = r10.f67861o     // Catch:{ all -> 0x0081 }
            int r0 = r8 + 2
            r10.f67861o = r0     // Catch:{ all -> 0x0081 }
            wc.h r9 = new wc.h     // Catch:{ all -> 0x0081 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0081 }
            r0 = 1
            if (r13 == 0) goto L_0x0041
            long r1 = r10.f67850N     // Catch:{ all -> 0x0081 }
            long r3 = r10.f67851O     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            long r1 = r9.mo79906r()     // Catch:{ all -> 0x0081 }
            long r3 = r9.mo79905q()     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = 1
        L_0x0042:
            boolean r1 = r9.mo79909u()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0051
            java.util.Map<java.lang.Integer, wc.h> r1 = r10.f67858d     // Catch:{ all -> 0x0081 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0081 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0081 }
        L_0x0051:
            ja.u r1 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x005c
            wc.i r11 = r10.f67853Q     // Catch:{ all -> 0x0084 }
            r11.mo79933g(r6, r8, r12)     // Catch:{ all -> 0x0084 }
            goto L_0x0066
        L_0x005c:
            boolean r1 = r10.f67856a     // Catch:{ all -> 0x0084 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            wc.i r0 = r10.f67853Q     // Catch:{ all -> 0x0084 }
            r0.mo79934h(r11, r8, r12)     // Catch:{ all -> 0x0084 }
        L_0x0066:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x006e
            wc.i r11 = r10.f67853Q
            r11.flush()
        L_0x006e:
            return r9
        L_0x006f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0084 }
            r12.<init>(r11)     // Catch:{ all -> 0x0084 }
            throw r12     // Catch:{ all -> 0x0084 }
        L_0x007b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0081 }
            r11.<init>()     // Catch:{ all -> 0x0081 }
            throw r11     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r11     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.m99599N(int, java.util.List, boolean):wc.h");
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m99608l0(C16802e eVar, boolean z, C16617e eVar2, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            eVar2 = C16617e.f67465h;
        }
        eVar.mo79837k0(z, eVar2);
    }

    /* renamed from: B */
    public final boolean mo79812B() {
        return this.f67856a;
    }

    /* renamed from: C */
    public final String mo79813C() {
        return this.f67859f;
    }

    /* renamed from: D */
    public final int mo79814D() {
        return this.f67860g;
    }

    /* renamed from: E */
    public final C16806d mo79815E() {
        return this.f67857c;
    }

    /* renamed from: F */
    public final int mo79816F() {
        return this.f67861o;
    }

    /* renamed from: G */
    public final C16839l mo79817G() {
        return this.f67846J;
    }

    /* renamed from: H */
    public final C16839l mo79818H() {
        return this.f67847K;
    }

    /* renamed from: I */
    public final synchronized C16827h mo79819I(int i) {
        return this.f67858d.get(Integer.valueOf(i));
    }

    /* renamed from: J */
    public final Map<Integer, C16827h> mo79820J() {
        return this.f67858d;
    }

    /* renamed from: K */
    public final long mo79821K() {
        return this.f67851O;
    }

    /* renamed from: L */
    public final C16832i mo79822L() {
        return this.f67853Q;
    }

    /* renamed from: M */
    public final synchronized boolean mo79823M(long j) {
        if (this.f67862p) {
            return false;
        }
        if (this.f67843G >= this.f67842F || j < this.f67845I) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final C16827h mo79824O(List<C16796b> list, boolean z) throws IOException {
        C13706o.m87929f(list, "requestHeaders");
        return m99599N(0, list, z);
    }

    /* renamed from: Q */
    public final void mo79825Q(int i, C11186d dVar, int i2, boolean z) throws IOException {
        C13706o.m87929f(dVar, "source");
        C11179b bVar = new C11179b();
        long j = (long) i2;
        dVar.mo62420W0(j);
        dVar.mo62392m0(bVar, j);
        String str = this.f67859f + '[' + i + "] onData";
        this.f67837A.mo79482i(new C16814f(str, true, str, true, this, i, bVar, i2, z), 0);
    }

    /* renamed from: S */
    public final void mo79826S(int i, List<C16796b> list, boolean z) {
        C13706o.m87929f(list, "requestHeaders");
        String str = this.f67859f + '[' + i + "] onHeaders";
        this.f67837A.mo79482i(new C16815g(str, true, str, true, this, i, list, z), 0);
    }

    /* renamed from: U */
    public final void mo79827U(int i, List<C16796b> list) {
        C13706o.m87929f(list, "requestHeaders");
        synchronized (this) {
            if (this.f67855S.contains(Integer.valueOf(i))) {
                mo79843x0(i, C16794a.PROTOCOL_ERROR);
                return;
            }
            this.f67855S.add(Integer.valueOf(i));
            String str = this.f67859f + '[' + i + "] onRequest";
            this.f67837A.mo79482i(new C16816h(str, true, str, true, this, i, list), 0);
        }
    }

    /* renamed from: W */
    public final void mo79828W(int i, C16794a aVar) {
        C13706o.m87929f(aVar, "errorCode");
        String str = this.f67859f + '[' + i + "] onReset";
        this.f67837A.mo79482i(new C16817i(str, true, str, true, this, i, aVar), 0);
    }

    /* renamed from: Z */
    public final boolean mo79829Z(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: c0 */
    public final synchronized C16827h mo79830c0(int i) {
        C16827h remove;
        remove = this.f67858d.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void close() {
        mo79845z(C16794a.NO_ERROR, C16794a.CANCEL, (IOException) null);
    }

    /* renamed from: e0 */
    public final void mo79832e0() {
        synchronized (this) {
            long j = this.f67843G;
            long j2 = this.f67842F;
            if (j >= j2) {
                this.f67842F = j2 + 1;
                this.f67845I = System.nanoTime() + ((long) 1000000000);
                C13339u uVar = C13339u.f61331a;
                String str = this.f67859f + " ping";
                this.f67864z.mo79482i(new C16818j(str, true, str, true, this), 0);
            }
        }
    }

    /* renamed from: f0 */
    public final void mo79833f0(int i) {
        this.f67860g = i;
    }

    public final void flush() throws IOException {
        this.f67853Q.flush();
    }

    /* renamed from: h0 */
    public final void mo79835h0(C16839l lVar) {
        C13706o.m87929f(lVar, "<set-?>");
        this.f67847K = lVar;
    }

    /* renamed from: j0 */
    public final void mo79836j0(C16794a aVar) throws IOException {
        C13706o.m87929f(aVar, "statusCode");
        synchronized (this.f67853Q) {
            synchronized (this) {
                if (!this.f67862p) {
                    this.f67862p = true;
                    int i = this.f67860g;
                    C13339u uVar = C13339u.f61331a;
                    this.f67853Q.mo79931f(i, aVar, C16279b.f66622a);
                }
            }
        }
    }

    /* renamed from: k0 */
    public final void mo79837k0(boolean z, C16617e eVar) throws IOException {
        C13706o.m87929f(eVar, "taskRunner");
        if (z) {
            this.f67853Q.mo79929d0();
            this.f67853Q.mo79936j(this.f67846J);
            int c = this.f67846J.mo79950c();
            if (c != 65535) {
                this.f67853Q.mo79928d(0, (long) (c - 65535));
            }
        }
        C16616d i = eVar.mo79492i();
        String str = this.f67859f;
        i.mo79482i(new C16615c(this.f67854R, str, true, str, true), 0);
    }

    /* renamed from: n0 */
    public final synchronized void mo79838n0(long j) {
        long j2 = this.f67848L + j;
        this.f67848L = j2;
        long j3 = j2 - this.f67849M;
        if (j3 >= ((long) (this.f67846J.mo79950c() / 2))) {
            mo79844y0(0, j3);
            this.f67849M += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f67853Q.mo79923T0());
        r6 = (long) r3;
        r8.f67850N += r6;
        r4 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79839p0(int r9, boolean r10, p226cd.C11179b r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            wc.i r12 = r8.f67853Q
            r12.mo79924X0(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x006c
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f67850N     // Catch:{ InterruptedException -> 0x005d }
            long r5 = r8.f67851O     // Catch:{ InterruptedException -> 0x005d }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, wc.h> r3 = r8.f67858d     // Catch:{ InterruptedException -> 0x005d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005d }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005d }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005d }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005d }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005d }
            throw r9     // Catch:{ InterruptedException -> 0x005d }
        L_0x0032:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch:{ all -> 0x005b }
            int r4 = (int) r3     // Catch:{ all -> 0x005b }
            wc.i r3 = r8.f67853Q     // Catch:{ all -> 0x005b }
            int r3 = r3.mo79923T0()     // Catch:{ all -> 0x005b }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x005b }
            long r4 = r8.f67850N     // Catch:{ all -> 0x005b }
            long r6 = (long) r3     // Catch:{ all -> 0x005b }
            long r4 = r4 + r6
            r8.f67850N = r4     // Catch:{ all -> 0x005b }
            ja.u r4 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x005b }
            monitor-exit(r8)
            long r12 = r12 - r6
            wc.i r4 = r8.f67853Q
            if (r10 == 0) goto L_0x0056
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r4.mo79924X0(r5, r9, r11, r3)
            goto L_0x000d
        L_0x005b:
            r9 = move-exception
            goto L_0x006a
        L_0x005d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005b }
            r9.interrupt()     // Catch:{ all -> 0x005b }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x005b }
            r9.<init>()     // Catch:{ all -> 0x005b }
            throw r9     // Catch:{ all -> 0x005b }
        L_0x006a:
            monitor-exit(r8)
            throw r9
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.mo79839p0(int, boolean, cd.b, long):void");
    }

    /* renamed from: q0 */
    public final void mo79840q0(int i, boolean z, List<C16796b> list) throws IOException {
        C13706o.m87929f(list, "alternating");
        this.f67853Q.mo79933g(z, i, list);
    }

    /* renamed from: t0 */
    public final void mo79841t0(boolean z, int i, int i2) {
        try {
            this.f67853Q.mo79937k(z, i, i2);
        } catch (IOException e) {
            m99598A(e);
        }
    }

    /* renamed from: w0 */
    public final void mo79842w0(int i, C16794a aVar) throws IOException {
        C13706o.m87929f(aVar, "statusCode");
        this.f67853Q.mo79935i(i, aVar);
    }

    /* renamed from: x0 */
    public final void mo79843x0(int i, C16794a aVar) {
        C13706o.m87929f(aVar, "errorCode");
        String str = this.f67859f + '[' + i + "] writeSynReset";
        this.f67864z.mo79482i(new C16819k(str, true, str, true, this, i, aVar), 0);
    }

    /* renamed from: y0 */
    public final void mo79844y0(int i, long j) {
        String str = this.f67859f + '[' + i + "] windowUpdate";
        this.f67864z.mo79482i(new C16820l(str, true, str, true, this, i, j), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|45|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79845z(p426wc.C16794a r4, p426wc.C16794a r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            boolean r0 = p372qc.C16279b.f66629h
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.C13706o.m87928e(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.mo79836j0(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, wc.h> r0 = r3.f67858d     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.Map<java.lang.Integer, wc.h> r4 = r3.f67858d     // Catch:{ all -> 0x0099 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0099 }
            wc.h[] r0 = new p426wc.C16827h[r1]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0067
            wc.h[] r4 = (p426wc.C16827h[]) r4     // Catch:{ all -> 0x0099 }
            java.util.Map<java.lang.Integer, wc.h> r0 = r3.f67858d     // Catch:{ all -> 0x0099 }
            r0.clear()     // Catch:{ all -> 0x0099 }
            goto L_0x006f
        L_0x0067:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ all -> 0x0099 }
        L_0x006f:
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length
        L_0x0075:
            if (r1 >= r0) goto L_0x007f
            r2 = r4[r1]
            r2.mo79893d(r5, r6)     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x007f:
            wc.i r4 = r3.f67853Q     // Catch:{ IOException -> 0x0084 }
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.net.Socket r4 = r3.f67852P     // Catch:{ IOException -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            tc.d r4 = r3.f67864z
            r4.mo79486n()
            tc.d r4 = r3.f67837A
            r4.mo79486n()
            tc.d r4 = r3.f67838B
            r4.mo79486n()
            return
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wc.C16802e.mo79845z(wc.a, wc.a, java.io.IOException):void");
    }
}
