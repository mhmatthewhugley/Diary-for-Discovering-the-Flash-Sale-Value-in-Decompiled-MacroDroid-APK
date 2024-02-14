package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzza */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzza {

    /* renamed from: a */
    private final String f40678a;

    public zzza(String str) {
        this.f40678a = Preconditions.m4484g(str);
    }

    /* renamed from: a */
    public final JSONObject mo50087a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.f40678a);
        return jSONObject;
    }
}
