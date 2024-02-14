package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import java.util.Locale;

public final class zzae extends GmsClient<zzr> {

    /* renamed from: Z */
    private final zzau f45960Z;

    /* renamed from: a0 */
    private final Locale f45961a0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzae(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 67, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Locale locale = Locale.getDefault();
        this.f45961a0 = locale;
        this.f45960Z = new zzau(str, locale, clientSettings.mo21668b() != null ? clientSettings.mo21668b().name : null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: r0 */
    public final void mo54276r0(zzm zzm, PlaceFilter placeFilter) throws RemoteException {
        Preconditions.m4489l(zzm, "callback == null");
        if (placeFilter == null) {
            placeFilter = PlaceFilter.m64709n2();
        }
        ((zzr) mo21626I()).mo54334u3(placeFilter, this.f45960Z, zzm);
    }

    /* renamed from: s0 */
    public final void mo54277s0(zzm zzm, PlaceReport placeReport) throws RemoteException {
        Preconditions.m4489l(zzm, "callback == null");
        ((zzr) mo21626I()).mo54333Q1(placeReport, this.f45960Z, zzm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (queryLocalInterface instanceof zzr) {
            return (zzr) queryLocalInterface;
        }
        return new zzu(iBinder);
    }
}
