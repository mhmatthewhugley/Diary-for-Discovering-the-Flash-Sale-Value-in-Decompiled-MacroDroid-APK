package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbro implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    final /* synthetic */ zzchh f27687a;

    zzbro(zzbrp zzbrp, zzchh zzchh) {
        this.f27687a = zzchh;
    }

    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
        this.f27687a.mo43575d(new RuntimeException("Connection failed."));
    }
}
