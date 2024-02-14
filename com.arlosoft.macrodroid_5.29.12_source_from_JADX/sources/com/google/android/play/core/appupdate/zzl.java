package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzp;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzl extends zzah {

    /* renamed from: c */
    final /* synthetic */ String f51143c;

    /* renamed from: d */
    final /* synthetic */ zzi f51144d;

    /* renamed from: f */
    final /* synthetic */ zzq f51145f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzl(zzq zzq, zzi zzi, String str, zzi zzi2) {
        super(zzi);
        this.f51145f = zzq;
        this.f51143c = str;
        this.f51144d = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            zzq zzq = this.f51145f;
            ((zzp) this.f51145f.f51156a.mo59819e()).mo59896P9(zzq.f51157b, zzq.m70433b(zzq, this.f51143c), new zzp(this.f51145f, this.f51144d, this.f51143c));
        } catch (RemoteException e) {
            zzq.f51154e.mo59807c(e, "requestUpdateInfo(%s)", this.f51143c);
            this.f51144d.mo60033d(new RuntimeException(e));
        }
    }
}
