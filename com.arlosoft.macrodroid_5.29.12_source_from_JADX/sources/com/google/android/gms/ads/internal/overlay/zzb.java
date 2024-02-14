package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    str5 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    str6 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 8:
                    str7 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.m4546p(parcel, E, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 11:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
