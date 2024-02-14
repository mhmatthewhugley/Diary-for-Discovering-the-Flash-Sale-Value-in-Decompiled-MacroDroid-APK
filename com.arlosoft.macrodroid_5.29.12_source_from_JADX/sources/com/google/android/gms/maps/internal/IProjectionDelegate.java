package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

public interface IProjectionDelegate extends IInterface {
    /* renamed from: U2 */
    IObjectWrapper mo54602U2(LatLng latLng) throws RemoteException;
}
