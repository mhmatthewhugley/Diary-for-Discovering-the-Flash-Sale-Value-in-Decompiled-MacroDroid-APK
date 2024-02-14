package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzk implements zzxm {

    /* renamed from: a */
    private final String f40713a = Preconditions.m4484g("phone");

    /* renamed from: c */
    private final String f40714c;
    @Nullable

    /* renamed from: d */
    private final String f40715d;
    @Nullable

    /* renamed from: f */
    private final String f40716f;

    @VisibleForTesting
    zzzk(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f40714c = Preconditions.m4484g(str2);
        this.f40715d = str3;
        this.f40716f = str4;
    }

    /* renamed from: a */
    public static zzzk m58543a(String str, String str2, String str3) {
        Preconditions.m4484g(str3);
        Preconditions.m4484g(str2);
        return new zzzk("phone", str, str2, str3, (String) null, (String) null);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f40713a.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f40714c);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f40715d;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f40716f;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
