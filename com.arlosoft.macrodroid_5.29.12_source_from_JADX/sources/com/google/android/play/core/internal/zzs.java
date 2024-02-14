package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzs extends zzk implements zzu {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: D6 */
    public final void mo59898D6(String str, Bundle bundle, Bundle bundle2, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70975b(y, bundle2);
        zzm.m70976c(y, zzw);
        mo59892t1(7, y);
    }

    /* renamed from: N5 */
    public final void mo59899N5(String str, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzw);
        mo59892t1(10, y);
    }

    /* renamed from: O9 */
    public final void mo59900O9(String str, List list, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzw);
        mo59892t1(14, y);
    }

    /* renamed from: S7 */
    public final void mo59901S7(String str, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzw);
        mo59892t1(5, y);
    }

    /* renamed from: T5 */
    public final void mo59902T5(String str, Bundle bundle, Bundle bundle2, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70975b(y, bundle2);
        zzm.m70976c(y, zzw);
        mo59892t1(9, y);
    }

    /* renamed from: e9 */
    public final void mo59903e9(String str, Bundle bundle, Bundle bundle2, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70975b(y, bundle2);
        zzm.m70976c(y, zzw);
        mo59892t1(11, y);
    }

    /* renamed from: i5 */
    public final void mo59904i5(String str, List list, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzw);
        mo59892t1(2, y);
    }

    /* renamed from: s2 */
    public final void mo59905s2(String str, Bundle bundle, Bundle bundle2, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70975b(y, bundle2);
        zzm.m70976c(y, zzw);
        mo59892t1(13, y);
    }

    /* renamed from: t4 */
    public final void mo59906t4(String str, List list, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzw);
        mo59892t1(12, y);
    }

    /* renamed from: x4 */
    public final void mo59907x4(String str, Bundle bundle, Bundle bundle2, zzw zzw) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70975b(y, bundle2);
        zzm.m70976c(y, zzw);
        mo59892t1(6, y);
    }
}
