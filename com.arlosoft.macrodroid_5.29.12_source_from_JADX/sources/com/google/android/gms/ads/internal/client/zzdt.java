package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzdt extends zzax {

    /* renamed from: c */
    final /* synthetic */ zzdu f1910c;

    zzdt(zzdu zzdu) {
        this.f1910c = zzdu;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzdu zzdu = this.f1910c;
        zzdu.f1914d.mo19754c(zzdu.mo20056l());
        super.onAdFailedToLoad(loadAdError);
    }

    public final void onAdLoaded() {
        zzdu zzdu = this.f1910c;
        zzdu.f1914d.mo19754c(zzdu.mo20056l());
        super.onAdLoaded();
    }
}
