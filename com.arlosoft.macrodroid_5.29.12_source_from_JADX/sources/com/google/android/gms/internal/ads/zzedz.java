package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzedz implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzfzp f33774a;

    /* renamed from: c */
    public final /* synthetic */ zzfzp f33775c;

    /* renamed from: d */
    public final /* synthetic */ zzfzp f33776d;

    public /* synthetic */ zzedz(zzfzp zzfzp, zzfzp zzfzp2, zzfzp zzfzp3) {
        this.f33774a = zzfzp;
        this.f33775c = zzfzp2;
        this.f33776d = zzfzp3;
    }

    public final Object call() {
        return new zzeej((zzeen) this.f33774a.get(), (JSONObject) this.f33775c.get(), (zzcbf) this.f33776d.get());
    }
}
