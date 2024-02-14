package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzah extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    final /* synthetic */ int f51201c;

    /* renamed from: d */
    final /* synthetic */ String f51202d;

    /* renamed from: f */
    final /* synthetic */ zzi f51203f;

    /* renamed from: g */
    final /* synthetic */ int f51204g;

    /* renamed from: o */
    final /* synthetic */ zzaw f51205o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzah(zzaw zzaw, zzi zzi, int i, String str, zzi zzi2, int i2) {
        super(zzi);
        this.f51205o = zzaw;
        this.f51201c = i;
        this.f51202d = str;
        this.f51203f = zzi2;
        this.f51204g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51205o.f51236d.mo59819e()).mo59898D6(this.f51205o.f51233a, zzaw.m70530z(this.f51201c, this.f51202d), zzaw.m70511g(), new zzar(this.f51205o, this.f51203f, this.f51201c, this.f51202d, this.f51204g));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
