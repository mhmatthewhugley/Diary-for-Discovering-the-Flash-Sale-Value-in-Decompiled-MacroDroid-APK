package com.google.android.gms.safetynet;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.internal.safetynet.zzy;

public final class SafetyNet {

    /* renamed from: a */
    private static final Api.ClientKey<zzx> f47910a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> f47911b;
    @Deprecated

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f47912c;
    @Deprecated

    /* renamed from: d */
    public static final SafetyNetApi f47913d = new zzk();

    /* renamed from: e */
    private static final zzo f47914e = new zzy();

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.internal.safetynet.zzy, com.google.android.gms.safetynet.zzo] */
    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        f47910a = clientKey;
        zzk zzk = new zzk();
        f47911b = zzk;
        f47912c = new Api<>("SafetyNet.API", zzk, clientKey);
    }

    private SafetyNet() {
    }

    /* renamed from: a */
    public static SafetyNetClient m66567a(@NonNull Context context) {
        return new SafetyNetClient(context);
    }
}
