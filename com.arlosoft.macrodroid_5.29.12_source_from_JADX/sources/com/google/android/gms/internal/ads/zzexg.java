package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzexg implements zzevd {

    /* renamed from: a */
    private final Bundle f35136a;

    public zzexg(Bundle bundle) {
        this.f35136a = bundle;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f35136a != null) {
            try {
                zzbu.m2596f(zzbu.m2596f(jSONObject, "device"), "play_store").put("parental_controls", zzaw.m1917b().mo43549h(this.f35136a));
            } catch (JSONException unused) {
                zze.m2645k("Failed putting parental controls bundle.");
            }
        }
    }
}
