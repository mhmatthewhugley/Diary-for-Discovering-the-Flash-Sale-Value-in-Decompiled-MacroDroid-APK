package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zah implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    final /* synthetic */ ConnectionCallbacks f3708a;

    zah(ConnectionCallbacks connectionCallbacks) {
        this.f3708a = connectionCallbacks;
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        this.f3708a.mo21335t1(i);
    }

    /* renamed from: y */
    public final void mo21660y(@Nullable Bundle bundle) {
        this.f3708a.mo21336y(bundle);
    }
}
