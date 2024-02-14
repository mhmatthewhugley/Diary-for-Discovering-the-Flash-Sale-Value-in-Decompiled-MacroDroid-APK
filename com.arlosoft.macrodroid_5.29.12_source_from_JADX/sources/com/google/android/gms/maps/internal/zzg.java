package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.internal.maps.zzu;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

public final class zzg extends zza implements IGoogleMapDelegate {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: J8 */
    public final void mo54566J8(zzbs zzbs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzbs);
        zzc.m59346c(y, iObjectWrapper);
        mo50652A1(38, y);
    }

    /* renamed from: T3 */
    public final void mo54567T3(int i) throws RemoteException {
        Parcel y = mo50655y();
        y.writeInt(i);
        mo50652A1(16, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IProjectionDelegate mo54568U0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo50655y()
            r1 = 26
            android.os.Parcel r0 = r4.mo50654t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.IProjectionDelegate
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.internal.IProjectionDelegate r1 = (com.google.android.gms.maps.internal.IProjectionDelegate) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.internal.zzbr r2 = new com.google.android.gms.maps.internal.zzbr
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.mo54568U0():com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: U7 */
    public final void mo54569U7(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel y = mo50655y();
        y.writeInt(i);
        y.writeInt(i2);
        y.writeInt(i3);
        y.writeInt(i4);
        mo50652A1(39, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IUiSettingsDelegate mo54570aa() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo50655y()
            r1 = 25
            android.os.Parcel r0 = r4.mo50654t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.IUiSettingsDelegate
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.internal.IUiSettingsDelegate r1 = (com.google.android.gms.maps.internal.IUiSettingsDelegate) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.internal.zzbx r2 = new com.google.android.gms.maps.internal.zzbx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.mo54570aa():com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    /* renamed from: b3 */
    public final CameraPosition mo54571b3() throws RemoteException {
        Parcel t1 = mo50654t1(1, mo50655y());
        CameraPosition cameraPosition = (CameraPosition) zzc.m59345b(t1, CameraPosition.CREATOR);
        t1.recycle();
        return cameraPosition;
    }

    /* renamed from: e5 */
    public final void mo54572e5(zzr zzr) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzr);
        mo50652A1(97, y);
    }

    /* renamed from: h2 */
    public final void mo54573h2(zzl zzl) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzl);
        mo50652A1(27, y);
    }

    /* renamed from: l8 */
    public final void mo54574l8(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, iObjectWrapper);
        mo50652A1(4, y);
    }

    /* renamed from: y6 */
    public final zzt mo54575y6(MarkerOptions markerOptions) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59347d(y, markerOptions);
        Parcel t1 = mo50654t1(11, y);
        zzt t12 = zzu.m59374t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: z5 */
    public final void mo54576z5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, iObjectWrapper);
        mo50652A1(5, y);
    }

    /* renamed from: z7 */
    public final void mo54577z7(zzaj zzaj) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzaj);
        mo50652A1(28, y);
    }
}
