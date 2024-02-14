package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public final class zzbv extends zza implements IStreetViewPanoramaFragmentDelegate {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* renamed from: N */
    public final void mo54603N() throws RemoteException {
        mo50652A1(14, mo50655y());
    }

    /* renamed from: S */
    public final void mo54604S(Bundle bundle) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59347d(y, bundle);
        mo50652A1(3, y);
    }

    /* renamed from: U */
    public final void mo54605U(Bundle bundle) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59347d(y, bundle);
        Parcel t1 = mo50654t1(10, y);
        if (t1.readInt() != 0) {
            bundle.readFromParcel(t1);
        }
        t1.recycle();
    }

    /* renamed from: g9 */
    public final void mo54606g9(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, iObjectWrapper);
        zzc.m59347d(y, streetViewPanoramaOptions);
        zzc.m59347d(y, bundle);
        mo50652A1(2, y);
    }

    /* renamed from: j1 */
    public final void mo54607j1(zzbp zzbp) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzbp);
        mo50652A1(12, y);
    }

    /* renamed from: n1 */
    public final IObjectWrapper mo54608n1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, iObjectWrapper);
        zzc.m59346c(y, iObjectWrapper2);
        zzc.m59347d(y, bundle);
        Parcel t1 = mo50654t1(4, y);
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    public final void onDestroy() throws RemoteException {
        mo50652A1(8, mo50655y());
    }

    public final void onLowMemory() throws RemoteException {
        mo50652A1(9, mo50655y());
    }

    public final void onPause() throws RemoteException {
        mo50652A1(6, mo50655y());
    }

    public final void onResume() throws RemoteException {
        mo50652A1(5, mo50655y());
    }

    public final void onStart() throws RemoteException {
        mo50652A1(13, mo50655y());
    }

    /* renamed from: s0 */
    public final void mo54614s0() throws RemoteException {
        mo50652A1(7, mo50655y());
    }
}
