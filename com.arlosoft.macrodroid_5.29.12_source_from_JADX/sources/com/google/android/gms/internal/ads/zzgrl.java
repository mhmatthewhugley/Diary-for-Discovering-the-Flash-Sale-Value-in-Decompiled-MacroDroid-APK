package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgrl extends AbstractList {

    /* renamed from: a */
    private final List f37159a;

    /* renamed from: c */
    private final zzgrk f37160c;

    public zzgrl(List list, zzgrk zzgrk) {
        this.f37159a = list;
        this.f37160c = zzgrk;
    }

    public final Object get(int i) {
        zzbfn b = zzbfn.m43300b(((Integer) this.f37159a.get(i)).intValue());
        return b == null ? zzbfn.AD_FORMAT_TYPE_UNSPECIFIED : b;
    }

    public final int size() {
        return this.f37159a.size();
    }
}
