package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbxj implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbwr f27912a;

    /* renamed from: b */
    final /* synthetic */ zzbvq f27913b;

    zzbxj(zzbxo zzbxo, zzbwr zzbwr, zzbvq zzbvq) {
        this.f27912a = zzbwr;
        this.f27913b = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            this.f27912a.mo43157C(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
