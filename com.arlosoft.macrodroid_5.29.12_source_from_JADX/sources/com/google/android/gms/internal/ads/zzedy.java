package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzedy implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzfzp f33772a;

    /* renamed from: c */
    public final /* synthetic */ zzfzp f33773c;

    public /* synthetic */ zzedy(zzfzp zzfzp, zzfzp zzfzp2) {
        this.f33772a = zzfzp;
        this.f33773c = zzfzp2;
    }

    public final Object call() {
        return new zzeeq((JSONObject) this.f33772a.get(), (zzcbf) this.f33773c.get());
    }
}
