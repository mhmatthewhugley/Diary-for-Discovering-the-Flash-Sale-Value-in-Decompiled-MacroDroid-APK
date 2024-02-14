package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzl extends AbstractSafeParcelable implements zzb {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: A */
    private final byte f48422A;
    @SafeParcelable.Field

    /* renamed from: B */
    private final byte f48423B;
    @SafeParcelable.Field

    /* renamed from: C */
    private final String f48424C;
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f48425a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f48426c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f48427d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f48428f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f48429g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final String f48430o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final String f48431p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final byte f48432s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final byte f48433z;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param byte b, @SafeParcelable.Param byte b2, @SafeParcelable.Param byte b3, @SafeParcelable.Param byte b4, @SafeParcelable.Param String str7) {
        this.f48425a = i;
        this.f48426c = str;
        this.f48427d = str2;
        this.f48428f = str3;
        this.f48429g = str4;
        this.f48430o = str5;
        this.f48431p = str6;
        this.f48432s = b;
        this.f48433z = b2;
        this.f48422A = b3;
        this.f48423B = b4;
        this.f48424C = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzl.class != obj.getClass()) {
            return false;
        }
        zzl zzl = (zzl) obj;
        if (this.f48425a != zzl.f48425a || this.f48432s != zzl.f48432s || this.f48433z != zzl.f48433z || this.f48422A != zzl.f48422A || this.f48423B != zzl.f48423B || !this.f48426c.equals(zzl.f48426c)) {
            return false;
        }
        String str = this.f48427d;
        if (str == null ? zzl.f48427d != null : !str.equals(zzl.f48427d)) {
            return false;
        }
        if (!this.f48428f.equals(zzl.f48428f) || !this.f48429g.equals(zzl.f48429g) || !this.f48430o.equals(zzl.f48430o)) {
            return false;
        }
        String str2 = this.f48431p;
        if (str2 == null ? zzl.f48431p != null : !str2.equals(zzl.f48431p)) {
            return false;
        }
        String str3 = this.f48424C;
        if (str3 != null) {
            return str3.equals(zzl.f48424C);
        }
        return zzl.f48424C == null;
    }

    public final int hashCode() {
        int hashCode = (((this.f48425a + 31) * 31) + this.f48426c.hashCode()) * 31;
        String str = this.f48427d;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f48428f.hashCode()) * 31) + this.f48429g.hashCode()) * 31) + this.f48430o.hashCode()) * 31;
        String str2 = this.f48431p;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f48432s) * 31) + this.f48433z) * 31) + this.f48422A) * 31) + this.f48423B) * 31;
        String str3 = this.f48424C;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = this.f48425a;
        String str = this.f48426c;
        String str2 = this.f48427d;
        byte b = this.f48432s;
        byte b2 = this.f48433z;
        byte b3 = this.f48422A;
        byte b4 = this.f48423B;
        String str3 = this.f48424C;
        return "AncsNotificationParcelable{, id=" + i + ", appId='" + str + "', dateTime='" + str2 + "', eventId=" + b + ", eventFlags=" + b2 + ", categoryId=" + b3 + ", categoryCount=" + b4 + ", packageName='" + str3 + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48425a);
        SafeParcelWriter.m4586x(parcel, 3, this.f48426c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f48427d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f48428f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f48429g, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f48430o, false);
        String str = this.f48431p;
        if (str == null) {
            str = this.f48426c;
        }
        SafeParcelWriter.m4586x(parcel, 8, str, false);
        SafeParcelWriter.m4568f(parcel, 9, this.f48432s);
        SafeParcelWriter.m4568f(parcel, 10, this.f48433z);
        SafeParcelWriter.m4568f(parcel, 11, this.f48422A);
        SafeParcelWriter.m4568f(parcel, 12, this.f48423B);
        SafeParcelWriter.m4586x(parcel, 13, this.f48424C, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
