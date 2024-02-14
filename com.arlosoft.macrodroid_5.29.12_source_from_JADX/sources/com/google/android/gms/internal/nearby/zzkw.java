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
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new zzkx();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44839a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f44840c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private byte[] f44841d;

    private zzkw() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkw) {
            zzkw zzkw = (zzkw) obj;
            return Objects.m4470a(this.f44839a, zzkw.f44839a) && Objects.m4470a(Integer.valueOf(this.f44840c), Integer.valueOf(zzkw.f44840c)) && Arrays.equals(this.f44841d, zzkw.f44841d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44839a, Integer.valueOf(this.f44840c), Integer.valueOf(Arrays.hashCode(this.f44841d)));
    }

    /* renamed from: l2 */
    public final String mo52826l2() {
        return this.f44839a;
    }

    @Nullable
    /* renamed from: m2 */
    public final byte[] mo52827m2() {
        return this.f44841d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44839a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f44840c);
        SafeParcelWriter.m4569g(parcel, 3, this.f44841d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f44840c;
    }

    @SafeParcelable.Constructor
    zzkw(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable byte[] bArr) {
        this.f44839a = str;
        this.f44840c = i;
        this.f44841d = bArr;
    }
}
