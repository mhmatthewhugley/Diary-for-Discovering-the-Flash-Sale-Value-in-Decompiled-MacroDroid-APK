package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzao extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51900c;

    /* renamed from: d */
    final /* synthetic */ zzi f51901d;

    /* renamed from: f */
    final /* synthetic */ zzbc f51902f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzca) this.f51902f.f51919b.mo59819e()).mo59845d3(this.f51902f.f51918a, zzbc.m71213d(this.f51900c), zzbc.m71210a(), new zzav(this.f51902f, this.f51901d));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "deferredLanguageInstall(%s)", this.f51900c);
            this.f51901d.mo60033d(new RuntimeException(e));
        }
    }
}
