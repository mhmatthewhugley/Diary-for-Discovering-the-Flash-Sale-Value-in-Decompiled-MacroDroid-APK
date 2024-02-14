package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzo implements zzgr {

    /* renamed from: a */
    public final zzci f47307a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f47308b;

    zzo(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzci) {
        this.f47308b = appMeasurementDynamiteService;
        this.f47307a = zzci;
    }

    /* renamed from: a */
    public final void mo55247a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f47307a.mo50833M1(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfr zzfr = this.f47308b.f46398a;
            if (zzfr != null) {
                zzfr.mo55221z().mo55103u().mo55092b("Event interceptor threw exception", e);
            }
        }
    }
}
