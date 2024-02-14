package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f46983a;

    /* renamed from: c */
    final /* synthetic */ zzhx f46984c;

    zzhf(zzhx zzhx, Bundle bundle) {
        this.f46984c = zzhx;
        this.f46983a = bundle;
    }

    public final void run() {
        zzhx zzhx = this.f46984c;
        Bundle bundle = this.f46983a;
        zzhx.mo55073e();
        zzhx.mo55140f();
        Preconditions.m4488k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.m4484g(string);
        Preconditions.m4484g(string2);
        Preconditions.m4488k(bundle.get("value"));
        if (!zzhx.f46899a.mo55212m()) {
            zzhx.f46899a.mo55221z().mo55102t().mo55091a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkw = new zzkw(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw w0 = zzhx.f46899a.mo55196N().mo55616w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            zzaw w02 = zzhx.f46899a.mo55196N().mo55616w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            zzaw w03 = zzhx.f46899a.mo55196N().mo55616w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            zzhx.f46899a.mo55194L().mo55459q(new zzac(bundle.getString("app_id"), string2, zzkw, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
