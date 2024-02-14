package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzt;
import com.google.android.gms.internal.auth.zzu;

public final class AccountTransfer {

    /* renamed from: a */
    private static final Api.ClientKey<zzu> f2685a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzu, zzn> f2686b;

    /* renamed from: c */
    private static final Api<zzn> f2687c;
    @Deprecated

    /* renamed from: d */
    private static final zzb f2688d = new zzt();

    /* renamed from: e */
    private static final zzq f2689e = new zzt();

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.auth.zzt, com.google.android.gms.auth.api.accounttransfer.zzb] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.internal.auth.zzt, com.google.android.gms.auth.api.accounttransfer.zzq] */
    static {
        Api.ClientKey<zzu> clientKey = new Api.ClientKey<>();
        f2685a = clientKey;
        zza zza = new zza();
        f2686b = zza;
        f2687c = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zza, clientKey);
    }

    private AccountTransfer() {
    }
}
