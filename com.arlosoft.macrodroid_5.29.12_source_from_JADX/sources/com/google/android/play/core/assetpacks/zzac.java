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
final class zzac extends zzah {

    /* renamed from: c */
    final /* synthetic */ List f51179c;

    /* renamed from: d */
    final /* synthetic */ Map f51180d;

    /* renamed from: f */
    final /* synthetic */ zzi f51181f;

    /* renamed from: g */
    final /* synthetic */ List f51182g;

    /* renamed from: o */
    final /* synthetic */ zzaw f51183o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        ArrayList v = zzaw.m70526v(this.f51179c);
        try {
            String u = this.f51183o.f51233a;
            Bundle n = zzaw.m70518n(this.f51180d);
            zzaw zzaw = this.f51183o;
            ((zzu) this.f51183o.f51236d.mo59819e()).mo59904i5(u, v, n, new zzav(zzaw, this.f51181f, zzaw.f51234b, zzaw.f51235c, this.f51182g));
        } catch (RemoteException e) {
            zzaw.f51231g.mo59807c(e, "startDownload(%s)", this.f51179c);
            this.f51181f.mo60033d(new RuntimeException(e));
        }
    }
}
