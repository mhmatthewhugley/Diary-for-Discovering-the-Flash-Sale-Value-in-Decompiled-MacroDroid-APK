package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewd implements zzevd {

    /* renamed from: a */
    private final JSONObject f35070a;

    public zzewd(JSONObject jSONObject) {
        this.f35070a = jSONObject;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            JSONObject f = zzbu.m2596f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f35070a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            zze.m2645k("Failed putting app indexing json.");
        }
    }
}
