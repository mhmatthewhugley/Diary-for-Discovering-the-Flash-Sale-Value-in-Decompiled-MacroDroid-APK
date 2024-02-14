package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcfv extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ zzcfy f28379a;

    zzcfv(zzcfy zzcfy) {
        this.f28379a = zzcfy;
    }

    public final void onAvailable(Network network) {
        this.f28379a.f28395m.set(true);
    }

    public final void onLost(Network network) {
        this.f28379a.f28395m.set(false);
    }
}
