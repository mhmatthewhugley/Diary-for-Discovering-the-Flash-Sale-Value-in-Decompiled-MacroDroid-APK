package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzdv extends zzbm implements zzdx {
    zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: D3 */
    public final void mo55039D3(zzaw zzaw, zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzaw);
        zzbo.m59534e(y, zzq);
        mo50769A1(1, y);
    }

    /* renamed from: F7 */
    public final byte[] mo55040F7(zzaw zzaw, String str) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzaw);
        y.writeString(str);
        Parcel t1 = mo50771t1(9, y);
        byte[] createByteArray = t1.createByteArray();
        t1.recycle();
        return createByteArray;
    }

    /* renamed from: M3 */
    public final void mo55041M3(zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzq);
        mo50769A1(4, y);
    }

    /* renamed from: Na */
    public final void mo55042Na(zzac zzac, zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzac);
        zzbo.m59534e(y, zzq);
        mo50769A1(12, y);
    }

    /* renamed from: O4 */
    public final void mo55043O4(zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzq);
        mo50769A1(20, y);
    }

    /* renamed from: O7 */
    public final String mo55044O7(zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzq);
        Parcel t1 = mo50771t1(11, y);
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: S4 */
    public final List mo55045S4(String str, String str2, boolean z, zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59533d(y, z);
        zzbo.m59534e(y, zzq);
        Parcel t1 = mo50771t1(14, y);
        ArrayList<zzkw> createTypedArrayList = t1.createTypedArrayList(zzkw.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }

    /* renamed from: Z6 */
    public final void mo55046Z6(zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzq);
        mo50769A1(6, y);
    }

    /* renamed from: a4 */
    public final void mo55047a4(long j, String str, String str2, String str3) throws RemoteException {
        Parcel y = mo50772y();
        y.writeLong(j);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        mo50769A1(10, y);
    }

    /* renamed from: c8 */
    public final List mo55048c8(String str, String str2, String str3) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString((String) null);
        y.writeString(str2);
        y.writeString(str3);
        Parcel t1 = mo50771t1(17, y);
        ArrayList<zzac> createTypedArrayList = t1.createTypedArrayList(zzac.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }

    /* renamed from: h4 */
    public final void mo55049h4(zzkw zzkw, zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzkw);
        zzbo.m59534e(y, zzq);
        mo50769A1(2, y);
    }

    /* renamed from: k7 */
    public final void mo55050k7(Bundle bundle, zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        zzbo.m59534e(y, zzq);
        mo50769A1(19, y);
    }

    /* renamed from: n2 */
    public final List mo55051n2(zzq zzq, boolean z) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzq);
        zzbo.m59533d(y, z);
        Parcel t1 = mo50771t1(7, y);
        ArrayList<zzkw> createTypedArrayList = t1.createTypedArrayList(zzkw.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }

    /* renamed from: t5 */
    public final void mo55052t5(zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, zzq);
        mo50769A1(18, y);
    }

    /* renamed from: t7 */
    public final List mo55053t7(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString((String) null);
        y.writeString(str2);
        y.writeString(str3);
        zzbo.m59533d(y, z);
        Parcel t1 = mo50771t1(15, y);
        ArrayList<zzkw> createTypedArrayList = t1.createTypedArrayList(zzkw.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }

    /* renamed from: t9 */
    public final List mo55054t9(String str, String str2, zzq zzq) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59534e(y, zzq);
        Parcel t1 = mo50771t1(16, y);
        ArrayList<zzac> createTypedArrayList = t1.createTypedArrayList(zzac.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }
}
