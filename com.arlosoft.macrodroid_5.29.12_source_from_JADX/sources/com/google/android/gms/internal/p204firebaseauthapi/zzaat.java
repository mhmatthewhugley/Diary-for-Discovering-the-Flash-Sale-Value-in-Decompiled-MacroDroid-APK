package com.google.android.gms.internal.p204firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaat */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaat implements zzxn {

    /* renamed from: c */
    private static final String f39532c = "zzaat";

    /* renamed from: a */
    private String f39533a;

    /* renamed from: a */
    public final String mo48801a() {
        return this.f39533a;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.f39533a = zzag.m56867a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39532c, str);
        }
    }
}
