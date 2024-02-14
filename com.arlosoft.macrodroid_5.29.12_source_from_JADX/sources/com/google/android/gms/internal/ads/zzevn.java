package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevn implements zzevd {

    /* renamed from: a */
    public final String f35034a;

    /* renamed from: b */
    public final int f35035b;

    /* renamed from: c */
    public final int f35036c;

    /* renamed from: d */
    public final int f35037d;

    /* renamed from: e */
    public final boolean f35038e;

    /* renamed from: f */
    public final int f35039f;

    public zzevn(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f35034a = str;
        this.f35035b = i;
        this.f35036c = i2;
        this.f35037d = i3;
        this.f35038e = z;
        this.f35039f = i4;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f35034a;
        boolean z = true;
        zzfeq.m50025f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.f35035b;
        if (i == -2) {
            z = false;
        }
        zzfeq.m50024e(bundle, "cnt", i, z);
        bundle.putInt("gnt", this.f35036c);
        bundle.putInt("pt", this.f35037d);
        Bundle a = zzfeq.m50020a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = zzfeq.m50020a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f35039f);
        a2.putBoolean("active_network_metered", this.f35038e);
    }
}
