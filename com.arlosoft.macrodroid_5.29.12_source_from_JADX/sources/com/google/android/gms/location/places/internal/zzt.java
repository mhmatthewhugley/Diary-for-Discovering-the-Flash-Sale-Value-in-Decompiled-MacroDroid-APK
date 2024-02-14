package com.google.android.gms.location.places.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public interface zzt extends IInterface {
    /* renamed from: H3 */
    void mo54335H3(List<String> list, zzau zzau, zzx zzx) throws RemoteException;

    /* renamed from: N6 */
    void mo54336N6(String str, zzau zzau, zzv zzv) throws RemoteException;

    /* renamed from: O1 */
    void mo54337O1(String str, int i, int i2, int i3, zzau zzau, zzv zzv) throws RemoteException;

    /* renamed from: r8 */
    void mo54338r8(AddPlaceRequest addPlaceRequest, zzau zzau, zzx zzx) throws RemoteException;

    /* renamed from: u9 */
    void mo54339u9(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, zzau zzau, zzx zzx) throws RemoteException;
}
