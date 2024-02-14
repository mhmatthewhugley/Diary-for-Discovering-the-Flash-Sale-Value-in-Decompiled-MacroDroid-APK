package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbwd implements MediationAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ zzbvq f27869a;

    /* renamed from: b */
    final /* synthetic */ Adapter f27870b;

    /* renamed from: c */
    final /* synthetic */ zzbwj f27871c;

    zzbwd(zzbwj zzbwj, zzbvq zzbvq, Adapter adapter) {
        this.f27871c = zzbwj;
        this.f27869a = zzbvq;
        this.f27870b = adapter;
    }

    /* renamed from: a */
    public final void mo20475a(@NonNull AdError adError) {
        try {
            String canonicalName = this.f27870b.getClass().getCanonicalName();
            int a = adError.mo19645a();
            String c = adError.mo19647c();
            String b = adError.mo19646b();
            zzcgp.m45224b(canonicalName + "failed to load mediation ad: ErrorCode = " + a + ". ErrorMessage = " + c + ". ErrorDomain = " + b);
            this.f27869a.mo43086u2(adError.mo19648d());
            this.f27869a.mo43078f2(adError.mo19645a(), adError.mo19647c());
            this.f27869a.mo43088x(adError.mo19645a());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
