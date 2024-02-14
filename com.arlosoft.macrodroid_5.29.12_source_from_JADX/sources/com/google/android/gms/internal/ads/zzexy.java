package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzexy implements zzevd {

    /* renamed from: a */
    private final Map f35168a;

    public zzexy(Map map) {
        this.f35168a = map;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzaw.m1917b().mo43550i(this.f35168a));
        } catch (JSONException e) {
            zze.m2645k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
