package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f46964a;

    /* renamed from: c */
    final /* synthetic */ String f46965c;

    /* renamed from: d */
    final /* synthetic */ long f46966d;

    /* renamed from: f */
    final /* synthetic */ Bundle f46967f;

    /* renamed from: g */
    final /* synthetic */ boolean f46968g;

    /* renamed from: o */
    final /* synthetic */ boolean f46969o;

    /* renamed from: p */
    final /* synthetic */ boolean f46970p;

    /* renamed from: s */
    final /* synthetic */ String f46971s;

    /* renamed from: z */
    final /* synthetic */ zzhx f46972z;

    zzhb(zzhx zzhx, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f46972z = zzhx;
        this.f46964a = str;
        this.f46965c = str2;
        this.f46966d = j;
        this.f46967f = bundle;
        this.f46968g = z;
        this.f46969o = z2;
        this.f46970p = z3;
        this.f46971s = str3;
    }

    public final void run() {
        this.f46972z.mo55377u(this.f46964a, this.f46965c, this.f46966d, this.f46967f, this.f46968g, this.f46969o, this.f46970p, this.f46971s);
    }
}
