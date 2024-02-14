package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzr extends zza {
    zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: Z8 */
    public final IObjectWrapper mo22068Z8(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        A1.writeInt(i);
        zzc.m55909f(A1, iObjectWrapper2);
        Parcel y = mo48613y(3, A1);
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }

    /* renamed from: g8 */
    public final IObjectWrapper mo22069g8(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        A1.writeInt(i);
        zzc.m55909f(A1, iObjectWrapper2);
        Parcel y = mo48613y(2, A1);
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }
}
