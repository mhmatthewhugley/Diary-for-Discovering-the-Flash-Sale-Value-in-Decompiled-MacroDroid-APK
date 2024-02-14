package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface zze extends IInterface {
    /* renamed from: J9 */
    IStreetViewPanoramaViewDelegate mo54651J9(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    /* renamed from: Ja */
    void mo54652Ja(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    /* renamed from: Y0 */
    IMapFragmentDelegate mo54653Y0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: b */
    ICameraUpdateFactoryDelegate mo54654b() throws RemoteException;

    /* renamed from: c */
    com.google.android.gms.internal.maps.zze mo54655c() throws RemoteException;

    /* renamed from: d0 */
    IStreetViewPanoramaFragmentDelegate mo54656d0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: n8 */
    IMapViewDelegate mo54657n8(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) throws RemoteException;
}
