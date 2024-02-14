package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewa implements zzevd {

    /* renamed from: a */
    private final String f35065a;

    public zzewa(String str) {
        this.f35065a = str;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f35065a);
        } catch (JSONException e) {
            zze.m2646l("Failed putting Ad ID.", e);
        }
    }
}
