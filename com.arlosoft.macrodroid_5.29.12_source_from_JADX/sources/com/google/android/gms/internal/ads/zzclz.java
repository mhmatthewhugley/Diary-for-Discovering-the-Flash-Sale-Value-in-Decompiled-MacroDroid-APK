package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzclz implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzciy f28929a;

    /* renamed from: c */
    public final /* synthetic */ Map f28930c;

    public /* synthetic */ zzclz(zzciy zzciy, Map map) {
        this.f28929a = zzciy;
        this.f28930c = map;
    }

    public final void run() {
        zzciy zzciy = this.f28929a;
        Map map = this.f28930c;
        int i = zzcmc.f28951M;
        zzciy.mo42954y("onGcacheInfoEvent", map);
    }
}
