package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzf implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzg f39421a;

    /* renamed from: c */
    public final /* synthetic */ String f39422c;

    /* renamed from: d */
    public final /* synthetic */ JSONObject f39423d;

    public /* synthetic */ zzf(zzg zzg, String str, JSONObject jSONObject) {
        this.f39421a = zzg;
        this.f39422c = str;
        this.f39423d = jSONObject;
    }

    public final Object call() {
        return Boolean.valueOf(this.f39421a.mo48672a(this.f39422c, this.f39423d));
    }
}
