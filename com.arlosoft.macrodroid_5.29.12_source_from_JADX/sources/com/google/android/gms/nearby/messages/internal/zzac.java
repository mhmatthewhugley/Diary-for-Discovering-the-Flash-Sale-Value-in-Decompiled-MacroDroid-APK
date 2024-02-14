package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47709a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final String f47710c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public final String f47711d;

    @SafeParcelable.Constructor
    zzac(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        this.f47709a = i;
        this.f47710c = str;
        this.f47711d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzac) && hashCode() == obj.hashCode()) {
            zzac zzac = (zzac) obj;
            return Objects.m4470a(this.f47710c, zzac.f47710c) && Objects.m4470a(this.f47711d, zzac.f47711d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f47710c, this.f47711d);
    }

    public final String toString() {
        String str = this.f47710c;
        String str2 = this.f47711d;
        return "namespace=" + str + ", type=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f47710c, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f47711d, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f47709a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
