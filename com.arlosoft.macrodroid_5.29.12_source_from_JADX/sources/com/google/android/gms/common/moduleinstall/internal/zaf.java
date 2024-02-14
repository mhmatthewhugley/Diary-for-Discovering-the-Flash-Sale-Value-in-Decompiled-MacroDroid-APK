package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaf extends zaa {
    zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    /* renamed from: Ib */
    public final void mo21872Ib(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, iStatusCallback);
        zac.m55856d(y, apiFeatureRequest);
        mo48574A1(4, y);
    }

    /* renamed from: Jb */
    public final void mo21873Jb(IStatusCallback iStatusCallback, zah zah) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, iStatusCallback);
        zac.m55857e(y, zah);
        mo48574A1(6, y);
    }

    /* renamed from: Z8 */
    public final void mo21874Z8(zae zae, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, zae);
        zac.m55856d(y, apiFeatureRequest);
        mo48574A1(1, y);
    }

    /* renamed from: ia */
    public final void mo21875ia(zae zae, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, zae);
        zac.m55856d(y, apiFeatureRequest);
        mo48574A1(3, y);
    }

    /* renamed from: sb */
    public final void mo21876sb(zae zae, ApiFeatureRequest apiFeatureRequest, zah zah) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, zae);
        zac.m55856d(y, apiFeatureRequest);
        zac.m55857e(y, zah);
        mo48574A1(2, y);
    }
}
