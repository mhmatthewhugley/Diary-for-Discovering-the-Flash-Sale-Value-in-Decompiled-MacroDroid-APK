package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdrd {

    /* renamed from: a */
    private final zzfzq f32864a;

    /* renamed from: b */
    private final zzdrq f32865b;

    /* renamed from: c */
    private final zzdrv f32866c;

    public zzdrd(zzfzq zzfzq, zzdrq zzdrq, zzdrv zzdrv) {
        this.f32864a = zzfzq;
        this.f32865b = zzdrq;
        this.f32866c = zzdrv;
    }

    /* renamed from: a */
    public final zzfzp mo44933a(zzfdw zzfdw, zzfdk zzfdk, JSONObject jSONObject) {
        zzfzp n;
        zzfdw zzfdw2 = zzfdw;
        zzfdk zzfdk2 = zzfdk;
        JSONObject jSONObject2 = jSONObject;
        zzfzp F = this.f32864a.mo46579F(new zzdrb(this, zzfdw2, zzfdk2, jSONObject2));
        zzfzp f = this.f32865b.mo44940f(jSONObject2, "images");
        zzfzp g = this.f32865b.mo44941g(jSONObject2, "images", zzfdk2, zzfdw2.f35590b.f35587b);
        zzfzp e = this.f32865b.mo44939e(jSONObject2, "secondary_image");
        zzfzp e2 = this.f32865b.mo44939e(jSONObject2, "app_icon");
        zzfzp d = this.f32865b.mo44938d(jSONObject2, "attribution");
        zzfzp h = this.f32865b.mo44942h(jSONObject2, zzfdk2, zzfdw2.f35590b.f35587b);
        zzdrq zzdrq = this.f32865b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            n = zzfzg.m51414i((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                n = zzfzg.m51414i((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    n = zzfzg.m51414i((Object) null);
                } else {
                    n = zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzdrf(zzdrq, optString), zzchc.f28460e);
                }
            }
        }
        zzfzp zzfzp = n;
        zzfzp a = this.f32866c.mo44944a(jSONObject2, "custom_assets");
        return zzfzg.m51407b(F, f, g, e, e2, d, h, zzfzp, a).mo46623a(new zzdrc(this, F, f, e2, e, d, jSONObject, h, g, zzfzp, a), this.f32864a);
    }
}
