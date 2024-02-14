package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbq;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzal extends zza implements zzam {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: Gb */
    public final void mo50513Gb(boolean z) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59297a(y, z);
        mo50500A1(12, y);
    }

    /* renamed from: H7 */
    public final LocationAvailability mo50514H7(String str) throws RemoteException {
        Parcel y = mo50503y();
        y.writeString(str);
        Parcel t1 = mo50502t1(34, y);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.m59298b(t1, LocationAvailability.CREATOR);
        t1.recycle();
        return locationAvailability;
    }

    /* renamed from: I3 */
    public final void mo50515I3(zzl zzl) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, zzl);
        mo50500A1(75, y);
    }

    /* renamed from: L1 */
    public final void mo50516L1(LocationSettingsRequest locationSettingsRequest, zzao zzao, String str) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, locationSettingsRequest);
        zzc.m59300d(y, zzao);
        y.writeString((String) null);
        mo50500A1(63, y);
    }

    /* renamed from: Ua */
    public final void mo50517Ua(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzak) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, geofencingRequest);
        zzc.m59299c(y, pendingIntent);
        zzc.m59300d(y, zzak);
        mo50500A1(57, y);
    }

    /* renamed from: Z */
    public final Location mo50518Z(String str) throws RemoteException {
        Parcel y = mo50503y();
        y.writeString(str);
        Parcel t1 = mo50502t1(80, y);
        Location location = (Location) zzc.m59298b(t1, Location.CREATOR);
        t1.recycle();
        return location;
    }

    /* renamed from: Z1 */
    public final void mo50519Z1(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, pendingIntent);
        zzc.m59300d(y, iStatusCallback);
        mo50500A1(73, y);
    }

    /* renamed from: c2 */
    public final void mo50520c2(zzbc zzbc) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, zzbc);
        mo50500A1(59, y);
    }

    /* renamed from: g4 */
    public final void mo50521g4(Location location) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, location);
        mo50500A1(13, y);
    }

    /* renamed from: h5 */
    public final void mo50522h5(zzai zzai) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59300d(y, zzai);
        mo50500A1(67, y);
    }

    /* renamed from: h9 */
    public final void mo50523h9(zzbq zzbq, zzak zzak) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, zzbq);
        zzc.m59300d(y, zzak);
        mo50500A1(74, y);
    }

    /* renamed from: i8 */
    public final void mo50524i8(PendingIntent pendingIntent) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, pendingIntent);
        mo50500A1(6, y);
    }

    /* renamed from: k */
    public final Location mo50525k() throws RemoteException {
        Parcel t1 = mo50502t1(7, mo50503y());
        Location location = (Location) zzc.m59298b(t1, Location.CREATOR);
        t1.recycle();
        return location;
    }

    /* renamed from: k9 */
    public final void mo50526k9(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel y = mo50503y();
        y.writeLong(j);
        zzc.m59297a(y, true);
        zzc.m59299c(y, pendingIntent);
        mo50500A1(5, y);
    }

    /* renamed from: l4 */
    public final void mo50527l4(String[] strArr, zzak zzak, String str) throws RemoteException {
        Parcel y = mo50503y();
        y.writeStringArray(strArr);
        zzc.m59300d(y, zzak);
        y.writeString(str);
        mo50500A1(3, y);
    }

    /* renamed from: p3 */
    public final void mo50528p3(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, pendingIntent);
        zzc.m59300d(y, iStatusCallback);
        mo50500A1(69, y);
    }

    /* renamed from: qb */
    public final void mo50529qb(PendingIntent pendingIntent, zzak zzak, String str) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, pendingIntent);
        zzc.m59300d(y, zzak);
        y.writeString(str);
        mo50500A1(2, y);
    }

    /* renamed from: r5 */
    public final void mo50530r5(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, activityTransitionRequest);
        zzc.m59299c(y, pendingIntent);
        zzc.m59300d(y, iStatusCallback);
        mo50500A1(72, y);
    }

    /* renamed from: tb */
    public final void mo50531tb(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel y = mo50503y();
        zzc.m59299c(y, pendingIntent);
        zzc.m59299c(y, sleepSegmentRequest);
        zzc.m59300d(y, iStatusCallback);
        mo50500A1(79, y);
    }
}
