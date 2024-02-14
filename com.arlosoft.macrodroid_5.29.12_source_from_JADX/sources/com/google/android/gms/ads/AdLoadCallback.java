package com.google.android.gms.ads;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class AdLoadCallback<AdT> {
    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
    }

    public void onAdLoaded(@NonNull AdT adt) {
    }
}
