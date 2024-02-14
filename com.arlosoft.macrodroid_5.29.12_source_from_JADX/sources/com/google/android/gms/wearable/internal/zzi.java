package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zza;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzi extends AbstractSafeParcelable implements zza {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final byte f48371a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final byte f48372c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f48373d;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param byte b, @SafeParcelable.Param byte b2, @SafeParcelable.Param String str) {
        this.f48371a = b;
        this.f48372c = b2;
        this.f48373d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzi.class != obj.getClass()) {
            return false;
        }
        zzi zzi = (zzi) obj;
        return this.f48371a == zzi.f48371a && this.f48372c == zzi.f48372c && this.f48373d.equals(zzi.f48373d);
    }

    public final int hashCode() {
        return ((((this.f48371a + 31) * 31) + this.f48372c) * 31) + this.f48373d.hashCode();
    }

    public final String toString() {
        byte b = this.f48371a;
        byte b2 = this.f48372c;
        String str = this.f48373d;
        return "AmsEntityUpdateParcelable{, mEntityId=" + b + ", mAttributeId=" + b2 + ", mValue='" + str + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4568f(parcel, 2, this.f48371a);
        SafeParcelWriter.m4568f(parcel, 3, this.f48372c);
        SafeParcelWriter.m4586x(parcel, 4, this.f48373d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
