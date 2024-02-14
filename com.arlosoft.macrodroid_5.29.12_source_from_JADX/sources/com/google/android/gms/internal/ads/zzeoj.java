package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeoj implements zza, zzdkn {

    /* renamed from: a */
    private zzbc f34591a;

    /* renamed from: a */
    public final synchronized void mo45402a(zzbc zzbc) {
        this.f34591a = zzbc;
    }

    public final synchronized void onAdClicked() {
        zzbc zzbc = this.f34591a;
        if (zzbc != null) {
            try {
                zzbc.zzb();
            } catch (RemoteException e) {
                zzcgp.m45230h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    /* renamed from: s */
    public final synchronized void mo44113s() {
        zzbc zzbc = this.f34591a;
        if (zzbc != null) {
            try {
                zzbc.zzb();
            } catch (RemoteException e) {
                zzcgp.m45230h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
