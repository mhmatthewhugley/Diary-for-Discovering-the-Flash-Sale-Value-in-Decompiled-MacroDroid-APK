package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.auth.account.zzd;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzr extends GmsClient<zzc> {
    public zzr(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 120, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        return zzd.m3129t1(iBinder);
    }
}
