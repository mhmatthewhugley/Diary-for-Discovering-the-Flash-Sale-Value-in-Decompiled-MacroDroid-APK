package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.zza;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzn extends GmsClient {
    public zzn(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, 236, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return new Feature[]{zza.f47880h, zza.f47881i, zza.f47882j, zza.f47883k, zza.f47884l, zza.f47886n, zza.f47885m, zza.f47887o, zza.f47888p, zza.f47889q, zza.f47890r};
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.nearby.exposurenotification.internal.INearbyExposureNotificationService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.nearby.exposurenotification.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo21629N() {
        return true;
    }

    /* renamed from: i */
    public final boolean mo21647i() {
        return Nearby.m66237b(mo21621D());
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 201516000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.INearbyExposureNotificationService");
        return queryLocalInterface instanceof zzdr ? (zzdr) queryLocalInterface : new zzdq(iBinder);
    }
}
