package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzasc extends zzarz implements zzase {
    zzasc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: R0 */
    public final void mo41874R0(int[] iArr) throws RemoteException {
        Parcel y = mo41869y();
        y.writeIntArray((int[]) null);
        mo41865A1(4, y);
    }

    /* renamed from: T4 */
    public final void mo41875T4(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeString("GMA_SDK");
        mo41865A1(2, y);
    }

    /* renamed from: b0 */
    public final void mo41876b0(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(0);
        mo41865A1(6, y);
    }

    /* renamed from: c */
    public final void mo41877c() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: o1 */
    public final void mo41878o1(byte[] bArr) throws RemoteException {
        Parcel y = mo41869y();
        y.writeByteArray(bArr);
        mo41865A1(5, y);
    }

    /* renamed from: x */
    public final void mo41879x(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(7, y);
    }
}
