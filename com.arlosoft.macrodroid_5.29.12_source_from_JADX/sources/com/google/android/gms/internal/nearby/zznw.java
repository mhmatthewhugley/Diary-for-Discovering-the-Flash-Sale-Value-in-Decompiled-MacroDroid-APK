package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

@RequiresApi(26)
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        ArrayList<zznt> arrayList = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 6:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 8:
                    bArr2 = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 9:
                    arrayList = SafeParcelReader.m4551u(parcel2, E, zznt.CREATOR);
                    break;
                case 10:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zznv(j, str, i, str2, j2, str3, bArr, bArr2, arrayList, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zznv[i];
    }
}
