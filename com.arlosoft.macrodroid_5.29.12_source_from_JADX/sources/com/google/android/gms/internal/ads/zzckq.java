package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzckq implements zzbpu {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzciy zzciy = (zzciy) obj;
        zzcnl p = zzciy.mo43761p();
        if (p == null) {
            try {
                zzcnl zzcnl = new zzcnl(zzciy, Float.parseFloat((String) map.get(TypedValues.Transition.S_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzciy.mo43743A(zzcnl);
                p = zzcnl;
            } catch (NullPointerException e) {
                e = e;
                zzcgp.m45227e("Unable to parse videoMeta message.", e);
                zzt.m2904q().mo43503t(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzcgp.m45227e("Unable to parse videoMeta message.", e);
                zzt.m2904q().mo43503t(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(TypedValues.Transition.S_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcgp.m45232j(3)) {
            zzcgp.m45224b("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        p.mo44164Kb(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
