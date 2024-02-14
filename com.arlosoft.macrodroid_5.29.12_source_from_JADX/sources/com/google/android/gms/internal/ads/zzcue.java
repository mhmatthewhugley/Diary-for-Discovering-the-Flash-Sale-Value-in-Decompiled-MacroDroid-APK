package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcue implements zzctw {

    /* renamed from: a */
    private final zzeak f31581a;

    zzcue(zzeak zzeak) {
        this.f31581a = zzeak;
    }

    /* renamed from: a */
    public final void mo44375a(Map map) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27014U7)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.f31581a.mo45133l(str);
            }
        }
    }
}
