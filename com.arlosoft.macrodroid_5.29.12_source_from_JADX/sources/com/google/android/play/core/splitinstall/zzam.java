package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzam extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51894c;

    /* renamed from: d */
    final /* synthetic */ zzi f51895d;

    /* renamed from: f */
    final /* synthetic */ zzbc f51896f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzca) this.f51896f.f51919b.mo59819e()).mo59844Y9(this.f51896f.f51918a, zzbc.m71214e(this.f51894c), zzbc.m71210a(), new zzax(this.f51896f, this.f51895d));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "deferredUninstall(%s)", this.f51894c);
            this.f51895d.mo60033d(new RuntimeException(e));
        }
    }
}
