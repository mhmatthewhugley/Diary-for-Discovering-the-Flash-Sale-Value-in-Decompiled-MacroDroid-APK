package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewo implements zzevd {

    /* renamed from: a */
    private final String f35098a;

    public zzewo(String str) {
        this.f35098a = str;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            JSONObject f = zzbu.m2596f((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f35098a)) {
                f.put("attok", this.f35098a);
            }
        } catch (JSONException e) {
            zze.m2646l("Failed putting attestation token.", e);
        }
    }
}
