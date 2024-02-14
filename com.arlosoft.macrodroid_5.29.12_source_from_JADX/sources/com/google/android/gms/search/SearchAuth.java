package com.google.android.gms.search;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.icing.zzav;
import com.google.android.gms.internal.icing.zzbc;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public class SearchAuth {
    @NonNull

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f47927a;
    @NonNull

    /* renamed from: b */
    public static final SearchAuthApi f47928b = new zzbc();

    /* renamed from: c */
    private static final Api.AbstractClientBuilder<zzav, Api.ApiOptions.NoOptions> f47929c;
    @NonNull

    /* renamed from: d */
    public static final Api.ClientKey<zzav> f47930d;

    /* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
    public static class StatusCodes {
    }

    static {
        zzb zzb = new zzb();
        f47929c = zzb;
        Api.ClientKey<zzav> clientKey = new Api.ClientKey<>();
        f47930d = clientKey;
        f47927a = new Api<>("SearchAuth.API", zzb, clientKey);
    }

    private SearchAuth() {
    }
}
