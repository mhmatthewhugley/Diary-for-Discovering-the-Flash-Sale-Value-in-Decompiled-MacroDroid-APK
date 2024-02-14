package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaa extends Api.AbstractClientBuilder {
    zaa() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        SignInOptions signInOptions = (SignInOptions) obj;
        return new SignInClientImpl(context, looper, true, clientSettings, SignInClientImpl.m66587r0(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
