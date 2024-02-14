package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzky extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzky> CREATOR = new zzkz();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44842a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f44843c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private byte[] f44844d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f44845f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private zznv f44846g;

    private zzky() {
        this.f44845f = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzky) {
            zzky zzky = (zzky) obj;
            return Objects.m4470a(this.f44842a, zzky.f44842a) && Objects.m4470a(Integer.valueOf(this.f44843c), Integer.valueOf(zzky.f44843c)) && Arrays.equals(this.f44844d, zzky.f44844d) && Objects.m4470a(Integer.valueOf(this.f44845f), Integer.valueOf(zzky.f44845f)) && Objects.m4470a(this.f44846g, zzky.f44846g);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44842a, Integer.valueOf(this.f44843c), Integer.valueOf(Arrays.hashCode(this.f44844d)), Integer.valueOf(this.f44845f), this.f44846g);
    }

    /* renamed from: l2 */
    public final String mo52834l2() {
        return this.f44842a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44842a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f44843c);
        SafeParcelWriter.m4569g(parcel, 3, this.f44844d, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f44845f);
        SafeParcelWriter.m4584v(parcel, 5, this.f44846g, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f44843c;
    }

    @SafeParcelable.Constructor
    zzky(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44842a = str;
        this.f44843c = i;
        this.f44844d = bArr;
        this.f44845f = i2;
        this.f44846g = zznv;
    }
}
