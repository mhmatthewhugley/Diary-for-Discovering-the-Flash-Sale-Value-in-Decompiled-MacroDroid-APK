package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzag extends zzah {

    /* renamed from: c */
    final /* synthetic */ int f51195c;

    /* renamed from: d */
    final /* synthetic */ String f51196d;

    /* renamed from: f */
    final /* synthetic */ String f51197f;

    /* renamed from: g */
    final /* synthetic */ int f51198g;

    /* renamed from: o */
    final /* synthetic */ zzi f51199o;

    /* renamed from: p */
    final /* synthetic */ zzaw f51200p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzag(zzaw zzaw, zzi zzi, int i, String str, String str2, int i2, zzi zzi2) {
        super(zzi);
        this.f51200p = zzaw;
        this.f51195c = i;
        this.f51196d = str;
        this.f51197f = str2;
        this.f51198g = i2;
        this.f51199o = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51200p.f51236d.mo59819e()).mo59907x4(this.f51200p.f51233a, zzaw.m70515k(this.f51195c, this.f51196d, this.f51197f, this.f51198g), zzaw.m70511g(), new zzaq(this.f51200p, this.f51199o));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
