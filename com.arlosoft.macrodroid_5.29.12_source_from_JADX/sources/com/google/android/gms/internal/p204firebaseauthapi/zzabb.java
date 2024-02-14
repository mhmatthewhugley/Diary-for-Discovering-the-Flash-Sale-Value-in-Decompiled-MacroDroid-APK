package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabb implements zzxm {

    /* renamed from: a */
    private final String f39583a;
    @Nullable

    /* renamed from: c */
    private final String f39584c;

    public zzabb(String str, @Nullable String str2) {
        this.f39583a = Preconditions.m4484g(str);
        this.f39584c = str2;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f39583a);
        jSONObject.put("returnSecureToken", true);
        String str = this.f39584c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
