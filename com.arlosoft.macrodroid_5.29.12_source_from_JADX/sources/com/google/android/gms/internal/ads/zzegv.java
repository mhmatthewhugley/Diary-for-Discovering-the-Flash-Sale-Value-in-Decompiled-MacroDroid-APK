package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzegv extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f33991a;

    /* renamed from: c */
    final /* synthetic */ Timer f33992c;

    /* renamed from: d */
    final /* synthetic */ zzl f33993d;

    zzegv(AlertDialog alertDialog, Timer timer, zzl zzl) {
        this.f33991a = alertDialog;
        this.f33992c = timer;
        this.f33993d = zzl;
    }

    public final void run() {
        this.f33991a.dismiss();
        this.f33992c.cancel();
        zzl zzl = this.f33993d;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
