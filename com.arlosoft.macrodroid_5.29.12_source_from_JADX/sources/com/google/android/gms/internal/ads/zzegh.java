package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzegh implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzego f33948a;

    public /* synthetic */ zzegh(zzego zzego) {
        this.f33948a = zzego;
    }

    public final Object call() {
        return this.f33948a.getWritableDatabase();
    }
}
