package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.internal.zzx;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznr extends zzx {

    /* renamed from: a */
    private final ListenerHolder f44976a;

    public zznr(ListenerHolder listenerHolder) {
        this.f44976a = listenerHolder;
    }

    /* renamed from: l0 */
    public final void mo53033l0(boolean z) {
        this.f44976a.mo21377c(new zznq(this, z));
    }
}
