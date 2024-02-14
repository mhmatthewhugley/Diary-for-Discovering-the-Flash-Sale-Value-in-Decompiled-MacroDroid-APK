package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzewx implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzfzp f35117a;

    /* renamed from: c */
    public final /* synthetic */ zzfzp f35118c;

    public /* synthetic */ zzewx(zzfzp zzfzp, zzfzp zzfzp2) {
        this.f35117a = zzfzp;
        this.f35118c = zzfzp2;
    }

    public final Object call() {
        return new zzewz((String) this.f35117a.get(), (String) this.f35118c.get());
    }
}
