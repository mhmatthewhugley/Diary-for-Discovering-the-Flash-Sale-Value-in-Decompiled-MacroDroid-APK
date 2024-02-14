package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfz extends zzjo {

    /* renamed from: a */
    private final ListenerHolder f44650a;

    zzfz(ListenerHolder listenerHolder) {
        this.f44650a = (ListenerHolder) Preconditions.m4488k(listenerHolder);
    }

    /* renamed from: c9 */
    public final void mo52723c9(zzku zzku) {
        this.f44650a.mo21377c(new zzfy(this, zzku));
    }
}
