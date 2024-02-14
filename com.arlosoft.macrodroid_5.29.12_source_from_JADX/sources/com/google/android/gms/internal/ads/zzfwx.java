package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfwx extends zzfvn {
    final /* synthetic */ zzfwy zza;

    zzfwx(zzfwy zzfwy) {
        this.zza = zzfwy;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfsx.m50936a(i, this.zza.f36507g, "index");
        zzfwy zzfwy = this.zza;
        int i2 = i + i;
        Object obj = zzfwy.f36506f[i2];
        obj.getClass();
        Object obj2 = zzfwy.f36506f[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: j */
    public final boolean mo46421j() {
        return true;
    }

    public final int size() {
        return this.zza.f36507g;
    }
}
