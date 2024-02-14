package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: A */
    private int f46295A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    private List<PatternItem> f46296B;
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<LatLng> f46297a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final List<List<LatLng>> f46298c;
    @SafeParcelable.Field

    /* renamed from: d */
    private float f46299d;
    @SafeParcelable.Field

    /* renamed from: f */
    private int f46300f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f46301g;
    @SafeParcelable.Field

    /* renamed from: o */
    private float f46302o;
    @SafeParcelable.Field

    /* renamed from: p */
    private boolean f46303p;
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f46304s;
    @SafeParcelable.Field

    /* renamed from: z */
    private boolean f46305z;

    public PolygonOptions() {
        this.f46299d = 10.0f;
        this.f46300f = ViewCompat.MEASURED_STATE_MASK;
        this.f46301g = 0;
        this.f46302o = 0.0f;
        this.f46303p = true;
        this.f46304s = false;
        this.f46305z = false;
        this.f46295A = 0;
        this.f46296B = null;
        this.f46297a = new ArrayList();
        this.f46298c = new ArrayList();
    }

    /* renamed from: l2 */
    public final int mo54748l2() {
        return this.f46301g;
    }

    /* renamed from: m2 */
    public final List<LatLng> mo54749m2() {
        return this.f46297a;
    }

    /* renamed from: n2 */
    public final int mo54750n2() {
        return this.f46300f;
    }

    /* renamed from: o2 */
    public final int mo54751o2() {
        return this.f46295A;
    }

    @Nullable
    /* renamed from: p2 */
    public final List<PatternItem> mo54752p2() {
        return this.f46296B;
    }

    /* renamed from: q2 */
    public final float mo54753q2() {
        return this.f46299d;
    }

    /* renamed from: r2 */
    public final float mo54754r2() {
        return this.f46302o;
    }

    /* renamed from: s2 */
    public final boolean mo54755s2() {
        return this.f46305z;
    }

    /* renamed from: t2 */
    public final boolean mo54756t2() {
        return this.f46304s;
    }

    /* renamed from: u2 */
    public final boolean mo54757u2() {
        return this.f46303p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 2, mo54749m2(), false);
        SafeParcelWriter.m4580r(parcel, 3, this.f46298c, false);
        SafeParcelWriter.m4573k(parcel, 4, mo54753q2());
        SafeParcelWriter.m4576n(parcel, 5, mo54750n2());
        SafeParcelWriter.m4576n(parcel, 6, mo54748l2());
        SafeParcelWriter.m4573k(parcel, 7, mo54754r2());
        SafeParcelWriter.m4565c(parcel, 8, mo54757u2());
        SafeParcelWriter.m4565c(parcel, 9, mo54756t2());
        SafeParcelWriter.m4565c(parcel, 10, mo54755s2());
        SafeParcelWriter.m4576n(parcel, 11, mo54751o2());
        SafeParcelWriter.m4558B(parcel, 12, mo54752p2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    PolygonOptions(@SafeParcelable.Param List<LatLng> list, @SafeParcelable.Param List list2, @SafeParcelable.Param float f, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param float f2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param int i3, @SafeParcelable.Param @Nullable List<PatternItem> list3) {
        this.f46297a = list;
        this.f46298c = list2;
        this.f46299d = f;
        this.f46300f = i;
        this.f46301g = i2;
        this.f46302o = f2;
        this.f46303p = z;
        this.f46304s = z2;
        this.f46305z = z3;
        this.f46295A = i3;
        this.f46296B = list3;
    }
}
