package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeqb implements zzeve {

    /* renamed from: a */
    private final Set f34698a;

    zzeqb(Set set) {
        this.f34698a = set;
    }

    public final int zza() {
        return 8;
    }

    public final zzfzp zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f34698a) {
            arrayList.add(add);
        }
        return zzfzg.m51414i(new zzeqa(arrayList));
    }
}
