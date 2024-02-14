package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaf extends zaa {
    zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: Z8 */
    public final void mo56111Z8(int i) throws RemoteException {
        Parcel y = mo48578y();
        y.writeInt(i);
        mo48574A1(7, y);
    }

    /* renamed from: ia */
    public final void mo56112ia(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, iAccountAccessor);
        y.writeInt(i);
        zac.m55855c(y, z);
        mo48574A1(9, y);
    }

    /* renamed from: sb */
    public final void mo56113sb(zai zai, zae zae) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55856d(y, zai);
        zac.m55857e(y, zae);
        mo48574A1(12, y);
    }
}
