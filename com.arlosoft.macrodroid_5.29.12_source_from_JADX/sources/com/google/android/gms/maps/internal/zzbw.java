package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

public final class zzbw extends zza implements IStreetViewPanoramaViewDelegate {
    zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    /* renamed from: N */
    public final void mo54615N() throws RemoteException {
        mo50652A1(11, mo50655y());
    }

    /* renamed from: S */
    public final void mo54616S(Bundle bundle) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59347d(y, bundle);
        mo50652A1(2, y);
    }

    /* renamed from: U */
    public final void mo54617U(Bundle bundle) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59347d(y, bundle);
        Parcel t1 = mo50654t1(7, y);
        if (t1.readInt() != 0) {
            bundle.readFromParcel(t1);
        }
        t1.recycle();
    }

    /* renamed from: j1 */
    public final void mo54618j1(zzbp zzbp) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzbp);
        mo50652A1(9, y);
    }

    public final void onDestroy() throws RemoteException {
        mo50652A1(5, mo50655y());
    }

    public final void onLowMemory() throws RemoteException {
        mo50652A1(6, mo50655y());
    }

    public final void onPause() throws RemoteException {
        mo50652A1(4, mo50655y());
    }

    public final void onResume() throws RemoteException {
        mo50652A1(3, mo50655y());
    }

    public final void onStart() throws RemoteException {
        mo50652A1(10, mo50655y());
    }

    /* renamed from: r0 */
    public final IObjectWrapper mo54624r0() throws RemoteException {
        Parcel t1 = mo50654t1(8, mo50655y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }
}
