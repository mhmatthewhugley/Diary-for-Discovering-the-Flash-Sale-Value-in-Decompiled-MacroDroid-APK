package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {

    /* renamed from: k */
    private final AdSize f2415k;

    public MediationBannerAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @NonNull String str2, @NonNull AdSize adSize, @NonNull String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.f2415k = adSize;
    }
}
