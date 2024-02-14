package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzey extends zzdd {
    @Nullable

    /* renamed from: a */
    private final OnPaidEventListener f1968a;

    public zzey(@Nullable OnPaidEventListener onPaidEventListener) {
        this.f1968a = onPaidEventListener;
    }

    /* renamed from: V9 */
    public final void mo19991V9(zzs zzs) {
        OnPaidEventListener onPaidEventListener = this.f1968a;
        if (onPaidEventListener != null) {
            onPaidEventListener.mo19735a(AdValue.m1714a(zzs.f2035c, zzs.f2036d, zzs.f2037f));
        }
    }
}
