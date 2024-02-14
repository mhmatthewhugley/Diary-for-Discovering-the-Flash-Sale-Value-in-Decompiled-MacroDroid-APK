package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbvf {

    /* renamed from: a */
    public final List f27849a;

    /* renamed from: b */
    public final List f27850b;

    /* renamed from: c */
    public final List f27851c;

    /* renamed from: d */
    public final List f27852d;

    /* renamed from: e */
    public final List f27853e;

    /* renamed from: f */
    public final List f27854f;

    /* renamed from: g */
    public final String f27855g;

    /* renamed from: h */
    public final String f27856h;

    public zzbvf(JSONObject jSONObject) throws JSONException {
        if (zzcgp.m45232j(2)) {
            zze.m2645k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbve zzbve = new zzbve(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzbve.f27848v);
                arrayList.add(zzbve);
                if (i < 0) {
                    Iterator it = zzbve.f27829c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f27849a = Collections.unmodifiableList(arrayList);
        this.f27855g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzt.m2896i();
            this.f27850b = zzbvg.m44192a(optJSONObject, "click_urls");
            zzt.m2896i();
            this.f27851c = zzbvg.m44192a(optJSONObject, "imp_urls");
            zzt.m2896i();
            this.f27852d = zzbvg.m44192a(optJSONObject, "downloaded_imp_urls");
            zzt.m2896i();
            this.f27853e = zzbvg.m44192a(optJSONObject, "nofill_urls");
            zzt.m2896i();
            this.f27854f = zzbvg.m44192a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            zzcce l2 = zzcce.m44871l2(optJSONObject.optJSONArray("rewards"));
            if (l2 == null) {
                this.f27856h = null;
            } else {
                this.f27856h = l2.f28207a;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f27850b = null;
        this.f27851c = null;
        this.f27852d = null;
        this.f27853e = null;
        this.f27854f = null;
        this.f27856h = null;
    }
}
