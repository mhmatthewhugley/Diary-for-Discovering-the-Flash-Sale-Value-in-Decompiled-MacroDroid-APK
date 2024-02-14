package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzbvc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzbvd f27822a;

    /* renamed from: c */
    public final /* synthetic */ Context f27823c;

    /* renamed from: d */
    public final /* synthetic */ String f27824d;

    public /* synthetic */ zzbvc(zzbvd zzbvd, Context context, String str) {
        this.f27822a = zzbvd;
        this.f27823c = context;
        this.f27824d = str;
    }

    public final void run() {
        Context context = this.f27823c;
        String str = this.f27824d;
        zzbjc.m43542c(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27112f0)).booleanValue());
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27182m0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((zzcoj) zzcgt.m45236b(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbvb.f27821a)).mo44188pa(ObjectWrapper.m5051g8(context), new zzbva(AppMeasurementSdk.m65326k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | zzcgs | NullPointerException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
