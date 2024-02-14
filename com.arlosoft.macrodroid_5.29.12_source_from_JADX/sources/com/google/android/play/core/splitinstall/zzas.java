package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzas extends zzah {

    /* renamed from: c */
    final /* synthetic */ int f51911c;

    /* renamed from: d */
    final /* synthetic */ zzi f51912d;

    /* renamed from: f */
    final /* synthetic */ zzbc f51913f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzca) this.f51913f.f51919b.mo59819e()).mo59847n4(this.f51913f.f51918a, this.f51911c, zzbc.m71210a(), new zzat(this.f51913f, this.f51912d));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "cancelInstall(%d)", Integer.valueOf(this.f51911c));
            this.f51912d.mo60033d(new RuntimeException(e));
        }
    }
}
