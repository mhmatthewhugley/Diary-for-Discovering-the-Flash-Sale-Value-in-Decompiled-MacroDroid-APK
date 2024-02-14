package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzen extends zzbk {

    /* renamed from: a */
    final /* synthetic */ zzeo f1960a;

    /* synthetic */ zzen(zzeo zzeo, zzem zzem) {
        this.f1960a = zzeo;
    }

    /* renamed from: Q8 */
    public final void mo19903Q8(zzl zzl) throws RemoteException {
        mo19907u6(zzl, 1);
    }

    @Nullable
    /* renamed from: b */
    public final String mo19904b() throws RemoteException {
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final String mo19905c() throws RemoteException {
        return null;
    }

    /* renamed from: g */
    public final boolean mo19906g() throws RemoteException {
        return false;
    }

    /* renamed from: u6 */
    public final void mo19907u6(zzl zzl, int i) throws RemoteException {
        zzcgp.m45226d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcgi.f28421b.post(new zzel(this));
    }
}
