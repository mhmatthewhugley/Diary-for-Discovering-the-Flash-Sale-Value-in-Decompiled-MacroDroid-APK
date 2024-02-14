package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzh extends zzg {

    /* renamed from: f */
    final String f51753f;

    zzh(zzi zzi, zzi zzi2, String str) {
        super(zzi, new zzag("OnRequestInstallCallback"), zzi2);
        this.f51753f = str;
    }

    /* renamed from: x0 */
    public final void mo59803x0(Bundle bundle) throws RemoteException {
        super.mo59803x0(bundle);
        this.f51751c.mo60034e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
