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
public final class zzks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzks> CREATOR = new zzkt();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: A */
    private zznv f44826A;
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44827a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f44828c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f44829d;
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f44830f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private byte[] f44831g;
    @SafeParcelable.Field

    /* renamed from: o */
    private byte[] f44832o;
    @SafeParcelable.Field

    /* renamed from: p */
    private byte[] f44833p;
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f44834s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final int f44835z;

    private zzks() {
        this.f44835z = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzks) {
            zzks zzks = (zzks) obj;
            return Objects.m4470a(this.f44827a, zzks.f44827a) && Objects.m4470a(this.f44828c, zzks.f44828c) && Objects.m4470a(this.f44829d, zzks.f44829d) && Objects.m4470a(Boolean.valueOf(this.f44830f), Boolean.valueOf(zzks.f44830f)) && Arrays.equals(this.f44831g, zzks.f44831g) && Arrays.equals(this.f44832o, zzks.f44832o) && Arrays.equals(this.f44833p, zzks.f44833p) && Objects.m4470a(Boolean.valueOf(this.f44834s), Boolean.valueOf(zzks.f44834s)) && Objects.m4470a(Integer.valueOf(this.f44835z), Integer.valueOf(zzks.f44835z)) && Objects.m4470a(this.f44826A, zzks.f44826A);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44827a, this.f44828c, this.f44829d, Boolean.valueOf(this.f44830f), Integer.valueOf(Arrays.hashCode(this.f44831g)), Integer.valueOf(Arrays.hashCode(this.f44832o)), Integer.valueOf(Arrays.hashCode(this.f44833p)), Boolean.valueOf(this.f44834s), Integer.valueOf(this.f44835z), this.f44826A);
    }

    /* renamed from: l2 */
    public final String mo52806l2() {
        return this.f44827a;
    }

    /* renamed from: m2 */
    public final String mo52807m2() {
        return this.f44828c;
    }

    /* renamed from: n2 */
    public final boolean mo52808n2() {
        return this.f44834s;
    }

    /* renamed from: o2 */
    public final boolean mo52809o2() {
        return this.f44830f;
    }

    /* renamed from: p2 */
    public final byte[] mo52810p2() {
        return this.f44832o;
    }

    /* renamed from: q2 */
    public final byte[] mo52811q2() {
        return this.f44833p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44827a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f44828c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44829d, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f44830f);
        SafeParcelWriter.m4569g(parcel, 5, this.f44831g, false);
        SafeParcelWriter.m4569g(parcel, 6, this.f44832o, false);
        SafeParcelWriter.m4569g(parcel, 7, this.f44833p, false);
        SafeParcelWriter.m4565c(parcel, 8, this.f44834s);
        SafeParcelWriter.m4576n(parcel, 9, this.f44835z);
        SafeParcelWriter.m4584v(parcel, 10, this.f44826A, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f44829d;
    }

    @SafeParcelable.Constructor
    zzks(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param byte[] bArr2, @SafeParcelable.Param byte[] bArr3, @SafeParcelable.Param boolean z2, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44827a = str;
        this.f44828c = str2;
        this.f44829d = str3;
        this.f44830f = z;
        this.f44831g = bArr;
        this.f44832o = bArr2;
        this.f44833p = bArr3;
        this.f44834s = z2;
        this.f44835z = i;
        this.f44826A = zznv;
    }
}
