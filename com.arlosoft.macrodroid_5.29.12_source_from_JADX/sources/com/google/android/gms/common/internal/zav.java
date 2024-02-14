package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3730a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    final IBinder f3731c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final ConnectionResult f3732d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f3733f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f3734g;

    @SafeParcelable.Constructor
    zav(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable IBinder iBinder, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f3730a = i;
        this.f3731c = iBinder;
        this.f3732d = connectionResult;
        this.f3733f = z;
        this.f3734g = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.f3732d.equals(zav.f3732d) && Objects.m4470a(mo21773m2(), zav.mo21773m2());
    }

    /* renamed from: l2 */
    public final ConnectionResult mo21772l2() {
        return this.f3732d;
    }

    @Nullable
    /* renamed from: m2 */
    public final IAccountAccessor mo21773m2() {
        IBinder iBinder = this.f3731c;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.m4461t1(iBinder);
    }

    /* renamed from: n2 */
    public final boolean mo21774n2() {
        return this.f3733f;
    }

    /* renamed from: o2 */
    public final boolean mo21775o2() {
        return this.f3734g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3730a);
        SafeParcelWriter.m4575m(parcel, 2, this.f3731c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f3732d, i, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f3733f);
        SafeParcelWriter.m4565c(parcel, 5, this.f3734g);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
