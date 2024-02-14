package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuthApi;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzbb implements SearchAuthApi.GoogleNowAuthResult {

    /* renamed from: a */
    private final Status f40769a;

    /* renamed from: c */
    private final GoogleNowAuthState f40770c;

    zzbb(Status status, GoogleNowAuthState googleNowAuthState) {
        this.f40769a = status;
        this.f40770c = googleNowAuthState;
    }

    public final Status getStatus() {
        return this.f40769a;
    }
}
