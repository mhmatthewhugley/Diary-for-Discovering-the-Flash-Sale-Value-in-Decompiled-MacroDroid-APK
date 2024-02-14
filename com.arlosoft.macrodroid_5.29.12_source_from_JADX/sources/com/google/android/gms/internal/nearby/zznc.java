package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznc> CREATOR = new zznd();

    @SafeParcelable.Constructor
    zznc() {
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof zznc);
    }

    public final int hashCode() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        SafeParcelWriter.m4564b(parcel, SafeParcelWriter.m4563a(parcel));
    }
}
