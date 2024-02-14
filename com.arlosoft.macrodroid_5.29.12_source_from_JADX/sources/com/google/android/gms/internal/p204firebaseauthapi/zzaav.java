package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaav */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaav implements zzxn {

    /* renamed from: c */
    private static final String f39542c = "zzaav";

    /* renamed from: a */
    private String f39543a;

    /* renamed from: a */
    public final String mo48804a() {
        return this.f39543a;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.f39543a = Strings.m4911a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39542c, str);
        }
    }
}
