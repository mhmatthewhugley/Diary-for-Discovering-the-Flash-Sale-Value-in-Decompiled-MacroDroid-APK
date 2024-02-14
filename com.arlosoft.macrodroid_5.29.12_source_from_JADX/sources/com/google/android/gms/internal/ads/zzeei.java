package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeei implements zzbud {
    zzeei() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ JSONObject mo42999c(Object obj) throws JSONException {
        zzeej zzeej = (zzeej) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27042X7)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzeej.f33800c.mo43281e());
            jSONObject2.put("ad_request_post_body", zzeej.f33800c.mo43280d());
        }
        jSONObject2.put("base_url", zzeej.f33800c.mo43278b());
        jSONObject2.put("signals", zzeej.f33799b);
        jSONObject3.put("body", zzeej.f33798a.f33826c);
        jSONObject3.put("headers", zzaw.m1917b().mo43550i(zzeej.f33798a.f33825b));
        jSONObject3.put("response_code", zzeej.f33798a.f33824a);
        jSONObject3.put("latency", zzeej.f33798a.f33827d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzeej.f33800c.mo43283g());
        return jSONObject;
    }
}
