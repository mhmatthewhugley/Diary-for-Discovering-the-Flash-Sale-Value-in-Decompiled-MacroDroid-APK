package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfx extends zzju implements zzgk {

    /* renamed from: a */
    private final ListenerHolder f44646a;

    /* renamed from: c */
    private final Set f44647c = new ArraySet();

    /* renamed from: d */
    private final Set f44648d = new ArraySet();

    zzfx(ListenerHolder listenerHolder) {
        this.f44646a = (ListenerHolder) Preconditions.m4488k(listenerHolder);
    }

    /* renamed from: P2 */
    public final synchronized void mo52718P2(zzky zzky) {
        this.f44647c.remove(zzky.mo52834l2());
        Status y0 = zzgy.m62516w0(zzky.zza());
        if (y0.mo21297q2()) {
            this.f44648d.add(zzky.mo52834l2());
        }
        this.f44646a.mo21377c(new zzfs(this, zzky, y0));
    }

    /* renamed from: X6 */
    public final synchronized void mo52719X6(zzla zzla) {
        this.f44648d.remove(zzla.zza());
        this.f44646a.mo21377c(new zzft(this, zzla));
    }

    /* renamed from: c */
    public final synchronized void mo52720c() {
        for (String zzfv : this.f44647c) {
            this.f44646a.mo21377c(new zzfv(this, zzfv));
        }
        this.f44647c.clear();
        for (String zzfw : this.f44648d) {
            this.f44646a.mo21377c(new zzfw(this, zzfw));
        }
        this.f44648d.clear();
    }

    /* renamed from: ib */
    public final void mo52721ib(zzkq zzkq) {
        this.f44646a.mo21377c(new zzfu(this, zzkq));
    }

    /* renamed from: u8 */
    public final synchronized void mo52722u8(zzks zzks) {
        this.f44647c.add(zzks.mo52806l2());
        this.f44646a.mo21377c(new zzfr(this, zzks));
    }
}
