package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzai extends zzah {

    /* renamed from: c */
    final /* synthetic */ int f51206c;

    /* renamed from: d */
    final /* synthetic */ zzi f51207d;

    /* renamed from: f */
    final /* synthetic */ zzaw f51208f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzai(zzaw zzaw, zzi zzi, int i, zzi zzi2) {
        super(zzi);
        this.f51208f = zzaw;
        this.f51206c = i;
        this.f51207d = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51208f.f51236d.mo59819e()).mo59902T5(this.f51208f.f51233a, zzaw.m70512h(this.f51206c), zzaw.m70511g(), new zzas(this.f51208f, this.f51207d));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
