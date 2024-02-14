package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener f28009a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public final NativeCustomFormatAd.OnCustomClickListener f28010b;
    @GuardedBy("this")
    @Nullable

    /* renamed from: c */
    private NativeCustomFormatAd f28011c;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized NativeCustomFormatAd m44681d(zzbmy zzbmy) {
        NativeCustomFormatAd nativeCustomFormatAd = this.f28011c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbyq zzbyq = new zzbyq(zzbmy);
        this.f28011c = zzbyq;
        return zzbyq;
    }
}
