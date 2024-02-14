package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbrn implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    final /* synthetic */ zzchh f27685a;

    /* renamed from: c */
    final /* synthetic */ zzbrp f27686c;

    zzbrn(zzbrp zzbrp, zzchh zzchh) {
        this.f27686c = zzbrp;
        this.f27685a = zzchh;
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        zzchh zzchh = this.f27685a;
        zzchh.mo43575d(new RuntimeException("onConnectionSuspended: " + i));
    }

    /* renamed from: y */
    public final void mo21660y(@Nullable Bundle bundle) {
        try {
            this.f27685a.mo43574c(this.f27686c.f27688a.mo42920o0());
        } catch (DeadObjectException e) {
            this.f27685a.mo43575d(e);
        }
    }
}
