package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzdx implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzed f1931a;

    /* renamed from: c */
    public final /* synthetic */ Context f1932c;

    /* renamed from: d */
    public final /* synthetic */ OnInitializationCompleteListener f1933d;

    public /* synthetic */ zzdx(zzed zzed, Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.f1931a = zzed;
        this.f1932c = context;
        this.f1933d = onInitializationCompleteListener;
    }

    public final void run() {
        this.f1931a.mo20081l(this.f1932c, (String) null, this.f1933d);
    }
}
