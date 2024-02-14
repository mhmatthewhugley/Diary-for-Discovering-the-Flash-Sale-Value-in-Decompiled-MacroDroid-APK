package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    @SafeParcelable.Field

    /* renamed from: a */
    private byte[] f47494a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f47495c;
    @SafeParcelable.Field

    /* renamed from: d */
    private int f47496d;

    private zzu() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzu) {
            zzu zzu = (zzu) obj;
            return Arrays.equals(this.f47494a, zzu.f47494a) && Objects.m4470a(Integer.valueOf(this.f47495c), Integer.valueOf(zzu.f47495c)) && Objects.m4470a(Integer.valueOf(this.f47496d), Integer.valueOf(zzu.f47496d));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(Arrays.hashCode(this.f47494a)), Integer.valueOf(this.f47495c), Integer.valueOf(this.f47496d));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f47494a);
        int i = this.f47495c;
        int i2 = this.f47496d;
        return "UwbSenderInfo{address=" + arrays + ", channel=" + i + ", preambleIndex=" + i2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4569g(parcel, 1, this.f47494a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f47495c);
        SafeParcelWriter.m4576n(parcel, 3, this.f47496d);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzu(@SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f47494a = bArr;
        this.f47495c = i;
        this.f47496d = i2;
    }
}
