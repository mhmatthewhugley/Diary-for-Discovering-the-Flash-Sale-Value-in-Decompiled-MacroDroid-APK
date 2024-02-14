package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdse implements zzbbq {

    /* renamed from: a */
    public final /* synthetic */ zzcmp f32953a;

    public /* synthetic */ zzdse(zzcmp zzcmp) {
        this.f32953a = zzcmp;
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        zzcmp zzcmp = this.f32953a;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != zzbbp.f26529j ? "0" : "1");
        zzcmp.mo42954y("onAdVisibilityChanged", hashMap);
    }
}
