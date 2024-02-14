package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzexu implements zzevd {

    /* renamed from: a */
    private final String f35158a;

    public zzexu(String str) {
        this.f35158a = str;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.f35158a)) {
                zzbu.m2596f(jSONObject, "pii").put("adsid", this.f35158a);
            }
        } catch (JSONException e) {
            zzcgp.m45230h("Failed putting trustless token.", e);
        }
    }
}
