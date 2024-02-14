package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzd extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ zzi f51130a;

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f51130a.mo60034e(-1);
        } else if (i != 2) {
            this.f51130a.mo60034e(1);
        } else {
            this.f51130a.mo60034e(0);
        }
    }
}
