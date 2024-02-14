package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.BandwidthInfo;
import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzie extends ConnectionLifecycleCallback {

    /* renamed from: a */
    private final ConnectionLifecycleCallback f44757a;

    /* renamed from: b */
    final /* synthetic */ zzih f44758b;

    zzie(zzih zzih, ConnectionLifecycleCallback connectionLifecycleCallback) {
        this.f44758b = zzih;
        this.f44757a = connectionLifecycleCallback;
    }

    /* renamed from: a */
    public final void mo52755a(String str, BandwidthInfo bandwidthInfo) {
        this.f44757a.mo52755a(str, bandwidthInfo);
    }

    /* renamed from: b */
    public final void mo37367b(String str, ConnectionInfo connectionInfo) {
        if (connectionInfo.mo55651a()) {
            this.f44758b.m62586M(str);
        }
        this.f44757a.mo37367b(str, connectionInfo);
    }

    /* renamed from: c */
    public final void mo37368c(String str, ConnectionResolution connectionResolution) {
        if (!connectionResolution.mo55659a().mo21297q2()) {
            this.f44758b.m62587N(str);
        }
        this.f44757a.mo37368c(str, connectionResolution);
    }

    /* renamed from: d */
    public final void mo37369d(String str) {
        this.f44758b.m62587N(str);
        this.f44757a.mo37369d(str);
    }
}
