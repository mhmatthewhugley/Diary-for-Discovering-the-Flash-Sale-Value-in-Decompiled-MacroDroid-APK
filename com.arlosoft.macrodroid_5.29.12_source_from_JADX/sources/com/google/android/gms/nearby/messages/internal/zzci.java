package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zznh;
import com.google.android.gms.nearby.messages.Message;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzci implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Message message = null;
        zze zze = null;
        zza zza = null;
        zznh zznh = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 3:
                    message = (Message) SafeParcelReader.m4546p(parcel, E, Message.CREATOR);
                    break;
                case 4:
                    zze = (zze) SafeParcelReader.m4546p(parcel, E, zze.CREATOR);
                    break;
                case 5:
                    zza = (zza) SafeParcelReader.m4546p(parcel, E, zza.CREATOR);
                    break;
                case 6:
                    zznh = (zznh) SafeParcelReader.m4546p(parcel, E, zznh.CREATOR);
                    break;
                case 7:
                    bArr = SafeParcelReader.m4537g(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new Update(i, i2, message, zze, zza, zznh, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Update[i];
    }
}
