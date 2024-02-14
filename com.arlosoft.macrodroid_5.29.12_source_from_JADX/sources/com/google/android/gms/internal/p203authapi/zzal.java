package com.google.android.gms.internal.p203authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api.zzal */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzal extends zzd implements zzai {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* renamed from: b4 */
    public final void mo48512b4(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, iStatusCallback);
        y.writeString(str);
        mo48518t1(2, y);
    }

    /* renamed from: f8 */
    public final void mo48513f8(zzae zzae, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzae);
        zzf.m55712c(y, getSignInIntentRequest);
        mo48518t1(3, y);
    }

    /* renamed from: rb */
    public final void mo48514rb(zzaa zzaa, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzaa);
        zzf.m55712c(y, beginSignInRequest);
        mo48518t1(1, y);
    }
}
