package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbxk implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbwu f27914a;

    /* renamed from: b */
    final /* synthetic */ zzbvq f27915b;

    /* renamed from: c */
    final /* synthetic */ zzbxo f27916c;

    zzbxk(zzbxo zzbxo, zzbwu zzbwu, zzbvq zzbvq) {
        this.f27916c = zzbxo;
        this.f27914a = zzbwu;
        this.f27915b = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            this.f27914a.mo43161C(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
