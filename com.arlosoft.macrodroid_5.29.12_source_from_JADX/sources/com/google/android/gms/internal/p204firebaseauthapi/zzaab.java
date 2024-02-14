package com.google.android.gms.internal.p204firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaab */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaab {

    /* renamed from: a */
    private String f39460a;

    /* renamed from: b */
    private String f39461b;

    /* renamed from: c */
    private String f39462c;

    /* renamed from: d */
    private Long f39463d;

    /* renamed from: e */
    private Long f39464e;

    /* renamed from: a */
    public static zzaab m55991a(String str) throws UnsupportedEncodingException {
        try {
            zzaab zzaab = new zzaab();
            JSONObject jSONObject = new JSONObject(str);
            zzaab.f39460a = jSONObject.optString("iss");
            zzaab.f39461b = jSONObject.optString("aud");
            zzaab.f39462c = jSONObject.optString("sub");
            zzaab.f39463d = Long.valueOf(jSONObject.optLong("iat"));
            zzaab.f39464e = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzaab;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                "Failed to read JwtToken from JSONObject. ".concat(e.toString());
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e.toString()));
        }
    }

    /* renamed from: b */
    public final Long mo48731b() {
        return this.f39464e;
    }

    /* renamed from: c */
    public final Long mo48732c() {
        return this.f39463d;
    }
}
