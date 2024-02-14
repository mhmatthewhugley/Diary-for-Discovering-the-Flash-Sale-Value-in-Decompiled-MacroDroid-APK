package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabf implements zzxn {

    /* renamed from: A */
    private static final String f39593A = "zzabf";

    /* renamed from: a */
    private String f39594a;

    /* renamed from: c */
    private String f39595c;

    /* renamed from: d */
    private String f39596d;

    /* renamed from: f */
    private String f39597f;

    /* renamed from: g */
    private String f39598g;

    /* renamed from: o */
    private String f39599o;

    /* renamed from: p */
    private long f39600p;

    /* renamed from: s */
    private List f39601s;

    /* renamed from: z */
    private String f39602z;

    /* renamed from: a */
    public final long mo48841a() {
        return this.f39600p;
    }

    @NonNull
    /* renamed from: b */
    public final String mo48842b() {
        return this.f39597f;
    }

    /* renamed from: c */
    public final String mo48843c() {
        return this.f39602z;
    }

    @NonNull
    /* renamed from: d */
    public final String mo48844d() {
        return this.f39599o;
    }

    /* renamed from: e */
    public final List mo48845e() {
        return this.f39601s;
    }

    /* renamed from: f */
    public final boolean mo48846f() {
        return !TextUtils.isEmpty(this.f39602z);
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39594a = Strings.m4911a(jSONObject.optString("localId", (String) null));
            this.f39595c = Strings.m4911a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            this.f39596d = Strings.m4911a(jSONObject.optString("displayName", (String) null));
            this.f39597f = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39598g = Strings.m4911a(jSONObject.optString("photoUrl", (String) null));
            this.f39599o = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            this.f39600p = jSONObject.optLong("expiresIn", 0);
            this.f39601s = zzaac.m55995q2(jSONObject.optJSONArray("mfaInfo"));
            this.f39602z = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39593A, str);
        }
    }
}
