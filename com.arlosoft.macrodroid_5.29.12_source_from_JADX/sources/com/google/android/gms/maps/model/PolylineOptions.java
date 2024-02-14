package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: A */
    private int f46307A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    private List<PatternItem> f46308B;
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<LatLng> f46309a;
    @SafeParcelable.Field

    /* renamed from: c */
    private float f46310c;
    @SafeParcelable.Field

    /* renamed from: d */
    private int f46311d;
    @SafeParcelable.Field

    /* renamed from: f */
    private float f46312f;
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f46313g;
    @SafeParcelable.Field

    /* renamed from: o */
    private boolean f46314o;
    @SafeParcelable.Field

    /* renamed from: p */
    private boolean f46315p;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: s */
    private Cap f46316s;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: z */
    private Cap f46317z;

    public PolylineOptions() {
        this.f46310c = 10.0f;
        this.f46311d = ViewCompat.MEASURED_STATE_MASK;
        this.f46312f = 0.0f;
        this.f46313g = true;
        this.f46314o = false;
        this.f46315p = false;
        this.f46316s = new ButtCap();
        this.f46317z = new ButtCap();
        this.f46307A = 0;
        this.f46308B = null;
        this.f46309a = new ArrayList();
    }

    /* renamed from: l2 */
    public final int mo54761l2() {
        return this.f46311d;
    }

    @NonNull
    /* renamed from: m2 */
    public final Cap mo54762m2() {
        return this.f46317z;
    }

    /* renamed from: n2 */
    public final int mo54763n2() {
        return this.f46307A;
    }

    @Nullable
    /* renamed from: o2 */
    public final List<PatternItem> mo54764o2() {
        return this.f46308B;
    }

    /* renamed from: p2 */
    public final List<LatLng> mo54765p2() {
        return this.f46309a;
    }

    @NonNull
    /* renamed from: q2 */
    public final Cap mo54766q2() {
        return this.f46316s;
    }

    /* renamed from: r2 */
    public final float mo54767r2() {
        return this.f46310c;
    }

    /* renamed from: s2 */
    public final float mo54768s2() {
        return this.f46312f;
    }

    /* renamed from: t2 */
    public final boolean mo54769t2() {
        return this.f46315p;
    }

    /* renamed from: u2 */
    public final boolean mo54770u2() {
        return this.f46314o;
    }

    /* renamed from: v2 */
    public final boolean mo54771v2() {
        return this.f46313g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 2, mo54765p2(), false);
        SafeParcelWriter.m4573k(parcel, 3, mo54767r2());
        SafeParcelWriter.m4576n(parcel, 4, mo54761l2());
        SafeParcelWriter.m4573k(parcel, 5, mo54768s2());
        SafeParcelWriter.m4565c(parcel, 6, mo54771v2());
        SafeParcelWriter.m4565c(parcel, 7, mo54770u2());
        SafeParcelWriter.m4565c(parcel, 8, mo54769t2());
        SafeParcelWriter.m4584v(parcel, 9, mo54766q2(), i, false);
        SafeParcelWriter.m4584v(parcel, 10, mo54762m2(), i, false);
        SafeParcelWriter.m4576n(parcel, 11, mo54763n2());
        SafeParcelWriter.m4558B(parcel, 12, mo54764o2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    PolylineOptions(@SafeParcelable.Param List list, @SafeParcelable.Param float f, @SafeParcelable.Param int i, @SafeParcelable.Param float f2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param @Nullable Cap cap, @SafeParcelable.Param @Nullable Cap cap2, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable List<PatternItem> list2) {
        this.f46310c = 10.0f;
        this.f46311d = ViewCompat.MEASURED_STATE_MASK;
        this.f46312f = 0.0f;
        this.f46313g = true;
        this.f46314o = false;
        this.f46315p = false;
        this.f46316s = new ButtCap();
        this.f46317z = new ButtCap();
        this.f46307A = 0;
        this.f46308B = null;
        this.f46309a = list;
        this.f46310c = f;
        this.f46311d = i;
        this.f46312f = f2;
        this.f46313g = z;
        this.f46314o = z2;
        this.f46315p = z3;
        if (cap != null) {
            this.f46316s = cap;
        }
        if (cap2 != null) {
            this.f46317z = cap2;
        }
        this.f46307A = i2;
        this.f46308B = list2;
    }
}
