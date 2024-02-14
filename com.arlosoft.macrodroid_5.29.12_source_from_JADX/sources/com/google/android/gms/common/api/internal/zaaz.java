package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaaz implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f3312a;

    /* renamed from: c */
    final /* synthetic */ StatusPendingResult f3313c;

    /* renamed from: d */
    final /* synthetic */ zabe f3314d;

    /* renamed from: t1 */
    public final void mo21335t1(int i) {
    }

    /* renamed from: y */
    public final void mo21336y(@Nullable Bundle bundle) {
        this.f3314d.m4018E((GoogleApiClient) Preconditions.m4488k((GoogleApiClient) this.f3312a.get()), this.f3313c, true);
    }
}
