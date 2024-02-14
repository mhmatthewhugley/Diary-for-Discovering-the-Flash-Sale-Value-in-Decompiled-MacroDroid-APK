package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzeij implements zzczc {

    /* renamed from: a */
    public final /* synthetic */ zzehf f34106a;

    public /* synthetic */ zzeij(zzehf zzehf) {
        this.f34106a = zzehf;
    }

    public final zzdk zza() {
        try {
            return ((zzbxd) this.f34106a.f34016b).mo43177b();
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }
}
