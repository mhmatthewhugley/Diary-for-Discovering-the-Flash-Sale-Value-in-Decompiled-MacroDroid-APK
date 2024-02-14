package com.google.firebase.auth.internal;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbl {
    @VisibleForTesting

    /* renamed from: a */
    static final Map f4653a;

    static {
        HashMap hashMap = new HashMap();
        f4653a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m6228a(Intent intent) {
        Preconditions.m4488k(intent);
        Preconditions.m4478a(m6231d(intent));
        return (Status) SafeParcelableSerializer.m4590b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    /* renamed from: b */
    public static Status m6229b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f4653a;
                if (map.containsKey(string)) {
                    return zzai.m6170a(((String) map.get(string)) + ":" + string2);
                }
            }
            return zzai.m6170a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            return zzai.m6170a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }

    /* renamed from: c */
    public static void m6230c(Intent intent, Status status) {
        SafeParcelableSerializer.m4594f(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: d */
    public static boolean m6231d(Intent intent) {
        Preconditions.m4488k(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
