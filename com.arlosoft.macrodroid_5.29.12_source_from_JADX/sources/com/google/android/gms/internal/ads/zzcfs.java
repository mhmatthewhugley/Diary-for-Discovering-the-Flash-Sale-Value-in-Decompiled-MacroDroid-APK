package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcfs {

    /* renamed from: a */
    private final List f28367a = new ArrayList();

    /* renamed from: b */
    private final List f28368b = new ArrayList();

    /* renamed from: c */
    private final Map f28369c = new HashMap();

    /* renamed from: d */
    private String f28370d;

    /* renamed from: e */
    private String f28371e;

    /* renamed from: f */
    private long f28372f;

    /* renamed from: g */
    private JSONObject f28373g;

    /* renamed from: h */
    private boolean f28374h = false;

    /* renamed from: i */
    private final List f28375i = new ArrayList();

    /* renamed from: j */
    private boolean f28376j = false;

    public zzcfs(String str, long j) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        this.f28371e = str;
        this.f28372f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f28373g = jSONObject;
                if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                    this.f28374h = false;
                    zzcgp.m45229g("App settings could not be fetched successfully.");
                    return;
                }
                this.f28374h = true;
                this.f28370d = this.f28373g.optString("app_id");
                JSONArray optJSONArray2 = this.f28373g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f28368b.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject2 = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f28369c.put(optString2, new zzbvf(optJSONObject2));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f28373g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                        this.f28367a.add(optJSONArray3.optString(i2));
                    }
                }
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27040X5)).booleanValue()) {
                    JSONObject optJSONObject3 = this.f28373g.optJSONObject("common_settings");
                    if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("loeid")) == null)) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            this.f28375i.add(optJSONArray.get(i3).toString());
                        }
                    }
                }
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27247s5)).booleanValue() && (optJSONObject = this.f28373g.optJSONObject("common_settings")) != null) {
                    this.f28376j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                zzcgp.m45230h("Exception occurred while processing app setting json", e);
                zzt.m2904q().mo43503t(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo43476a() {
        return this.f28372f;
    }

    /* renamed from: b */
    public final String mo43477b() {
        return this.f28370d;
    }

    /* renamed from: c */
    public final String mo43478c() {
        return this.f28371e;
    }

    /* renamed from: d */
    public final List mo43479d() {
        return this.f28375i;
    }

    /* renamed from: e */
    public final Map mo43480e() {
        return this.f28369c;
    }

    /* renamed from: f */
    public final JSONObject mo43481f() {
        return this.f28373g;
    }

    /* renamed from: g */
    public final void mo43482g(long j) {
        this.f28372f = j;
    }

    /* renamed from: h */
    public final boolean mo43483h() {
        return this.f28376j;
    }

    /* renamed from: i */
    public final boolean mo43484i() {
        return this.f28374h;
    }
}
