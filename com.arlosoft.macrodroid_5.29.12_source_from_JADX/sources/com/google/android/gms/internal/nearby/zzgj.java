package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgj extends zzkb {

    /* renamed from: a */
    private final ListenerHolder f44663a;

    zzgj(ListenerHolder listenerHolder) {
        this.f44663a = (ListenerHolder) Preconditions.m4488k(listenerHolder);
    }

    /* renamed from: g5 */
    public final void mo52726g5(zzlg zzlg) {
        this.f44663a.mo21377c(new zzgi(this, zzlg));
    }

    /* renamed from: kb */
    public final synchronized void mo52727kb(zzlc zzlc) {
    }

    /* renamed from: w8 */
    public final void mo52728w8(zzle zzle) {
        this.f44663a.mo21377c(new zzgh(this, zzle));
    }
}
