package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzad;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzas;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
class zzg extends zzad {

    /* renamed from: a */
    final zzag f51750a;

    /* renamed from: c */
    final zzi f51751c;

    /* renamed from: d */
    final /* synthetic */ zzi f51752d;

    zzg(zzi zzi, zzag zzag, zzi zzi2) {
        this.f51752d = zzi;
        this.f51750a = zzag;
        this.f51751c = zzi2;
    }

    /* renamed from: x0 */
    public void mo59803x0(Bundle bundle) throws RemoteException {
        zzas zzas = this.f51752d.f51755a;
        if (zzas != null) {
            zzas.mo59822s(this.f51751c);
        }
        this.f51750a.mo59808d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
