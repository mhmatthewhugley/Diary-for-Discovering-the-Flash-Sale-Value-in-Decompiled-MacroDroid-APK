package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaba */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaba implements zzxn {

    /* renamed from: K */
    private static final String f39563K = "zzaba";

    /* renamed from: A */
    private String f39564A;

    /* renamed from: B */
    private boolean f39565B;

    /* renamed from: C */
    private String f39566C;

    /* renamed from: D */
    private String f39567D;

    /* renamed from: E */
    private String f39568E;

    /* renamed from: F */
    private String f39569F;

    /* renamed from: G */
    private String f39570G;

    /* renamed from: H */
    private String f39571H;

    /* renamed from: I */
    private List f39572I;

    /* renamed from: J */
    private String f39573J;

    /* renamed from: a */
    private boolean f39574a;

    /* renamed from: c */
    private String f39575c;

    /* renamed from: d */
    private String f39576d;

    /* renamed from: f */
    private long f39577f;

    /* renamed from: g */
    private String f39578g;

    /* renamed from: o */
    private String f39579o;

    /* renamed from: p */
    private String f39580p;

    /* renamed from: s */
    private String f39581s;

    /* renamed from: z */
    private String f39582z;

    /* renamed from: a */
    public final long mo48819a() {
        return this.f39577f;
    }

    @Nullable
    /* renamed from: b */
    public final zze mo48820b() {
        if (!TextUtils.isEmpty(this.f39566C) || !TextUtils.isEmpty(this.f39567D)) {
            return zze.m6316q2(this.f39582z, this.f39567D, this.f39566C, this.f39570G, this.f39568E);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo48821c() {
        return this.f39579o;
    }

    /* renamed from: d */
    public final String mo48822d() {
        return this.f39569F;
    }

    /* renamed from: e */
    public final String mo48823e() {
        return this.f39575c;
    }

    /* renamed from: f */
    public final String mo48824f() {
        return this.f39573J;
    }

    /* renamed from: g */
    public final String mo48825g() {
        return this.f39582z;
    }

    /* renamed from: h */
    public final String mo48826h() {
        return this.f39564A;
    }

    @Nullable
    /* renamed from: i */
    public final String mo48827i() {
        return this.f39576d;
    }

    @Nullable
    /* renamed from: j */
    public final String mo48828j() {
        return this.f39571H;
    }

    /* renamed from: k */
    public final List mo48829k() {
        return this.f39572I;
    }

    /* renamed from: l */
    public final boolean mo48830l() {
        return !TextUtils.isEmpty(this.f39573J);
    }

    /* renamed from: m */
    public final boolean mo48831m() {
        return this.f39574a;
    }

    /* renamed from: n */
    public final boolean mo48832n() {
        return this.f39565B;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39574a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f39575c = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39576d = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            this.f39577f = jSONObject.optLong("expiresIn", 0);
            this.f39578g = Strings.m4911a(jSONObject.optString("localId", (String) null));
            this.f39579o = Strings.m4911a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            this.f39580p = Strings.m4911a(jSONObject.optString("displayName", (String) null));
            this.f39581s = Strings.m4911a(jSONObject.optString("photoUrl", (String) null));
            this.f39582z = Strings.m4911a(jSONObject.optString("providerId", (String) null));
            this.f39564A = Strings.m4911a(jSONObject.optString("rawUserInfo", (String) null));
            this.f39565B = jSONObject.optBoolean("isNewUser", false);
            this.f39566C = jSONObject.optString("oauthAccessToken", (String) null);
            this.f39567D = jSONObject.optString("oauthIdToken", (String) null);
            this.f39569F = Strings.m4911a(jSONObject.optString("errorMessage", (String) null));
            this.f39570G = Strings.m4911a(jSONObject.optString("pendingToken", (String) null));
            this.f39571H = Strings.m4911a(jSONObject.optString("tenantId", (String) null));
            this.f39572I = zzaac.m55995q2(jSONObject.optJSONArray("mfaInfo"));
            this.f39573J = Strings.m4911a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.f39568E = Strings.m4911a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39563K, str);
        }
    }

    /* renamed from: p */
    public final boolean mo48833p() {
        return this.f39574a || !TextUtils.isEmpty(this.f39569F);
    }
}
