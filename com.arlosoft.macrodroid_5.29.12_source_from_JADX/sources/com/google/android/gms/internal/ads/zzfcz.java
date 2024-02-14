package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfcz extends zzfmr {

    /* renamed from: a */
    final /* synthetic */ zzdb f35459a;

    /* renamed from: b */
    final /* synthetic */ zzfdb f35460b;

    zzfcz(zzfdb zzfdb, zzdb zzdb) {
        this.f35460b = zzfdb;
        this.f35459a = zzdb;
    }

    /* renamed from: f */
    public final void mo44623f() {
        if (this.f35460b.f35470p != null) {
            try {
                this.f35459a.mo19988b();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
    }
}
