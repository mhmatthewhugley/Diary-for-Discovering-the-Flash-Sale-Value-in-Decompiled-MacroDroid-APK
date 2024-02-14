package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;

public interface IMapFragmentDelegate extends IInterface {
    /* renamed from: N */
    void mo54580N() throws RemoteException;

    /* renamed from: S */
    void mo54581S(Bundle bundle) throws RemoteException;

    /* renamed from: U */
    void mo54582U(Bundle bundle) throws RemoteException;

    /* renamed from: X0 */
    void mo54583X0(zzap zzap) throws RemoteException;

    /* renamed from: n1 */
    IObjectWrapper mo54584n1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* renamed from: q8 */
    void mo54590q8(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    /* renamed from: s0 */
    void mo54591s0() throws RemoteException;
}
