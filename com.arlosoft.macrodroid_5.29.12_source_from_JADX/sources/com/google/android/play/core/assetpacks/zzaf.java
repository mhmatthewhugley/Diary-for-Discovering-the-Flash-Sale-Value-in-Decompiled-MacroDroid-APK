package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzu;
import com.google.android.play.core.tasks.zzi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzaf extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51190c;

    /* renamed from: d */
    final /* synthetic */ Map f51191d;

    /* renamed from: f */
    final /* synthetic */ zzi f51192f;

    /* renamed from: g */
    final /* synthetic */ zzbe f51193g;

    /* renamed from: o */
    final /* synthetic */ zzaw f51194o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        ArrayList v = zzaw.m70526v(this.f51190c);
        try {
            String u = this.f51194o.f51233a;
            Bundle n = zzaw.m70518n(this.f51191d);
            zzaw zzaw = this.f51194o;
            ((zzu) this.f51194o.f51236d.mo59819e()).mo59906t4(u, v, n, new zzau(zzaw, this.f51192f, zzaw.f51234b, zzaw.f51235c, this.f51193g));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "getPackStates(%s)", this.f51190c);
            this.f51192f.mo60033d(new RuntimeException(e));
        }
    }
}
