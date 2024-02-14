package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzkd extends zza {
    zzkd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    /* renamed from: Ib */
    public final void mo52774Ib(zzmg zzmg) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzmg);
        mo52521t1(2007, y);
    }

    /* renamed from: Jb */
    public final void mo52775Jb(zzmk zzmk) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzmk);
        mo52521t1(SamsungIrisUnlockModule.IRIS_REQUEST_IR_PREVIEW_ENABLE, y);
    }

    /* renamed from: Kb */
    public final void mo52776Kb(zzmo zzmo) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzmo);
        mo52521t1(2008, y);
    }

    /* renamed from: Lb */
    public final void mo52777Lb(zzms zzms) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzms);
        mo52521t1(2001, y);
    }

    /* renamed from: Mb */
    public final void mo52778Mb(zzmw zzmw) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzmw);
        mo52521t1(2003, y);
    }

    /* renamed from: Nb */
    public final void mo52779Nb(zzmy zzmy) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzmy);
        mo52521t1(2002, y);
    }

    /* renamed from: Ob */
    public final void mo52780Ob(zzna zzna) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzna);
        mo52521t1(2010, y);
    }

    /* renamed from: Pb */
    public final void mo52781Pb(zznc zznc) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zznc);
        mo52521t1(SamsungIrisUnlockModule.IRIS_REQUEST_FACTORY_TEST_CAMERA_VERSION, y);
    }

    /* renamed from: Z8 */
    public final void mo52782Z8(zzfn zzfn) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzfn);
        mo52521t1(2012, y);
    }

    /* renamed from: g8 */
    public final void mo52783g8(zzfj zzfj) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzfj);
        mo52521t1(2006, y);
    }

    /* renamed from: ia */
    public final void mo52784ia(zzfp zzfp) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzfp);
        mo52521t1(2011, y);
    }

    /* renamed from: sb */
    public final void mo52785sb(zzjl zzjl) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzjl);
        mo52521t1(2009, y);
    }
}
