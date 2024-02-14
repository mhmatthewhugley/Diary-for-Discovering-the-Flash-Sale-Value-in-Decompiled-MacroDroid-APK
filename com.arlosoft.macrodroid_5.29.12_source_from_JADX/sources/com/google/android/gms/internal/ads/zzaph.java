package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaph extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ zzapi f25253a;

    zzaph(zzapi zzapi) {
        this.f25253a = zzapi;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzapi.class) {
            this.f25253a.f25254a = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzapi.class) {
            this.f25253a.f25254a = null;
        }
    }
}
