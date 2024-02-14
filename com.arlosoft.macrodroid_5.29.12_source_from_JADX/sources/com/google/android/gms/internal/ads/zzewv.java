package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzewv implements zzeve {

    /* renamed from: a */
    private final JSONObject f35115a;

    zzewv(Context context) {
        this.f35115a = zzcbm.m44804c(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo45495a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f35115a);
        } catch (JSONException unused) {
            zze.m2645k("Failed putting version constants.");
        }
    }

    public final int zza() {
        return 46;
    }

    public final zzfzp zzb() {
        return zzfzg.m51414i(new zzewu(this));
    }
}
