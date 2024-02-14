package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbss implements zzcob {

    /* renamed from: a */
    public final /* synthetic */ zzbtf f27711a;

    public /* synthetic */ zzbss(zzbtf zzbtf, byte[] bArr) {
        this.f27711a = zzbtf;
    }

    public final void zza() {
        zzbtf zzbtf = this.f27711a;
        zzs.f2304i.postDelayed(new zzbte(zzbtf.f27733a, zzbtf.f27734b, zzbtf.f27735c), WorkRequest.MIN_BACKOFF_MILLIS);
    }
}
