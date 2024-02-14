package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzed extends BaseGmsClient {
    public zzed(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(context, looper, 93, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(iBinder);
    }
}
