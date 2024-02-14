package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzdkn;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzm {
    /* renamed from: a */
    public static final void m2466a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f2053B == 4 && adOverlayInfoParcel.f2070d == null) {
            zza zza = adOverlayInfoParcel.f2069c;
            if (zza != null) {
                zza.onAdClicked();
            }
            zzdkn zzdkn = adOverlayInfoParcel.f2067P;
            if (zzdkn != null) {
                zzdkn.mo44113s();
            }
            Activity i = adOverlayInfoParcel.f2071f.mo43756i();
            zzc zzc = adOverlayInfoParcel.f2068a;
            if (!(zzc == null || !zzc.f2077A || i == null)) {
                context = i;
            }
            zzt.m2897j();
            zzc zzc2 = adOverlayInfoParcel.f2068a;
            zza.m2430b(context, zzc2, adOverlayInfoParcel.f2076z, zzc2 != null ? zzc2.f2086z : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f2055D.f28449f);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.m4901f()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzt.m2905r();
        zzs.m2759j(context, intent);
    }
}
