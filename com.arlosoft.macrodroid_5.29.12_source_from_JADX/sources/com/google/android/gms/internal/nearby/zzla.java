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
public final class zzla extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzla> CREATOR = new zzlb();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44849a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f44850c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private zznv f44851d;

    private zzla() {
        this.f44850c = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzla) {
            zzla zzla = (zzla) obj;
            return Objects.m4470a(this.f44849a, zzla.f44849a) && Objects.m4470a(Integer.valueOf(this.f44850c), Integer.valueOf(zzla.f44850c)) && Objects.m4470a(this.f44851d, zzla.f44851d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44849a, Integer.valueOf(this.f44850c), this.f44851d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44849a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f44850c);
        SafeParcelWriter.m4584v(parcel, 3, this.f44851d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f44849a;
    }

    @SafeParcelable.Constructor
    zzla(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44849a = str;
        this.f44850c = i;
        this.f44851d = zznv;
    }
}
