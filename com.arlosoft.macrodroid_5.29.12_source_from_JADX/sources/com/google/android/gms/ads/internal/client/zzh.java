package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzh extends zzbh {

    /* renamed from: a */
    private final AdLoadCallback f1978a;

    /* renamed from: c */
    private final Object f1979c;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f1978a = adLoadCallback;
        this.f1979c = obj;
    }

    /* renamed from: a */
    public final void mo19901a() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f1978a;
        if (adLoadCallback != null && (obj = this.f1979c) != null) {
            adLoadCallback.onAdLoaded(obj);
        }
    }

    /* renamed from: r1 */
    public final void mo19902r1(zze zze) {
        AdLoadCallback adLoadCallback = this.f1978a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zze.mo20074m2());
        }
    }
}
