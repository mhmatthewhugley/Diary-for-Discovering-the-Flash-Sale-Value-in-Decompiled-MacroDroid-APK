package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzh implements zzxn {

    /* renamed from: z */
    private static final String f40696z = "zzzh";

    /* renamed from: a */
    private String f40697a;

    /* renamed from: c */
    private String f40698c;

    /* renamed from: d */
    private String f40699d;

    /* renamed from: f */
    private String f40700f;

    /* renamed from: g */
    private boolean f40701g;

    /* renamed from: o */
    private long f40702o;
    @Nullable

    /* renamed from: p */
    private List f40703p;
    @Nullable

    /* renamed from: s */
    private String f40704s;

    /* renamed from: a */
    public final long mo50095a() {
        return this.f40702o;
    }

    @NonNull
    /* renamed from: b */
    public final String mo50096b() {
        return this.f40699d;
    }

    @Nullable
    /* renamed from: c */
    public final String mo50097c() {
        return this.f40704s;
    }

    @NonNull
    /* renamed from: d */
    public final String mo50098d() {
        return this.f40700f;
    }

    @Nullable
    /* renamed from: e */
    public final List mo50099e() {
        return this.f40703p;
    }

    /* renamed from: f */
    public final boolean mo50100f() {
        return !TextUtils.isEmpty(this.f40704s);
    }

    /* renamed from: g */
    public final boolean mo50101g() {
        return this.f40701g;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40697a = jSONObject.optString("localId", (String) null);
            this.f40698c = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null);
            this.f40699d = jSONObject.optString("idToken", (String) null);
            this.f40700f = jSONObject.optString("refreshToken", (String) null);
            this.f40701g = jSONObject.optBoolean("isNewUser", false);
            this.f40702o = jSONObject.optLong("expiresIn", 0);
            this.f40703p = zzaac.m55995q2(jSONObject.optJSONArray("mfaInfo"));
            this.f40704s = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f40696z, str);
        }
    }
}
