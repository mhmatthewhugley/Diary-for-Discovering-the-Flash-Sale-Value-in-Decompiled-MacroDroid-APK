package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcfo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f28351a;

    /* renamed from: c */
    final /* synthetic */ zzchh f28352c;

    zzcfo(zzcfp zzcfp, Context context, zzchh zzchh) {
        this.f28351a = context;
        this.f28352c = zzchh;
    }

    public final void run() {
        try {
            this.f28352c.mo43574c(AdvertisingIdClient.m1817a(this.f28351a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.f28352c.mo43575d(e);
            zzcgp.m45227e("Exception while getting advertising Id info", e);
        }
    }
}
