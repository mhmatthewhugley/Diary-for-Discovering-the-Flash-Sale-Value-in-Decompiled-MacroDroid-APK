package com.google.android.gms.auth.api.phone;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.p202authapiphone.zzv;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {

    /* renamed from: k */
    private static final Api.ClientKey<zzv> f2833k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder<zzv, Api.ApiOptions.NoOptions> f2834l;

    /* renamed from: m */
    private static final Api<Api.ApiOptions.NoOptions> f2835m;

    static {
        Api.ClientKey<zzv> clientKey = new Api.ClientKey<>();
        f2833k = clientKey;
        zza zza = new zza();
        f2834l = zza;
        f2835m = new Api<>("SmsRetriever.API", zza, clientKey);
    }

    public SmsRetrieverClient(@NonNull Context context) {
        super(context, f2835m, null, GoogleApi.Settings.f3103c);
    }

    /* renamed from: G */
    public abstract Task<Void> mo20951G();
}
