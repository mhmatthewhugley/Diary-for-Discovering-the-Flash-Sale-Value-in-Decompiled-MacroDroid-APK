package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f46479a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzau f46480c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f46481d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final long f46482f;

    zzaw(zzaw zzaw, long j) {
        Preconditions.m4488k(zzaw);
        this.f46479a = zzaw.f46479a;
        this.f46480c = zzaw.f46480c;
        this.f46481d = zzaw.f46481d;
        this.f46482f = j;
    }

    public final String toString() {
        String str = this.f46481d;
        String str2 = this.f46479a;
        String valueOf = String.valueOf(this.f46480c);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzax.m65471a(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param String str, @SafeParcelable.Param zzau zzau, @SafeParcelable.Param String str2, @SafeParcelable.Param long j) {
        this.f46479a = str;
        this.f46480c = zzau;
        this.f46481d = str2;
        this.f46482f = j;
    }
}
