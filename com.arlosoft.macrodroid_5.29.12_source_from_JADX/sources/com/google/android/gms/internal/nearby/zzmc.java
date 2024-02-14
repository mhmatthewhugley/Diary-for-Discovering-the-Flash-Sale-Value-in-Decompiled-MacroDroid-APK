package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzmc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        zzlx zzlx = null;
        String str2 = null;
        String str3 = null;
        long j4 = -1;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 2:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 3:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m4546p(parcel2, E, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    j4 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) SafeParcelReader.m4546p(parcel2, E, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) SafeParcelReader.m4546p(parcel2, E, Uri.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 10:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 11:
                    zzlx = (zzlx) SafeParcelReader.m4546p(parcel2, E, zzlx.CREATOR);
                    break;
                case 12:
                    j3 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 13:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 14:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzmb(j, i, bArr, parcelFileDescriptor, str, j4, parcelFileDescriptor2, uri, j2, z, zzlx, j3, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmb[i];
    }
}
