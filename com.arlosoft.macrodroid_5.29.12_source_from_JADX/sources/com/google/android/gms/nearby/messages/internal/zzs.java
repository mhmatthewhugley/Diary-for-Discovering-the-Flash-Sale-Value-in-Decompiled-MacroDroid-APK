package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zza;
import com.google.android.gms.internal.nearby.zzc;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzs extends zza {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    /* renamed from: Ib */
    public final void mo56022Ib(SubscribeRequest subscribeRequest) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, subscribeRequest);
        mo52519A1(3, y);
    }

    /* renamed from: Jb */
    public final void mo56023Jb(zzce zzce) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzce);
        mo52519A1(2, y);
    }

    /* renamed from: Kb */
    public final void mo56024Kb(zzcg zzcg) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzcg);
        mo52519A1(4, y);
    }

    /* renamed from: Z8 */
    public final void mo56025Z8(zzj zzj) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzj);
        mo52519A1(9, y);
    }

    /* renamed from: g8 */
    public final void mo56026g8(zzh zzh) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzh);
        mo52519A1(7, y);
    }

    /* renamed from: ia */
    public final void mo56027ia(zzbz zzbz) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzbz);
        mo52519A1(1, y);
    }

    /* renamed from: sb */
    public final void mo56028sb(zzcb zzcb) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzcb);
        mo52519A1(8, y);
    }
}
