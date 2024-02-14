package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgg extends zzkb {

    /* renamed from: a */
    private final ListenerHolder f44659a;

    /* renamed from: c */
    private final Set f44660c = new ArraySet();

    zzgg(ListenerHolder listenerHolder) {
        this.f44659a = (ListenerHolder) Preconditions.m4488k(listenerHolder);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static boolean m62489A1(zzle zzle) {
        if (zzle.mo52855l2() == null || (zzle.mo52856m2() != null && !"__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(zzle.mo52856m2()))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo52725b() {
        for (String zzgf : this.f44660c) {
            this.f44659a.mo21377c(new zzgf(this, zzgf));
        }
        this.f44660c.clear();
    }

    /* renamed from: g5 */
    public final synchronized void mo52726g5(zzlg zzlg) {
        this.f44660c.remove(zzlg.zza());
        this.f44659a.mo21377c(new zzge(this, zzlg));
    }

    /* renamed from: kb */
    public final synchronized void mo52727kb(zzlc zzlc) {
        this.f44659a.mo21377c(new zzgc(this, zzlc));
    }

    /* renamed from: w8 */
    public final synchronized void mo52728w8(zzle zzle) {
        if (!m62489A1(zzle)) {
            this.f44660c.add(zzle.mo52856m2());
        }
        this.f44659a.mo21377c(new zzgd(this, zzle));
    }
}
