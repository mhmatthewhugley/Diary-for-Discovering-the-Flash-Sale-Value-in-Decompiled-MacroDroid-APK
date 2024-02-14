package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbr;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzex implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzbr f46758a;

    /* renamed from: c */
    final /* synthetic */ ServiceConnection f46759c;

    /* renamed from: d */
    final /* synthetic */ zzey f46760d;

    zzex(zzey zzey, zzbr zzbr, ServiceConnection serviceConnection) {
        this.f46760d = zzey;
        this.f46758a = zzbr;
        this.f46759c = serviceConnection;
    }

    public final void run() {
        zzey zzey = this.f46760d;
        zzez zzez = zzey.f46762c;
        String a = zzey.f46761a;
        zzbr zzbr = this.f46758a;
        ServiceConnection serviceConnection = this.f46759c;
        zzez.f46763a.mo55185B().mo55073e();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", a);
        Bundle bundle2 = null;
        try {
            Bundle g0 = zzbr.mo50776g0(bundle);
            if (g0 == null) {
                zzez.f46763a.mo55221z().mo55098p().mo55091a("Install Referrer Service returned a null response");
            } else {
                bundle2 = g0;
            }
        } catch (Exception e) {
            zzez.f46763a.mo55221z().mo55098p().mo55092b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzez.f46763a.mo55185B().mo55073e();
        zzfr.m65679r();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzez.f46763a.mo55221z().mo55103u().mo55091a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzez.f46763a.mo55221z().mo55098p().mo55091a("No referrer defined in Install Referrer response");
                } else {
                    zzez.f46763a.mo55221z().mo55102t().mo55092b("InstallReferrer API result", string);
                    Bundle t0 = zzez.f46763a.mo55196N().mo55611t0(Uri.parse("?".concat(string)));
                    if (t0 == null) {
                        zzez.f46763a.mo55221z().mo55098p().mo55091a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                zzez.f46763a.mo55221z().mo55098p().mo55091a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzez.f46763a.mo55189F().f46739f.mo55120a()) {
                            zzez.f46763a.mo55221z().mo55102t().mo55091a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzez.f46763a.mo55212m()) {
                            zzez.f46763a.mo55189F().f46739f.mo55121b(j);
                            zzez.f46763a.mo55221z().mo55102t().mo55092b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            zzez.f46763a.mo55191I().mo55374r("auto", "_cmp", t0, a);
                        }
                    }
                }
            }
        }
        ConnectionTracker.m4827b().mo21939c(zzez.f46763a.mo55202c(), serviceConnection);
    }
}
