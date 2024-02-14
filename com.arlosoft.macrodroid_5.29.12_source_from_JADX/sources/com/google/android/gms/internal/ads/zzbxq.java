package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxq> CREATOR = new zzbxr();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f27927a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f27928c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f27929d;

    @SafeParcelable.Constructor
    zzbxq(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f27927a = i;
        this.f27928c = i2;
        this.f27929d = i3;
    }

    /* renamed from: l2 */
    public static zzbxq m44633l2(VersionInfo versionInfo) {
        return new zzbxq(versionInfo.mo19748a(), versionInfo.mo19750c(), versionInfo.mo19749b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbxq)) {
            zzbxq zzbxq = (zzbxq) obj;
            if (zzbxq.f27929d == this.f27929d && zzbxq.f27928c == this.f27928c && zzbxq.f27927a == this.f27927a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f27927a, this.f27928c, this.f27929d});
    }

    public final String toString() {
        int i = this.f27927a;
        int i2 = this.f27928c;
        int i3 = this.f27929d;
        return i + "." + i2 + "." + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f27927a);
        SafeParcelWriter.m4576n(parcel, 2, this.f27928c);
        SafeParcelWriter.m4576n(parcel, 3, this.f27929d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
