package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbxl implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbwx f27917a;

    /* renamed from: b */
    final /* synthetic */ zzbvq f27918b;

    zzbxl(zzbxo zzbxo, zzbwx zzbwx, zzbvq zzbvq) {
        this.f27917a = zzbwx;
        this.f27918b = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            this.f27917a.mo43164C(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
