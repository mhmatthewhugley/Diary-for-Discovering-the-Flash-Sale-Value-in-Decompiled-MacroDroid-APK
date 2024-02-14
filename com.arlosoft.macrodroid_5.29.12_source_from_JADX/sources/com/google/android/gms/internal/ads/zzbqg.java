package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbqg implements zzbpu {

    /* renamed from: a */
    private final zzebe f27655a;

    public zzbqg(zzebe zzebe) {
        this.f27655a = zzebe;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27070a8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                String str4 = (String) map.get("format");
                if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                    this.f27655a.mo45145f(str2, str4, str3);
                } else if (str.equals("show")) {
                    this.f27655a.mo45146g(str2, str3);
                }
            }
        }
    }
}
