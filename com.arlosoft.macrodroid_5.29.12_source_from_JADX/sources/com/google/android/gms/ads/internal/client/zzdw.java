package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzdw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzed f1928a;

    /* renamed from: c */
    public final /* synthetic */ Context f1929c;

    /* renamed from: d */
    public final /* synthetic */ OnInitializationCompleteListener f1930d;

    public /* synthetic */ zzdw(zzed zzed, Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.f1928a = zzed;
        this.f1929c = context;
        this.f1930d = onInitializationCompleteListener;
    }

    public final void run() {
        this.f1928a.mo20080k(this.f1929c, (String) null, this.f1930d);
    }
}
