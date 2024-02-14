package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaqm implements AppOpsManager.OnOpActiveChangedListener {

    /* renamed from: a */
    final /* synthetic */ zzaqn f25340a;

    zzaqm(zzaqn zzaqn) {
        this.f25340a = zzaqn;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.f25340a.f25342a = System.currentTimeMillis();
            this.f25340a.f25345d = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzaqn zzaqn = this.f25340a;
        if (zzaqn.f25343b > 0 && currentTimeMillis >= zzaqn.f25343b) {
            zzaqn.f25344c = currentTimeMillis - zzaqn.f25343b;
        }
        this.f25340a.f25345d = false;
    }
}
