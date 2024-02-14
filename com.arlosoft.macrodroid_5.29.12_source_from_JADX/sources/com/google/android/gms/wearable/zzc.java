package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                bArr = SafeParcelReader.m4537g(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m4546p(parcel, E, ParcelFileDescriptor.CREATOR);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                uri = (Uri) SafeParcelReader.m4546p(parcel, E, Uri.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
