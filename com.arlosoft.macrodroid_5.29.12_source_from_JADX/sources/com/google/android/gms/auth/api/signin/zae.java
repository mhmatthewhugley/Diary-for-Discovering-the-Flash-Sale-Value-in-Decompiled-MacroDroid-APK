package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m4551u(parcel, E, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m4546p(parcel, E, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    z3 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 7:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 8:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m4551u(parcel, E, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new GoogleSignInOptions(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, (ArrayList) arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
