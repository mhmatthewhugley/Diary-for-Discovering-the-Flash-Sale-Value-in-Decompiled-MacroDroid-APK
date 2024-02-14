package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzk extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ zzi f51606a;

    /* renamed from: c */
    final /* synthetic */ zzl f51607c;

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f51606a.mo60034e(-1);
            this.f51607c.f51615g.mo59694a((PendingIntent) null);
        } else if (i != 2) {
            this.f51606a.mo60033d(new AssetPackException(-100));
        } else {
            this.f51606a.mo60034e(0);
        }
    }
}
