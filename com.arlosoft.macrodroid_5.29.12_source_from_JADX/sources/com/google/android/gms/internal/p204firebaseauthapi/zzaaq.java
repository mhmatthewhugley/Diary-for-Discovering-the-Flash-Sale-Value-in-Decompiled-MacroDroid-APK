package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaaq implements zzxm {

    /* renamed from: a */
    private String f39516a;

    /* renamed from: c */
    private String f39517c;
    @Nullable

    /* renamed from: d */
    private final String f39518d;

    public zzaaq(@Nullable String str) {
        this.f39518d = str;
    }

    public zzaaq(String str, String str2, @Nullable String str3, @Nullable String str4) {
        this.f39516a = Preconditions.m4484g(str);
        this.f39517c = Preconditions.m4484g(str2);
        this.f39518d = str4;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f39516a;
        if (str != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
        }
        String str2 = this.f39517c;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f39518d;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
