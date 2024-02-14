package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaap */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaap implements zzxn {

    /* renamed from: A */
    private static final String f39506A = "zzaap";

    /* renamed from: a */
    private String f39507a;

    /* renamed from: c */
    private String f39508c;

    /* renamed from: d */
    private Boolean f39509d;

    /* renamed from: f */
    private String f39510f;

    /* renamed from: g */
    private String f39511g;

    /* renamed from: o */
    private zzaag f39512o;

    /* renamed from: p */
    private String f39513p;

    /* renamed from: s */
    private String f39514s;

    /* renamed from: z */
    private long f39515z;

    /* renamed from: a */
    public final long mo48791a() {
        return this.f39515z;
    }

    @Nullable
    /* renamed from: b */
    public final String mo48792b() {
        return this.f39507a;
    }

    @Nullable
    /* renamed from: c */
    public final String mo48793c() {
        return this.f39513p;
    }

    @Nullable
    /* renamed from: d */
    public final String mo48794d() {
        return this.f39514s;
    }

    @Nullable
    /* renamed from: e */
    public final List mo48795e() {
        zzaag zzaag = this.f39512o;
        if (zzaag != null) {
            return zzaag.mo48751n2();
        }
        return null;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39507a = Strings.m4911a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            this.f39508c = Strings.m4911a(jSONObject.optString("passwordHash", (String) null));
            this.f39509d = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.f39510f = Strings.m4911a(jSONObject.optString("displayName", (String) null));
            this.f39511g = Strings.m4911a(jSONObject.optString("photoUrl", (String) null));
            this.f39512o = zzaag.m56009l2(jSONObject.optJSONArray("providerUserInfo"));
            this.f39513p = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39514s = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            this.f39515z = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39506A, str);
        }
    }
}
