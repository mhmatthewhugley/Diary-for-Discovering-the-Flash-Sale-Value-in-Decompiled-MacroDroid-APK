package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzflm {

    /* renamed from: f */
    private static zzflm f36063f;

    /* renamed from: a */
    private float f36064a = 0.0f;

    /* renamed from: b */
    private final zzflf f36065b;

    /* renamed from: c */
    private final zzfld f36066c;

    /* renamed from: d */
    private zzfle f36067d;

    /* renamed from: e */
    private zzflg f36068e;

    public zzflm(zzflf zzflf, zzfld zzfld) {
        this.f36065b = zzflf;
        this.f36066c = zzfld;
    }

    /* renamed from: b */
    public static zzflm m50485b() {
        if (f36063f == null) {
            f36063f = new zzflm(new zzflf(), new zzfld());
        }
        return f36063f;
    }

    /* renamed from: a */
    public final float mo45921a() {
        return this.f36064a;
    }

    /* renamed from: c */
    public final void mo45922c(Context context) {
        this.f36067d = new zzfle(new Handler(), context, new zzflc(), this, (byte[]) null);
    }

    /* renamed from: d */
    public final void mo45923d(float f) {
        this.f36064a = f;
        if (this.f36068e == null) {
            this.f36068e = zzflg.m50458a();
        }
        for (zzfkv g : this.f36068e.mo45892b()) {
            g.mo45880g().mo45938h(f);
        }
    }

    /* renamed from: e */
    public final void mo45924e() {
        zzflh.m50465a().mo45900d(this);
        zzflh.m50465a().mo45898b();
        zzfmi.m50552d().mo45968i();
        this.f36067d.mo45889a();
    }

    /* renamed from: f */
    public final void mo45925f() {
        zzfmi.m50552d().mo45969j();
        zzflh.m50465a().mo45899c();
        this.f36067d.mo45890b();
    }
}
