package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzi();

    /* renamed from: d */
    private static final String f46288d = PatternItem.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f46289a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final Float f46290c;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        Preconditions.m4479b(z, sb.toString());
        this.f46289a = i;
        this.f46290c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f46289a == patternItem.f46289a && Objects.m4470a(this.f46290c, patternItem.f46290c);
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f46289a), this.f46290c);
    }

    public String toString() {
        int i = this.f46289a;
        String valueOf = String.valueOf(this.f46290c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f46289a);
        SafeParcelWriter.m4574l(parcel, 3, this.f46290c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
