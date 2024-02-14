package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zact f3423a;

    zacq(zact zact) {
        this.f3423a = zact;
    }

    public final void run() {
        this.f3423a.f3433p.mo21492c(new ConnectionResult(4));
    }
}
