package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzby extends zzk implements zzca {
    zzby(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* renamed from: A3 */
    public final void mo59842A3(String str, List list, Bundle bundle, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzcc);
        mo59892t1(14, y);
    }

    /* renamed from: I6 */
    public final void mo59843I6(String str, int i, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeInt(i);
        zzm.m70976c(y, zzcc);
        mo59892t1(5, y);
    }

    /* renamed from: Y9 */
    public final void mo59844Y9(String str, List list, Bundle bundle, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzcc);
        mo59892t1(7, y);
    }

    /* renamed from: d3 */
    public final void mo59845d3(String str, List list, Bundle bundle, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzcc);
        mo59892t1(13, y);
    }

    /* renamed from: l7 */
    public final void mo59846l7(String str, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70976c(y, zzcc);
        mo59892t1(6, y);
    }

    /* renamed from: n4 */
    public final void mo59847n4(String str, int i, Bundle bundle, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeInt(i);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzcc);
        mo59892t1(4, y);
    }

    /* renamed from: vb */
    public final void mo59848vb(String str, List list, Bundle bundle, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzcc);
        mo59892t1(2, y);
    }

    /* renamed from: x2 */
    public final void mo59849x2(String str, List list, Bundle bundle, zzcc zzcc) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        y.writeTypedList(list);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzcc);
        mo59892t1(8, y);
    }
}
