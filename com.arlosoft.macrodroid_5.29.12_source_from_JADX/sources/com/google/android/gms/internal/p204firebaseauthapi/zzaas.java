package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaas implements zzxm {

    /* renamed from: a */
    private final String f39525a;

    /* renamed from: c */
    private final String f39526c = Preconditions.m4484g("phone");
    @Nullable

    /* renamed from: d */
    private final String f39527d;
    @Nullable

    /* renamed from: f */
    private final String f39528f;
    @Nullable

    /* renamed from: g */
    private final String f39529g;
    @Nullable

    /* renamed from: o */
    private final String f39530o;
    @Nullable

    /* renamed from: p */
    private zzza f39531p;

    private zzaas(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f39525a = Preconditions.m4484g(str);
        this.f39527d = str3;
        this.f39528f = str4;
        this.f39529g = str5;
        this.f39530o = str6;
    }

    /* renamed from: a */
    public static zzaas m56051a(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Preconditions.m4484g(str2);
        return new zzaas(str, "phone", str2, str3, str4, str5);
    }

    @Nullable
    /* renamed from: b */
    public final String mo48799b() {
        return this.f39528f;
    }

    /* renamed from: c */
    public final void mo48800c(zzza zzza) {
        this.f39531p = zzza;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f39525a);
        this.f39526c.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f39527d != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f39527d);
            if (!TextUtils.isEmpty(this.f39529g)) {
                jSONObject2.put("recaptchaToken", this.f39529g);
            }
            if (!TextUtils.isEmpty(this.f39530o)) {
                jSONObject2.put("safetyNetToken", this.f39530o);
            }
            zzza zzza = this.f39531p;
            if (zzza != null) {
                jSONObject2.put("autoRetrievalInfo", zzza.mo50087a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
