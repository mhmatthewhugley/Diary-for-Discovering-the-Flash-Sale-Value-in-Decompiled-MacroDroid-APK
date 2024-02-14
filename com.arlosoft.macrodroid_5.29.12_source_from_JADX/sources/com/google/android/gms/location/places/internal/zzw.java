package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.places.zzc;
import com.google.android.gms.internal.places.zze;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public final class zzw extends zzc implements zzt {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    /* renamed from: H3 */
    public final void mo54335H3(List<String> list, zzau zzau, zzx zzx) throws RemoteException {
        Parcel y = mo53510y();
        y.writeStringList(list);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzx);
        mo53509t1(17, y);
    }

    /* renamed from: N6 */
    public final void mo54336N6(String str, zzau zzau, zzv zzv) throws RemoteException {
        Parcel y = mo53510y();
        y.writeString(str);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzv);
        mo53509t1(19, y);
    }

    /* renamed from: O1 */
    public final void mo54337O1(String str, int i, int i2, int i3, zzau zzau, zzv zzv) throws RemoteException {
        Parcel y = mo53510y();
        y.writeString(str);
        y.writeInt(i);
        y.writeInt(i2);
        y.writeInt(i3);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzv);
        mo53509t1(20, y);
    }

    /* renamed from: r8 */
    public final void mo54338r8(AddPlaceRequest addPlaceRequest, zzau zzau, zzx zzx) throws RemoteException {
        Parcel y = mo53510y();
        zze.m63755c(y, addPlaceRequest);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzx);
        mo53509t1(14, y);
    }

    /* renamed from: u9 */
    public final void mo54339u9(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, zzau zzau, zzx zzx) throws RemoteException {
        Parcel y = mo53510y();
        y.writeString(str);
        zze.m63755c(y, latLngBounds);
        y.writeInt(i);
        zze.m63755c(y, autocompleteFilter);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzx);
        mo53509t1(28, y);
    }
}
