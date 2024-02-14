package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 4:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m4546p(parcel2, E, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 9:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m4551u(parcel2, E, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 12:
                    str8 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
