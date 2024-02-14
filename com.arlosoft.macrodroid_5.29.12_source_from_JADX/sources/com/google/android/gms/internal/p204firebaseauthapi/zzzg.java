package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzg implements zzxm {

    /* renamed from: f */
    private static final Logger f40692f = new Logger(zzzg.class.getSimpleName(), new String[0]);

    /* renamed from: a */
    private final String f40693a;

    /* renamed from: c */
    private final String f40694c;
    @Nullable

    /* renamed from: d */
    private final String f40695d;

    public zzzg(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        this.f40693a = Preconditions.m4484g(emailAuthCredential.mo22584q2());
        this.f40694c = Preconditions.m4484g(emailAuthCredential.mo22586s2());
        this.f40695d = str;
    }

    public final String zza() throws JSONException {
        ActionCodeUrl c = ActionCodeUrl.m5954c(this.f40694c);
        String str = null;
        String a = c != null ? c.mo22572a() : null;
        if (c != null) {
            str = c.mo22574d();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f40693a);
        if (a != null) {
            jSONObject.put("oobCode", a);
        }
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f40695d;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        return jSONObject.toString();
    }
}
