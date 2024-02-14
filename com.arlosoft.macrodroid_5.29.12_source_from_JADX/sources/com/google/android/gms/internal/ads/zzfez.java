package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfez {
    /* renamed from: a */
    public static void m50041a(Context context, boolean z) {
        if (z) {
            zzcgp.m45228f("This request is sent from a test device.");
            return;
        }
        zzaw.m1917b();
        String x = zzcgi.m45188x(context);
        zzcgp.m45228f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + x + "\")) to get test ads on this device.");
    }

    /* renamed from: b */
    public static void m50042b(int i, Throwable th, String str) {
        zzcgp.m45228f("Ad failed to load : " + i);
        zze.m2646l(str, th);
        if (i != 3) {
            zzt.m2904q().mo43502s(th, str);
        }
    }
}
