package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzan extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51897c;

    /* renamed from: d */
    final /* synthetic */ zzi f51898d;

    /* renamed from: f */
    final /* synthetic */ zzbc f51899f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzca) this.f51899f.f51919b.mo59819e()).mo59849x2(this.f51899f.f51918a, zzbc.m71214e(this.f51897c), zzbc.m71210a(), new zzau(this.f51899f, this.f51898d));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "deferredInstall(%s)", this.f51897c);
            this.f51898d.mo60033d(new RuntimeException(e));
        }
    }
}
