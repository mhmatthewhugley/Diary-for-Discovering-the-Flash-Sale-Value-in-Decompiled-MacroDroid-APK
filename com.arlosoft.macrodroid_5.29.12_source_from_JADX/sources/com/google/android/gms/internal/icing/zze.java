package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zze {

    /* renamed from: a */
    public static final Api.ClientKey<zzae> f40910a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzae, Api.ApiOptions.NoOptions> f40911b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f40912c;
    @Deprecated

    /* renamed from: d */
    public static final zzz f40913d = new zzal();

    static {
        Api.ClientKey<zzae> clientKey = new Api.ClientKey<>();
        f40910a = clientKey;
        zzd zzd = new zzd();
        f40911b = zzd;
        f40912c = new Api<>("AppDataSearch.LIGHTWEIGHT_API", zzd, clientKey);
    }
}
