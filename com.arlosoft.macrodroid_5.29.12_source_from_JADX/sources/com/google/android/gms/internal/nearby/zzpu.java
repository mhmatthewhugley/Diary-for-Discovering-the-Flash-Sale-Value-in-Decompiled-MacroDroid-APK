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
public final class zzpu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpu> CREATOR = new zzpv();
    @SafeParcelable.Field

    /* renamed from: a */
    private int f45012a;
    @SafeParcelable.Field

    /* renamed from: c */
    private float f45013c;

    private zzpu() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpu) {
            zzpu zzpu = (zzpu) obj;
            return Objects.m4470a(Integer.valueOf(this.f45012a), Integer.valueOf(zzpu.f45012a)) && Objects.m4470a(Float.valueOf(this.f45013c), Float.valueOf(zzpu.f45013c));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45012a), Float.valueOf(this.f45013c));
    }

    /* renamed from: l2 */
    public final float mo53142l2() {
        return this.f45013c;
    }

    /* renamed from: m2 */
    public final int mo53143m2() {
        return this.f45012a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45012a);
        SafeParcelWriter.m4573k(parcel, 2, this.f45013c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzpu(@SafeParcelable.Param int i, @SafeParcelable.Param float f) {
        this.f45012a = i;
        this.f45013c = f;
    }
}
