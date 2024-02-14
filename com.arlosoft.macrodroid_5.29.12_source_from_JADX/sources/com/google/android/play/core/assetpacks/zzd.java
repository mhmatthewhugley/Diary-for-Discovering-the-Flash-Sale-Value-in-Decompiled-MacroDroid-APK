package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.zzce;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzd {

    /* renamed from: a */
    private static zza f51436a;

    /* renamed from: a */
    static synchronized zza m70651a(Context context) {
        zza zza;
        synchronized (zzd.class) {
            if (f51436a == null) {
                zzcb zzcb = new zzcb((zzca) null);
                zzcb.mo59696b(new zzp(zzce.m70925a(context)));
                f51436a = zzcb.mo59695a();
            }
            zza = f51436a;
        }
        return zza;
    }
}
