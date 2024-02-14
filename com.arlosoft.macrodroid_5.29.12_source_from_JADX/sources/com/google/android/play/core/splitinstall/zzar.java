package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzar extends zzah {

    /* renamed from: c */
    final /* synthetic */ zzi f51909c;

    /* renamed from: d */
    final /* synthetic */ zzbc f51910d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            zzbc zzbc = this.f51910d;
            ((zzca) this.f51910d.f51919b.mo59819e()).mo59846l7(zzbc.f51918a, new zzaz(zzbc, this.f51909c));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "getSessionStates", new Object[0]);
            this.f51909c.mo60033d(new RuntimeException(e));
        }
    }
}
