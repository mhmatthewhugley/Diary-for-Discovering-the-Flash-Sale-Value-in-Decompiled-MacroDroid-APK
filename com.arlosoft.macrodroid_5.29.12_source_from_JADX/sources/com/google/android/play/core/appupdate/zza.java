package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.zzce;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zza {

    /* renamed from: a */
    private static zzaa f51121a;

    /* renamed from: a */
    static synchronized zzaa m70416a(Context context) {
        zzaa zzaa;
        synchronized (zza.class) {
            if (f51121a == null) {
                zzy zzy = new zzy((zzx) null);
                zzy.mo59565a(new zzh(zzce.m70925a(context)));
                f51121a = zzy.mo59566b();
            }
            zzaa = f51121a;
        }
        return zzaa;
    }
}
