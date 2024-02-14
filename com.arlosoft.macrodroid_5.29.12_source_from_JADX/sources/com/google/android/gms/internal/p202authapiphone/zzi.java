package com.google.android.gms.internal.p202authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzi */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzi extends zzb implements zzj {
    zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: E3 */
    public final void mo48502E3(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel y = mo48499y();
        zzd.m55632b(y, iStatusCallback);
        mo48498t1(3, y);
    }

    /* renamed from: k4 */
    public final void mo48503k4(zzl zzl) throws RemoteException {
        Parcel y = mo48499y();
        zzd.m55632b(y, zzl);
        mo48498t1(1, y);
    }

    /* renamed from: n6 */
    public final void mo48504n6(String str, zzh zzh) throws RemoteException {
        Parcel y = mo48499y();
        y.writeString(str);
        zzd.m55632b(y, zzh);
        mo48498t1(5, y);
    }

    /* renamed from: nb */
    public final void mo48505nb(zzf zzf) throws RemoteException {
        Parcel y = mo48499y();
        zzd.m55632b(y, zzf);
        mo48498t1(4, y);
    }

    /* renamed from: x3 */
    public final void mo48506x3(String str, zzl zzl) throws RemoteException {
        Parcel y = mo48499y();
        y.writeString(str);
        zzd.m55632b(y, zzl);
        mo48498t1(2, y);
    }
}
