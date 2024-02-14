package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzaag zzaag = null;
        String str5 = null;
        String str6 = null;
        zze zze = null;
        ArrayList<zzaac> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    zzaag = (zzaag) SafeParcelReader.m4546p(parcel2, E, zzaag.CREATOR);
                    break;
                case 8:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 11:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 12:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 13:
                    zze = (zze) SafeParcelReader.m4546p(parcel2, E, zze.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m4551u(parcel2, E, zzaac.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzzr(str, str2, z, str3, str4, zzaag, str5, str6, j, j2, z2, zze, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzr[i];
    }
}
