package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaar */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaar implements zzxn {

    /* renamed from: o */
    private static final String f39519o = "zzaar";

    /* renamed from: a */
    private String f39520a;

    /* renamed from: c */
    private String f39521c;

    /* renamed from: d */
    private String f39522d;

    /* renamed from: f */
    private String f39523f;

    /* renamed from: g */
    private long f39524g;

    /* renamed from: a */
    public final long mo48796a() {
        return this.f39524g;
    }

    /* renamed from: b */
    public final String mo48797b() {
        return this.f39520a;
    }

    @NonNull
    /* renamed from: c */
    public final String mo48798c() {
        return this.f39523f;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39520a = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39521c = Strings.m4911a(jSONObject.optString("displayName", (String) null));
            this.f39522d = Strings.m4911a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            this.f39523f = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            this.f39524g = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39519o, str);
        }
    }
}
