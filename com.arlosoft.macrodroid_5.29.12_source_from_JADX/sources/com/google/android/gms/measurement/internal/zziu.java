package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzie f47114a;

    /* renamed from: c */
    final /* synthetic */ zzjm f47115c;

    zziu(zzjm zzjm, zzie zzie) {
        this.f47115c = zzjm;
        this.f47114a = zzie;
    }

    public final void run() {
        zzjm zzjm = this.f47115c;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to send current screen to service");
            return;
        }
        try {
            zzie zzie = this.f47114a;
            if (zzie == null) {
                H.mo55047a4(0, (String) null, (String) null, zzjm.f46899a.mo55202c().getPackageName());
            } else {
                H.mo55047a4(zzie.f47059c, zzie.f47057a, zzie.f47058b, zzjm.f46899a.mo55202c().getPackageName());
            }
            this.f47115c.m65932E();
        } catch (RemoteException e) {
            this.f47115c.f46899a.mo55221z().mo55098p().mo55092b("Failed to send current screen to the service", e);
        }
    }
}
