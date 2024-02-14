package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzi implements zzxm {

    /* renamed from: a */
    private final String f40705a = Preconditions.m4484g("phone");

    /* renamed from: c */
    private String f40706c;
    @Nullable

    /* renamed from: d */
    private final String f40707d;
    @Nullable

    /* renamed from: f */
    private final String f40708f;
    @Nullable

    /* renamed from: g */
    private final String f40709g;

    @VisibleForTesting
    zzzi(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.f40706c = Preconditions.m4484g(str2);
        this.f40707d = str3;
        this.f40709g = str4;
        this.f40708f = str7;
    }

    /* renamed from: a */
    public static zzzi m58538a(String str, String str2, String str3, @Nullable String str4) {
        Preconditions.m4484g(str3);
        Preconditions.m4484g(str2);
        return new zzzi("phone", str, str2, str3, (String) null, (String) null, str4);
    }

    /* renamed from: b */
    public final zzzi mo50102b(String str) {
        this.f40706c = str;
        return this;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f40706c);
        this.f40705a.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.f40708f;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f40707d;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f40709g;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
