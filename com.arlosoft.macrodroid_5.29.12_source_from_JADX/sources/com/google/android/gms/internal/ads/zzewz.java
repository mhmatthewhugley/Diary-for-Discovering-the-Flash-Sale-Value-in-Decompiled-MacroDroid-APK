package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewz implements zzevd {

    /* renamed from: a */
    private final String f35122a;

    /* renamed from: b */
    private final String f35123b;

    public zzewz(String str, String str2) {
        this.f35122a = str;
        this.f35123b = str2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            JSONObject f = zzbu.m2596f((JSONObject) obj, "pii");
            f.put("doritos", this.f35122a);
            f.put("doritos_v2", this.f35123b);
        } catch (JSONException unused) {
            zze.m2645k("Failed putting doritos string.");
        }
    }
}
