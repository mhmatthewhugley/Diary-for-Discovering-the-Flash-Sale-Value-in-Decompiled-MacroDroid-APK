package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzf extends GmsClient<zzv> {

    /* renamed from: Z */
    private static final Api.ClientKey<zzf> f53860Z;

    /* renamed from: a0 */
    private static final Api.AbstractClientBuilder<zzf, Api.ApiOptions.NoOptions> f53861a0;

    /* renamed from: b0 */
    static final Api<Api.ApiOptions.NoOptions> f53862b0;

    static {
        Api.ClientKey<zzf> clientKey = new Api.ClientKey<>();
        f53860Z = clientKey;
        zze zze = new zze();
        f53861a0 = zze;
        f53862b0 = new Api<>("AppIndexing.API", zze, clientKey);
    }

    public zzf(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 113, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    /* renamed from: X */
    public final boolean mo21639X() {
        return true;
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 12600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof zzv) {
            return (zzv) queryLocalInterface;
        }
        return new zzv(iBinder);
    }
}
