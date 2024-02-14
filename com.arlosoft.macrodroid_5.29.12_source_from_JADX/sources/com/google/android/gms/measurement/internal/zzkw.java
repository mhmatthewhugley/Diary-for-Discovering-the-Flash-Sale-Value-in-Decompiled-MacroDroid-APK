package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new zzkx();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f47281a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f47282c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final long f47283d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final Long f47284f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public final String f47285g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final String f47286o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final Double f47287p;

    @SafeParcelable.Constructor
    zzkw(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param long j, @SafeParcelable.Param @Nullable Long l, @SafeParcelable.Param Float f, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param @Nullable Double d) {
        this.f47281a = i;
        this.f47282c = str;
        this.f47283d = j;
        this.f47284f = l;
        if (i == 1) {
            this.f47287p = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f47287p = d;
        }
        this.f47285g = str2;
        this.f47286o = str3;
    }

    @Nullable
    /* renamed from: l2 */
    public final Object mo55568l2() {
        Long l = this.f47284f;
        if (l != null) {
            return l;
        }
        Double d = this.f47287p;
        if (d != null) {
            return d;
        }
        String str = this.f47285g;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzkx.m66117a(this, parcel, i);
    }

    zzkw(zzky zzky) {
        this(zzky.f47290c, zzky.f47291d, zzky.f47292e, zzky.f47289b);
    }

    zzkw(String str, long j, @Nullable Object obj, String str2) {
        Preconditions.m4484g(str);
        this.f47281a = 2;
        this.f47282c = str;
        this.f47283d = j;
        this.f47286o = str2;
        if (obj == null) {
            this.f47284f = null;
            this.f47287p = null;
            this.f47285g = null;
        } else if (obj instanceof Long) {
            this.f47284f = (Long) obj;
            this.f47287p = null;
            this.f47285g = null;
        } else if (obj instanceof String) {
            this.f47284f = null;
            this.f47287p = null;
            this.f47285g = (String) obj;
        } else if (obj instanceof Double) {
            this.f47284f = null;
            this.f47287p = (Double) obj;
            this.f47285g = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
