package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdrb implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzdrd f32849a;

    /* renamed from: c */
    public final /* synthetic */ zzfdw f32850c;

    /* renamed from: d */
    public final /* synthetic */ zzfdk f32851d;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f32852f;

    public /* synthetic */ zzdrb(zzdrd zzdrd, zzfdw zzfdw, zzfdk zzfdk, JSONObject jSONObject) {
        this.f32849a = zzdrd;
        this.f32850c = zzfdw;
        this.f32851d = zzfdk;
        this.f32852f = jSONObject;
    }

    public final Object call() {
        zzfdw zzfdw = this.f32850c;
        zzfdk zzfdk = this.f32851d;
        JSONObject jSONObject = this.f32852f;
        zzdoq zzdoq = new zzdoq();
        zzdoq.mo44842v(jSONObject.optInt("template_id", -1));
        zzdoq.mo44829i(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdoq.mo44839s(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfef zzfef = zzfdw.f35589a.f35583a;
        if (zzfef.f35632g.contains(Integer.toString(zzdoq.mo44798K()))) {
            if (zzdoq.mo44798K() == 3) {
                if (zzdoq.mo44826g0() == null) {
                    throw new zzekr(1, "No custom template id for custom template ad response.");
                } else if (!zzfef.f35633h.contains(zzdoq.mo44826g0())) {
                    throw new zzekr(1, "Unexpected custom template id in the response.");
                }
            }
            zzdoq.mo44840t(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzfdk.f35506N) {
                zzt.m2905r();
                optString = zzs.m2745S() + " : " + optString;
            }
            zzdoq.mo44841u("headline", optString);
            zzdoq.mo44841u("body", jSONObject.optString("body", (String) null));
            zzdoq.mo44841u("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdoq.mo44841u("store", jSONObject.optString("store", (String) null));
            zzdoq.mo44841u("price", jSONObject.optString("price", (String) null));
            zzdoq.mo44841u("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdoq;
        }
        throw new zzekr(1, "Invalid template ID: " + zzdoq.mo44798K());
    }
}
