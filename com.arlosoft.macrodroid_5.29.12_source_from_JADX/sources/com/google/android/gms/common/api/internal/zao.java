package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zao implements Runnable {

    /* renamed from: a */
    private final zam f3474a;

    /* renamed from: c */
    final /* synthetic */ zap f3475c;

    zao(zap zap, zam zam) {
        this.f3475c = zap;
        this.f3474a = zam;
    }

    @MainThread
    public final void run() {
        if (this.f3475c.f3476c) {
            ConnectionResult b = this.f3474a.mo21524b();
            if (b.mo21136o2()) {
                zap zap = this.f3475c;
                zap.f3200a.startActivityForResult(GoogleApiActivity.m3650a(zap.mo21363b(), (PendingIntent) Preconditions.m4488k(b.mo21135n2()), this.f3474a.mo21523a(), false), 1);
                return;
            }
            zap zap2 = this.f3475c;
            if (zap2.f3479g.mo21153d(zap2.mo21363b(), b.mo21133l2(), (String) null) != null) {
                zap zap3 = this.f3475c;
                zap3.f3479g.mo21151B(zap3.mo21363b(), this.f3475c.f3200a, b.mo21133l2(), 2, this.f3475c);
            } else if (b.mo21133l2() == 18) {
                zap zap4 = this.f3475c;
                Dialog w = zap4.f3479g.mo21166w(zap4.mo21363b(), this.f3475c);
                zap zap5 = this.f3475c;
                zap5.f3479g.mo21167x(zap5.mo21363b().getApplicationContext(), new zan(this, w));
            } else {
                this.f3475c.m4246l(b, this.f3474a.mo21523a());
            }
        }
    }
}
