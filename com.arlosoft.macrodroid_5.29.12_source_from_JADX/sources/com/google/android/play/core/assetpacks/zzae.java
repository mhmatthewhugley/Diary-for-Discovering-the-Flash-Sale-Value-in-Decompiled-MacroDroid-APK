package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzae extends zzah {

    /* renamed from: c */
    final /* synthetic */ Map f51187c;

    /* renamed from: d */
    final /* synthetic */ zzi f51188d;

    /* renamed from: f */
    final /* synthetic */ zzaw f51189f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzae(zzaw zzaw, zzi zzi, Map map, zzi zzi2) {
        super(zzi);
        this.f51189f = zzaw;
        this.f51187c = map;
        this.f51188d = zzi2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            ((zzu) this.f51189f.f51236d.mo59819e()).mo59901S7(this.f51189f.f51233a, zzaw.m70518n(this.f51187c), new zzao(this.f51189f, this.f51188d));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "syncPacks", new Object[0]);
            this.f51188d.mo60033d(new RuntimeException(e));
        }
    }
}
