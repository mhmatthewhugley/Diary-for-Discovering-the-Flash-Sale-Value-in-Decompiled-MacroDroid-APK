package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaan */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaan implements zzxn {

    /* renamed from: c */
    private static final String f39495c = "zzaan";

    /* renamed from: a */
    private String f39496a;

    /* renamed from: a */
    public final String mo48777a() {
        return this.f39496a;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            this.f39496a = Strings.m4911a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39495c, str);
        }
    }
}
