package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* renamed from: com.google.android.gms.internal.auth-api.zzao */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzao extends GoogleApi<zzl> implements SignInClient {

    /* renamed from: k */
    private static final Api.ClientKey<zzaw> f39124k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder<zzaw, zzl> f39125l;

    /* renamed from: m */
    private static final Api<zzl> f39126m;

    static {
        Api.ClientKey<zzaw> clientKey = new Api.ClientKey<>();
        f39124k = clientKey;
        zzas zzas = new zzas();
        f39125l = zzas;
        f39126m = new Api<>("Auth.Api.Identity.SignIn.API", zzas, clientKey);
    }
}
