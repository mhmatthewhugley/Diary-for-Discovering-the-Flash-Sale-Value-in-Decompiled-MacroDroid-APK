package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzav extends zzao {
    final /* synthetic */ zzaw zza;

    zzav(zzaw zzaw) {
        this.zza = zzaw;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzac.m61133a(i, this.zza.f41956g, "index");
        zzaw zzaw = this.zza;
        int i2 = i + i;
        Object obj = zzaw.f41955f[i2];
        obj.getClass();
        Object obj2 = zzaw.f41955f[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.f41956g;
    }
}
