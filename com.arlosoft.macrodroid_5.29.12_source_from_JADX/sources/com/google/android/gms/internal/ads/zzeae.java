package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeae {

    /* renamed from: a */
    private final String f33527a;

    /* renamed from: b */
    private final String f33528b;

    /* renamed from: c */
    private final String f33529c;

    /* renamed from: d */
    private final int f33530d;

    /* renamed from: e */
    private final String f33531e;

    /* renamed from: f */
    private final int f33532f;

    /* renamed from: g */
    private final boolean f33533g;

    public zzeae(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.f33527a = str;
        this.f33528b = str2;
        this.f33529c = str3;
        this.f33530d = i;
        this.f33531e = str4;
        this.f33532f = i2;
        this.f33533g = z;
    }

    /* renamed from: a */
    public final JSONObject mo45119a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f33527a);
        jSONObject.put(ClientCookie.VERSION_ATTR, this.f33529c);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27051Y7)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f33528b);
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f33530d);
        jSONObject.put("description", this.f33531e);
        jSONObject.put("initializationLatencyMillis", this.f33532f);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27060Z7)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f33533g);
        }
        return jSONObject;
    }
}
