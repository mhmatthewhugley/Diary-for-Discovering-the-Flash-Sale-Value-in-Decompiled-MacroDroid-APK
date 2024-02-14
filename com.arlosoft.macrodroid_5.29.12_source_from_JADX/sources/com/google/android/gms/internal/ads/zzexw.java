package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzexw implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ zzexw f35166a = new zzexw();

    private /* synthetic */ zzexw() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzay.m1924c().mo42663b(zzbjc.f26886I);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f26896J)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzch.m2634a(str2));
                }
            }
        }
        return new zzexy(hashMap);
    }
}
