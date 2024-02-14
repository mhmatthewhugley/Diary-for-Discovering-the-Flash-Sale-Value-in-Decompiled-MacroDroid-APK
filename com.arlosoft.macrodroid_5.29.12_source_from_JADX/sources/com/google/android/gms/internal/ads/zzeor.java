package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzeor implements zzddd {

    /* renamed from: a */
    public final /* synthetic */ zzeof f34614a;

    /* renamed from: c */
    public final /* synthetic */ zzbsl f34615c;

    public /* synthetic */ zzeor(zzeof zzeof, zzbsl zzbsl) {
        this.f34614a = zzeof;
        this.f34615c = zzbsl;
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        zzeof zzeof = this.f34614a;
        zzbsl zzbsl = this.f34615c;
        zzeof.mo44382r(zze);
        if (zzbsl != null) {
            try {
                zzbsl.mo42950C(zze);
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
        if (zzbsl != null) {
            try {
                zzbsl.mo42949A(zze.f1934a);
            } catch (RemoteException e2) {
                zzcgp.m45231i("#007 Could not call remote method.", e2);
            }
        }
    }
}
