package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbwh implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbvq f27877a;

    /* renamed from: b */
    final /* synthetic */ zzbwj f27878b;

    zzbwh(zzbwj zzbwj, zzbvq zzbvq) {
        this.f27878b = zzbwj;
        this.f27877a = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            String canonicalName = this.f27878b.f27882a.getClass().getCanonicalName();
            int a = adError.mo19645a();
            String c = adError.mo19647c();
            String b = adError.mo19646b();
            zzcgp.m45224b(canonicalName + "failed to load mediation ad: ErrorCode = " + a + ". ErrorMessage = " + c + ". ErrorDomain = " + b);
            this.f27877a.mo43086u2(adError.mo19648d());
            this.f27877a.mo43078f2(adError.mo19645a(), adError.mo19647c());
            this.f27877a.mo43088x(adError.mo19645a());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
