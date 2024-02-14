package com.google.android.gms.internal.mlkit_translate;

import java.util.AbstractMap;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzae extends zzv {
    final /* synthetic */ zzaf zza;

    zzae(zzaf zzaf) {
        this.zza = zzaf;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzj.m61888a(i, this.zza.f43092g, "index");
        zzaf zzaf = this.zza;
        int i2 = i + i;
        Object obj = zzaf.f43091f[i2];
        obj.getClass();
        Object obj2 = zzaf.f43091f[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.f43092g;
    }
}
