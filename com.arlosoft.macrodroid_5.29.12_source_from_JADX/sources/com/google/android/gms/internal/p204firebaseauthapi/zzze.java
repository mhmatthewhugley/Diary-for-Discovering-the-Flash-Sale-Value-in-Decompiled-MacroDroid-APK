package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzze */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzze implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        zzaaw zzaaw = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    zzaaw = (zzaaw) SafeParcelReader.m4546p(parcel, E, zzaaw.CREATOR);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m4549s(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzzd(str, z, str2, z2, zzaaw, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzd[i];
    }
}
