package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzerr implements zzevd {

    /* renamed from: a */
    private final JSONObject f34801a;

    /* renamed from: b */
    private final JSONObject f34802b;

    public zzerr(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f34801a = jSONObject;
        this.f34802b = jSONObject2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f34801a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f34802b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
