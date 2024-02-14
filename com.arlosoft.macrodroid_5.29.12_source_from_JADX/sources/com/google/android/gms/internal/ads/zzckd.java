package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzckd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzciy f28731a;

    /* renamed from: c */
    public final /* synthetic */ Map f28732c;

    public /* synthetic */ zzckd(zzciy zzciy, Map map) {
        this.f28731a = zzciy;
        this.f28732c = map;
    }

    public final void run() {
        zzciy zzciy = this.f28731a;
        Map map = this.f28732c;
        int i = zzckg.f28735N;
        zzciy.mo42954y("onGcacheInfoEvent", map);
    }
}
