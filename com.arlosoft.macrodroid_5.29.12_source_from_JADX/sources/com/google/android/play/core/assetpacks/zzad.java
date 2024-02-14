package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzad extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51184c;

    /* renamed from: d */
    final /* synthetic */ zzi f51185d;

    /* renamed from: f */
    final /* synthetic */ zzaw f51186f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzad(zzaw zzaw, zzi zzi, List list, zzi zzi2) {
        super(zzi);
        this.f51186f = zzaw;
        this.f51184c = list;
        this.f51185d = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51186f.f51236d.mo59819e()).mo59900O9(this.f51186f.f51233a, zzaw.m70526v(this.f51184c), zzaw.m70511g(), new zzam(this.f51186f, this.f51185d));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "cancelDownloads(%s)", this.f51184c);
        }
    }
}
