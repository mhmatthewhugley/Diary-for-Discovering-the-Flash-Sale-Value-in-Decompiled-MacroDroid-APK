package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.location.zzu;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class zzi extends GmsClient<zzam> {

    /* renamed from: Z */
    private final String f41143Z;

    /* renamed from: a0 */
    protected final zzbg<zzam> f41144a0 = new zzh(this);

    public zzi(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f41143Z = str;
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return zzu.f46123f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo21623F() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f41143Z);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 11717000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzal(iBinder);
    }
}
