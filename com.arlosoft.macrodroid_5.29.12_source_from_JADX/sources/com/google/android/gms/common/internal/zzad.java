package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzad extends zza implements zzaf {
    zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: D7 */
    public final boolean mo21787D7(zzs zzs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55907d(A1, zzs);
        zzc.m55909f(A1, iObjectWrapper);
        Parcel y = mo48613y(5, A1);
        boolean g = zzc.m55910g(y);
        y.recycle();
        return g;
    }

    /* renamed from: N9 */
    public final zzq mo21788N9(zzo zzo) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55907d(A1, zzo);
        Parcel y = mo48613y(8, A1);
        zzq zzq = (zzq) zzc.m55904a(y, zzq.CREATOR);
        y.recycle();
        return zzq;
    }

    /* renamed from: X8 */
    public final zzq mo21789X8(zzo zzo) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55907d(A1, zzo);
        Parcel y = mo48613y(6, A1);
        zzq zzq = (zzq) zzc.m55904a(y, zzq.CREATOR);
        y.recycle();
        return zzq;
    }

    /* renamed from: g */
    public final boolean mo21790g() throws RemoteException {
        Parcel y = mo48613y(7, mo48610A1());
        boolean g = zzc.m55910g(y);
        y.recycle();
        return g;
    }
}
