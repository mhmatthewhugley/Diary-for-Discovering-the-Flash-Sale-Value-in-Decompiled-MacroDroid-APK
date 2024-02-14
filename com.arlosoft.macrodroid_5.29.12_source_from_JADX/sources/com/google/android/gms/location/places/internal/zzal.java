package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzaq();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<zzao> f45969a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final List<zzan> f45970c;

    @SafeParcelable.Constructor
    zzal(@SafeParcelable.Param List<zzao> list, @SafeParcelable.Param List<zzan> list2) {
        this.f45969a = Collections.unmodifiableList(list);
        this.f45970c = Collections.unmodifiableList(list2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f45969a, false);
        SafeParcelWriter.m4558B(parcel, 2, this.f45970c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
