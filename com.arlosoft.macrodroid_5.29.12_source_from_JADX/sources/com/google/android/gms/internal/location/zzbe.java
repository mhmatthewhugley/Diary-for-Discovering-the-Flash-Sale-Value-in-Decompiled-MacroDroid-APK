package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@SafeParcelable.Class
@SafeParcelable.Reserved
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f41118a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final long f41119c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final short f41120d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final double f41121f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final double f41122g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final float f41123o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final int f41124p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final int f41125s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final int f41126z;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param short s, @SafeParcelable.Param double d, @SafeParcelable.Param double d2, @SafeParcelable.Param float f, @SafeParcelable.Param long j, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        String str2;
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "requestId is null or too long: ".concat(valueOf);
            } else {
                str2 = new String("requestId is null or too long: ");
            }
            throw new IllegalArgumentException(str2);
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f41120d = s;
                this.f41118a = str;
                this.f41121f = d;
                this.f41122g = d2;
                this.f41123o = f;
                this.f41119c = j;
                this.f41124p = i4;
                this.f41125s = i2;
                this.f41126z = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            return this.f41123o == zzbe.f41123o && this.f41121f == zzbe.f41121f && this.f41122g == zzbe.f41122g && this.f41120d == zzbe.f41120d;
        }
    }

    /* renamed from: f */
    public final String mo50588f() {
        return this.f41118a;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41121f);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41122g);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f41123o)) * 31) + this.f41120d) * 31) + this.f41124p;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.f41120d;
        objArr[0] = s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID";
        objArr[1] = this.f41118a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f41124p);
        objArr[3] = Double.valueOf(this.f41121f);
        objArr[4] = Double.valueOf(this.f41122g);
        objArr[5] = Float.valueOf(this.f41123o);
        objArr[6] = Integer.valueOf(this.f41125s / 1000);
        objArr[7] = Integer.valueOf(this.f41126z);
        objArr[8] = Long.valueOf(this.f41119c);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f41118a, false);
        SafeParcelWriter.m4581s(parcel, 2, this.f41119c);
        SafeParcelWriter.m4585w(parcel, 3, this.f41120d);
        SafeParcelWriter.m4570h(parcel, 4, this.f41121f);
        SafeParcelWriter.m4570h(parcel, 5, this.f41122g);
        SafeParcelWriter.m4573k(parcel, 6, this.f41123o);
        SafeParcelWriter.m4576n(parcel, 7, this.f41124p);
        SafeParcelWriter.m4576n(parcel, 8, this.f41125s);
        SafeParcelWriter.m4576n(parcel, 9, this.f41126z);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
