package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zai implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    final /* synthetic */ OnConnectionFailedListener f3709a;

    zai(OnConnectionFailedListener onConnectionFailedListener) {
        this.f3709a = onConnectionFailedListener;
    }

    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
        this.f3709a.mo21388A1(connectionResult);
    }
}
