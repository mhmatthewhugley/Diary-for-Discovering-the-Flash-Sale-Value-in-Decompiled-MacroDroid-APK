package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzs;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzlc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlc> CREATOR = new zzld();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44852a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f44853c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private zzs f44854d;

    private zzlc() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlc) {
            zzlc zzlc = (zzlc) obj;
            return Objects.m4470a(this.f44852a, zzlc.f44852a) && Objects.m4470a(Integer.valueOf(this.f44853c), Integer.valueOf(zzlc.f44853c)) && Objects.m4470a(this.f44854d, zzlc.f44854d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44852a, Integer.valueOf(this.f44853c), this.f44854d);
    }

    @Nullable
    /* renamed from: l2 */
    public final zzs mo52847l2() {
        return this.f44854d;
    }

    /* renamed from: m2 */
    public final String mo52848m2() {
        return this.f44852a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44852a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f44853c);
        SafeParcelWriter.m4584v(parcel, 3, this.f44854d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f44853c;
    }

    @SafeParcelable.Constructor
    zzlc(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zzs zzs) {
        this.f44852a = str;
        this.f44853c = i;
        this.f44854d = zzs;
    }
}
