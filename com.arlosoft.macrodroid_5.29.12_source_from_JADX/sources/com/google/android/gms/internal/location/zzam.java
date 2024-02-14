package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzbq;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public interface zzam extends IInterface {
    /* renamed from: Gb */
    void mo50513Gb(boolean z) throws RemoteException;

    /* renamed from: H7 */
    LocationAvailability mo50514H7(String str) throws RemoteException;

    /* renamed from: I3 */
    void mo50515I3(zzl zzl) throws RemoteException;

    /* renamed from: L1 */
    void mo50516L1(LocationSettingsRequest locationSettingsRequest, zzao zzao, String str) throws RemoteException;

    /* renamed from: Ua */
    void mo50517Ua(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzak) throws RemoteException;

    /* renamed from: Z */
    Location mo50518Z(@Nullable String str) throws RemoteException;

    /* renamed from: Z1 */
    void mo50519Z1(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: c2 */
    void mo50520c2(zzbc zzbc) throws RemoteException;

    /* renamed from: g4 */
    void mo50521g4(Location location) throws RemoteException;

    /* renamed from: h5 */
    void mo50522h5(zzai zzai) throws RemoteException;

    /* renamed from: h9 */
    void mo50523h9(zzbq zzbq, zzak zzak) throws RemoteException;

    /* renamed from: i8 */
    void mo50524i8(PendingIntent pendingIntent) throws RemoteException;

    @Deprecated
    /* renamed from: k */
    Location mo50525k() throws RemoteException;

    /* renamed from: k9 */
    void mo50526k9(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: l4 */
    void mo50527l4(String[] strArr, zzak zzak, String str) throws RemoteException;

    /* renamed from: p3 */
    void mo50528p3(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: qb */
    void mo50529qb(PendingIntent pendingIntent, zzak zzak, String str) throws RemoteException;

    /* renamed from: r5 */
    void mo50530r5(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: tb */
    void mo50531tb(PendingIntent pendingIntent, @Nullable SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException;
}
