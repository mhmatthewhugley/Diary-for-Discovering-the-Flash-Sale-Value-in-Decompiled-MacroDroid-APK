package com.google.android.gms.internal.icing;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzav extends GmsClient<zzau> {
    public zzav(Context context, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, context.getMainLooper(), 73, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.search.internal.ISearchAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.search.service.SEARCH_AUTH_START";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
        if (queryLocalInterface instanceof zzau) {
            return (zzau) queryLocalInterface;
        }
        return new zzau(iBinder);
    }
}
