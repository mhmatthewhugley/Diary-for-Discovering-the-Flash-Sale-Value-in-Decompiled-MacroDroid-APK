package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzc implements zzxm {

    /* renamed from: a */
    private final String f40681a;

    /* renamed from: c */
    private final String f40682c = "http://localhost";
    @Nullable

    /* renamed from: d */
    private final String f40683d;

    public zzzc(String str, @Nullable String str2) {
        this.f40681a = Preconditions.m4484g(str);
        this.f40683d = str2;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f40681a);
        jSONObject.put("continueUri", this.f40682c);
        String str = this.f40683d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
