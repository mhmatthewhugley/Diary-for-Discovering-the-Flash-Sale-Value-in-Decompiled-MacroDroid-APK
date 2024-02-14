package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzcho {

    /* renamed from: a */
    private final zzchh f28469a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f28470b = new AtomicInteger(0);

    public zzcho() {
        zzchh zzchh = new zzchh();
        this.f28469a = zzchh;
        zzfzg.m51423r(zzchh, new zzchm(this), zzchc.f28461f);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo43581a() {
        return this.f28470b.get();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo43582c() {
        this.f28469a.mo43575d(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void mo43583d(Object obj) {
        this.f28469a.mo43574c(obj);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo43584e(zzchl zzchl, zzchj zzchj) {
        zzfzg.m51423r(this.f28469a, new zzchn(this, zzchl, zzchj), zzchc.f28461f);
    }
}
