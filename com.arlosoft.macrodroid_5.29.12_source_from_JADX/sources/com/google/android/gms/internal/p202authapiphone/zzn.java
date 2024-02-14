package com.google.android.gms.internal.p202authapiphone;

import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzn */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzn extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeAutofillClient {

    /* renamed from: k */
    private static final Api.ClientKey<zzv> f39104k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder<zzv, Api.ApiOptions.NoOptions> f39105l;

    /* renamed from: m */
    private static final Api<Api.ApiOptions.NoOptions> f39106m;

    static {
        Api.ClientKey<zzv> clientKey = new Api.ClientKey<>();
        f39104k = clientKey;
        zzr zzr = new zzr();
        f39105l = zzr;
        f39106m = new Api<>("SmsCodeAutofill.API", zzr, clientKey);
    }
}
