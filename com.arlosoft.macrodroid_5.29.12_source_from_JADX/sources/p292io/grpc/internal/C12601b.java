package p292io.grpc.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.apache.commons.p353io.FileUtils;
import p292io.grpc.C12533b0;
import p292io.grpc.C12561g;
import p292io.grpc.C12923m;
import p292io.grpc.C12930o0;
import p292io.grpc.C12951p0;
import p292io.grpc.C12981s0;
import p292io.grpc.C12997u;
import p292io.grpc.C12999u0;
import p292io.grpc.C13011y0;
import p292io.grpc.internal.C12601b;
import p292io.grpc.internal.C12625d0;
import p292io.grpc.internal.C12725k2;

/* renamed from: io.grpc.internal.b */
/* compiled from: AbstractManagedChannelImplBuilder */
public abstract class C12601b<T extends C12601b<T>> extends C12951p0<T> {

    /* renamed from: G */
    private static final Logger f59594G = Logger.getLogger(C12601b.class.getName());
    @VisibleForTesting

    /* renamed from: H */
    static final long f59595H = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: I */
    static final long f59596I = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: J */
    private static final C12733l1<? extends Executor> f59597J = C12664d2.m84108c(C12749o0.f60045r);

    /* renamed from: K */
    private static final C12997u f59598K = C12997u.m85199c();

    /* renamed from: L */
    private static final C12923m f59599L = C12923m.m84930a();

    /* renamed from: A */
    C13011y0 f59600A;

    /* renamed from: B */
    private boolean f59601B;

    /* renamed from: C */
    private boolean f59602C;

    /* renamed from: D */
    private boolean f59603D;

    /* renamed from: E */
    private boolean f59604E;

    /* renamed from: F */
    private boolean f59605F;

    /* renamed from: a */
    C12733l1<? extends Executor> f59606a;

    /* renamed from: b */
    C12733l1<? extends Executor> f59607b;

    /* renamed from: c */
    private final List<C12561g> f59608c = new ArrayList();

    /* renamed from: d */
    final C12999u0 f59609d;

    /* renamed from: e */
    private C12981s0.C12986d f59610e;

    /* renamed from: f */
    final String f59611f;

    /* renamed from: g */
    private final SocketAddress f59612g;

    /* renamed from: h */
    String f59613h;
    @VisibleForTesting

    /* renamed from: i */
    String f59614i;

    /* renamed from: j */
    String f59615j;

    /* renamed from: k */
    boolean f59616k;

    /* renamed from: l */
    C12997u f59617l;

    /* renamed from: m */
    C12923m f59618m;

    /* renamed from: n */
    long f59619n;

    /* renamed from: o */
    int f59620o;

    /* renamed from: p */
    int f59621p;

    /* renamed from: q */
    long f59622q;

    /* renamed from: r */
    long f59623r;

    /* renamed from: s */
    boolean f59624s;

    /* renamed from: t */
    boolean f59625t;

    /* renamed from: u */
    C12533b0 f59626u;

    /* renamed from: v */
    int f59627v;

    /* renamed from: w */
    Map<String, ?> f59628w;

    /* renamed from: x */
    boolean f59629x;

    /* renamed from: y */
    protected C12725k2.C12727b f59630y;

    /* renamed from: z */
    private int f59631z;

    protected C12601b(String str) {
        C12733l1<? extends Executor> l1Var = f59597J;
        this.f59606a = l1Var;
        this.f59607b = l1Var;
        C12999u0 c = C12999u0.m85205c();
        this.f59609d = c;
        this.f59610e = c.mo69853b();
        this.f59615j = "pick_first";
        this.f59617l = f59598K;
        this.f59618m = f59599L;
        this.f59619n = f59595H;
        this.f59620o = 5;
        this.f59621p = 5;
        this.f59622q = 16777216;
        this.f59623r = FileUtils.ONE_MB;
        this.f59624s = false;
        this.f59626u = C12533b0.m83671g();
        this.f59629x = true;
        this.f59630y = C12725k2.m84304a();
        this.f59631z = 4194304;
        this.f59601B = true;
        this.f59602C = true;
        this.f59603D = true;
        this.f59604E = false;
        this.f59605F = true;
        this.f59611f = (String) Preconditions.m5393t(str, TypedValues.Attributes.S_TARGET);
        this.f59612g = null;
    }

    /* renamed from: a */
    public C12930o0 mo69212a() {
        return new C12667e1(new C12627d1(this, mo69213e(), new C12625d0.C12626a(), C12664d2.m84108c(C12749o0.f60045r), C12749o0.f60047t, mo69215g(), C12700h2.f59928a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12799t mo69213e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo69214f() {
        return 443;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    @com.google.common.annotations.VisibleForTesting
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p292io.grpc.C12561g> mo69215g() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<io.grpc.g> r1 = r11.f59608c
            r0.<init>(r1)
            r1 = 0
            r11.f59625t = r1
            boolean r2 = r11.f59601B
            java.lang.String r3 = "getClientInterceptor"
            r4 = 0
            r5 = 1
            java.lang.String r6 = "Unable to apply census stats"
            if (r2 == 0) goto L_0x0076
            r11.f59625t = r5
            java.lang.String r2 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r8[r1] = r9     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r8[r5] = r9     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r10 = 2
            r8[r10] = r9     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r8)     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            boolean r8 = r11.f59602C     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r7[r1] = r8     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            boolean r8 = r11.f59603D     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r7[r5] = r8     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            boolean r8 = r11.f59604E     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            r7[r10] = r8     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            io.grpc.g r2 = (p292io.grpc.C12561g) r2     // Catch:{ ClassNotFoundException -> 0x0068, NoSuchMethodException -> 0x005f, IllegalAccessException -> 0x0056, InvocationTargetException -> 0x004d }
            goto L_0x0071
        L_0x004d:
            r2 = move-exception
            java.util.logging.Logger r7 = f59594G
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0070
        L_0x0056:
            r2 = move-exception
            java.util.logging.Logger r7 = f59594G
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0070
        L_0x005f:
            r2 = move-exception
            java.util.logging.Logger r7 = f59594G
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0070
        L_0x0068:
            r2 = move-exception
            java.util.logging.Logger r7 = f59594G
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
        L_0x0070:
            r2 = r4
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r0.add(r1, r2)
        L_0x0076:
            boolean r2 = r11.f59605F
            if (r2 == 0) goto L_0x00ba
            r11.f59625t = r5
            java.lang.String r2 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ad, NoSuchMethodException -> 0x00a4, IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0092 }
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x00ad, NoSuchMethodException -> 0x00a4, IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0092 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{ ClassNotFoundException -> 0x00ad, NoSuchMethodException -> 0x00a4, IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0092 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x00ad, NoSuchMethodException -> 0x00a4, IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0092 }
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch:{ ClassNotFoundException -> 0x00ad, NoSuchMethodException -> 0x00a4, IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0092 }
            io.grpc.g r2 = (p292io.grpc.C12561g) r2     // Catch:{ ClassNotFoundException -> 0x00ad, NoSuchMethodException -> 0x00a4, IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0092 }
            r4 = r2
            goto L_0x00b5
        L_0x0092:
            r2 = move-exception
            java.util.logging.Logger r3 = f59594G
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log(r5, r6, r2)
            goto L_0x00b5
        L_0x009b:
            r2 = move-exception
            java.util.logging.Logger r3 = f59594G
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log(r5, r6, r2)
            goto L_0x00b5
        L_0x00a4:
            r2 = move-exception
            java.util.logging.Logger r3 = f59594G
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log(r5, r6, r2)
            goto L_0x00b5
        L_0x00ad:
            r2 = move-exception
            java.util.logging.Logger r3 = f59594G
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            r3.log(r5, r6, r2)
        L_0x00b5:
            if (r4 == 0) goto L_0x00ba
            r0.add(r1, r4)
        L_0x00ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12601b.mo69215g():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C12981s0.C12986d mo69216h() {
        if (this.f59614i == null) {
            return this.f59610e;
        }
        return new C12744n1(this.f59610e, this.f59614i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo69217i() {
        return this.f59631z;
    }
}
