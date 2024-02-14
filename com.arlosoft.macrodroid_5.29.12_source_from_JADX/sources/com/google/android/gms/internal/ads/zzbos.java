package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbos implements zzbpu {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcgp.m45229g("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzcgp.m45229g("No timestamp given for CSI tick.");
            } else {
                try {
                    long c = zzt.m2889b().mo21952c() + (Long.parseLong(str4) - zzt.m2889b().mo21950a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcmp.mo43758l().mo42684c(str2, str3, c);
                } catch (NumberFormatException e) {
                    zzcgp.m45230h("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcgp.m45229g("No value given for CSI experiment.");
            } else {
                zzcmp.mo43758l().mo42682a().mo42690d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcgp.m45229g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcgp.m45229g("No name given for CSI extra.");
            } else {
                zzcmp.mo43758l().mo42682a().mo42690d(str6, str7);
            }
        }
    }
}
