package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzd extends GmsClient<zzg> {
    protected zzd(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 300, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return zze.f2638b;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.appset.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo21629N() {
        return true;
    }

    /* renamed from: X */
    public final boolean mo21639X() {
        return true;
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 212800000;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }
}
