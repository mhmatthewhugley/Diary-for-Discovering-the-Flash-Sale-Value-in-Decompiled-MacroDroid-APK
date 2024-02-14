package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfa {

    /* renamed from: a */
    private final zza f46765a;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
    public interface zza {
        /* renamed from: a */
        void mo54883a(Context context, Intent intent);
    }

    public zzfa(zza zza2) {
        Preconditions.m4488k(zza2);
        this.f46765a = zza2;
    }

    @MainThread
    /* renamed from: a */
    public final void mo55144a(Context context, Intent intent) {
        zzfr H = zzfr.m65677H(context, (zzcl) null, (Long) null);
        zzeh z = H.mo55221z();
        if (intent == null) {
            z.mo55103u().mo55091a("Receiver called with null intent");
            return;
        }
        H.mo55207h();
        String action = intent.getAction();
        z.mo55102t().mo55092b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            z.mo55102t().mo55091a("Starting wakeful intent.");
            this.f46765a.mo54883a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            z.mo55103u().mo55091a("Install Referrer Broadcasts are deprecated");
        }
    }
}
