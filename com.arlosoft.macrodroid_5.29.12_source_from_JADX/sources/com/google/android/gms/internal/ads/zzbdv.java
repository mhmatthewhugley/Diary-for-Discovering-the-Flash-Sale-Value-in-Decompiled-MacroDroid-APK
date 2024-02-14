package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbdv implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    final /* synthetic */ zzbdx f26666a;

    zzbdv(zzbdx zzbdx) {
        this.f26666a = zzbdx;
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        synchronized (this.f26666a.f26670c) {
            this.f26666a.f26673f = null;
            this.f26666a.f26670c.notifyAll();
        }
    }

    /* renamed from: y */
    public final void mo21660y(@Nullable Bundle bundle) {
        synchronized (this.f26666a.f26670c) {
            try {
                zzbdx zzbdx = this.f26666a;
                if (zzbdx.f26671d != null) {
                    zzbdx.f26673f = zzbdx.f26671d.mo42532p0();
                }
            } catch (DeadObjectException e) {
                zzcgp.m45227e("Unable to obtain a cache service instance.", e);
                zzbdx.m43199h(this.f26666a);
            }
            this.f26666a.f26670c.notifyAll();
        }
    }
}
