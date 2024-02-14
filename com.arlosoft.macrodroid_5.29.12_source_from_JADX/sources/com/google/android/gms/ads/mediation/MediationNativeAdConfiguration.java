package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbls;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    @Nullable

    /* renamed from: k */
    private final zzbls f2418k;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, String str3, @Nullable zzbls zzbls) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.f2418k = zzbls;
    }
}
