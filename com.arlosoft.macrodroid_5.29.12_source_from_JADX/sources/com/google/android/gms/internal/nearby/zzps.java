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
public final class zzps extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzps> CREATOR = new zzpt();
    @SafeParcelable.Field

    /* renamed from: a */
    private boolean f45007a;
    @SafeParcelable.Field

    /* renamed from: c */
    private boolean f45008c;
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f45009d;
    @SafeParcelable.Field

    /* renamed from: f */
    private int f45010f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f45011g;

    private zzps() {
    }

    /* renamed from: a */
    public final boolean mo53131a() {
        return this.f45007a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzps) {
            zzps zzps = (zzps) obj;
            return Objects.m4470a(Boolean.valueOf(this.f45007a), Boolean.valueOf(zzps.f45007a)) && Objects.m4470a(Boolean.valueOf(this.f45008c), Boolean.valueOf(zzps.f45008c)) && Objects.m4470a(Boolean.valueOf(this.f45009d), Boolean.valueOf(zzps.f45009d)) && Objects.m4470a(Integer.valueOf(this.f45010f), Integer.valueOf(zzps.f45010f)) && Objects.m4470a(Integer.valueOf(this.f45011g), Integer.valueOf(zzps.f45011g));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f45007a), Boolean.valueOf(this.f45008c), Boolean.valueOf(this.f45009d), Integer.valueOf(this.f45010f), Integer.valueOf(this.f45011g));
    }

    /* renamed from: l2 */
    public final boolean mo53134l2() {
        return this.f45008c;
    }

    /* renamed from: m2 */
    public final boolean mo53135m2() {
        return this.f45009d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f45007a);
        SafeParcelWriter.m4565c(parcel, 2, this.f45008c);
        SafeParcelWriter.m4565c(parcel, 3, this.f45009d);
        SafeParcelWriter.m4576n(parcel, 4, this.f45010f);
        SafeParcelWriter.m4576n(parcel, 5, this.f45011g);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f45011g;
    }

    @SafeParcelable.Constructor
    zzps(@SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f45007a = z;
        this.f45008c = z2;
        this.f45009d = z3;
        this.f45010f = i;
        this.f45011g = i2;
    }
}
