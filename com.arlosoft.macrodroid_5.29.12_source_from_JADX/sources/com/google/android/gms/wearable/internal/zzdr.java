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
public final class zzdr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdr> CREATOR = new zzds();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48256a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final ParcelFileDescriptor f48257c;

    @SafeParcelable.Constructor
    public zzdr(@SafeParcelable.Param int i, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor) {
        this.f48256a = i;
        this.f48257c = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48256a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48257c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
