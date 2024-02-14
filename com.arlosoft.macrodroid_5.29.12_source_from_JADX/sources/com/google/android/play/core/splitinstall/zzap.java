package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzap extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51903c;

    /* renamed from: d */
    final /* synthetic */ zzi f51904d;

    /* renamed from: f */
    final /* synthetic */ zzbc f51905f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzca) this.f51905f.f51919b.mo59819e()).mo59842A3(this.f51905f.f51918a, zzbc.m71213d(this.f51903c), zzbc.m71210a(), new zzaw(this.f51905f, this.f51904d));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "deferredLanguageUninstall(%s)", this.f51903c);
            this.f51904d.mo60033d(new RuntimeException(e));
        }
    }
}
