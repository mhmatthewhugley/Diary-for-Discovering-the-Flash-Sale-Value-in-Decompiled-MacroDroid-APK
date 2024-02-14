package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzd implements Parcelable.Creator<BeginSignInResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m4546p(parcel, E, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new BeginSignInResult(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInResult[i];
    }
}
