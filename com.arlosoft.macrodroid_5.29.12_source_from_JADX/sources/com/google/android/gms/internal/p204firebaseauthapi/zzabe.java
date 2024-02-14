package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabe */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabe implements zzxm {

    /* renamed from: a */
    private final String f39590a;

    /* renamed from: c */
    private final String f39591c;
    @Nullable

    /* renamed from: d */
    private final String f39592d;

    public zzabe(String str, String str2, @Nullable String str3) {
        this.f39590a = Preconditions.m4484g(str);
        this.f39591c = Preconditions.m4484g(str2);
        this.f39592d = str3;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f39590a);
        jSONObject.put("password", this.f39591c);
        jSONObject.put("returnSecureToken", true);
        String str = this.f39592d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
