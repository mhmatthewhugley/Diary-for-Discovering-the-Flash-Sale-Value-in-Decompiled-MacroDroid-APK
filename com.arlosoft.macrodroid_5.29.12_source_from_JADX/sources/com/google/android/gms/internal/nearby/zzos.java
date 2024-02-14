package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.PointerIconCompat;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzos extends zza {
    zzos(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
    }

    /* renamed from: Ib */
    public final void mo53088Ib(zzon zzon) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzon);
        mo52519A1(1002, y);
    }

    /* renamed from: Jb */
    public final void mo53089Jb(zzpk zzpk) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzpk);
        mo52519A1(1001, y);
    }

    /* renamed from: Kb */
    public final void mo53090Kb(zzqe zzqe) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzqe);
        mo52519A1(PointerIconCompat.TYPE_VERTICAL_TEXT, y);
    }

    /* renamed from: Lb */
    public final void mo53091Lb(zzqi zzqi) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzqi);
        mo52519A1(SamsungIrisUnlockModule.IRIS_ERROR_IDENTIFY_FAILURE_SENSOR_CHANGED, y);
    }

    /* renamed from: Mb */
    public final void mo53092Mb(zzqm zzqm) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzqm);
        mo52519A1(1006, y);
    }

    /* renamed from: Z8 */
    public final void mo53093Z8(zzob zzob) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzob);
        mo52519A1(PointerIconCompat.TYPE_CROSSHAIR, y);
    }

    /* renamed from: g8 */
    public final void mo53094g8(zznz zznz) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zznz);
        mo52519A1(PointerIconCompat.TYPE_TEXT, y);
    }

    /* renamed from: ia */
    public final void mo53095ia(zzof zzof) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzof);
        mo52519A1(1004, y);
    }

    /* renamed from: sb */
    public final void mo53096sb(zzoj zzoj) throws RemoteException {
        Parcel y = mo52522y();
        zzc.m62340e(y, zzoj);
        mo52519A1(1003, y);
    }
}
