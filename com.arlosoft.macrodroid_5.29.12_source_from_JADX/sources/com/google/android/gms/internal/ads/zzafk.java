package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzafk {

    /* renamed from: a */
    public final zzaap f24253a;

    /* renamed from: b */
    public final zzafx f24254b = new zzafx();

    /* renamed from: c */
    public final zzef f24255c = new zzef();

    /* renamed from: d */
    public zzafy f24256d;

    /* renamed from: e */
    public zzafg f24257e;

    /* renamed from: f */
    public int f24258f;

    /* renamed from: g */
    public int f24259g;

    /* renamed from: h */
    public int f24260h;

    /* renamed from: i */
    public int f24261i;

    /* renamed from: j */
    private final zzef f24262j = new zzef(1);

    /* renamed from: k */
    private final zzef f24263k = new zzef();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f24264l;

    public zzafk(zzaap zzaap, zzafy zzafy, zzafg zzafg) {
        this.f24253a = zzaap;
        this.f24256d = zzafy;
        this.f24257e = zzafg;
        mo41437h(zzafy, zzafg);
    }

    /* renamed from: a */
    public final int mo41431a() {
        int i;
        if (!this.f24264l) {
            i = this.f24256d.f24376g[this.f24258f];
        } else {
            i = this.f24254b.f24362j[this.f24258f] ? 1 : 0;
        }
        return mo41436f() != null ? i | BasicMeasure.EXACTLY : i;
    }

    /* renamed from: b */
    public final int mo41432b() {
        if (!this.f24264l) {
            return this.f24256d.f24373d[this.f24258f];
        }
        return this.f24254b.f24360h[this.f24258f];
    }

    /* renamed from: c */
    public final int mo41433c(int i, int i2) {
        zzef zzef;
        zzafw f = mo41436f();
        if (f == null) {
            return 0;
        }
        int i3 = f.f24351d;
        if (i3 != 0) {
            zzef = this.f24254b.f24366n;
        } else {
            byte[] bArr = (byte[]) zzen.m49166h(f.f24352e);
            zzef zzef2 = this.f24263k;
            int length = bArr.length;
            zzef2.mo45228d(bArr, length);
            zzef = this.f24263k;
            i3 = length;
        }
        boolean b = this.f24254b.mo41442b(this.f24258f);
        boolean z = b || i2 != 0;
        zzef zzef3 = this.f24262j;
        zzef3.mo45232h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzef3.mo45230f(0);
        this.f24253a.mo41213c(this.f24262j, 1, 1);
        this.f24253a.mo41213c(zzef, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!b) {
            this.f24255c.mo45227c(8);
            zzef zzef4 = this.f24255c;
            byte[] h = zzef4.mo45232h();
            h[0] = 0;
            h[1] = 1;
            h[2] = 0;
            h[3] = (byte) i2;
            h[4] = (byte) ((i >> 24) & 255);
            h[5] = (byte) ((i >> 16) & 255);
            h[6] = (byte) ((i >> 8) & 255);
            h[7] = (byte) (i & 255);
            this.f24253a.mo41213c(zzef4, 8, 1);
            return i3 + 9;
        }
        zzef zzef5 = this.f24254b.f24366n;
        int w = zzef5.mo45247w();
        zzef5.mo45231g(-2);
        int i4 = (w * 6) + 2;
        if (i2 != 0) {
            this.f24255c.mo45227c(i4);
            byte[] h2 = this.f24255c.mo45232h();
            zzef5.mo45226b(h2, 0, i4);
            int i5 = (((h2[2] & 255) << 8) | (h2[3] & 255)) + i2;
            h2[2] = (byte) ((i5 >> 8) & 255);
            h2[3] = (byte) (i5 & 255);
            zzef5 = this.f24255c;
        }
        this.f24253a.mo41213c(zzef5, i4, 1);
        return i3 + 1 + i4;
    }

    /* renamed from: d */
    public final long mo41434d() {
        if (!this.f24264l) {
            return this.f24256d.f24372c[this.f24258f];
        }
        return this.f24254b.f24358f[this.f24260h];
    }

    /* renamed from: e */
    public final long mo41435e() {
        if (!this.f24264l) {
            return this.f24256d.f24375f[this.f24258f];
        }
        zzafx zzafx = this.f24254b;
        return zzafx.f24361i[this.f24258f];
    }

    @Nullable
    /* renamed from: f */
    public final zzafw mo41436f() {
        if (!this.f24264l) {
            return null;
        }
        zzafx zzafx = this.f24254b;
        zzafg zzafg = zzafx.f24353a;
        int i = zzen.f34500a;
        int i2 = zzafg.f24244a;
        zzafw zzafw = zzafx.f24365m;
        if (zzafw == null) {
            zzafw = this.f24256d.f24370a.mo41440a(i2);
        }
        if (zzafw == null || !zzafw.f24348a) {
            return null;
        }
        return zzafw;
    }

    /* renamed from: h */
    public final void mo41437h(zzafy zzafy, zzafg zzafg) {
        this.f24256d = zzafy;
        this.f24257e = zzafg;
        this.f24253a.mo41214d(zzafy.f24370a.f24342f);
        mo41438i();
    }

    /* renamed from: i */
    public final void mo41438i() {
        zzafx zzafx = this.f24254b;
        zzafx.f24356d = 0;
        zzafx.f24368p = 0;
        zzafx.f24369q = false;
        zzafx.f24363k = false;
        zzafx.f24367o = false;
        zzafx.f24365m = null;
        this.f24258f = 0;
        this.f24260h = 0;
        this.f24259g = 0;
        this.f24261i = 0;
        this.f24264l = false;
    }

    /* renamed from: k */
    public final boolean mo41439k() {
        this.f24258f++;
        if (!this.f24264l) {
            return false;
        }
        int i = this.f24259g + 1;
        this.f24259g = i;
        int[] iArr = this.f24254b.f24359g;
        int i2 = this.f24260h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f24260h = i2 + 1;
        this.f24259g = 0;
        return false;
    }
}
