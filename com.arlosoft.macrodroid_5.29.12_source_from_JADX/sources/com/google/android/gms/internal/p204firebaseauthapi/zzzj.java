package com.google.android.gms.internal.p204firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzj implements zzxn {

    /* renamed from: d */
    private static final String f40710d = "zzzj";

    /* renamed from: a */
    private String f40711a;

    /* renamed from: c */
    private String f40712c;

    /* renamed from: a */
    public final String mo50103a() {
        return this.f40711a;
    }

    /* renamed from: b */
    public final String mo50104b() {
        return this.f40712c;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40711a = jSONObject.optString("idToken", (String) null);
            this.f40712c = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f40710d, str);
        }
    }
}
