package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgxd {

    /* renamed from: a */
    final LinkedHashMap f37410a;

    zzgxd(int i) {
        this.f37410a = zzgxf.m53641b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzgxd mo47596a(Object obj, zzgxv zzgxv) {
        LinkedHashMap linkedHashMap = this.f37410a;
        zzgxq.m53657a(obj, "key");
        zzgxq.m53657a(zzgxv, "provider");
        linkedHashMap.put(obj, zzgxv);
        return this;
    }
}
