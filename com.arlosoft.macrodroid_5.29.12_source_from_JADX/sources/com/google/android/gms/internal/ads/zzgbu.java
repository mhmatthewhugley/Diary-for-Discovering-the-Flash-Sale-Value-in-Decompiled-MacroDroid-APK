package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbu {

    /* renamed from: a */
    private final ConcurrentMap f36662a;

    /* renamed from: b */
    private final zzgbo f36663b;

    /* renamed from: c */
    private final Class f36664c;

    /* renamed from: d */
    private final zzghm f36665d;

    /* synthetic */ zzgbu(ConcurrentMap concurrentMap, zzgbo zzgbo, zzghm zzghm, Class cls, zzgbt zzgbt) {
        this.f36662a = concurrentMap;
        this.f36663b = zzgbo;
        this.f36664c = cls;
        this.f36665d = zzghm;
    }

    /* renamed from: a */
    public final zzgbo mo46710a() {
        return this.f36663b;
    }

    /* renamed from: b */
    public final zzghm mo46711b() {
        return this.f36665d;
    }

    /* renamed from: c */
    public final Class mo46712c() {
        return this.f36664c;
    }

    /* renamed from: d */
    public final Collection mo46713d() {
        return this.f36662a.values();
    }

    /* renamed from: e */
    public final List mo46714e(byte[] bArr) {
        List list = (List) this.f36662a.get(new zzgbq(bArr, (zzgbp) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean mo46715f() {
        return !this.f36665d.mo46806a().isEmpty();
    }
}
