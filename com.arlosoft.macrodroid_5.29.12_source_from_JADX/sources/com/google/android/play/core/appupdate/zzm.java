package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzp;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzm extends zzah {

    /* renamed from: c */
    final /* synthetic */ zzi f51146c;

    /* renamed from: d */
    final /* synthetic */ String f51147d;

    /* renamed from: f */
    final /* synthetic */ zzq f51148f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzp) this.f51148f.f51156a.mo59819e()).mo59897cb(this.f51148f.f51157b, zzq.m70438h(), new zzo(this.f51148f, this.f51146c));
        } catch (RemoteException e) {
            zzq.f51154e.mo59807c(e, "completeUpdate(%s)", this.f51147d);
            this.f51146c.mo60033d(new RuntimeException(e));
        }
    }
}
