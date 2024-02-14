package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaau implements zzxm {

    /* renamed from: a */
    private final String f39534a = Preconditions.m4484g("phone");

    /* renamed from: c */
    private final String f39535c;

    /* renamed from: d */
    private final String f39536d;
    @Nullable

    /* renamed from: f */
    private final String f39537f;
    @Nullable

    /* renamed from: g */
    private final String f39538g;
    @Nullable

    /* renamed from: o */
    private final String f39539o;
    @Nullable

    /* renamed from: p */
    private final String f39540p;
    @Nullable

    /* renamed from: s */
    private zzza f39541s;

    private zzaau(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.f39535c = Preconditions.m4484g(str2);
        this.f39536d = Preconditions.m4484g(str3);
        this.f39538g = str4;
        this.f39537f = str5;
        this.f39539o = str6;
        this.f39540p = str7;
    }

    /* renamed from: a */
    public static zzaau m56056a(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Preconditions.m4484g(str3);
        return new zzaau("phone", str, str2, str3, str4, str5, str6);
    }

    @Nullable
    /* renamed from: b */
    public final String mo48802b() {
        return this.f39537f;
    }

    /* renamed from: c */
    public final void mo48803c(zzza zzza) {
        this.f39541s = zzza;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f39535c);
        jSONObject.put("mfaEnrollmentId", this.f39536d);
        this.f39534a.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f39538g != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f39538g);
            if (!TextUtils.isEmpty(this.f39539o)) {
                jSONObject2.put("recaptchaToken", this.f39539o);
            }
            if (!TextUtils.isEmpty(this.f39540p)) {
                jSONObject2.put("safetyNetToken", this.f39540p);
            }
            zzza zzza = this.f39541s;
            if (zzza != null) {
                jSONObject2.put("autoRetrievalInfo", zzza.mo50087a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
