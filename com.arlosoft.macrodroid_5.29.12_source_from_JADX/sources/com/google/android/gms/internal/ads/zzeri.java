package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeri implements zzevd {

    /* renamed from: a */
    public final double f34782a;

    /* renamed from: b */
    public final boolean f34783b;

    public zzeri(double d, boolean z) {
        this.f34782a = d;
        this.f34783b = z;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = zzfeq.m50020a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = zzfeq.m50020a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.f34783b);
        a2.putDouble("battery_level", this.f34782a);
    }
}
