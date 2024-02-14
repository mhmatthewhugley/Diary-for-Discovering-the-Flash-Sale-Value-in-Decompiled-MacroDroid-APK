package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzen extends zzkh {
    public zzen(zzkt zzkt) {
        super(zzkt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo54913j() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo55111k() {
        mo55503f();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f46899a.mo55202c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
