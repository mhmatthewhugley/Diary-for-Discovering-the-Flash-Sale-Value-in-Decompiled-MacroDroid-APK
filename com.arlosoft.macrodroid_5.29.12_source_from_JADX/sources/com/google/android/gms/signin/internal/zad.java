package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class zad extends zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z8 */
    public final boolean mo21357Z8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) zac.m55853a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) zac.m55853a(parcel, zaa.CREATOR);
                zac.m55854b(parcel);
                break;
            case 4:
                Status status = (Status) zac.m55853a(parcel, Status.CREATOR);
                zac.m55854b(parcel);
                break;
            case 6:
                Status status2 = (Status) zac.m55853a(parcel, Status.CREATOR);
                zac.m55854b(parcel);
                break;
            case 7:
                Status status3 = (Status) zac.m55853a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.m55853a(parcel, GoogleSignInAccount.CREATOR);
                zac.m55854b(parcel);
                break;
            case 8:
                zac.m55854b(parcel);
                mo21446C2((zak) zac.m55853a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) zac.m55853a(parcel, zag.CREATOR);
                zac.m55854b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
