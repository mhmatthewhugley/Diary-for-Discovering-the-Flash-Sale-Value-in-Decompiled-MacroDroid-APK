package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzp implements zzgs {

    /* renamed from: a */
    public final zzci f47309a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f47310b;

    zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzci) {
        this.f47310b = appMeasurementDynamiteService;
        this.f47309a = zzci;
    }

    /* renamed from: a */
    public final void mo55248a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f47309a.mo50833M1(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfr zzfr = this.f47310b.f46398a;
            if (zzfr != null) {
                zzfr.mo55221z().mo55103u().mo55092b("Event listener threw exception", e);
            }
        }
    }
}
