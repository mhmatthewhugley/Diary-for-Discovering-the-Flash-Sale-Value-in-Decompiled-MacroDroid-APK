package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzq extends zza {
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: Ib */
    public final IObjectWrapper mo22061Ib(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        A1.writeInt(i);
        Parcel y = mo48613y(4, A1);
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }

    /* renamed from: Jb */
    public final IObjectWrapper mo22062Jb(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        zzc.m55906c(A1, z);
        A1.writeLong(j);
        Parcel y = mo48613y(7, A1);
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }

    /* renamed from: Z8 */
    public final int mo22063Z8(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        zzc.m55906c(A1, z);
        Parcel y = mo48613y(5, A1);
        int readInt = y.readInt();
        y.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final int mo22064b() throws RemoteException {
        Parcel y = mo48613y(6, mo48610A1());
        int readInt = y.readInt();
        y.recycle();
        return readInt;
    }

    /* renamed from: g8 */
    public final int mo22065g8(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        zzc.m55906c(A1, z);
        Parcel y = mo48613y(3, A1);
        int readInt = y.readInt();
        y.recycle();
        return readInt;
    }

    /* renamed from: ia */
    public final IObjectWrapper mo22066ia(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        A1.writeInt(i);
        Parcel y = mo48613y(2, A1);
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }

    /* renamed from: sb */
    public final IObjectWrapper mo22067sb(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel A1 = mo48610A1();
        zzc.m55909f(A1, iObjectWrapper);
        A1.writeString(str);
        A1.writeInt(i);
        zzc.m55909f(A1, iObjectWrapper2);
        Parcel y = mo48613y(8, A1);
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }
}
