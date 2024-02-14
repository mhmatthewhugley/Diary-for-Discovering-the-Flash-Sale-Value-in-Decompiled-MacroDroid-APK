package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfhp {

    /* renamed from: a */
    private final Object f35783a;

    /* renamed from: b */
    private final List f35784b;

    /* renamed from: c */
    final /* synthetic */ zzfhz f35785c;

    /* synthetic */ zzfhp(zzfhz zzfhz, Object obj, List list, zzfho zzfho) {
        this.f35785c = zzfhz;
        this.f35783a = obj;
        this.f35784b = list;
    }

    /* renamed from: a */
    public final zzfhy mo45739a(Callable callable) {
        zzfzf c = zzfzg.m51408c(this.f35784b);
        zzfzp a = c.mo46623a(zzfhn.f35782a, zzchc.f28461f);
        zzfhz zzfhz = this.f35785c;
        return new zzfhy(zzfhz, this.f35783a, (String) null, a, this.f35784b, c.mo46623a(callable, zzfhz.f35801a), (zzfhx) null);
    }
}
