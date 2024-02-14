package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzab extends zzah {

    /* renamed from: c */
    final /* synthetic */ String f51176c;

    /* renamed from: d */
    final /* synthetic */ zzi f51177d;

    /* renamed from: f */
    final /* synthetic */ zzaw f51178f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzab(zzaw zzaw, zzi zzi, String str, zzi zzi2) {
        super(zzi);
        this.f51178f = zzaw;
        this.f51176c = str;
        this.f51177d = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51178f.f51236d.mo59819e()).mo59905s2(this.f51178f.f51233a, zzaw.m70530z(0, this.f51176c), zzaw.m70511g(), new zzat(this.f51178f, this.f51177d));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "removePack(%s)", this.f51176c);
        }
    }
}
