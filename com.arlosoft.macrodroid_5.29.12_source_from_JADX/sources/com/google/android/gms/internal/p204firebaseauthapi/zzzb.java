package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzb implements zzxn {

    /* renamed from: c */
    private static final String f40679c = "com.google.android.gms.internal.firebase-auth-api.zzzb";

    /* renamed from: a */
    private String f40680a;

    /* renamed from: a */
    public final zzzb mo50088a(@NonNull String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f40680a = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            String str2 = f40679c;
            String message = e.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzvg("Failed to parse error for string [" + str + "]", e);
        }
    }

    /* renamed from: b */
    public final String mo50089b() {
        return this.f40680a;
    }

    /* renamed from: c */
    public final boolean mo50090c() {
        return !TextUtils.isEmpty(this.f40680a);
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(@NonNull String str) throws zzvg {
        mo50088a(str);
        return this;
    }
}
