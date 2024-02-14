package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdapterResponseInfo {

    /* renamed from: a */
    private final zzu f1697a;
    @Nullable

    /* renamed from: b */
    private final AdError f1698b;

    private AdapterResponseInfo(zzu zzu) {
        this.f1697a = zzu;
        zze zze = zzu.f2040d;
        this.f1698b = zze == null ? null : zze.mo20073l2();
    }

    @Nullable
    /* renamed from: e */
    public static AdapterResponseInfo m1716e(@Nullable zzu zzu) {
        if (zzu != null) {
            return new AdapterResponseInfo(zzu);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public String mo19698a() {
        return this.f1697a.f2043o;
    }

    @NonNull
    /* renamed from: b */
    public String mo19699b() {
        return this.f1697a.f2045s;
    }

    @NonNull
    /* renamed from: c */
    public String mo19700c() {
        return this.f1697a.f2044p;
    }

    @NonNull
    /* renamed from: d */
    public String mo19701d() {
        return this.f1697a.f2042g;
    }

    @NonNull
    /* renamed from: f */
    public final JSONObject mo19702f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f1697a.f2038a);
        jSONObject.put("Latency", this.f1697a.f2039c);
        String d = mo19701d();
        if (d == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", d);
        }
        String a = mo19698a();
        if (a == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", a);
        }
        String c = mo19700c();
        if (c == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", c);
        }
        String b = mo19699b();
        if (b == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", b);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f1697a.f2041f.keySet()) {
            jSONObject2.put(str, this.f1697a.f2041f.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f1698b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.mo19649e());
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return mo19702f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
