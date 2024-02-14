package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.uwb.zze;
import com.google.android.gms.nearby.zza;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzqs extends GmsClient {
    @Nullable

    /* renamed from: Z */
    private final zze f45038Z;
    @Nullable

    /* renamed from: a0 */
    private Long f45039a0;

    public zzqs(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, @Nullable zze zze) {
        super(context, looper, 298, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f45038Z = zze;
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return new Feature[]{zza.f47863I, zza.f47864J, zza.f47865K};
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo21623F() {
        Bundle bundle = new Bundle();
        if (this.f45039a0 == null) {
            this.f45039a0 = Long.valueOf((long) hashCode());
        }
        bundle.putLong("clientId", this.f45039a0.longValue());
        zze zze = this.f45038Z;
        if (zze != null) {
            bundle.putInt("deviceType", zze.mo56062a());
            bundle.putBoolean("isTestOnly", false);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.nearby.uwb.internal.INearbyUwbService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.nearby.uwb.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo21629N() {
        return true;
    }

    /* renamed from: b */
    public final void mo21640b() {
        if (mo21641c()) {
            try {
                ((zzos) mo21626I()).mo53093Z8(new zzob());
            } catch (RemoteException e) {
                Log.w("NearbyUwbClient", "Failed to notify client disconnect.", e);
            }
        }
        super.mo21640b();
    }

    /* renamed from: i */
    public final boolean mo21647i() {
        return Nearby.m66237b(mo21621D());
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 211600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
        return queryLocalInterface instanceof zzos ? (zzos) queryLocalInterface : new zzos(iBinder);
    }
}
