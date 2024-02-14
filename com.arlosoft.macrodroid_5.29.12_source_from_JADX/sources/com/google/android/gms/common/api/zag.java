package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zag<R extends Result> extends BasePendingResult<R> {

    /* renamed from: r */
    private final Result f3504r;

    public zag(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.f3504r = result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final R mo21036h(Status status) {
        return this.f3504r;
    }
}
