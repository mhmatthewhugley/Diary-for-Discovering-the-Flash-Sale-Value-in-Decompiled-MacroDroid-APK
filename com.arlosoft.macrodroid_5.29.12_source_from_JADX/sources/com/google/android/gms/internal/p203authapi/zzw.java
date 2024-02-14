package com.google.android.gms.internal.p203authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zzw */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzw extends zzd implements zzx {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: B2 */
    public final void mo48527B2(zzv zzv, zzz zzz) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzv);
        zzf.m55712c(y, zzz);
        mo48518t1(2, y);
    }

    /* renamed from: C3 */
    public final void mo48528C3(zzv zzv) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzv);
        mo48518t1(4, y);
    }

    /* renamed from: b9 */
    public final void mo48529b9(zzv zzv, zzt zzt) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzv);
        zzf.m55712c(y, zzt);
        mo48518t1(3, y);
    }

    /* renamed from: q2 */
    public final void mo48530q2(zzv zzv, CredentialRequest credentialRequest) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzv);
        zzf.m55712c(y, credentialRequest);
        mo48518t1(1, y);
    }
}
