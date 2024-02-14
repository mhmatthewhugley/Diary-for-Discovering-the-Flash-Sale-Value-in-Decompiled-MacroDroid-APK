package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfks {

    /* renamed from: a */
    private final zzfkz f35992a;

    /* renamed from: b */
    private final zzfkz f35993b;

    /* renamed from: c */
    private final zzfkw f35994c;

    /* renamed from: d */
    private final zzfky f35995d;

    private zzfks(zzfkw zzfkw, zzfky zzfky, zzfkz zzfkz, zzfkz zzfkz2, boolean z) {
        this.f35994c = zzfkw;
        this.f35995d = zzfky;
        this.f35992a = zzfkz;
        if (zzfkz2 == null) {
            this.f35993b = zzfkz.NONE;
        } else {
            this.f35993b = zzfkz2;
        }
    }

    /* renamed from: a */
    public static zzfks m50428a(zzfkw zzfkw, zzfky zzfky, zzfkz zzfkz, zzfkz zzfkz2, boolean z) {
        zzfly.m50528b(zzfky, "ImpressionType is null");
        zzfly.m50528b(zzfkz, "Impression owner is null");
        if (zzfkz == zzfkz.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzfkw == zzfkw.DEFINED_BY_JAVASCRIPT && zzfkz == zzfkz.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzfky != zzfky.DEFINED_BY_JAVASCRIPT || zzfkz != zzfkz.NATIVE) {
            return new zzfks(zzfkw, zzfky, zzfkz, zzfkz2, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: b */
    public final JSONObject mo45870b() {
        JSONObject jSONObject = new JSONObject();
        zzflw.m50522h(jSONObject, "impressionOwner", this.f35992a);
        zzflw.m50522h(jSONObject, "mediaEventsOwner", this.f35993b);
        zzflw.m50522h(jSONObject, "creativeType", this.f35994c);
        zzflw.m50522h(jSONObject, "impressionType", this.f35995d);
        zzflw.m50522h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
