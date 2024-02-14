package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzq;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
class zzn extends zzq {

    /* renamed from: a */
    final zzag f51149a;

    /* renamed from: c */
    final zzi f51150c;

    /* renamed from: d */
    final /* synthetic */ zzq f51151d;

    zzn(zzq zzq, zzag zzag, zzi zzi) {
        this.f51151d = zzq;
        this.f51149a = zzag;
        this.f51150c = zzi;
    }

    /* renamed from: v0 */
    public void mo59557v0(Bundle bundle) throws RemoteException {
        this.f51151d.f51156a.mo59822s(this.f51150c);
        this.f51149a.mo59808d("onRequestInfo", new Object[0]);
    }

    /* renamed from: x0 */
    public void mo59558x0(Bundle bundle) throws RemoteException {
        this.f51151d.f51156a.mo59822s(this.f51150c);
        this.f51149a.mo59808d("onCompleteUpdate", new Object[0]);
    }
}
