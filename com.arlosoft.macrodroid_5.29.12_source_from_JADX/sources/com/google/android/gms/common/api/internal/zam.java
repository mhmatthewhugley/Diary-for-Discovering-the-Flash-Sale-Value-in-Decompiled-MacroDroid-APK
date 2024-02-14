package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zam {

    /* renamed from: a */
    private final int f3470a;

    /* renamed from: b */
    private final ConnectionResult f3471b;

    zam(ConnectionResult connectionResult, int i) {
        Preconditions.m4488k(connectionResult);
        this.f3471b = connectionResult;
        this.f3470a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo21523a() {
        return this.f3470a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult mo21524b() {
        return this.f3471b;
    }
}
