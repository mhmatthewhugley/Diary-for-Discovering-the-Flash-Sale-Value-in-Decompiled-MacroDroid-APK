package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoj extends zzarz {
    zzfoj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: Z8 */
    public final zzfoh mo46032Z8(zzfof zzfof) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzfof);
        Parcel t1 = mo41868t1(1, y);
        zzfoh zzfoh = (zzfoh) zzasb.m42223a(t1, zzfoh.CREATOR);
        t1.recycle();
        return zzfoh;
    }

    /* renamed from: ia */
    public final zzfoq mo46033ia(zzfoo zzfoo) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzfoo);
        Parcel t1 = mo41868t1(3, y);
        zzfoq zzfoq = (zzfoq) zzasb.m42223a(t1, zzfoq.CREATOR);
        t1.recycle();
        return zzfoq;
    }

    /* renamed from: sb */
    public final void mo46034sb(zzfoc zzfoc) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzfoc);
        mo41865A1(2, y);
    }
}
