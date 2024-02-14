package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzn implements zzxm {

    /* renamed from: a */
    private final String f40723a = zzzm.REFRESH_TOKEN.toString();

    /* renamed from: c */
    private final String f40724c;

    public zzzn(String str) {
        this.f40724c = Preconditions.m4484g(str);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f40723a);
        jSONObject.put("refreshToken", this.f40724c);
        return jSONObject.toString();
    }
}
