package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzefi implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzefg f33885a;

    public /* synthetic */ zzefi(zzefg zzefg) {
        this.f33885a = zzefg;
    }

    public final Object call() {
        return this.f33885a.getWritableDatabase();
    }
}
