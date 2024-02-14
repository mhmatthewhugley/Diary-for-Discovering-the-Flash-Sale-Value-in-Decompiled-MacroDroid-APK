package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbbh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f26502a;

    /* renamed from: c */
    final /* synthetic */ int f26503c;

    /* renamed from: d */
    final /* synthetic */ int f26504d;

    /* renamed from: f */
    final /* synthetic */ float f26505f;

    /* renamed from: g */
    final /* synthetic */ zzbbk f26506g;

    zzbbh(zzbbk zzbbk, int i, int i2, int i3, float f) {
        this.f26506g = zzbbk;
        this.f26502a = i;
        this.f26503c = i2;
        this.f26504d = i3;
        this.f26505f = f;
    }

    public final void run() {
        this.f26506g.f26512b.mo42388v(this.f26502a, this.f26503c, this.f26504d, this.f26505f);
    }
}
