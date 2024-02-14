package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzh implements Parcelable.Creator<zzg> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzk[] zzkArr = null;
        String str = null;
        Account account = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                zzkArr = (zzk[]) SafeParcelReader.m4550t(parcel, E, zzk.CREATOR);
            } else if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                account = (Account) SafeParcelReader.m4546p(parcel, E, Account.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzg(zzkArr, str, z, account);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
