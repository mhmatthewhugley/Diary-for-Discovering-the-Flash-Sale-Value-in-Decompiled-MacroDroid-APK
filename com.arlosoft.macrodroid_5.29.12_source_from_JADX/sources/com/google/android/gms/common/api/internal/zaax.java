package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaax implements zabf {

    /* renamed from: a */
    private final zabi f3310a;

    public zaax(zabi zabi) {
        this.f3310a = zabi;
    }

    /* renamed from: a */
    public final void mo21434a(@Nullable Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo21435b() {
        for (Api.Client b : this.f3310a.f3359o.values()) {
            b.mo21195b();
        }
        this.f3310a.f3352E.f3336p = Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo21436c() {
        this.f3310a.mo21460o();
    }

    /* renamed from: d */
    public final void mo21437d(ConnectionResult connectionResult, Api api, boolean z) {
    }

    /* renamed from: e */
    public final void mo21438e(int i) {
    }

    /* renamed from: f */
    public final BaseImplementation.ApiMethodImpl mo21439f(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f3310a.f3352E.f3328h.add(apiMethodImpl);
        return apiMethodImpl;
    }

    /* renamed from: g */
    public final boolean mo21440g() {
        return true;
    }

    /* renamed from: h */
    public final BaseImplementation.ApiMethodImpl mo21441h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
