package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zznh;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zza implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        zznh[] zznhArr = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                bArr = SafeParcelReader.m4537g(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                zznhArr = (zznh[]) SafeParcelReader.m4550t(parcel, E, zznh.CREATOR);
            } else if (w == 5) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new Message(i, bArr, str, str2, zznhArr, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Message[i];
    }
}
