package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzak extends zzah {

    /* renamed from: c */
    final /* synthetic */ zzi f51215c;

    /* renamed from: d */
    final /* synthetic */ zzaw f51216d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzak(zzaw zzaw, zzi zzi, zzi zzi2) {
        super(zzi);
        this.f51216d = zzaw;
        this.f51215c = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51216d.f51237e.mo59819e()).mo59899N5(this.f51216d.f51233a, zzaw.m70511g(), new zzap(this.f51216d, this.f51215c));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "keepAlive", new Object[0]);
        }
    }
}
