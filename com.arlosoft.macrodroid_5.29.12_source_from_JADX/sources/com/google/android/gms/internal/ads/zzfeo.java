package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfeo {

    /* renamed from: a */
    private final zzfdk f35654a;

    /* renamed from: b */
    private final zzfdn f35655b;

    /* renamed from: c */
    private final zzego f35656c;

    /* renamed from: d */
    private final zzfkm f35657d;

    /* renamed from: e */
    private final zzfju f35658e;

    @VisibleForTesting
    public zzfeo(zzego zzego, zzfkm zzfkm, zzfdk zzfdk, zzfdn zzfdn, zzfju zzfju) {
        this.f35654a = zzfdk;
        this.f35655b = zzfdn;
        this.f35656c = zzego;
        this.f35657d = zzfkm;
        this.f35658e = zzfju;
    }

    /* renamed from: a */
    public final void mo45629a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo45630b((String) it.next(), 2);
        }
    }

    /* renamed from: b */
    public final void mo45630b(String str, int i) {
        if (!this.f35654a.f35540k0) {
            this.f35657d.mo45862c(str, this.f35658e);
            return;
        }
        this.f35656c.mo45279f(new zzegq(zzt.m2889b().mo21950a(), this.f35655b.f35566b, str, i));
    }

    /* renamed from: c */
    public final void mo45631c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo45630b((String) it.next(), i);
        }
    }
}
