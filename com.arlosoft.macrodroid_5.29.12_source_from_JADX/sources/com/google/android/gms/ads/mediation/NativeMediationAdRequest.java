package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface NativeMediationAdRequest extends MediationAdRequest {
    @NonNull
    /* renamed from: a */
    NativeAdOptions mo20513a();

    @NonNull
    @Deprecated
    /* renamed from: f */
    com.google.android.gms.ads.formats.NativeAdOptions mo20514f();

    /* renamed from: h */
    boolean mo20515h();

    @NonNull
    Map zza();

    boolean zzb();
}
