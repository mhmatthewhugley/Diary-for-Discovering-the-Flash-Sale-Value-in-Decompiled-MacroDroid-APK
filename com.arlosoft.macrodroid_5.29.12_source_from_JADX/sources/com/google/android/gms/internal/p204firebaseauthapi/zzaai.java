package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaai implements zzxm {

    /* renamed from: a */
    private final String f39478a;
    @Nullable

    /* renamed from: c */
    private final String f39479c;
    @Nullable

    /* renamed from: d */
    private final String f39480d;

    public zzaai(String str, @Nullable String str2, @Nullable String str3) {
        this.f39478a = Preconditions.m4484g(str);
        this.f39479c = str2;
        this.f39480d = str3;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f39478a);
        String str = this.f39479c;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f39480d;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
