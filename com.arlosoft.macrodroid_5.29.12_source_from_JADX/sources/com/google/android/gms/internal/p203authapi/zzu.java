package com.google.android.gms.internal.p203authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzu */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzu extends zzc implements zzv {
    public zzu() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21043y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo48520O3((Status) zzf.m55710a(parcel, Status.CREATOR), (Credential) zzf.m55710a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo48521e1((Status) zzf.m55710a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo48522ub((Status) zzf.m55710a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
