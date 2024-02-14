package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzo extends zzn {
    zzo(zzq zzq, zzi zzi) {
        super(zzq, new zzag("OnCompleteUpdateCallback"), zzi);
    }

    /* renamed from: x0 */
    public final void mo59558x0(Bundle bundle) throws RemoteException {
        super.mo59558x0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f51150c.mo60033d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f51150c.mo60034e((Object) null);
        }
    }
}
