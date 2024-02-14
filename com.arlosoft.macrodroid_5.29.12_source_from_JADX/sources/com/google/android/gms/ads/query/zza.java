package com.google.android.gms.ads.query;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbzt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zza implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f2590a;

    /* renamed from: c */
    public final /* synthetic */ AdFormat f2591c;

    /* renamed from: d */
    public final /* synthetic */ AdRequest f2592d;

    /* renamed from: f */
    public final /* synthetic */ QueryInfoGenerationCallback f2593f;

    public /* synthetic */ zza(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f2590a = context;
        this.f2591c = adFormat;
        this.f2592d = adRequest;
        this.f2593f = queryInfoGenerationCallback;
    }

    public final void run() {
        Context context = this.f2590a;
        AdFormat adFormat = this.f2591c;
        AdRequest adRequest = this.f2592d;
        new zzbzt(context, adFormat, adRequest == null ? null : adRequest.mo19668a()).mo43236b(this.f2593f);
    }
}
