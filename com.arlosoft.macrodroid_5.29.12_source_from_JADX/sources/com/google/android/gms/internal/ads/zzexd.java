package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzexd implements zzevd {

    /* renamed from: a */
    private final List f35131a;

    public zzexd(List list) {
        this.f35131a = list;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f35131a));
        } catch (JSONException unused) {
            zze.m2645k("Failed putting experiment ids.");
        }
    }
}
