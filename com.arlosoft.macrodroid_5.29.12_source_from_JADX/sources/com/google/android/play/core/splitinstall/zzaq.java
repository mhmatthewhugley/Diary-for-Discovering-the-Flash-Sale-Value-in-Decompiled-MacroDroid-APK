package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzaq extends zzah {

    /* renamed from: c */
    final /* synthetic */ int f51906c;

    /* renamed from: d */
    final /* synthetic */ zzi f51907d;

    /* renamed from: f */
    final /* synthetic */ zzbc f51908f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59556a() {
        try {
            zzbc zzbc = this.f51908f;
            ((zzca) this.f51908f.f51919b.mo59819e()).mo59843I6(zzbc.f51918a, this.f51906c, new zzay(zzbc, this.f51907d));
        } catch (RemoteException e) {
            zzbc.f51916c.mo59807c(e, "getSessionState(%d)", Integer.valueOf(this.f51906c));
            this.f51907d.mo60033d(new RuntimeException(e));
        }
    }
}
