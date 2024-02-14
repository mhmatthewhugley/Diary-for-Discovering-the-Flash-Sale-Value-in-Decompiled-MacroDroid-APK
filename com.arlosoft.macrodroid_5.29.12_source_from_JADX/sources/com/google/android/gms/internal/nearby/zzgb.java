package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgb extends zzjx {

    /* renamed from: a */
    private final ListenerHolder f44654a;

    public zzgb(ListenerHolder listenerHolder) {
        this.f44654a = (ListenerHolder) Preconditions.m4488k(listenerHolder);
    }

    /* renamed from: d5 */
    public final void mo52724d5(zzkw zzkw) {
        this.f44654a.mo21377c(new zzga(this, zzkw));
    }
}
