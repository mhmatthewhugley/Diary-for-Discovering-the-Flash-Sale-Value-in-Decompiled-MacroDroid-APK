package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbxi implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbwr f27910a;

    /* renamed from: b */
    final /* synthetic */ zzbvq f27911b;

    zzbxi(zzbxo zzbxo, zzbwr zzbwr, zzbvq zzbvq) {
        this.f27910a = zzbwr;
        this.f27911b = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            this.f27910a.mo43157C(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
