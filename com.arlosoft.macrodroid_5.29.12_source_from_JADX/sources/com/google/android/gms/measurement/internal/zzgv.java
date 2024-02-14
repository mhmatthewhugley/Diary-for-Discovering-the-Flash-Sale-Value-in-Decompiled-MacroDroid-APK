package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class zzgv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzhx f46922a;

    /* renamed from: c */
    public final /* synthetic */ Bundle f46923c;

    /* renamed from: d */
    public final /* synthetic */ long f46924d;

    public /* synthetic */ zzgv(zzhx zzhx, Bundle bundle, long j) {
        this.f46922a = zzhx;
        this.f46923c = bundle;
        this.f46924d = j;
    }

    public final void run() {
        zzhx zzhx = this.f46922a;
        Bundle bundle = this.f46923c;
        long j = this.f46924d;
        if (TextUtils.isEmpty(zzhx.f46899a.mo55184A().mo55064r())) {
            zzhx.mo55348F(bundle, 0, j);
        } else {
            zzhx.f46899a.mo55221z().mo55104v().mo55091a("Using developer consent only; google app id found");
        }
    }
}
