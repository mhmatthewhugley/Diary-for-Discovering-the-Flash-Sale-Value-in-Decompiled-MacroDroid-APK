package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzp extends zzn {

    /* renamed from: f */
    private final String f51152f;

    /* renamed from: g */
    final /* synthetic */ zzq f51153g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzp(zzq zzq, zzi zzi, String str) {
        super(zzq, new zzag("OnRequestInstallCallback"), zzi);
        this.f51153g = zzq;
        this.f51152f = str;
    }

    /* renamed from: v0 */
    public final void mo59557v0(Bundle bundle) throws RemoteException {
        super.mo59557v0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f51150c.mo60033d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f51150c.mo60034e(zzq.m70435d(this.f51153g, bundle, this.f51152f));
        }
    }
}
