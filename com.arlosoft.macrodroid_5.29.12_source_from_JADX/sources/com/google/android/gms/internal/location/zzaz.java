package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzbq;
import com.google.android.gms.location.zzu;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzaz extends zzi {

    /* renamed from: b0 */
    private final zzav f41099b0;

    public zzaz(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.f41099b0 = new zzav(context, this.f41144a0);
    }

    /* renamed from: A0 */
    public final void mo50553A0(boolean z) throws RemoteException {
        this.f41099b0.mo50548k(z);
    }

    /* renamed from: B0 */
    public final void mo50554B0(Location location) throws RemoteException {
        this.f41099b0.mo50549l(location);
    }

    /* renamed from: C0 */
    public final void mo50555C0(zzai zzai) throws RemoteException {
        this.f41099b0.mo50550m(zzai);
    }

    /* renamed from: D0 */
    public final void mo50556D0(LocationSettingsRequest locationSettingsRequest, BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder, String str) throws RemoteException {
        mo21656w();
        boolean z = true;
        Preconditions.m4479b(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (resultHolder == null) {
            z = false;
        }
        Preconditions.m4479b(z, "listener can't be null.");
        ((zzam) mo21626I()).mo50516L1(locationSettingsRequest, new zzay(resultHolder), (String) null);
    }

    /* renamed from: E0 */
    public final void mo50557E0(long j, PendingIntent pendingIntent) throws RemoteException {
        mo21656w();
        Preconditions.m4488k(pendingIntent);
        Preconditions.m4479b(j >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) mo21626I()).mo50526k9(j, true, pendingIntent);
    }

    /* renamed from: F0 */
    public final void mo50558F0(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4489l(activityTransitionRequest, "activityTransitionRequest must be specified.");
        Preconditions.m4489l(pendingIntent, "PendingIntent must be specified.");
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50530r5(activityTransitionRequest, pendingIntent, new StatusCallback(resultHolder));
    }

    /* renamed from: G0 */
    public final void mo50559G0(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50519Z1(pendingIntent, new StatusCallback(resultHolder));
    }

    /* renamed from: H0 */
    public final void mo50560H0(PendingIntent pendingIntent) throws RemoteException {
        mo21656w();
        Preconditions.m4488k(pendingIntent);
        ((zzam) mo21626I()).mo50524i8(pendingIntent);
    }

    /* renamed from: I0 */
    public final void mo50561I0(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4489l(pendingIntent, "PendingIntent must be specified.");
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50528p3(pendingIntent, new StatusCallback(resultHolder));
    }

    /* renamed from: J0 */
    public final void mo50562J0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4489l(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.m4489l(pendingIntent, "PendingIntent must be specified.");
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50517Ua(geofencingRequest, pendingIntent, new zzaw(resultHolder));
    }

    /* renamed from: K0 */
    public final void mo50563K0(zzbq zzbq, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4489l(zzbq, "removeGeofencingRequest can't be null.");
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50523h9(zzbq, new zzax(resultHolder));
    }

    /* renamed from: L0 */
    public final void mo50564L0(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4489l(pendingIntent, "PendingIntent must be specified.");
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50529qb(pendingIntent, new zzax(resultHolder), mo21621D().getPackageName());
    }

    /* renamed from: M0 */
    public final void mo50565M0(List<String> list, BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        mo21656w();
        Preconditions.m4479b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        Preconditions.m4489l(resultHolder, "ResultHolder not provided.");
        ((zzam) mo21626I()).mo50527l4((String[]) list.toArray(new String[0]), new zzax(resultHolder), mo21621D().getPackageName());
    }

    /* renamed from: N0 */
    public final Location mo50566N0(String str) throws RemoteException {
        if (ArrayUtils.m4843c(mo21653r(), zzu.f46120c)) {
            return this.f41099b0.mo50538a(str);
        }
        return this.f41099b0.mo50539b();
    }

    /* renamed from: X */
    public final boolean mo21639X() {
        return true;
    }

    /* renamed from: b */
    public final void mo21640b() {
        synchronized (this.f41099b0) {
            if (mo21641c()) {
                try {
                    this.f41099b0.mo50551n();
                    this.f41099b0.mo50552o();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo21640b();
        }
    }

    /* renamed from: s0 */
    public final LocationAvailability mo50567s0() throws RemoteException {
        return this.f41099b0.mo50540c();
    }

    /* renamed from: t0 */
    public final void mo50568t0(zzba zzba, ListenerHolder<LocationCallback> listenerHolder, zzai zzai) throws RemoteException {
        synchronized (this.f41099b0) {
            this.f41099b0.mo50542e(zzba, listenerHolder, zzai);
        }
    }

    /* renamed from: u0 */
    public final void mo50569u0(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, zzai zzai) throws RemoteException {
        synchronized (this.f41099b0) {
            this.f41099b0.mo50541d(locationRequest, listenerHolder, zzai);
        }
    }

    /* renamed from: v0 */
    public final void mo50570v0(zzba zzba, PendingIntent pendingIntent, zzai zzai) throws RemoteException {
        this.f41099b0.mo50543f(zzba, pendingIntent, zzai);
    }

    /* renamed from: w0 */
    public final void mo50571w0(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzai) throws RemoteException {
        this.f41099b0.mo50544g(locationRequest, pendingIntent, zzai);
    }

    /* renamed from: x0 */
    public final void mo50572x0(ListenerHolder.ListenerKey<LocationListener> listenerKey, zzai zzai) throws RemoteException {
        this.f41099b0.mo50545h(listenerKey, zzai);
    }

    /* renamed from: y0 */
    public final void mo50573y0(PendingIntent pendingIntent, zzai zzai) throws RemoteException {
        this.f41099b0.mo50547j(pendingIntent, zzai);
    }

    /* renamed from: z0 */
    public final void mo50574z0(ListenerHolder.ListenerKey<LocationCallback> listenerKey, zzai zzai) throws RemoteException {
        this.f41099b0.mo50546i(listenerKey, zzai);
    }
}
