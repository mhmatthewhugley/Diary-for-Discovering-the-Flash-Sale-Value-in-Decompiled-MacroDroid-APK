package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzcb;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
class zzbb extends zzcb {

    /* renamed from: a */
    final zzi f51914a;

    /* renamed from: c */
    final /* synthetic */ zzbc f51915c;

    zzbb(zzbc zzbc, zzi zzi) {
        this.f51915c = zzbc;
        this.f51914a = zzi;
    }

    /* renamed from: D4 */
    public void mo59850D4(int i, Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: H5 */
    public void mo59851H5(int i, Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: K7 */
    public void mo59852K7(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onDeferredUninstall", new Object[0]);
    }

    /* renamed from: O0 */
    public final void mo59853O0(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        int i = bundle.getInt("error_code");
        zzbc.f51916c.mo59806b("onError(%d)", Integer.valueOf(i));
        this.f51914a.mo60033d(new SplitInstallException(i));
    }

    /* renamed from: P1 */
    public void mo59854P1(List list) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: P3 */
    public final void mo59855P3(int i, Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: R3 */
    public final void mo59856R3(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onGetSplitsForAppUpdate", new Object[0]);
    }

    /* renamed from: T0 */
    public final void mo59857T0(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: g0 */
    public void mo59858g0(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: m1 */
    public void mo59859m1(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onDeferredLanguageUninstall", new Object[0]);
    }

    /* renamed from: t0 */
    public void mo59860t0(int i, Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: v0 */
    public void mo59861v0(Bundle bundle) throws RemoteException {
        this.f51915c.f51919b.mo59822s(this.f51914a);
        zzbc.f51916c.mo59808d("onDeferredInstall", new Object[0]);
    }
}
