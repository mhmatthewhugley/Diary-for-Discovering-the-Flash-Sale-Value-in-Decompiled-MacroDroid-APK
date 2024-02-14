package com.google.android.gms.appindexing;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zze;

@Deprecated
@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class AppIndex {
    @NonNull

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f2627a;
    @NonNull
    @Deprecated

    /* renamed from: b */
    public static final Api<Api.ApiOptions.NoOptions> f2628b;
    @NonNull

    /* renamed from: c */
    public static final AppIndexApi f2629c = new zzal();

    static {
        Api<Api.ApiOptions.NoOptions> api = zze.f40912c;
        f2627a = api;
        f2628b = api;
    }

    private AppIndex() {
    }
}
