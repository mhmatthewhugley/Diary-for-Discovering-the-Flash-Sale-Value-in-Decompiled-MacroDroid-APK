package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaj implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final int f3460a;

    /* renamed from: c */
    public final GoogleApiClient f3461c;
    @Nullable

    /* renamed from: d */
    public final GoogleApiClient.OnConnectionFailedListener f3462d;

    /* renamed from: f */
    final /* synthetic */ zak f3463f;

    public zaj(zak zak, int i, @Nullable GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3463f = zak;
        this.f3460a = i;
        this.f3461c = googleApiClient;
        this.f3462d = onConnectionFailedListener;
    }

    /* renamed from: A1 */
    public final void mo21388A1(@NonNull ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f3463f.mo21527s(connectionResult, this.f3460a);
    }
}
