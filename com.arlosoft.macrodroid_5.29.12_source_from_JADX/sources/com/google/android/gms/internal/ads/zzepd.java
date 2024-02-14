package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepd implements zzeve {

    /* renamed from: a */
    private final Context f34636a;

    zzepd(Context context) {
        this.f34636a = context;
    }

    public final int zza() {
        return 2;
    }

    public final zzfzp zzb() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27254t2)).booleanValue()) {
            return zzfzg.m51414i((Object) null);
        }
        return zzfzg.m51414i(new zzepe(ContextCompat.checkSelfPermission(this.f34636a, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
