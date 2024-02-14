package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabg implements zzxm {

    /* renamed from: a */
    private String f39603a;

    /* renamed from: c */
    private String f39604c;

    /* renamed from: d */
    private String f39605d;

    /* renamed from: f */
    private String f39606f;

    /* renamed from: g */
    private String f39607g;

    /* renamed from: o */
    private boolean f39608o;

    private zzabg() {
    }

    /* renamed from: a */
    public static zzabg m56097a(String str, String str2, boolean z) {
        zzabg zzabg = new zzabg();
        zzabg.f39604c = Preconditions.m4484g(str);
        zzabg.f39605d = Preconditions.m4484g(str2);
        zzabg.f39608o = z;
        return zzabg;
    }

    /* renamed from: b */
    public static zzabg m56098b(String str, String str2, boolean z) {
        zzabg zzabg = new zzabg();
        zzabg.f39603a = Preconditions.m4484g(str);
        zzabg.f39606f = Preconditions.m4484g(str2);
        zzabg.f39608o = z;
        return zzabg;
    }

    /* renamed from: c */
    public final void mo48847c(String str) {
        this.f39607g = str;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f39606f)) {
            jSONObject.put("phoneNumber", this.f39603a);
            jSONObject.put("temporaryProof", this.f39606f);
        } else {
            jSONObject.put("sessionInfo", this.f39604c);
            jSONObject.put("code", this.f39605d);
        }
        String str = this.f39607g;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f39608o) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
