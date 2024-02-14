package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdou extends zzdov {

    /* renamed from: b */
    private final JSONObject f32668b;

    /* renamed from: c */
    private final boolean f32669c;

    /* renamed from: d */
    private final boolean f32670d;

    /* renamed from: e */
    private final boolean f32671e;

    /* renamed from: f */
    private final boolean f32672f;

    /* renamed from: g */
    private final String f32673g;
    @Nullable

    /* renamed from: h */
    private final JSONObject f32674h;

    public zzdou(zzfdk zzfdk, JSONObject jSONObject) {
        super(zzfdk);
        this.f32668b = zzbu.m2597g(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f32669c = zzbu.m2601k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f32670d = zzbu.m2601k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f32671e = zzbu.m2601k(false, jSONObject, "enable_omid");
        this.f32673g = zzbu.m2592b("", jSONObject, "watermark_overlay_png_base64");
        this.f32672f = jSONObject.optJSONObject("overlay") != null ? true : z;
        this.f32674h = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27166k4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    /* renamed from: a */
    public final zzfei mo44847a() {
        JSONObject jSONObject = this.f32674h;
        return jSONObject != null ? new zzfei(jSONObject) : this.f32675a.f35515W;
    }

    /* renamed from: b */
    public final String mo44848b() {
        return this.f32673g;
    }

    @Nullable
    /* renamed from: c */
    public final JSONObject mo44849c() {
        JSONObject jSONObject = this.f32668b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f32675a.f35493A);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean mo44850d() {
        return this.f32671e;
    }

    /* renamed from: e */
    public final boolean mo44851e() {
        return this.f32669c;
    }

    /* renamed from: f */
    public final boolean mo44852f() {
        return this.f32670d;
    }

    /* renamed from: g */
    public final boolean mo44853g() {
        return this.f32672f;
    }
}
