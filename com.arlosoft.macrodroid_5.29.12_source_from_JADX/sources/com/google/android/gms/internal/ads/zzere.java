package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzere implements zzevd {

    /* renamed from: a */
    public final int f34767a;

    /* renamed from: b */
    public final boolean f34768b;

    /* renamed from: c */
    public final boolean f34769c;

    /* renamed from: d */
    public final int f34770d;

    /* renamed from: e */
    public final int f34771e;

    /* renamed from: f */
    public final int f34772f;

    /* renamed from: g */
    public final int f34773g;

    /* renamed from: h */
    public final int f34774h;

    /* renamed from: i */
    public final float f34775i;

    /* renamed from: j */
    public final boolean f34776j;

    public zzere(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.f34767a = i;
        this.f34768b = z;
        this.f34769c = z2;
        this.f34770d = i2;
        this.f34771e = i3;
        this.f34772f = i4;
        this.f34773g = i5;
        this.f34774h = i6;
        this.f34775i = f;
        this.f34776j = z3;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f34767a);
        bundle.putBoolean("ma", this.f34768b);
        bundle.putBoolean("sp", this.f34769c);
        bundle.putInt("muv", this.f34770d);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26845D8)).booleanValue()) {
            bundle.putInt("muv_min", this.f34771e);
            bundle.putInt("muv_max", this.f34772f);
        }
        bundle.putInt("rm", this.f34773g);
        bundle.putInt("riv", this.f34774h);
        bundle.putFloat("android_app_volume", this.f34775i);
        bundle.putBoolean("android_app_muted", this.f34776j);
    }
}
