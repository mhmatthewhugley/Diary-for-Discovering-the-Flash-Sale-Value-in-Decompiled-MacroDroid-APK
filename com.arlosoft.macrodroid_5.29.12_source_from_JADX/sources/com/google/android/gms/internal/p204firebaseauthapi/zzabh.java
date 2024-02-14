package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabh implements zzxn {

    /* renamed from: s */
    private static final String f39609s = "zzabh";

    /* renamed from: a */
    private String f39610a;

    /* renamed from: c */
    private String f39611c;

    /* renamed from: d */
    private long f39612d;

    /* renamed from: f */
    private String f39613f;

    /* renamed from: g */
    private boolean f39614g;

    /* renamed from: o */
    private String f39615o;

    /* renamed from: p */
    private String f39616p;

    /* renamed from: a */
    public final long mo48848a() {
        return this.f39612d;
    }

    @Nullable
    /* renamed from: b */
    public final String mo48849b() {
        return this.f39610a;
    }

    @Nullable
    /* renamed from: c */
    public final String mo48850c() {
        return this.f39616p;
    }

    @Nullable
    /* renamed from: d */
    public final String mo48851d() {
        return this.f39611c;
    }

    @Nullable
    /* renamed from: e */
    public final String mo48852e() {
        return this.f39615o;
    }

    /* renamed from: f */
    public final boolean mo48853f() {
        return this.f39614g;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39610a = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39611c = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            this.f39612d = jSONObject.optLong("expiresIn", 0);
            this.f39613f = Strings.m4911a(jSONObject.optString("localId", (String) null));
            this.f39614g = jSONObject.optBoolean("isNewUser", false);
            this.f39615o = Strings.m4911a(jSONObject.optString("temporaryProof", (String) null));
            this.f39616p = Strings.m4911a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39609s, str);
        }
    }
}
