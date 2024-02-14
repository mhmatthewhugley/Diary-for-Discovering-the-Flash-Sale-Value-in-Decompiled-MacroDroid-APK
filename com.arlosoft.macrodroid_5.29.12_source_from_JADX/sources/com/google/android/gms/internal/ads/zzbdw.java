package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbdw implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    final /* synthetic */ zzbdx f26667a;

    zzbdw(zzbdx zzbdx) {
        this.f26667a = zzbdx;
    }

    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f26667a.f26670c) {
            this.f26667a.f26673f = null;
            zzbdx zzbdx = this.f26667a;
            if (zzbdx.f26671d != null) {
                zzbdx.f26671d = null;
            }
            this.f26667a.f26670c.notifyAll();
        }
    }
}
