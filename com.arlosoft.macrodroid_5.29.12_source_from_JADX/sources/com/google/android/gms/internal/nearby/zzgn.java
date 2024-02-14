package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgn extends zzjr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f44667a;

    /* renamed from: c */
    private final ListenerHolder f44668c;

    zzgn(Context context, ListenerHolder listenerHolder) {
        this.f44667a = (Context) Preconditions.m4488k(context);
        this.f44668c = (ListenerHolder) Preconditions.m4488k(listenerHolder);
    }

    /* renamed from: F6 */
    public final void mo52729F6(zzli zzli) {
        this.f44668c.mo21377c(new zzgl(this, zzli));
    }

    /* renamed from: Fa */
    public final void mo52730Fa(zzla zzla) {
        this.f44668c.mo21377c(new zzgm(this, zzla));
    }
}
