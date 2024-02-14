package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface IMapViewDelegate extends IInterface {
    /* renamed from: N */
    void mo54592N() throws RemoteException;

    /* renamed from: S */
    void mo54593S(Bundle bundle) throws RemoteException;

    /* renamed from: U */
    void mo54594U(Bundle bundle) throws RemoteException;

    /* renamed from: X0 */
    void mo54595X0(zzap zzap) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* renamed from: r0 */
    IObjectWrapper mo54601r0() throws RemoteException;
}
