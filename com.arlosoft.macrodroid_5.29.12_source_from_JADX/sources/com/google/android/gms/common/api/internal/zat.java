package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final Api f3481a;

    /* renamed from: c */
    private final boolean f3482c;
    @Nullable

    /* renamed from: d */
    private zau f3483d;

    public zat(Api api, boolean z) {
        this.f3481a = api;
        this.f3482c = z;
    }

    /* renamed from: b */
    private final zau m4259b() {
        Preconditions.m4489l(this.f3483d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f3483d;
    }

    /* renamed from: A1 */
    public final void mo21388A1(@NonNull ConnectionResult connectionResult) {
        m4259b().mo21458g8(connectionResult, this.f3481a, this.f3482c);
    }

    /* renamed from: a */
    public final void mo21530a(zau zau) {
        this.f3483d = zau;
    }

    /* renamed from: t1 */
    public final void mo21335t1(int i) {
        m4259b().mo21335t1(i);
    }

    /* renamed from: y */
    public final void mo21336y(@Nullable Bundle bundle) {
        m4259b().mo21336y(bundle);
    }
}
