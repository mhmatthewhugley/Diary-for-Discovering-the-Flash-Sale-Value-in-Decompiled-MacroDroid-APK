package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a */
    private final boolean f3997a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f3998c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f3999d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f4000f;

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param boolean z, @SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f3997a = z;
        this.f3998c = str;
        this.f3999d = zzy.m4964a(i) - 1;
        this.f4000f = zzd.m4933a(i2) - 1;
    }

    /* renamed from: l2 */
    public final boolean mo21980l2() {
        return this.f3997a;
    }

    /* renamed from: m2 */
    public final int mo21981m2() {
        return zzd.m4933a(this.f4000f);
    }

    /* renamed from: n2 */
    public final int mo21982n2() {
        return zzy.m4964a(this.f3999d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f3997a);
        SafeParcelWriter.m4586x(parcel, 2, this.f3998c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f3999d);
        SafeParcelWriter.m4576n(parcel, 4, this.f4000f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f3998c;
    }
}
