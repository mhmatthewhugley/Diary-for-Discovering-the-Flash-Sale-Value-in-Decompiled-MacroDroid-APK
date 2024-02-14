package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzfzc;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzz implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzaa f2586a;

    zzz(zzaa zzaa) {
        this.f2586a = zzaa;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzt.m2904q().mo43503t(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaa = this.f2586a;
        zzf.m3062c(zzaa.f2478D, zzaa.f2498g, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcgp.m45227e("Failed to initialize webview for loading SDKCore. ", th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20700c(@Nullable Object obj) {
        zzam zzam = (zzam) obj;
        zzcgp.m45224b("Initialized webview successfully for SDKCore.");
    }
}
