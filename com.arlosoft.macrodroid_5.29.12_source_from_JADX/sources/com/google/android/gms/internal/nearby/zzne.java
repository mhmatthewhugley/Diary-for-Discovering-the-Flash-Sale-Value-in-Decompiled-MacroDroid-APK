package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzne extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzne> CREATOR = new zznf();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f44945a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final ParcelUuid f44946c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final ParcelUuid f44947d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final ParcelUuid f44948f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private final byte[] f44949g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final byte[] f44950o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final int f44951p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final byte[] f44952s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    private final byte[] f44953z;

    @SafeParcelable.Constructor
    zzne(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable ParcelUuid parcelUuid, @SafeParcelable.Param @Nullable ParcelUuid parcelUuid2, @SafeParcelable.Param @Nullable ParcelUuid parcelUuid3, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param @Nullable byte[] bArr2, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable byte[] bArr3, @SafeParcelable.Param @Nullable byte[] bArr4) {
        this.f44945a = i;
        this.f44946c = parcelUuid;
        this.f44947d = parcelUuid2;
        this.f44948f = parcelUuid3;
        this.f44949g = bArr;
        this.f44950o = bArr2;
        this.f44951p = i2;
        this.f44952s = bArr3;
        this.f44953z = bArr4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzne.class == obj.getClass()) {
            zzne zzne = (zzne) obj;
            return this.f44951p == zzne.f44951p && Arrays.equals(this.f44952s, zzne.f44952s) && Arrays.equals(this.f44953z, zzne.f44953z) && Objects.m4470a(this.f44948f, zzne.f44948f) && Arrays.equals(this.f44949g, zzne.f44949g) && Arrays.equals(this.f44950o, zzne.f44950o) && Objects.m4470a(this.f44946c, zzne.f44946c) && Objects.m4470a(this.f44947d, zzne.f44947d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f44951p), Integer.valueOf(Arrays.hashCode(this.f44952s)), Integer.valueOf(Arrays.hashCode(this.f44953z)), this.f44948f, Integer.valueOf(Arrays.hashCode(this.f44949g)), Integer.valueOf(Arrays.hashCode(this.f44950o)), this.f44946c, this.f44947d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f44945a);
        SafeParcelWriter.m4584v(parcel, 4, this.f44946c, i, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f44947d, i, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f44948f, i, false);
        SafeParcelWriter.m4569g(parcel, 7, this.f44949g, false);
        SafeParcelWriter.m4569g(parcel, 8, this.f44950o, false);
        SafeParcelWriter.m4576n(parcel, 9, this.f44951p);
        SafeParcelWriter.m4569g(parcel, 10, this.f44952s, false);
        SafeParcelWriter.m4569g(parcel, 11, this.f44953z, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
