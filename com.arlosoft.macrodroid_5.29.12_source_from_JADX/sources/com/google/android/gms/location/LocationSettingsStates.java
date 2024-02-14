package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();
    @SafeParcelable.Field

    /* renamed from: a */
    private final boolean f45858a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f45859c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f45860d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f45861f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f45862g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final boolean f45863o;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param boolean z5, @SafeParcelable.Param boolean z6) {
        this.f45858a = z;
        this.f45859c = z2;
        this.f45860d = z3;
        this.f45861f = z4;
        this.f45862g = z5;
        this.f45863o = z6;
    }

    /* renamed from: l2 */
    public boolean mo54200l2() {
        return this.f45863o;
    }

    /* renamed from: m2 */
    public boolean mo54201m2() {
        return this.f45860d;
    }

    /* renamed from: n2 */
    public boolean mo54202n2() {
        return this.f45861f;
    }

    /* renamed from: o2 */
    public boolean mo54203o2() {
        return this.f45858a;
    }

    /* renamed from: p2 */
    public boolean mo54204p2() {
        return this.f45862g;
    }

    /* renamed from: q2 */
    public boolean mo54205q2() {
        return this.f45859c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, mo54203o2());
        SafeParcelWriter.m4565c(parcel, 2, mo54205q2());
        SafeParcelWriter.m4565c(parcel, 3, mo54201m2());
        SafeParcelWriter.m4565c(parcel, 4, mo54202n2());
        SafeParcelWriter.m4565c(parcel, 5, mo54204p2());
        SafeParcelWriter.m4565c(parcel, 6, mo54200l2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
