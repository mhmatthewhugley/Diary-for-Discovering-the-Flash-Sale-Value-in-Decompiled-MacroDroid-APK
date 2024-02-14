package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface IStreetViewPanoramaFragmentDelegate extends IInterface {
    /* renamed from: N */
    void mo54603N() throws RemoteException;

    /* renamed from: S */
    void mo54604S(Bundle bundle) throws RemoteException;

    /* renamed from: U */
    void mo54605U(Bundle bundle) throws RemoteException;

    /* renamed from: g9 */
    void mo54606g9(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException;

    /* renamed from: j1 */
    void mo54607j1(zzbp zzbp) throws RemoteException;

    /* renamed from: n1 */
    IObjectWrapper mo54608n1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* renamed from: s0 */
    void mo54614s0() throws RemoteException;
}
