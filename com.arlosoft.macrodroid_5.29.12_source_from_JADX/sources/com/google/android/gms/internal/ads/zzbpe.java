package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbpe implements zzbpu {
    zzbpe() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        JSONObject zzb;
        zzcmp zzcmp = (zzcmp) obj;
        zzblr T = zzcmp.mo44031T();
        if (T == null || (zzb = T.zzb()) == null) {
            zzcmp.mo42953b("nativeClickMetaReady", new JSONObject());
        } else {
            zzcmp.mo42953b("nativeClickMetaReady", zzb);
        }
    }
}
