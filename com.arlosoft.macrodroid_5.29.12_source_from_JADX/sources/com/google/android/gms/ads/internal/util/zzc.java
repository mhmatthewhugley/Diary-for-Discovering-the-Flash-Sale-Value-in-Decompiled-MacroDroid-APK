package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzc extends zzb {

    /* renamed from: c */
    private final Context f2238c;

    zzc(Context context) {
        this.f2238c = context;
    }

    /* renamed from: a */
    public final void mo20184a() {
        boolean z;
        try {
            z = AdvertisingIdClient.m1818c(this.f2238c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzcgp.m45227e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        zzcgo.m45207j(z);
        zzcgp.m45229g("Update ad debug logging enablement as " + z);
    }
}
