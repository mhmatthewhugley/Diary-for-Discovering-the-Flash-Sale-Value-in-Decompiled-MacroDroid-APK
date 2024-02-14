package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgm extends AbstractSafeParcelable implements Node {
    public static final Parcelable.Creator<zzgm> CREATOR = new zzgn();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f48340a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f48341c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f48342d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f48343f;

    @SafeParcelable.Constructor
    public zzgm(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param int i, @SafeParcelable.Param boolean z) {
        this.f48340a = str;
        this.f48341c = str2;
        this.f48342d = i;
        this.f48343f = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgm)) {
            return false;
        }
        return ((zzgm) obj).f48340a.equals(this.f48340a);
    }

    public final String getId() {
        return this.f48340a;
    }

    public final int hashCode() {
        return this.f48340a.hashCode();
    }

    /* renamed from: p0 */
    public final String mo56222p0() {
        return this.f48341c;
    }

    public final String toString() {
        String str = this.f48341c;
        String str2 = this.f48340a;
        int i = this.f48342d;
        boolean z = this.f48343f;
        return "Node{" + str + ", id=" + str2 + ", hops=" + i + ", isNearby=" + z + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f48340a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f48341c, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f48342d);
        SafeParcelWriter.m4565c(parcel, 5, this.f48343f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
