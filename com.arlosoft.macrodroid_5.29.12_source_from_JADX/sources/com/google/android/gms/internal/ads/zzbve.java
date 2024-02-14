package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbve {

    /* renamed from: a */
    public final String f27827a;

    /* renamed from: b */
    public final String f27828b;

    /* renamed from: c */
    public final List f27829c;

    /* renamed from: d */
    public final String f27830d;

    /* renamed from: e */
    public final String f27831e;

    /* renamed from: f */
    public final List f27832f;

    /* renamed from: g */
    public final List f27833g;

    /* renamed from: h */
    public final List f27834h;

    /* renamed from: i */
    public final List f27835i;

    /* renamed from: j */
    public final List f27836j;

    /* renamed from: k */
    public final String f27837k;

    /* renamed from: l */
    public final List f27838l;

    /* renamed from: m */
    public final List f27839m;

    /* renamed from: n */
    public final List f27840n;

    /* renamed from: o */
    public final String f27841o;

    /* renamed from: p */
    public final String f27842p;
    @Nullable

    /* renamed from: q */
    public final String f27843q;
    @Nullable

    /* renamed from: r */
    public final String f27844r;

    /* renamed from: s */
    public final String f27845s;
    @Nullable

    /* renamed from: t */
    public final List f27846t;

    /* renamed from: u */
    public final String f27847u;
    @Nullable

    /* renamed from: v */
    public final String f27848v;

    public zzbve(JSONObject jSONObject) throws JSONException {
        List list;
        this.f27828b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f27829c = Collections.unmodifiableList(arrayList);
        this.f27830d = jSONObject.optString("allocation_id", (String) null);
        zzt.m2896i();
        this.f27832f = zzbvg.m44192a(jSONObject, "clickurl");
        zzt.m2896i();
        this.f27833g = zzbvg.m44192a(jSONObject, "imp_urls");
        zzt.m2896i();
        this.f27834h = zzbvg.m44192a(jSONObject, "downloaded_imp_urls");
        zzt.m2896i();
        this.f27836j = zzbvg.m44192a(jSONObject, "fill_urls");
        zzt.m2896i();
        this.f27838l = zzbvg.m44192a(jSONObject, "video_start_urls");
        zzt.m2896i();
        this.f27840n = zzbvg.m44192a(jSONObject, "video_complete_urls");
        zzt.m2896i();
        this.f27839m = zzbvg.m44192a(jSONObject, "video_reward_urls");
        this.f27841o = jSONObject.optString("transaction_id");
        this.f27842p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzt.m2896i();
            list = zzbvg.m44192a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f27835i = list;
        this.f27827a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.f27837k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f27831e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f27843q = jSONObject.optString("html_template", (String) null);
        this.f27844r = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f27845s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzt.m2896i();
        this.f27846t = zzbvg.m44192a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f27847u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f27848v = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
