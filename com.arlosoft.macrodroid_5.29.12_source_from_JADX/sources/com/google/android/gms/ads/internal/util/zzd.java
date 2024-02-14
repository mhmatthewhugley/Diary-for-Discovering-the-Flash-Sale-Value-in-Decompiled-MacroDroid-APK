package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzfzp;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzd {
    /* renamed from: a */
    public static void m2644a(Context context) {
        if (zzcgo.m45208k(context) && !zzcgo.m45210m()) {
            zzfzp b = new zzc(context).mo20314b();
            zzcgp.m45228f("Updating ad debug logging enablement.");
            zzchf.m45244a(b, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
