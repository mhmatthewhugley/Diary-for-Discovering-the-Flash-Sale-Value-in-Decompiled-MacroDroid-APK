package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzal extends zzah {

    /* renamed from: c */
    final /* synthetic */ Collection f51890c;

    /* renamed from: d */
    final /* synthetic */ Collection f51891d;

    /* renamed from: f */
    final /* synthetic */ zzi f51892f;

    /* renamed from: g */
    final /* synthetic */ zzbc f51893g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        ArrayList e = zzbc.m71214e(this.f51890c);
        e.addAll(zzbc.m71213d(this.f51891d));
        try {
            ((zzca) this.f51893g.f51919b.mo59819e()).mo59848vb(this.f51893g.f51918a, e, zzbc.m71210a(), new zzba(this.f51893g, this.f51892f));
        } catch (RemoteException e2) {
            zzbc.f51916c.mo59807c(e2, "startInstall(%s,%s)", this.f51890c, this.f51891d);
            this.f51892f.mo60033d(new RuntimeException(e2));
        }
    }
}
