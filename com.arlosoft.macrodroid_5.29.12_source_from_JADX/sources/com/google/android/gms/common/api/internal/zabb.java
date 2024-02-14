package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabb implements ResultCallback {

    /* renamed from: a */
    final /* synthetic */ StatusPendingResult f3316a;

    /* renamed from: c */
    final /* synthetic */ boolean f3317c;

    /* renamed from: d */
    final /* synthetic */ GoogleApiClient f3318d;

    /* renamed from: f */
    final /* synthetic */ zabe f3319f;

    zabb(zabe zabe, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f3319f = zabe;
        this.f3316a = statusPendingResult;
        this.f3317c = z;
        this.f3318d = googleApiClient;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo21280A(@NonNull Result result) {
        Status status = (Status) result;
        Storage.m3343b(this.f3319f.f3326f).mo21020i();
        if (status.mo21297q2() && this.f3319f.mo21255l()) {
            zabe zabe = this.f3319f;
            zabe.mo21250f();
            zabe.mo21249e();
        }
        this.f3316a.mo21329l(status);
        if (this.f3317c) {
            this.f3318d.mo21250f();
        }
    }
}
