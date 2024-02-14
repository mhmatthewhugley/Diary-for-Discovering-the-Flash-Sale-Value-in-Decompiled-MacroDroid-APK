package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* renamed from: com.google.android.gms.internal.auth-api.zzak */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzak extends GoogleApi<zzf> implements CredentialSavingClient {

    /* renamed from: k */
    private static final Api.ClientKey<zzab> f39119k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder<zzab, zzf> f39120l;

    /* renamed from: m */
    private static final Api<zzf> f39121m;

    static {
        Api.ClientKey<zzab> clientKey = new Api.ClientKey<>();
        f39119k = clientKey;
        zzam zzam = new zzam();
        f39120l = zzam;
        f39121m = new Api<>("Auth.Api.Identity.CredentialSaving.API", zzam, clientKey);
    }
}
