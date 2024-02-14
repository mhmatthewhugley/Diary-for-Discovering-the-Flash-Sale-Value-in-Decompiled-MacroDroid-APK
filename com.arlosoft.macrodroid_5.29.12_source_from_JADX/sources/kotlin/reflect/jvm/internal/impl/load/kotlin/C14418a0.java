package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a0 */
/* compiled from: TypeMappingMode.kt */
public final class C14418a0 {

    /* renamed from: k */
    public static final C14419a f63215k = new C14419a((C13695i) null);

    /* renamed from: l */
    public static final C14418a0 f63216l;

    /* renamed from: m */
    public static final C14418a0 f63217m;

    /* renamed from: n */
    public static final C14418a0 f63218n = new C14418a0(false, true, false, false, false, (C14418a0) null, false, (C14418a0) null, (C14418a0) null, false, PointerIconCompat.TYPE_GRABBING, (C13695i) null);

    /* renamed from: o */
    public static final C14418a0 f63219o;

    /* renamed from: p */
    public static final C14418a0 f63220p;

    /* renamed from: q */
    public static final C14418a0 f63221q;

    /* renamed from: r */
    public static final C14418a0 f63222r;

    /* renamed from: s */
    public static final C14418a0 f63223s;

    /* renamed from: t */
    public static final C14418a0 f63224t;

    /* renamed from: a */
    private final boolean f63225a;

    /* renamed from: b */
    private final boolean f63226b;

    /* renamed from: c */
    private final boolean f63227c;

    /* renamed from: d */
    private final boolean f63228d;

    /* renamed from: e */
    private final boolean f63229e;

    /* renamed from: f */
    private final C14418a0 f63230f;

    /* renamed from: g */
    private final boolean f63231g;

    /* renamed from: h */
    private final C14418a0 f63232h;

    /* renamed from: i */
    private final C14418a0 f63233i;

    /* renamed from: j */
    private final boolean f63234j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a */
    /* compiled from: TypeMappingMode.kt */
    public static final class C14419a {
        private C14419a() {
        }

        public /* synthetic */ C14419a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a0$b */
    /* compiled from: TypeMappingMode.kt */
    public /* synthetic */ class C14420b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63235a;

        static {
            int[] iArr = new int[C14970r1.values().length];
            iArr[C14970r1.IN_VARIANCE.ordinal()] = 1;
            iArr[C14970r1.INVARIANT.ordinal()] = 2;
            f63235a = iArr;
        }
    }

    static {
        C14418a0 a0Var = new C14418a0(false, false, false, false, false, (C14418a0) null, false, (C14418a0) null, (C14418a0) null, false, 1023, (C13695i) null);
        f63216l = a0Var;
        C14418a0 a0Var2 = new C14418a0(false, false, false, false, false, (C14418a0) null, false, (C14418a0) null, (C14418a0) null, true, FrameMetricsAggregator.EVERY_DURATION, (C13695i) null);
        f63217m = a0Var2;
        C14418a0 a0Var3 = a0Var;
        f63219o = new C14418a0(false, false, false, false, false, a0Var3, false, (C14418a0) null, (C14418a0) null, false, 988, (C13695i) null);
        f63220p = new C14418a0(false, false, false, false, false, a0Var2, false, (C14418a0) null, (C14418a0) null, true, 476, (C13695i) null);
        f63221q = new C14418a0(false, true, false, false, false, a0Var3, false, (C14418a0) null, (C14418a0) null, false, 988, (C13695i) null);
        f63222r = new C14418a0(false, false, false, true, false, a0Var3, false, (C14418a0) null, (C14418a0) null, false, 983, (C13695i) null);
        f63223s = new C14418a0(false, false, false, true, false, a0Var3, false, (C14418a0) null, (C14418a0) null, false, 919, (C13695i) null);
        f63224t = new C14418a0(false, false, true, false, false, a0Var3, false, (C14418a0) null, (C14418a0) null, false, 984, (C13695i) null);
    }

    public C14418a0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C14418a0 a0Var, boolean z6, C14418a0 a0Var2, C14418a0 a0Var3, boolean z7) {
        this.f63225a = z;
        this.f63226b = z2;
        this.f63227c = z3;
        this.f63228d = z4;
        this.f63229e = z5;
        this.f63230f = a0Var;
        this.f63231g = z6;
        this.f63232h = a0Var2;
        this.f63233i = a0Var3;
        this.f63234j = z7;
    }

    /* renamed from: a */
    public final boolean mo73126a() {
        return this.f63231g;
    }

    /* renamed from: b */
    public final boolean mo73127b() {
        return this.f63234j;
    }

    /* renamed from: c */
    public final boolean mo73128c() {
        return this.f63226b;
    }

    /* renamed from: d */
    public final boolean mo73129d() {
        return this.f63225a;
    }

    /* renamed from: e */
    public final boolean mo73130e() {
        return this.f63227c;
    }

    /* renamed from: f */
    public final C14418a0 mo73131f(C14970r1 r1Var, boolean z) {
        C13706o.m87929f(r1Var, "effectiveVariance");
        if (!z || !this.f63227c) {
            int i = C14420b.f63235a[r1Var.ordinal()];
            if (i == 1) {
                C14418a0 a0Var = this.f63232h;
                if (a0Var != null) {
                    return a0Var;
                }
            } else if (i != 2) {
                C14418a0 a0Var2 = this.f63230f;
                if (a0Var2 != null) {
                    return a0Var2;
                }
            } else {
                C14418a0 a0Var3 = this.f63233i;
                if (a0Var3 != null) {
                    return a0Var3;
                }
            }
        }
        return this;
    }

    /* renamed from: g */
    public final C14418a0 mo73132g() {
        return new C14418a0(this.f63225a, true, this.f63227c, this.f63228d, this.f63229e, this.f63230f, this.f63231g, this.f63232h, this.f63233i, false, 512, (C13695i) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14418a0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, kotlin.reflect.jvm.internal.impl.load.kotlin.C14418a0 r17, boolean r18, kotlin.reflect.jvm.internal.impl.load.kotlin.C14418a0 r19, kotlin.reflect.jvm.internal.impl.load.kotlin.C14418a0 r20, boolean r21, int r22, kotlin.jvm.internal.C13695i r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r1 = 1
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001f
            r6 = 0
            goto L_0x0020
        L_0x001f:
            r6 = r15
        L_0x0020:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0026
            r7 = 0
            goto L_0x0028
        L_0x0026:
            r7 = r16
        L_0x0028:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            r8 = 0
            goto L_0x0030
        L_0x002e:
            r8 = r17
        L_0x0030:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r2 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r8
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r8
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C14418a0.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.a0, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.a0, kotlin.reflect.jvm.internal.impl.load.kotlin.a0, boolean, int, kotlin.jvm.internal.i):void");
    }
}
