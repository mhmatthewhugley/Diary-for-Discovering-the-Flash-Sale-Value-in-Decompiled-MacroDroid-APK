package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbpg implements zzbpu {
    zzbpg() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            zze.m2645k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfrb j = zzfrc.m50843j();
        j.mo46091b((String) map.get("appId"));
        j.mo46097h(zzcmp.getWidth());
        j.mo46096g(zzcmp.mo44027R().getWindowToken());
        if (!map.containsKey("gravityX") || !map.containsKey("gravityY")) {
            j.mo46093d(81);
        } else {
            j.mo46093d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        }
        if (map.containsKey("verticalMargin")) {
            j.mo46094e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            j.mo46094e(0.02f);
        }
        if (map.containsKey("enifd")) {
            j.mo46090a((String) map.get("enifd"));
        }
        try {
            zzt.m2899l().mo20238j(zzcmp, j.mo46098i());
        } catch (NullPointerException e) {
            zzt.m2904q().mo43503t(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.m2645k("Missing parameters for LMD Overlay show request");
        }
    }
}
