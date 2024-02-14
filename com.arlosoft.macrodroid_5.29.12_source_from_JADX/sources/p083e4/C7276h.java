package p083e4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p063b5.C2248a;
import p063b5.C2249b;
import p063b5.C2250c;
import p063b5.C2251d;
import p063b5.C2252e;
import p063b5.C2253f;
import p063b5.C2255h;
import p067c5.C2278h;
import p067c5.C2279i;
import p084e5.C7282a;
import p090f5.C7308e;
import p090f5.C7315j;
import p090f5.C7316k;
import p120k4.C7580a;

/* renamed from: e4.h */
/* compiled from: RequestBuilder */
public class C7276h<TranscodeType> extends C2248a<C7276h<TranscodeType>> {

    /* renamed from: f0 */
    protected static final C2253f f17757f0 = ((C2253f) ((C2253f) ((C2253f) new C2253f().mo24499f(C7580a.f18490c)).mo24492a0(C7275g.LOW)).mo24506j0(true));

    /* renamed from: R */
    private final Context f17758R;

    /* renamed from: S */
    private final C7278i f17759S;

    /* renamed from: T */
    private final Class<TranscodeType> f17760T;

    /* renamed from: U */
    private final C7271c f17761U;

    /* renamed from: V */
    private final C7273e f17762V;
    @NonNull

    /* renamed from: W */
    private C7281j<?, ? super TranscodeType> f17763W;
    @Nullable

    /* renamed from: X */
    private Object f17764X;
    @Nullable

    /* renamed from: Y */
    private List<C2252e<TranscodeType>> f17765Y;
    @Nullable

    /* renamed from: Z */
    private C7276h<TranscodeType> f17766Z;
    @Nullable

    /* renamed from: a0 */
    private C7276h<TranscodeType> f17767a0;
    @Nullable

    /* renamed from: b0 */
    private Float f17768b0;

    /* renamed from: c0 */
    private boolean f17769c0 = true;

    /* renamed from: d0 */
    private boolean f17770d0;

    /* renamed from: e0 */
    private boolean f17771e0;

    /* renamed from: e4.h$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C7277a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17772a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17773b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                e4.g[] r0 = p083e4.C7275g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17773b = r0
                r1 = 1
                e4.g r2 = p083e4.C7275g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f17773b     // Catch:{ NoSuchFieldError -> 0x001d }
                e4.g r3 = p083e4.C7275g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f17773b     // Catch:{ NoSuchFieldError -> 0x0028 }
                e4.g r4 = p083e4.C7275g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f17773b     // Catch:{ NoSuchFieldError -> 0x0033 }
                e4.g r5 = p083e4.C7275g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f17772a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f17772a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f17772a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f17772a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f17772a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f17772a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f17772a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f17772a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p083e4.C7276h.C7277a.<clinit>():void");
        }
    }

    protected C7276h(@NonNull C7271c cVar, C7278i iVar, Class<TranscodeType> cls, Context context) {
        this.f17761U = cVar;
        this.f17759S = iVar;
        this.f17760T = cls;
        this.f17758R = context;
        this.f17763W = iVar.mo37186p(cls);
        this.f17762V = cVar.mo37146i();
        m30043B0(iVar.mo37184n());
        mo24491a(iVar.mo37185o());
    }

    @NonNull
    /* renamed from: A0 */
    private C7275g m30042A0(@NonNull C7275g gVar) {
        int i = C7277a.f17773b[gVar.ordinal()];
        if (i == 1) {
            return C7275g.NORMAL;
        }
        if (i == 2) {
            return C7275g.HIGH;
        }
        if (i == 3 || i == 4) {
            return C7275g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo24523x());
    }

    /* renamed from: B0 */
    private void m30043B0(List<C2252e<Object>> list) {
        for (C2252e<Object> s0 : list) {
            mo37176s0(s0);
        }
    }

    /* renamed from: D0 */
    private <Y extends C2278h<TranscodeType>> Y m30044D0(@NonNull Y y, @Nullable C2252e<TranscodeType> eVar, C2248a<?> aVar, Executor executor) {
        C7315j.m30204d(y);
        if (this.f17770d0) {
            C2250c u0 = m30048u0(y, eVar, aVar, executor);
            C2250c c = y.mo24583c();
            if (!u0.mo24531e(c) || m30045H0(aVar, c)) {
                this.f17759S.mo37183m(y);
                y.mo24585g(u0);
                this.f17759S.mo37195x(y, u0);
                return y;
            }
            u0.recycle();
            if (!((C2250c) C7315j.m30204d(c)).isRunning()) {
                c.mo24538j();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: H0 */
    private boolean m30045H0(C2248a<?> aVar, C2250c cVar) {
        return !aVar.mo24477G() && cVar.isComplete();
    }

    @NonNull
    /* renamed from: O0 */
    private C7276h<TranscodeType> m30046O0(@Nullable Object obj) {
        this.f17764X = obj;
        this.f17770d0 = true;
        return this;
    }

    /* renamed from: P0 */
    private C2250c m30047P0(C2278h<TranscodeType> hVar, C2252e<TranscodeType> eVar, C2248a<?> aVar, C2251d dVar, C7281j<?, ? super TranscodeType> jVar, C7275g gVar, int i, int i2, Executor executor) {
        Context context = this.f17758R;
        C7273e eVar2 = this.f17762V;
        return C2255h.m9269z(context, eVar2, this.f17764X, this.f17760T, aVar, i, i2, gVar, hVar, eVar, this.f17765Y, dVar, eVar2.mo37163f(), jVar.mo37200b(), executor);
    }

    /* renamed from: u0 */
    private C2250c m30048u0(C2278h<TranscodeType> hVar, @Nullable C2252e<TranscodeType> eVar, C2248a<?> aVar, Executor executor) {
        return m30049v0(hVar, eVar, (C2251d) null, this.f17763W, aVar.mo24523x(), aVar.mo24520t(), aVar.mo24519s(), aVar, executor);
    }

    /* renamed from: v0 */
    private C2250c m30049v0(C2278h<TranscodeType> hVar, @Nullable C2252e<TranscodeType> eVar, @Nullable C2251d dVar, C7281j<?, ? super TranscodeType> jVar, C7275g gVar, int i, int i2, C2248a<?> aVar, Executor executor) {
        C2249b bVar;
        C2249b bVar2;
        if (this.f17767a0 != null) {
            bVar2 = new C2249b(dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        C2250c x0 = m30050x0(hVar, eVar, bVar2, jVar, gVar, i, i2, aVar, executor);
        if (bVar == null) {
            return x0;
        }
        int t = this.f17767a0.mo24520t();
        int s = this.f17767a0.mo24519s();
        if (C7316k.m30223r(i, i2) && !this.f17767a0.mo24483P()) {
            t = aVar.mo24520t();
            s = aVar.mo24519s();
        }
        C7276h<TranscodeType> hVar2 = this.f17767a0;
        C2249b bVar3 = bVar;
        bVar3.mo24540q(x0, hVar2.m30049v0(hVar, eVar, bVar, hVar2.f17763W, hVar2.mo24523x(), t, s, this.f17767a0, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [b5.a<?>, b5.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p063b5.C2250c m30050x0(p067c5.C2278h<TranscodeType> r22, p063b5.C2252e<TranscodeType> r23, @androidx.annotation.Nullable p063b5.C2251d r24, p083e4.C7281j<?, ? super TranscodeType> r25, p083e4.C7275g r26, int r27, int r28, p063b5.C2248a<?> r29, java.util.concurrent.Executor r30) {
        /*
            r21 = this;
            r10 = r21
            r4 = r24
            r11 = r26
            e4.h<TranscodeType> r0 = r10.f17766Z
            if (r0 == 0) goto L_0x008f
            boolean r1 = r10.f17771e0
            if (r1 != 0) goto L_0x0087
            e4.j<?, ? super TranscodeType> r1 = r0.f17763W
            boolean r2 = r0.f17769c0
            if (r2 == 0) goto L_0x0017
            r15 = r25
            goto L_0x0018
        L_0x0017:
            r15 = r1
        L_0x0018:
            boolean r0 = r0.mo24478H()
            if (r0 == 0) goto L_0x0025
            e4.h<TranscodeType> r0 = r10.f17766Z
            e4.g r0 = r0.mo24523x()
            goto L_0x0029
        L_0x0025:
            e4.g r0 = r10.m30042A0(r11)
        L_0x0029:
            r16 = r0
            e4.h<TranscodeType> r0 = r10.f17766Z
            int r0 = r0.mo24520t()
            e4.h<TranscodeType> r1 = r10.f17766Z
            int r1 = r1.mo24519s()
            boolean r2 = p090f5.C7316k.m30223r(r27, r28)
            if (r2 == 0) goto L_0x004d
            e4.h<TranscodeType> r2 = r10.f17766Z
            boolean r2 = r2.mo24483P()
            if (r2 != 0) goto L_0x004d
            int r0 = r29.mo24520t()
            int r1 = r29.mo24519s()
        L_0x004d:
            r17 = r0
            r18 = r1
            b5.i r14 = new b5.i
            r14.<init>(r4)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r14
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            b5.c r0 = r0.m30047P0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            r10.f17771e0 = r1
            e4.h<TranscodeType> r1 = r10.f17766Z
            r11 = r1
            r12 = r22
            r13 = r23
            r2 = r14
            r19 = r1
            r20 = r30
            b5.c r1 = r11.m30049v0(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            r10.f17771e0 = r3
            r2.mo24550p(r0, r1)
            return r2
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x008f:
            java.lang.Float r0 = r10.f17768b0
            if (r0 == 0) goto L_0x00cd
            b5.i r12 = new b5.i
            r12.<init>(r4)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r12
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            b5.c r13 = r0.m30047P0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            b5.a r0 = r29.clone()
            java.lang.Float r1 = r10.f17768b0
            float r1 = r1.floatValue()
            b5.a r3 = r0.mo24505i0(r1)
            e4.g r6 = r10.m30042A0(r11)
            r0 = r21
            r1 = r22
            b5.c r0 = r0.m30047P0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.mo24550p(r13, r0)
            return r12
        L_0x00cd:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            b5.c r0 = r0.m30047P0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p083e4.C7276h.m30050x0(c5.h, b5.e, b5.d, e4.j, e4.g, int, int, b5.a, java.util.concurrent.Executor):b5.c");
    }

    @NonNull
    /* renamed from: C0 */
    public <Y extends C2278h<TranscodeType>> Y mo37167C0(@NonNull Y y) {
        return mo37168F0(y, (C2252e) null, C7308e.m30186b());
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: F0 */
    public <Y extends C2278h<TranscodeType>> Y mo37168F0(@NonNull Y y, @Nullable C2252e<TranscodeType> eVar, Executor executor) {
        return m30044D0(y, eVar, this, executor);
    }

    @NonNull
    /* renamed from: G0 */
    public C2279i<ImageView, TranscodeType> mo37169G0(@NonNull ImageView imageView) {
        C2248a aVar;
        C7316k.m30206a();
        C7315j.m30204d(imageView);
        if (!mo24482O() && mo24480M() && imageView.getScaleType() != null) {
            switch (C7277a.f17772a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo24485S();
                    break;
                case 2:
                    aVar = clone().mo24486T();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo24487U();
                    break;
                case 6:
                    aVar = clone().mo24486T();
                    break;
            }
        }
        aVar = this;
        return (C2279i) m30044D0(this.f17762V.mo37158a(imageView, this.f17760T), (C2252e) null, aVar, C7308e.m30186b());
    }

    @CheckResult
    @NonNull
    /* renamed from: I0 */
    public C7276h<TranscodeType> mo37170I0(@Nullable Bitmap bitmap) {
        return m30046O0(bitmap).mo24491a(C2253f.m9245t0(C7580a.f18489b));
    }

    @CheckResult
    @NonNull
    /* renamed from: J0 */
    public C7276h<TranscodeType> mo37171J0(@Nullable Uri uri) {
        return m30046O0(uri);
    }

    @CheckResult
    @NonNull
    /* renamed from: K0 */
    public C7276h<TranscodeType> mo37172K0(@Nullable File file) {
        return m30046O0(file);
    }

    @CheckResult
    @NonNull
    /* renamed from: L0 */
    public C7276h<TranscodeType> mo37173L0(@RawRes @DrawableRes @Nullable Integer num) {
        return m30046O0(num).mo24491a(C2253f.m9246u0(C7282a.m30089c(this.f17758R)));
    }

    @CheckResult
    @NonNull
    /* renamed from: M0 */
    public C7276h<TranscodeType> mo37174M0(@Nullable Object obj) {
        return m30046O0(obj);
    }

    @CheckResult
    @NonNull
    /* renamed from: N0 */
    public C7276h<TranscodeType> mo37175N0(@Nullable String str) {
        return m30046O0(str);
    }

    @CheckResult
    @NonNull
    /* renamed from: s0 */
    public C7276h<TranscodeType> mo37176s0(@Nullable C2252e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f17765Y == null) {
                this.f17765Y = new ArrayList();
            }
            this.f17765Y.add(eVar);
        }
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: t0 */
    public C7276h<TranscodeType> mo24491a(@NonNull C2248a<?> aVar) {
        C7315j.m30204d(aVar);
        return (C7276h) super.mo24491a(aVar);
    }

    @CheckResult
    /* renamed from: z0 */
    public C7276h<TranscodeType> mo24496d() {
        C7276h<TranscodeType> hVar = (C7276h) super.clone();
        hVar.f17763W = hVar.f17763W.clone();
        return hVar;
    }
}
