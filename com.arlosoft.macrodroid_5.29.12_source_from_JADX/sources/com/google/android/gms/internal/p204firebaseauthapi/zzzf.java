package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzf implements zzxm {

    /* renamed from: a */
    private final String f40691a;

    public zzzf(String str) {
        this.f40691a = Preconditions.m4484g(str);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f40691a);
        return jSONObject.toString();
    }
}
