package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzboj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f27582a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public final NativeCustomTemplateAd.OnCustomClickListener f27583b;
    @GuardedBy("this")
    @Nullable

    /* renamed from: c */
    private NativeCustomTemplateAd f27584c;

    public zzboj(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @Nullable NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f27582a = onCustomTemplateAdLoadedListener;
        this.f27583b = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized NativeCustomTemplateAd m43893f(zzbmy zzbmy) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f27584c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbmz zzbmz = new zzbmz(zzbmy);
        this.f27584c = zzbmz;
        return zzbmz;
    }

    @Nullable
    /* renamed from: d */
    public final zzbni mo42864d() {
        if (this.f27583b == null) {
            return null;
        }
        return new zzbog(this, (zzbof) null);
    }

    /* renamed from: e */
    public final zzbnl mo42865e() {
        return new zzboi(this, (zzboh) null);
    }
}
