package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcvi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcmp f31657a;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f31658c;

    public /* synthetic */ zzcvi(zzcmp zzcmp, JSONObject jSONObject) {
        this.f31657a = zzcmp;
        this.f31658c = jSONObject;
    }

    public final void run() {
        this.f31657a.mo42972d1("AFMA_updateActiveView", this.f31658c);
    }
}
