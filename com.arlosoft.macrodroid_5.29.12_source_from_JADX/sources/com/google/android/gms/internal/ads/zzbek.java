package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbek implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    final /* synthetic */ zzchh f26700a;

    /* renamed from: c */
    final /* synthetic */ zzbel f26701c;

    zzbek(zzbel zzbel, zzchh zzchh) {
        this.f26701c = zzbel;
        this.f26700a = zzchh;
    }

    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f26701c.f26705d) {
            this.f26700a.mo43575d(new RuntimeException("Connection failed."));
        }
    }
}
