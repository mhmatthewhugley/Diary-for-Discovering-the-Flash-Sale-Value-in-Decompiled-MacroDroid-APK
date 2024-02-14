package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcng implements zzbpu {

    /* renamed from: a */
    final /* synthetic */ zzcni f29069a;

    zzcng(zzcni zzcni) {
        this.f29069a = zzcni;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f29069a) {
                        zzcni zzcni = this.f29069a;
                        if (zzcni.f29094W != parseInt) {
                            zzcni.f29094W = parseInt;
                            this.f29069a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzcgp.m45230h("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
