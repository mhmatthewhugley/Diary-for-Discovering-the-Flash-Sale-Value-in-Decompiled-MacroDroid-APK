package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

public interface ICameraUpdateFactoryDelegate extends IInterface {
    /* renamed from: c6 */
    IObjectWrapper mo54565c6(LatLng latLng, float f) throws RemoteException;
}
