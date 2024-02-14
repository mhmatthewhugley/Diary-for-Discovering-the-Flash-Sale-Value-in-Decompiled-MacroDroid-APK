package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbw;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfdg extends zzfmr {

    /* renamed from: a */
    final /* synthetic */ zzbw f35479a;

    /* renamed from: b */
    final /* synthetic */ zzfdh f35480b;

    zzfdg(zzfdh zzfdh, zzbw zzbw) {
        this.f35480b = zzfdh;
        this.f35479a = zzbw;
    }

    /* renamed from: f */
    public final void mo44623f() {
        if (this.f35480b.f35484f != null) {
            try {
                this.f35479a.mo19963b();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
    }
}
