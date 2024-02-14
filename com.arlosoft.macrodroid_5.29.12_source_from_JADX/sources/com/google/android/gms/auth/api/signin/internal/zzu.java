package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p203authapi.zzc;
import com.google.android.gms.internal.p203authapi.zzf;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzu extends zzc implements zzr {
    public zzu() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21043y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo21026z8((GoogleSignInAccount) zzf.m55710a(parcel, GoogleSignInAccount.CREATOR), (Status) zzf.m55710a(parcel, Status.CREATOR));
                break;
            case 102:
                mo21025d7((Status) zzf.m55710a(parcel, Status.CREATOR));
                break;
            case 103:
                mo21024N7((Status) zzf.m55710a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
