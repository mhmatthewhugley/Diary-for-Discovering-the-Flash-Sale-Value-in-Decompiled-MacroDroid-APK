package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeeg implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzcay f33791a;

    zzeeg(zzeek zzeek, zzcay zzcay) {
        this.f33791a = zzcay;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        try {
            this.f33791a.mo43268a6(zzaz.m2567l2(th));
        } catch (RemoteException e) {
            zze.m2646l("Service can't call client", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        try {
            this.f33791a.mo43267B9((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.m2646l("Service can't call client", e);
        }
    }
}
