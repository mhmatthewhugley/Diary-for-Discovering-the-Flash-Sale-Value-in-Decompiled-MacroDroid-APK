package com.google.android.gms.internal.p204firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzl implements zzxn {

    /* renamed from: d */
    private static final String f40717d = "zzzl";

    /* renamed from: a */
    private String f40718a;

    /* renamed from: c */
    private String f40719c;

    /* renamed from: a */
    public final String mo50105a() {
        return this.f40718a;
    }

    /* renamed from: b */
    public final String mo50106b() {
        return this.f40719c;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40718a = jSONObject.optString("idToken", (String) null);
            this.f40719c = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f40717d, str);
        }
    }
}
