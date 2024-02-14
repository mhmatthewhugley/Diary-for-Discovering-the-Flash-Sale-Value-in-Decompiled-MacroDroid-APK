package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3748a;

    @SafeParcelable.Constructor
    zzaj(@SafeParcelable.Param int i) {
        this.f3748a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3748a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
