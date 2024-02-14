package com.google.android.gms.auth.account;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

public class WorkAccount {

    /* renamed from: a */
    private static final Api.ClientKey<zzr> f2660a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzr, Api.ApiOptions.NoOptions> f2661b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f2662c;
    @Deprecated

    /* renamed from: d */
    public static final WorkAccountApi f2663d = new zzh();

    static {
        Api.ClientKey<zzr> clientKey = new Api.ClientKey<>();
        f2660a = clientKey;
        zzf zzf = new zzf();
        f2661b = zzf;
        f2662c = new Api<>("WorkAccount.API", zzf, clientKey);
    }

    private WorkAccount() {
    }
}
