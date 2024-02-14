package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbwg implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbvq f27875a;

    /* renamed from: b */
    final /* synthetic */ zzbwj f27876b;

    zzbwg(zzbwj zzbwj, zzbvq zzbvq) {
        this.f27876b = zzbwj;
        this.f27875a = zzbvq;
    }

    /* renamed from: a */
    public final void mo20475a(AdError adError) {
        try {
            String canonicalName = this.f27876b.f27882a.getClass().getCanonicalName();
            int a = adError.mo19645a();
            String c = adError.mo19647c();
            String b = adError.mo19646b();
            zzcgp.m45224b(canonicalName + "failed to loaded mediation ad: ErrorCode = " + a + ". ErrorMessage = " + c + ". ErrorDomain = " + b);
            this.f27875a.mo43086u2(adError.mo19648d());
            this.f27875a.mo43078f2(adError.mo19645a(), adError.mo19647c());
            this.f27875a.mo43088x(adError.mo19645a());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}