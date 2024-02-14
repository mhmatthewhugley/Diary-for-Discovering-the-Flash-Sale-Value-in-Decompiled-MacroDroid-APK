package p063b5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import p063b5.C2248a;
import p083e4.C7275g;
import p084e5.C7283b;
import p090f5.C7305b;
import p090f5.C7315j;
import p090f5.C7316k;
import p102h4.C7380e;
import p102h4.C7384g;
import p102h4.C7387j;
import p120k4.C7580a;
import p164s4.C10192g;
import p164s4.C10193h;
import p164s4.C10199j;
import p164s4.C10214o;

/* renamed from: b5.a */
/* compiled from: BaseRequestOptions */
public abstract class C2248a<T extends C2248a<T>> implements Cloneable {

    /* renamed from: A */
    private int f6885A = -1;

    /* renamed from: B */
    private int f6886B = -1;
    @NonNull

    /* renamed from: C */
    private C7380e f6887C = C7283b.m30091c();

    /* renamed from: D */
    private boolean f6888D;

    /* renamed from: E */
    private boolean f6889E = true;
    @Nullable

    /* renamed from: F */
    private Drawable f6890F;

    /* renamed from: G */
    private int f6891G;
    @NonNull

    /* renamed from: H */
    private C7384g f6892H = new C7384g();
    @NonNull

    /* renamed from: I */
    private Map<Class<?>, C7387j<?>> f6893I = new C7305b();
    @NonNull

    /* renamed from: J */
    private Class<?> f6894J = Object.class;

    /* renamed from: K */
    private boolean f6895K;
    @Nullable

    /* renamed from: L */
    private Resources.Theme f6896L;

    /* renamed from: M */
    private boolean f6897M;

    /* renamed from: N */
    private boolean f6898N;

    /* renamed from: O */
    private boolean f6899O;

    /* renamed from: P */
    private boolean f6900P = true;

    /* renamed from: Q */
    private boolean f6901Q;

    /* renamed from: a */
    private int f6902a;

    /* renamed from: c */
    private float f6903c = 1.0f;
    @NonNull

    /* renamed from: d */
    private C7580a f6904d = C7580a.f18492e;
    @NonNull

    /* renamed from: f */
    private C7275g f6905f = C7275g.NORMAL;
    @Nullable

    /* renamed from: g */
    private Drawable f6906g;

    /* renamed from: o */
    private int f6907o;
    @Nullable

    /* renamed from: p */
    private Drawable f6908p;

    /* renamed from: s */
    private int f6909s;

    /* renamed from: z */
    private boolean f6910z = true;

    /* renamed from: K */
    private boolean m9156K(int i) {
        return m9157L(this.f6902a, i);
    }

    /* renamed from: L */
    private static boolean m9157L(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m9158V(@androidx.annotation.NonNull p164s4.C10199j r2, @androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            b5.a r2 = r1.m9160c0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.m9158V(s4.j, h4.j):b5.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m9159b0(@androidx.annotation.NonNull p164s4.C10199j r2, @androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 1
            b5.a r2 = r1.m9160c0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.m9159b0(s4.j, h4.j):b5.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m9160c0(@androidx.annotation.NonNull p164s4.C10199j r1, @androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            b5.a r1 = r0.mo24515p0(r1, r2)
            goto L_0x000b
        L_0x0007:
            b5.a r1 = r0.mo24488X(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f6900P = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.m9160c0(s4.j, h4.j, boolean):b5.a");
    }

    /* renamed from: d0 */
    private T m9161d0() {
        return this;
    }

    @NonNull
    /* renamed from: e0 */
    private T m9162e0() {
        if (!this.f6895K) {
            return m9161d0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: A */
    public final float mo24472A() {
        return this.f6903c;
    }

    @Nullable
    /* renamed from: B */
    public final Resources.Theme mo24473B() {
        return this.f6896L;
    }

    @NonNull
    /* renamed from: C */
    public final Map<Class<?>, C7387j<?>> mo24474C() {
        return this.f6893I;
    }

    /* renamed from: D */
    public final boolean mo24475D() {
        return this.f6901Q;
    }

    /* renamed from: E */
    public final boolean mo24476E() {
        return this.f6898N;
    }

    /* renamed from: G */
    public final boolean mo24477G() {
        return this.f6910z;
    }

    /* renamed from: H */
    public final boolean mo24478H() {
        return m9156K(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo24479J() {
        return this.f6900P;
    }

    /* renamed from: M */
    public final boolean mo24480M() {
        return this.f6889E;
    }

    /* renamed from: N */
    public final boolean mo24481N() {
        return this.f6888D;
    }

    /* renamed from: O */
    public final boolean mo24482O() {
        return m9156K(2048);
    }

    /* renamed from: P */
    public final boolean mo24483P() {
        return C7316k.m30223r(this.f6886B, this.f6885A);
    }

    @NonNull
    /* renamed from: R */
    public T mo24484R() {
        this.f6895K = true;
        return m9161d0();
    }

    @CheckResult
    @NonNull
    /* renamed from: S */
    public T mo24485S() {
        return mo24488X(C10199j.f23309b, new C10192g());
    }

    @CheckResult
    @NonNull
    /* renamed from: T */
    public T mo24486T() {
        return m9158V(C10199j.f23312e, new C10193h());
    }

    @CheckResult
    @NonNull
    /* renamed from: U */
    public T mo24487U() {
        return m9158V(C10199j.f23308a, new C10214o());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo24488X(@androidx.annotation.NonNull p164s4.C10199j r2, @androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f6897M
            if (r0 == 0) goto L_0x000d
            b5.a r0 = r1.clone()
            b5.a r2 = r0.mo24488X(r2, r3)
            return r2
        L_0x000d:
            r1.mo24501g(r2)
            r2 = 0
            b5.a r2 = r1.mo24510m0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.mo24488X(s4.j, h4.j):b5.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: Y */
    public T mo24489Y(int i, int i2) {
        if (this.f6897M) {
            return clone().mo24489Y(i, i2);
        }
        this.f6886B = i;
        this.f6885A = i2;
        this.f6902a |= 512;
        return m9162e0();
    }

    @CheckResult
    @NonNull
    /* renamed from: Z */
    public T mo24490Z(@Nullable Drawable drawable) {
        if (this.f6897M) {
            return clone().mo24490Z(drawable);
        }
        this.f6908p = drawable;
        this.f6909s = 0;
        this.f6902a = (this.f6902a | 64) & -129;
        return m9162e0();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public T mo24491a(@NonNull C2248a<?> aVar) {
        if (this.f6897M) {
            return clone().mo24491a(aVar);
        }
        if (m9157L(aVar.f6902a, 2)) {
            this.f6903c = aVar.f6903c;
        }
        if (m9157L(aVar.f6902a, 262144)) {
            this.f6898N = aVar.f6898N;
        }
        if (m9157L(aVar.f6902a, 1048576)) {
            this.f6901Q = aVar.f6901Q;
        }
        if (m9157L(aVar.f6902a, 4)) {
            this.f6904d = aVar.f6904d;
        }
        if (m9157L(aVar.f6902a, 8)) {
            this.f6905f = aVar.f6905f;
        }
        if (m9157L(aVar.f6902a, 16)) {
            this.f6906g = aVar.f6906g;
            this.f6907o = 0;
            this.f6902a &= -33;
        }
        if (m9157L(aVar.f6902a, 32)) {
            this.f6907o = aVar.f6907o;
            this.f6906g = null;
            this.f6902a &= -17;
        }
        if (m9157L(aVar.f6902a, 64)) {
            this.f6908p = aVar.f6908p;
            this.f6909s = 0;
            this.f6902a &= -129;
        }
        if (m9157L(aVar.f6902a, 128)) {
            this.f6909s = aVar.f6909s;
            this.f6908p = null;
            this.f6902a &= -65;
        }
        if (m9157L(aVar.f6902a, 256)) {
            this.f6910z = aVar.f6910z;
        }
        if (m9157L(aVar.f6902a, 512)) {
            this.f6886B = aVar.f6886B;
            this.f6885A = aVar.f6885A;
        }
        if (m9157L(aVar.f6902a, 1024)) {
            this.f6887C = aVar.f6887C;
        }
        if (m9157L(aVar.f6902a, 4096)) {
            this.f6894J = aVar.f6894J;
        }
        if (m9157L(aVar.f6902a, 8192)) {
            this.f6890F = aVar.f6890F;
            this.f6891G = 0;
            this.f6902a &= -16385;
        }
        if (m9157L(aVar.f6902a, 16384)) {
            this.f6891G = aVar.f6891G;
            this.f6890F = null;
            this.f6902a &= -8193;
        }
        if (m9157L(aVar.f6902a, 32768)) {
            this.f6896L = aVar.f6896L;
        }
        if (m9157L(aVar.f6902a, 65536)) {
            this.f6889E = aVar.f6889E;
        }
        if (m9157L(aVar.f6902a, 131072)) {
            this.f6888D = aVar.f6888D;
        }
        if (m9157L(aVar.f6902a, 2048)) {
            this.f6893I.putAll(aVar.f6893I);
            this.f6900P = aVar.f6900P;
        }
        if (m9157L(aVar.f6902a, 524288)) {
            this.f6899O = aVar.f6899O;
        }
        if (!this.f6889E) {
            this.f6893I.clear();
            this.f6888D = false;
            this.f6902a = this.f6902a & -2049 & -131073;
            this.f6900P = true;
        }
        this.f6902a |= aVar.f6902a;
        this.f6892H.mo37380d(aVar.f6892H);
        return m9162e0();
    }

    @CheckResult
    @NonNull
    /* renamed from: a0 */
    public T mo24492a0(@NonNull C7275g gVar) {
        if (this.f6897M) {
            return clone().mo24492a0(gVar);
        }
        this.f6905f = (C7275g) C7315j.m30204d(gVar);
        this.f6902a |= 8;
        return m9162e0();
    }

    @NonNull
    /* renamed from: b */
    public T mo24493b() {
        if (!this.f6895K || this.f6897M) {
            this.f6897M = true;
            return mo24484R();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public T mo24494c() {
        return mo24515p0(C10199j.f23309b, new C10192g());
    }

    @CheckResult
    /* renamed from: d */
    public T clone() {
        try {
            T t = (C2248a) super.clone();
            C7384g gVar = new C7384g();
            t.f6892H = gVar;
            gVar.mo37380d(this.f6892H);
            C7305b bVar = new C7305b();
            t.f6893I = bVar;
            bVar.putAll(this.f6893I);
            t.f6895K = false;
            t.f6897M = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @CheckResult
    @NonNull
    /* renamed from: e */
    public T mo24497e(@NonNull Class<?> cls) {
        if (this.f6897M) {
            return clone().mo24497e(cls);
        }
        this.f6894J = (Class) C7315j.m30204d(cls);
        this.f6902a |= 4096;
        return m9162e0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2248a)) {
            return false;
        }
        C2248a aVar = (C2248a) obj;
        if (Float.compare(aVar.f6903c, this.f6903c) == 0 && this.f6907o == aVar.f6907o && C7316k.m30208c(this.f6906g, aVar.f6906g) && this.f6909s == aVar.f6909s && C7316k.m30208c(this.f6908p, aVar.f6908p) && this.f6891G == aVar.f6891G && C7316k.m30208c(this.f6890F, aVar.f6890F) && this.f6910z == aVar.f6910z && this.f6885A == aVar.f6885A && this.f6886B == aVar.f6886B && this.f6888D == aVar.f6888D && this.f6889E == aVar.f6889E && this.f6898N == aVar.f6898N && this.f6899O == aVar.f6899O && this.f6904d.equals(aVar.f6904d) && this.f6905f == aVar.f6905f && this.f6892H.equals(aVar.f6892H) && this.f6893I.equals(aVar.f6893I) && this.f6894J.equals(aVar.f6894J) && C7316k.m30208c(this.f6887C, aVar.f6887C) && C7316k.m30208c(this.f6896L, aVar.f6896L)) {
            return true;
        }
        return false;
    }

    @CheckResult
    @NonNull
    /* renamed from: f */
    public T mo24499f(@NonNull C7580a aVar) {
        if (this.f6897M) {
            return clone().mo24499f(aVar);
        }
        this.f6904d = (C7580a) C7315j.m30204d(aVar);
        this.f6902a |= 4;
        return m9162e0();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [h4.f, java.lang.Object, h4.f<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo24500f0(@androidx.annotation.NonNull p102h4.C7381f<Y> r2, @androidx.annotation.NonNull Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f6897M
            if (r0 == 0) goto L_0x000d
            b5.a r0 = r1.clone()
            b5.a r2 = r0.mo24500f0(r2, r3)
            return r2
        L_0x000d:
            p090f5.C7315j.m30204d(r2)
            p090f5.C7315j.m30204d(r3)
            h4.g r0 = r1.f6892H
            r0.mo37381e(r2, r3)
            b5.a r2 = r1.m9162e0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.mo24500f0(h4.f, java.lang.Object):b5.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: g */
    public T mo24501g(@NonNull C10199j jVar) {
        return mo24500f0(C10199j.f23315h, C7315j.m30204d(jVar));
    }

    @CheckResult
    @NonNull
    /* renamed from: g0 */
    public T mo24502g0(@NonNull C7380e eVar) {
        if (this.f6897M) {
            return clone().mo24502g0(eVar);
        }
        this.f6887C = (C7380e) C7315j.m30204d(eVar);
        this.f6902a |= 1024;
        return m9162e0();
    }

    @CheckResult
    @NonNull
    /* renamed from: h */
    public T mo24503h() {
        return m9159b0(C10199j.f23308a, new C10214o());
    }

    public int hashCode() {
        return C7316k.m30218m(this.f6896L, C7316k.m30218m(this.f6887C, C7316k.m30218m(this.f6894J, C7316k.m30218m(this.f6893I, C7316k.m30218m(this.f6892H, C7316k.m30218m(this.f6905f, C7316k.m30218m(this.f6904d, C7316k.m30219n(this.f6899O, C7316k.m30219n(this.f6898N, C7316k.m30219n(this.f6889E, C7316k.m30219n(this.f6888D, C7316k.m30217l(this.f6886B, C7316k.m30217l(this.f6885A, C7316k.m30219n(this.f6910z, C7316k.m30218m(this.f6890F, C7316k.m30217l(this.f6891G, C7316k.m30218m(this.f6908p, C7316k.m30217l(this.f6909s, C7316k.m30218m(this.f6906g, C7316k.m30217l(this.f6907o, C7316k.m30215j(this.f6903c)))))))))))))))))))));
    }

    @CheckResult
    @NonNull
    /* renamed from: i0 */
    public T mo24505i0(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        if (this.f6897M) {
            return clone().mo24505i0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f6903c = f;
        this.f6902a |= 2;
        return m9162e0();
    }

    @CheckResult
    @NonNull
    /* renamed from: j0 */
    public T mo24506j0(boolean z) {
        if (this.f6897M) {
            return clone().mo24506j0(true);
        }
        this.f6910z = !z;
        this.f6902a |= 256;
        return m9162e0();
    }

    @NonNull
    /* renamed from: k */
    public final C7580a mo24507k() {
        return this.f6904d;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo24508k0(@androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            b5.a r2 = r1.mo24510m0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.mo24508k0(h4.j):b5.a");
    }

    /* renamed from: l */
    public final int mo24509l() {
        return this.f6907o;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo24510m0(@androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f6897M
            if (r0 == 0) goto L_0x000d
            b5.a r0 = r2.clone()
            b5.a r3 = r0.mo24510m0(r3, r4)
            return r3
        L_0x000d:
            s4.m r0 = new s4.m
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo24513o0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo24513o0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            h4.j r0 = r0.mo40812c()
            r2.mo24513o0(r1, r0, r4)
            java.lang.Class<w4.c> r0 = p185w4.C10336c.class
            w4.f r1 = new w4.f
            r1.<init>(r3)
            r2.mo24513o0(r0, r1, r4)
            b5.a r3 = r2.m9162e0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.mo24510m0(h4.j, boolean):b5.a");
    }

    @Nullable
    /* renamed from: n */
    public final Drawable mo24511n() {
        return this.f6906g;
    }

    @Nullable
    /* renamed from: o */
    public final Drawable mo24512o() {
        return this.f6890F;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [h4.j<Y>, h4.j, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.NonNull
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo24513o0(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull p102h4.C7387j<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f6897M
            if (r0 == 0) goto L_0x000d
            b5.a r0 = r1.clone()
            b5.a r2 = r0.mo24513o0(r2, r3, r4)
            return r2
        L_0x000d:
            p090f5.C7315j.m30204d(r2)
            p090f5.C7315j.m30204d(r3)
            java.util.Map<java.lang.Class<?>, h4.j<?>> r0 = r1.f6893I
            r0.put(r2, r3)
            int r2 = r1.f6902a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f6889E = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f6902a = r2
            r0 = 0
            r1.f6900P = r0
            if (r4 == 0) goto L_0x0030
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f6902a = r2
            r1.f6888D = r3
        L_0x0030:
            b5.a r2 = r1.m9162e0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.mo24513o0(java.lang.Class, h4.j, boolean):b5.a");
    }

    /* renamed from: p */
    public final int mo24514p() {
        return this.f6891G;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [h4.j<android.graphics.Bitmap>, h4.j] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo24515p0(@androidx.annotation.NonNull p164s4.C10199j r2, @androidx.annotation.NonNull p102h4.C7387j<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f6897M
            if (r0 == 0) goto L_0x000d
            b5.a r0 = r1.clone()
            b5.a r2 = r0.mo24515p0(r2, r3)
            return r2
        L_0x000d:
            r1.mo24501g(r2)
            b5.a r2 = r1.mo24508k0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2248a.mo24515p0(s4.j, h4.j):b5.a");
    }

    /* renamed from: q */
    public final boolean mo24516q() {
        return this.f6899O;
    }

    @NonNull
    /* renamed from: r */
    public final C7384g mo24517r() {
        return this.f6892H;
    }

    @CheckResult
    @NonNull
    /* renamed from: r0 */
    public T mo24518r0(boolean z) {
        if (this.f6897M) {
            return clone().mo24518r0(z);
        }
        this.f6901Q = z;
        this.f6902a |= 1048576;
        return m9162e0();
    }

    /* renamed from: s */
    public final int mo24519s() {
        return this.f6885A;
    }

    /* renamed from: t */
    public final int mo24520t() {
        return this.f6886B;
    }

    @Nullable
    /* renamed from: u */
    public final Drawable mo24521u() {
        return this.f6908p;
    }

    /* renamed from: v */
    public final int mo24522v() {
        return this.f6909s;
    }

    @NonNull
    /* renamed from: x */
    public final C7275g mo24523x() {
        return this.f6905f;
    }

    @NonNull
    /* renamed from: y */
    public final Class<?> mo24524y() {
        return this.f6894J;
    }

    @NonNull
    /* renamed from: z */
    public final C7380e mo24525z() {
        return this.f6887C;
    }
}
