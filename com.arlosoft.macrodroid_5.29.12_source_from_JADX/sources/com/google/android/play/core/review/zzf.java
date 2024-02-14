package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.internal.zzac;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzf extends zzah {

    /* renamed from: c */
    final /* synthetic */ zzi f51748c;

    /* renamed from: d */
    final /* synthetic */ zzi f51749d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            String b = this.f51749d.f51756b;
            Bundle a = PlayCoreVersion.m70767a("review");
            zzi zzi = this.f51749d;
            ((zzac) this.f51749d.f51755a.mo59819e()).mo59801C6(b, a, new zzh(zzi, this.f51748c, zzi.f51756b));
        } catch (RemoteException e) {
            zzi.f51754c.mo59807c(e, "error requesting in-app review for %s", this.f51749d.f51756b);
            this.f51748c.mo60033d(new RuntimeException(e));
        }
    }
}
