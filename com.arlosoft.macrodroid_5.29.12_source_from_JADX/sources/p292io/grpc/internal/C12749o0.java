package p292io.grpc.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12560f0;
import p292io.grpc.C12562g0;
import p292io.grpc.C12900j;
import p292io.grpc.C12910l0;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.C13009x0;
import p292io.grpc.C13011y0;
import p292io.grpc.internal.C12617c2;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12785r;

/* renamed from: io.grpc.internal.o0 */
/* compiled from: GrpcUtil */
public final class C12749o0 {

    /* renamed from: a */
    private static final Logger f60028a = Logger.getLogger(C12749o0.class.getName());

    /* renamed from: b */
    public static final Charset f60029b = Charset.forName("US-ASCII");

    /* renamed from: c */
    public static final C12960q0.C12967g<Long> f60030c = C12960q0.C12967g.m85092e("grpc-timeout", new C12757h());

    /* renamed from: d */
    public static final C12960q0.C12967g<String> f60031d;

    /* renamed from: e */
    public static final C12960q0.C12967g<byte[]> f60032e = C12562g0.m83776b("grpc-accept-encoding", new C12755f((C12750a) null));

    /* renamed from: f */
    public static final C12960q0.C12967g<String> f60033f;

    /* renamed from: g */
    public static final C12960q0.C12967g<byte[]> f60034g = C12562g0.m83776b("accept-encoding", new C12755f((C12750a) null));

    /* renamed from: h */
    public static final C12960q0.C12967g<String> f60035h;

    /* renamed from: i */
    public static final C12960q0.C12967g<String> f60036i;

    /* renamed from: j */
    public static final C12960q0.C12967g<String> f60037j;

    /* renamed from: k */
    public static final Splitter f60038k = Splitter.m5427f(',').mo22237m();

    /* renamed from: l */
    public static final long f60039l;

    /* renamed from: m */
    public static final long f60040m = TimeUnit.HOURS.toNanos(2);

    /* renamed from: n */
    public static final long f60041n;

    /* renamed from: o */
    public static final C13011y0 f60042o = new C12789r1();

    /* renamed from: p */
    public static final C13011y0 f60043p = new C12750a();

    /* renamed from: q */
    public static final C12542c.C12543a<Boolean> f60044q = C12542c.C12543a.m83731b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");

    /* renamed from: r */
    public static final C12617c2.C12621d<Executor> f60045r = new C12751b();

    /* renamed from: s */
    public static final C12617c2.C12621d<ScheduledExecutorService> f60046s = new C12752c();

    /* renamed from: t */
    public static final Supplier<Stopwatch> f60047t = new C12753d();

    /* renamed from: io.grpc.internal.o0$a */
    /* compiled from: GrpcUtil */
    class C12750a implements C13011y0 {
        C12750a() {
        }

        /* renamed from: a */
        public C13009x0 mo69481a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* renamed from: io.grpc.internal.o0$b */
    /* compiled from: GrpcUtil */
    class C12751b implements C12617c2.C12621d<Executor> {
        C12751b() {
        }

        /* renamed from: a */
        public void mo69247b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(C12749o0.m84364f("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: io.grpc.internal.o0$c */
    /* compiled from: GrpcUtil */
    class C12752c implements C12617c2.C12621d<ScheduledExecutorService> {
        C12752c() {
        }

        /* renamed from: a */
        public void mo69247b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        /* renamed from: c */
        public ScheduledExecutorService create() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C12749o0.m84364f("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* renamed from: io.grpc.internal.o0$d */
    /* compiled from: GrpcUtil */
    class C12753d implements Supplier<Stopwatch> {
        C12753d() {
        }

        /* renamed from: a */
        public Stopwatch get() {
            return Stopwatch.m5464d();
        }
    }

    /* renamed from: io.grpc.internal.o0$e */
    /* compiled from: GrpcUtil */
    class C12754e implements C12793s {

        /* renamed from: a */
        final /* synthetic */ C12793s f60048a;

        /* renamed from: b */
        final /* synthetic */ C12900j.C12901a f60049b;

        C12754e(C12793s sVar, C12900j.C12901a aVar) {
            this.f60048a = sVar;
            this.f60049b = aVar;
        }

        /* renamed from: c */
        public C12560f0 mo69268c() {
            return this.f60048a.mo69268c();
        }

        /* renamed from: g */
        public C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
            return this.f60048a.mo69389g(r0Var, q0Var, cVar.mo69092q(this.f60049b));
        }
    }

    /* renamed from: io.grpc.internal.o0$f */
    /* compiled from: GrpcUtil */
    private static final class C12755f implements C12562g0.C12563a<byte[]> {
        private C12755f() {
        }

        /* synthetic */ C12755f(C12750a aVar) {
            this();
        }

        /* renamed from: c */
        public byte[] mo69071b(byte[] bArr) {
            return bArr;
        }

        /* renamed from: d */
        public byte[] mo69070a(byte[] bArr) {
            return bArr;
        }
    }

    /* renamed from: io.grpc.internal.o0$g */
    /* compiled from: GrpcUtil */
    public enum C12756g {
        NO_ERROR(0, r1),
        PROTOCOL_ERROR(1, r4),
        INTERNAL_ERROR(2, r4),
        FLOW_CONTROL_ERROR(3, r4),
        SETTINGS_TIMEOUT(4, r4),
        STREAM_CLOSED(5, r4),
        FRAME_SIZE_ERROR(6, r4),
        REFUSED_STREAM(7, r1),
        CANCEL(8, C12537b1.f59408g),
        COMPRESSION_ERROR(9, r4),
        CONNECT_ERROR(10, r4),
        ENHANCE_YOUR_CALM(11, C12537b1.f59416o.mo69066q("Bandwidth exhausted")),
        INADEQUATE_SECURITY(12, C12537b1.f59414m.mo69066q("Permission denied as protocol is not secure enough to call")),
        HTTP_1_1_REQUIRED(13, C12537b1.f59409h);
        

        /* renamed from: F */
        private static final C12756g[] f60055F = null;
        private final int code;
        private final C12537b1 status;

        static {
            f60055F = m84384b();
        }

        private C12756g(int i, C12537b1 b1Var) {
            this.code = i;
            this.status = b1Var.mo69058e("HTTP/2 error code: " + name());
        }

        /* renamed from: b */
        private static C12756g[] m84384b() {
            C12756g[] values = values();
            C12756g[] gVarArr = new C12756g[(((int) values[values.length - 1].mo69490d()) + 1)];
            for (C12756g gVar : values) {
                gVarArr[(int) gVar.mo69490d()] = gVar;
            }
            return gVarArr;
        }

        /* renamed from: e */
        public static C12756g m84385e(long j) {
            C12756g[] gVarArr = f60055F;
            if (j >= ((long) gVarArr.length) || j < 0) {
                return null;
            }
            return gVarArr[(int) j];
        }

        /* renamed from: g */
        public static C12537b1 m84386g(long j) {
            C12756g e = m84385e(j);
            if (e != null) {
                return e.mo69491f();
            }
            C12537b1 h = C12537b1.m83683h(INTERNAL_ERROR.mo69491f().mo69062m().mo69069e());
            return h.mo69066q("Unrecognized HTTP/2 error code: " + j);
        }

        /* renamed from: d */
        public long mo69490d() {
            return (long) this.code;
        }

        /* renamed from: f */
        public C12537b1 mo69491f() {
            return this.status;
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.o0$h */
    /* compiled from: GrpcUtil */
    static class C12757h implements C12960q0.C12964d<Long> {
        C12757h() {
        }

        /* renamed from: c */
        public Long mo69493b(String str) {
            Preconditions.m5378e(str.length() > 0, "empty timeout");
            Preconditions.m5378e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            }
            if (charAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            if (charAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            if (charAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            }
            if (charAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            }
            if (charAt == 'n') {
                return Long.valueOf(parseLong);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(charAt)}));
        }

        /* renamed from: d */
        public String mo69492a(Long l) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            } else if (l.longValue() < 100000000) {
                return l + "n";
            } else if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            } else if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            } else if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + ExifInterface.LATITUDE_SOUTH;
            } else if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            } else {
                return timeUnit.toHours(l.longValue()) + "H";
            }
        }
    }

    static {
        C12960q0.C12964d<String> dVar = C12960q0.f60666d;
        f60031d = C12960q0.C12967g.m85092e("grpc-encoding", dVar);
        f60033f = C12960q0.C12967g.m85092e("content-encoding", dVar);
        f60035h = C12960q0.C12967g.m85092e("content-type", dVar);
        f60036i = C12960q0.C12967g.m85092e("te", dVar);
        f60037j = C12960q0.C12967g.m85092e("user-agent", dVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f60039l = timeUnit.toNanos(20);
        f60041n = timeUnit.toNanos(20);
    }

    private C12749o0() {
    }

    /* renamed from: a */
    public static URI m84359a(String str) {
        Preconditions.m5393t(str, "authority");
        try {
            return new URI((String) null, str, (String) null, (String) null, (String) null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: " + str, e);
        }
    }

    /* renamed from: b */
    static void m84360b(C12690g2.C12691a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                m84361c(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m84361c(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                f60028a.log(Level.WARNING, "exception caught in closeQuietly", e);
            }
        }
    }

    /* renamed from: d */
    public static String m84362d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.28.0");
        return sb.toString();
    }

    /* renamed from: e */
    public static String m84363e(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: f */
    public static ThreadFactory m84364f(String str, boolean z) {
        return new ThreadFactoryBuilder().mo61914e(z).mo61915f(str).mo61913b();
    }

    /* renamed from: g */
    static C12793s m84365g(C12910l0.C12916e eVar, boolean z) {
        C12910l0.C12920h c = eVar.mo69681c();
        C12793s a = c != null ? ((C12721j2) c.mo69338d()).mo69443a() : null;
        if (a != null) {
            C12900j.C12901a b = eVar.mo69680b();
            if (b == null) {
                return a;
            }
            return new C12754e(a, b);
        }
        if (!eVar.mo69679a().mo69064o()) {
            if (eVar.mo69682d()) {
                return new C12680f0(eVar.mo69679a(), C12785r.C12786a.DROPPED);
            }
            if (!z) {
                return new C12680f0(eVar.mo69679a(), C12785r.C12786a.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C12537b1.C12539b m84366h(int i) {
        if (i >= 100 && i < 200) {
            return C12537b1.C12539b.INTERNAL;
        }
        if (i != 400) {
            if (i == 401) {
                return C12537b1.C12539b.UNAUTHENTICATED;
            }
            if (i == 403) {
                return C12537b1.C12539b.PERMISSION_DENIED;
            }
            if (i == 404) {
                return C12537b1.C12539b.UNIMPLEMENTED;
            }
            if (i != 429) {
                if (i != 431) {
                    switch (i) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return C12537b1.C12539b.UNKNOWN;
                    }
                }
            }
            return C12537b1.C12539b.UNAVAILABLE;
        }
        return C12537b1.C12539b.INTERNAL;
    }

    /* renamed from: i */
    public static C12537b1 m84367i(int i) {
        C12537b1 d = m84366h(i).mo69068d();
        return d.mo69066q("HTTP status code " + i);
    }

    /* renamed from: j */
    public static boolean m84368j(String str) {
        char charAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m84369k(C12542c cVar) {
        return !Boolean.TRUE.equals(cVar.mo69083h(f60044q));
    }
}
