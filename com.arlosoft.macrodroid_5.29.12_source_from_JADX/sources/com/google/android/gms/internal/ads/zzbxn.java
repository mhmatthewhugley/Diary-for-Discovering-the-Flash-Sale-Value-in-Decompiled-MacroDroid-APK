package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbxn implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbxa f27920a;

    /* renamed from: b */
    final /* synthetic */ zzbvq f27921b;

    /* renamed from: c */
    final /* synthetic */ zzbxo f27922c;

    zzbxn(zzbxo zzbxo, zzbxa zzbxa, zzbvq zzbvq) {
        this.f27922c = zzbxo;
        this.f27920a = zzbxa;
        this.f27921b = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            this.f27920a.mo43167C(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
