package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface IStreetViewPanoramaViewDelegate extends IInterface {
    /* renamed from: N */
    void mo54615N() throws RemoteException;

    /* renamed from: S */
    void mo54616S(Bundle bundle) throws RemoteException;

    /* renamed from: U */
    void mo54617U(Bundle bundle) throws RemoteException;

    /* renamed from: j1 */
    void mo54618j1(zzbp zzbp) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* renamed from: r0 */
    IObjectWrapper mo54624r0() throws RemoteException;
}
