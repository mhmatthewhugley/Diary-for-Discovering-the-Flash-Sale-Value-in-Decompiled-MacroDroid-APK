package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        zzzy zzzy = null;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        ArrayList<zzt> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzz = null;
        zze zze = null;
        zzbb zzbb = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    zzzy = (zzzy) SafeParcelReader.m4546p(parcel2, E, zzzy.CREATOR);
                    break;
                case 2:
                    zzt = (zzt) SafeParcelReader.m4546p(parcel2, E, zzt.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m4551u(parcel2, E, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    bool = SafeParcelReader.m4555y(parcel2, E);
                    break;
                case 9:
                    zzz = (zzz) SafeParcelReader.m4546p(parcel2, E, zzz.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 11:
                    zze = (zze) SafeParcelReader.m4546p(parcel2, E, zze.CREATOR);
                    break;
                case 12:
                    zzbb = (zzbb) SafeParcelReader.m4546p(parcel2, E, zzbb.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzx(zzzy, zzt, str, str2, arrayList, arrayList2, str3, bool, zzz, z, zze, zzbb);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzx[i];
    }
}
