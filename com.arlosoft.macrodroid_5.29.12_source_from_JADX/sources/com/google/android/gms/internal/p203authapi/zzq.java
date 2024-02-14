package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api.zzq */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzq extends GmsClient<zzx> {

    /* renamed from: Z */
    private final Auth.AuthCredentialsOptions f39156Z;

    public zzq(Context context, Looper looper, ClientSettings clientSettings, Auth.AuthCredentialsOptions authCredentialsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f39156Z = new Auth.AuthCredentialsOptions.Builder(authCredentialsOptions == null ? Auth.AuthCredentialsOptions.f2674f : authCredentialsOptions).mo20775a(zzba.m55706a()).mo20776b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo21623F() {
        return this.f39156Z.mo20771b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zzx) {
            return (zzx) queryLocalInterface;
        }
        return new zzw(iBinder);
    }
}
