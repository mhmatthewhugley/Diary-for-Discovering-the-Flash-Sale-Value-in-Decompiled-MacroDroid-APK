package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f46985a;

    /* renamed from: c */
    final /* synthetic */ zzhx f46986c;

    zzhg(zzhx zzhx, Bundle bundle) {
        this.f46986c = zzhx;
        this.f46985a = bundle;
    }

    public final void run() {
        zzhx zzhx = this.f46986c;
        Bundle bundle = this.f46985a;
        zzhx.mo55073e();
        zzhx.mo55140f();
        Preconditions.m4488k(bundle);
        String g = Preconditions.m4484g(bundle.getString("name"));
        if (!zzhx.f46899a.mo55212m()) {
            zzhx.f46899a.mo55221z().mo55102t().mo55091a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkw zzkw = new zzkw(g, 0, (Object) null, "");
        try {
            zzac zzac = r4;
            zzac zzac2 = new zzac(bundle.getString("app_id"), "", zzkw, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzaw) null, bundle.getLong("trigger_timeout"), (zzaw) null, bundle.getLong("time_to_live"), zzhx.f46899a.mo55196N().mo55616w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            zzhx.f46899a.mo55194L().mo55459q(zzac);
        } catch (IllegalArgumentException unused) {
        }
    }
}
