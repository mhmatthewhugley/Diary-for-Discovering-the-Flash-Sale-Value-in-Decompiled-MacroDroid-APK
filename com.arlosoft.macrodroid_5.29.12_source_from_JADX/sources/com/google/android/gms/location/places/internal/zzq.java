package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzf;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public final class zzq extends GmsClient<zzt> {

    /* renamed from: Z */
    private final zzau f46020Z;

    private zzq(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 65, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f46020Z = new zzau(str, Locale.getDefault(), clientSettings.mo21668b() != null ? clientSettings.mo21668b().name : null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: r0 */
    public final void mo54328r0(zzf zzf, String str) throws RemoteException {
        Preconditions.m4489l(zzf, "callback cannot be null");
        ((zzt) mo21626I()).mo54336N6(str, this.f46020Z, zzf);
    }

    /* renamed from: s0 */
    public final void mo54329s0(zzf zzf, String str, int i, int i2, int i3) throws RemoteException {
        Preconditions.m4489l(zzf, "callback cannot be null");
        ((zzt) mo21626I()).mo54337O1(str, i, i2, i3, this.f46020Z, zzf);
    }

    /* renamed from: t0 */
    public final void mo54330t0(zzm zzm, AddPlaceRequest addPlaceRequest) throws RemoteException {
        Preconditions.m4489l(zzm, "callback == null");
        ((zzt) mo21626I()).mo54338r8(addPlaceRequest, this.f46020Z, zzm);
    }

    /* renamed from: u0 */
    public final void mo54331u0(zzm zzm, String str, @Nullable LatLngBounds latLngBounds, int i, @Nullable AutocompleteFilter autocompleteFilter) throws RemoteException {
        Preconditions.m4489l(zzm, "callback == null");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (autocompleteFilter == null) {
            autocompleteFilter = new AutocompleteFilter.Builder().mo54237a();
        }
        ((zzt) mo21626I()).mo54339u9(str2, latLngBounds, i, autocompleteFilter, this.f46020Z, zzm);
    }

    /* renamed from: v0 */
    public final void mo54332v0(zzm zzm, List<String> list) throws RemoteException {
        Preconditions.m4489l(zzm, "callback == null");
        ((zzt) mo21626I()).mo54335H3(list, this.f46020Z, zzm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (queryLocalInterface instanceof zzt) {
            return (zzt) queryLocalInterface;
        }
        return new zzw(iBinder);
    }
}
