package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new zzkr();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44821a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f44822c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f44823d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f44824f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private zznv f44825g;

    private zzkq() {
        this.f44823d = 0;
        this.f44824f = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkq) {
            zzkq zzkq = (zzkq) obj;
            return Objects.m4470a(this.f44821a, zzkq.f44821a) && Objects.m4470a(Integer.valueOf(this.f44822c), Integer.valueOf(zzkq.f44822c)) && Objects.m4470a(Integer.valueOf(this.f44823d), Integer.valueOf(zzkq.f44823d)) && Objects.m4470a(Integer.valueOf(this.f44824f), Integer.valueOf(zzkq.f44824f)) && Objects.m4470a(this.f44825g, zzkq.f44825g);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44821a, Integer.valueOf(this.f44822c), Integer.valueOf(this.f44823d), Integer.valueOf(this.f44824f), this.f44825g);
    }

    /* renamed from: l2 */
    public final int mo52798l2() {
        return this.f44822c;
    }

    /* renamed from: m2 */
    public final String mo52799m2() {
        return this.f44821a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44821a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f44822c);
        SafeParcelWriter.m4576n(parcel, 3, this.f44823d);
        SafeParcelWriter.m4576n(parcel, 4, this.f44824f);
        SafeParcelWriter.m4584v(parcel, 5, this.f44825g, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f44823d;
    }

    @SafeParcelable.Constructor
    zzkq(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44821a = str;
        this.f44822c = i;
        this.f44823d = i2;
        this.f44824f = i3;
        this.f44825g = zznv;
    }
}
