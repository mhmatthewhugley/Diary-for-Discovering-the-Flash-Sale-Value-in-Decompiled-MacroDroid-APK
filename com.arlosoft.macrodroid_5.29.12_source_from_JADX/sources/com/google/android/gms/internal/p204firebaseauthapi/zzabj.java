package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabj implements zzxn {

    /* renamed from: d */
    private static final String f39619d = "zzabj";

    /* renamed from: a */
    private String f39620a;

    /* renamed from: c */
    private String f39621c;

    /* renamed from: a */
    public final String mo48854a() {
        return this.f39620a;
    }

    /* renamed from: b */
    public final String mo48855b() {
        return this.f39621c;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39620a = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39621c = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39619d, str);
        }
    }
}
