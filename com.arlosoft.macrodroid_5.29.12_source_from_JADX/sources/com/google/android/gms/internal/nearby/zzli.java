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
public final class zzli extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzli> CREATOR = new zzlj();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44861a;
    @SafeParcelable.Field

    /* renamed from: c */
    private zzmb f44862c;
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f44863d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f44864f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private zznv f44865g;

    private zzli() {
        this.f44864f = 0;
    }

    /* renamed from: a */
    public final boolean mo52869a() {
        return this.f44863d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzli) {
            zzli zzli = (zzli) obj;
            return Objects.m4470a(this.f44861a, zzli.f44861a) && Objects.m4470a(this.f44862c, zzli.f44862c) && Objects.m4470a(Boolean.valueOf(this.f44863d), Boolean.valueOf(zzli.f44863d)) && Objects.m4470a(Integer.valueOf(this.f44864f), Integer.valueOf(zzli.f44864f)) && Objects.m4470a(this.f44865g, zzli.f44865g);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44861a, this.f44862c, Boolean.valueOf(this.f44863d), Integer.valueOf(this.f44864f), this.f44865g);
    }

    /* renamed from: l2 */
    public final zzmb mo52872l2() {
        return this.f44862c;
    }

    /* renamed from: m2 */
    public final String mo52873m2() {
        return this.f44861a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44861a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f44862c, i, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f44863d);
        SafeParcelWriter.m4576n(parcel, 4, this.f44864f);
        SafeParcelWriter.m4584v(parcel, 5, this.f44865g, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzli(@SafeParcelable.Param String str, @SafeParcelable.Param zzmb zzmb, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44861a = str;
        this.f44862c = zzmb;
        this.f44863d = z;
        this.f44864f = i;
        this.f44865g = zznv;
    }
}
