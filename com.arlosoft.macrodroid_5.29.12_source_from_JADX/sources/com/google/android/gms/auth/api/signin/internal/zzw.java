package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p203authapi.zzd;
import com.google.android.gms.internal.p203authapi.zzf;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzw extends zzd implements zzt {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: F8 */
    public final void mo21044F8(zzr zzr, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzr);
        zzf.m55712c(y, googleSignInOptions);
        mo48518t1(101, y);
    }

    /* renamed from: n5 */
    public final void mo21045n5(zzr zzr, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzr);
        zzf.m55712c(y, googleSignInOptions);
        mo48518t1(102, y);
    }

    /* renamed from: z4 */
    public final void mo21046z4(zzr zzr, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzr);
        zzf.m55712c(y, googleSignInOptions);
        mo48518t1(103, y);
    }
}
