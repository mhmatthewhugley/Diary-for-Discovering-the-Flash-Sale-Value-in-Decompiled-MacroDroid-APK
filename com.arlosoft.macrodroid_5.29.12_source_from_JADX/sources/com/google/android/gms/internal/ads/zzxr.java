package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzxr {

    /* renamed from: a */
    private final zzxd f38911a = new zzxd();
    @Nullable

    /* renamed from: b */
    private final zzxn f38912b;
    @Nullable

    /* renamed from: c */
    private final zzxq f38913c;

    /* renamed from: d */
    private boolean f38914d;
    @Nullable

    /* renamed from: e */
    private Surface f38915e;

    /* renamed from: f */
    private float f38916f;

    /* renamed from: g */
    private float f38917g;

    /* renamed from: h */
    private float f38918h;

    /* renamed from: i */
    private float f38919i;

    /* renamed from: j */
    private int f38920j;

    /* renamed from: k */
    private long f38921k;

    /* renamed from: l */
    private long f38922l;

    /* renamed from: m */
    private long f38923m;

    /* renamed from: n */
    private long f38924n;

    /* renamed from: o */
    private long f38925o;

    /* renamed from: p */
    private long f38926p;

    /* renamed from: q */
    private long f38927q;

    public zzxr(@Nullable Context context) {
        zzxn zzxn;
        zzxq zzxq = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzen.f34500a;
            zzxn = zzxp.m55371b(applicationContext);
            if (zzxn == null) {
                zzxn = zzxo.m55369b(applicationContext);
            }
        } else {
            zzxn = null;
        }
        this.f38912b = zzxn;
        this.f38913c = zzxn != null ? zzxq.m55374a() : zzxq;
        this.f38921k = -9223372036854775807L;
        this.f38922l = -9223372036854775807L;
        this.f38916f = -1.0f;
        this.f38919i = 1.0f;
        this.f38920j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m55377b(zzxr zzxr, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzxr.f38921k = refreshRate;
            zzxr.f38922l = (refreshRate * 80) / 100;
            return;
        }
        zzdw.m48255e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzxr.f38921k = -9223372036854775807L;
        zzxr.f38922l = -9223372036854775807L;
    }

    /* renamed from: k */
    private final void m55378k() {
        Surface surface;
        if (zzen.f34500a >= 30 && (surface = this.f38915e) != null && this.f38920j != Integer.MIN_VALUE && this.f38918h != 0.0f) {
            this.f38918h = 0.0f;
            zzxm.m55367a(surface, 0.0f);
        }
    }

    /* renamed from: l */
    private final void m55379l() {
        this.f38923m = 0;
        this.f38926p = -1;
        this.f38924n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.f38917g) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r10.f38911a.mo48378b() >= 30) goto L_0x0064;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m55380m() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzen.f34500a
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r10.f38915e
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.zzxd r0 = r10.f38911a
            boolean r0 = r0.mo48383g()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzxd r0 = r10.f38911a
            float r0 = r0.mo48377a()
            goto L_0x001c
        L_0x001a:
            float r0 = r10.f38916f
        L_0x001c:
            float r2 = r10.f38917g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzxd r1 = r10.f38911a
            boolean r1 = r1.mo48383g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzxd r1 = r10.f38911a
            long r6 = r1.mo48380d()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r10.f38917g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzxd r2 = r10.f38911a
            int r2 = r2.mo48378b()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r10.f38917g = r0
            r10.m55381n(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxr.m55380m():void");
    }

    /* renamed from: n */
    private final void m55381n(boolean z) {
        Surface surface;
        if (zzen.f34500a >= 30 && (surface = this.f38915e) != null && this.f38920j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f38914d) {
                float f2 = this.f38917g;
                if (f2 != -1.0f) {
                    f = this.f38919i * f2;
                }
            }
            if (z || this.f38918h != f) {
                this.f38918h = f;
                zzxm.m55367a(surface, f);
            }
        }
    }

    /* renamed from: a */
    public final long mo48402a(long j) {
        long j2;
        if (this.f38926p != -1 && this.f38911a.mo48383g()) {
            long c = this.f38927q + ((long) (((float) (this.f38911a.mo48379c() * (this.f38923m - this.f38926p))) / this.f38919i));
            if (Math.abs(j - c) <= 20000000) {
                j = c;
            } else {
                m55379l();
            }
        }
        this.f38924n = this.f38923m;
        this.f38925o = j;
        zzxq zzxq = this.f38913c;
        if (zzxq == null || this.f38921k == -9223372036854775807L) {
            return j;
        }
        long j3 = zzxq.f38906a;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.f38921k;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            long j6 = j5;
            j5 = j4 + j5;
            j2 = j6;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.f38922l;
    }

    /* renamed from: c */
    public final void mo48403c(float f) {
        this.f38916f = f;
        this.f38911a.mo48382f();
        m55380m();
    }

    /* renamed from: d */
    public final void mo48404d(long j) {
        long j2 = this.f38924n;
        if (j2 != -1) {
            this.f38926p = j2;
            this.f38927q = this.f38925o;
        }
        this.f38923m++;
        this.f38911a.mo48381e(j * 1000);
        m55380m();
    }

    /* renamed from: e */
    public final void mo48405e(float f) {
        this.f38919i = f;
        m55379l();
        m55381n(false);
    }

    /* renamed from: f */
    public final void mo48406f() {
        m55379l();
    }

    /* renamed from: g */
    public final void mo48407g() {
        this.f38914d = true;
        m55379l();
        if (this.f38912b != null) {
            zzxq zzxq = this.f38913c;
            Objects.requireNonNull(zzxq);
            zzxq.mo48398b();
            this.f38912b.mo48393a(new zzxl(this));
        }
        m55381n(false);
    }

    /* renamed from: h */
    public final void mo48408h() {
        this.f38914d = false;
        zzxn zzxn = this.f38912b;
        if (zzxn != null) {
            zzxn.zza();
            zzxq zzxq = this.f38913c;
            Objects.requireNonNull(zzxq);
            zzxq.mo48399c();
        }
        m55378k();
    }

    /* renamed from: i */
    public final void mo48409i(@Nullable Surface surface) {
        if (true == (surface instanceof zzxj)) {
            surface = null;
        }
        if (this.f38915e != surface) {
            m55378k();
            this.f38915e = surface;
            m55381n(true);
        }
    }

    /* renamed from: j */
    public final void mo48410j(int i) {
        if (this.f38920j != i) {
            this.f38920j = i;
            m55381n(true);
        }
    }
}
