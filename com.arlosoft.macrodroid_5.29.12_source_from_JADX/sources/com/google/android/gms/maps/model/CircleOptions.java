package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private LatLng f46233a;
    @SafeParcelable.Field

    /* renamed from: c */
    private double f46234c;
    @SafeParcelable.Field

    /* renamed from: d */
    private float f46235d;
    @SafeParcelable.Field

    /* renamed from: f */
    private int f46236f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f46237g;
    @SafeParcelable.Field

    /* renamed from: o */
    private float f46238o;
    @SafeParcelable.Field

    /* renamed from: p */
    private boolean f46239p;
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f46240s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    private List<PatternItem> f46241z;

    public CircleOptions() {
        this.f46233a = null;
        this.f46234c = 0.0d;
        this.f46235d = 10.0f;
        this.f46236f = ViewCompat.MEASURED_STATE_MASK;
        this.f46237g = 0;
        this.f46238o = 0.0f;
        this.f46239p = true;
        this.f46240s = false;
        this.f46241z = null;
    }

    /* renamed from: l2 */
    public final LatLng mo54685l2() {
        return this.f46233a;
    }

    /* renamed from: m2 */
    public final int mo54686m2() {
        return this.f46237g;
    }

    /* renamed from: n2 */
    public final double mo54687n2() {
        return this.f46234c;
    }

    /* renamed from: o2 */
    public final int mo54688o2() {
        return this.f46236f;
    }

    @Nullable
    /* renamed from: p2 */
    public final List<PatternItem> mo54689p2() {
        return this.f46241z;
    }

    /* renamed from: q2 */
    public final float mo54690q2() {
        return this.f46235d;
    }

    /* renamed from: r2 */
    public final float mo54691r2() {
        return this.f46238o;
    }

    /* renamed from: s2 */
    public final boolean mo54692s2() {
        return this.f46240s;
    }

    /* renamed from: t2 */
    public final boolean mo54693t2() {
        return this.f46239p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, mo54685l2(), i, false);
        SafeParcelWriter.m4570h(parcel, 3, mo54687n2());
        SafeParcelWriter.m4573k(parcel, 4, mo54690q2());
        SafeParcelWriter.m4576n(parcel, 5, mo54688o2());
        SafeParcelWriter.m4576n(parcel, 6, mo54686m2());
        SafeParcelWriter.m4573k(parcel, 7, mo54691r2());
        SafeParcelWriter.m4565c(parcel, 8, mo54693t2());
        SafeParcelWriter.m4565c(parcel, 9, mo54692s2());
        SafeParcelWriter.m4558B(parcel, 10, mo54689p2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    CircleOptions(@SafeParcelable.Param LatLng latLng, @SafeParcelable.Param double d, @SafeParcelable.Param float f, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param float f2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable List<PatternItem> list) {
        this.f46233a = latLng;
        this.f46234c = d;
        this.f46235d = f;
        this.f46236f = i;
        this.f46237g = i2;
        this.f46238o = f2;
        this.f46239p = z;
        this.f46240s = z2;
        this.f46241z = list;
    }
}
