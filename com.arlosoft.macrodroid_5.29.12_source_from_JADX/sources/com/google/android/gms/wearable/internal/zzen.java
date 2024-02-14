package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48279a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final ParcelFileDescriptor f48280c;

    @SafeParcelable.Constructor
    public zzen(@SafeParcelable.Param int i, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor) {
        this.f48279a = i;
        this.f48280c = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48279a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48280c, i | 1, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
