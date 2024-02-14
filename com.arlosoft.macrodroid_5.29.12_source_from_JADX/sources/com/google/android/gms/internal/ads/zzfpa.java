package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfpa extends zzarz implements zzfpc {
    zzfpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* renamed from: R0 */
    public final void mo46065R0(int[] iArr) throws RemoteException {
        Parcel y = mo41869y();
        y.writeIntArray((int[]) null);
        mo41865A1(4, y);
    }

    /* renamed from: b0 */
    public final void mo46066b0(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(6, y);
    }

    /* renamed from: c */
    public final void mo46067c() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: d6 */
    public final void mo46068d6(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeString(str);
        y.writeString((String) null);
        mo41865A1(8, y);
    }

    /* renamed from: o1 */
    public final void mo46069o1(byte[] bArr) throws RemoteException {
        Parcel y = mo41869y();
        y.writeByteArray(bArr);
        mo41865A1(5, y);
    }

    /* renamed from: x */
    public final void mo46070x(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(7, y);
    }
}
