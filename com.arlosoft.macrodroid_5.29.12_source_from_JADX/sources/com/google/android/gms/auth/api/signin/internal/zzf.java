package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.p203authapi.zzba;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzf extends GmsClient<zzt> {

    /* renamed from: Z */
    private final GoogleSignInOptions f2934Z;

    public zzf(Context context, Looper looper, ClientSettings clientSettings, @Nullable GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.Builder builder;
        if (googleSignInOptions != null) {
            builder = new GoogleSignInOptions.Builder(googleSignInOptions);
        } else {
            builder = new GoogleSignInOptions.Builder();
        }
        builder.mo20997h(zzba.m55706a());
        if (!clientSettings.mo21671e().isEmpty()) {
            for (Scope f : clientSettings.mo21671e()) {
                builder.mo20995f(f, new Scope[0]);
            }
        }
        this.f2934Z = builder.mo20990a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: d */
    public final boolean mo21031d() {
        return true;
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: r0 */
    public final GoogleSignInOptions mo21033r0() {
        return this.f2934Z;
    }

    /* renamed from: u */
    public final Intent mo21034u() {
        return zzi.m3369b(mo21621D(), this.f2934Z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zzt) {
            return (zzt) queryLocalInterface;
        }
        return new zzw(iBinder);
    }
}
