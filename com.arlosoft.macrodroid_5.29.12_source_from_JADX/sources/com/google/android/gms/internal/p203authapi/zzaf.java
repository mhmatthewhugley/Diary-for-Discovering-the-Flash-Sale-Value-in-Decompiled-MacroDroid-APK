package com.google.android.gms.internal.p203authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zzaf */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzaf extends zzd implements zzac {
    zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* renamed from: w9 */
    public final void mo48509w9(zzag zzag, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel y = mo48519y();
        zzf.m55711b(y, zzag);
        zzf.m55712c(y, savePasswordRequest);
        mo48518t1(2, y);
    }
}
