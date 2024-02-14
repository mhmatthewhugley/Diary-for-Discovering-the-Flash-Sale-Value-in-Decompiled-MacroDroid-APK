package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabi implements zzxm {

    /* renamed from: a */
    private final String f39617a;

    /* renamed from: c */
    private final String f39618c;

    public zzabi(String str, String str2) {
        this.f39617a = Preconditions.m4484g(str);
        this.f39618c = Preconditions.m4484g(str2);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f39617a);
        jSONObject.put("mfaEnrollmentId", this.f39618c);
        return jSONObject.toString();
    }
}
