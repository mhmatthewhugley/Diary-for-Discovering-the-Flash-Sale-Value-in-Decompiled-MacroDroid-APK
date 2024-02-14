package com.google.android.gms.internal.ads;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcbf {

    /* renamed from: a */
    private final List f28131a;

    /* renamed from: b */
    private final String f28132b;

    /* renamed from: c */
    private final String f28133c;

    /* renamed from: d */
    private final String f28134d;

    /* renamed from: e */
    private final boolean f28135e;

    /* renamed from: f */
    private final boolean f28136f;

    /* renamed from: g */
    private final String f28137g;

    /* renamed from: h */
    private final String f28138h;

    /* renamed from: i */
    private final String f28139i;

    /* renamed from: j */
    private final int f28140j;

    /* renamed from: k */
    private final JSONObject f28141k;

    /* renamed from: l */
    private final String f28142l;

    /* renamed from: m */
    private final String f28143m;

    public zzcbf(JSONObject jSONObject) {
        List list;
        this.f28139i = jSONObject.optString("url");
        this.f28132b = jSONObject.optString("base_uri");
        this.f28133c = jSONObject.optString("post_parameters");
        this.f28135e = m44787j(jSONObject.optString("drt_include"));
        this.f28136f = m44787j(jSONObject.optString("cookies_include", "true"));
        this.f28137g = jSONObject.optString("request_id");
        this.f28134d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            list = null;
        } else {
            list = Arrays.asList(optString.split(","));
        }
        this.f28131a = list;
        this.f28140j = jSONObject.optInt(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_VALID, 0) == 1 ? -2 : 1;
        this.f28138h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f28141k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f28142l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f28143m = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    private static boolean m44787j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: a */
    public final int mo43277a() {
        return this.f28140j;
    }

    /* renamed from: b */
    public final String mo43278b() {
        return this.f28132b;
    }

    /* renamed from: c */
    public final String mo43279c() {
        return this.f28143m;
    }

    /* renamed from: d */
    public final String mo43280d() {
        return this.f28133c;
    }

    /* renamed from: e */
    public final String mo43281e() {
        return this.f28139i;
    }

    /* renamed from: f */
    public final List mo43282f() {
        return this.f28131a;
    }

    /* renamed from: g */
    public final JSONObject mo43283g() {
        return this.f28141k;
    }

    /* renamed from: h */
    public final boolean mo43284h() {
        return this.f28136f;
    }

    /* renamed from: i */
    public final boolean mo43285i() {
        return this.f28135e;
    }
}
