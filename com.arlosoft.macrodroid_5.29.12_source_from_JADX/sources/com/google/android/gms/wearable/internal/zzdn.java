package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdn> CREATOR = new zzdo();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48252a;
    @SafeParcelable.Field
    @VisibleForTesting

    /* renamed from: c */
    public final List f48253c;

    @SafeParcelable.Constructor
    public zzdn(@SafeParcelable.Param int i, @SafeParcelable.Param List list) {
        this.f48252a = i;
        this.f48253c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48252a);
        SafeParcelWriter.m4558B(parcel, 3, this.f48253c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
