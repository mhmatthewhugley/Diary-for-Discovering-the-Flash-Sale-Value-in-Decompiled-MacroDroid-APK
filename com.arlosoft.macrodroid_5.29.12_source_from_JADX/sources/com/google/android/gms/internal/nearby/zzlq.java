package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzlq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlq> CREATOR = new zzlr();
    @SafeParcelable.Field

    /* renamed from: a */
    private int f44873a;

    private zzlq() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlq) {
            return Objects.m4470a(Integer.valueOf(this.f44873a), Integer.valueOf(((zzlq) obj).f44873a));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f44873a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f44873a);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzlq(@SafeParcelable.Param int i) {
        this.f44873a = i;
    }
}
