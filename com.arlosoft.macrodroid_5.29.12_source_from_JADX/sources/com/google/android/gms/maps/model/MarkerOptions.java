package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzh();
    @SafeParcelable.Field

    /* renamed from: A */
    private float f46274A = 0.0f;
    @SafeParcelable.Field

    /* renamed from: B */
    private float f46275B = 0.5f;
    @SafeParcelable.Field

    /* renamed from: C */
    private float f46276C = 0.0f;
    @SafeParcelable.Field

    /* renamed from: D */
    private float f46277D = 1.0f;
    @SafeParcelable.Field

    /* renamed from: E */
    private float f46278E;
    @SafeParcelable.Field

    /* renamed from: a */
    private LatLng f46279a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f46280c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f46281d;
    @SafeParcelable.Field

    /* renamed from: f */
    private BitmapDescriptor f46282f;
    @SafeParcelable.Field

    /* renamed from: g */
    private float f46283g = 0.5f;
    @SafeParcelable.Field

    /* renamed from: o */
    private float f46284o = 1.0f;
    @SafeParcelable.Field

    /* renamed from: p */
    private boolean f46285p;
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f46286s = true;
    @SafeParcelable.Field

    /* renamed from: z */
    private boolean f46287z = false;

    public MarkerOptions() {
    }

    /* renamed from: l2 */
    public final float mo54726l2() {
        return this.f46277D;
    }

    /* renamed from: m2 */
    public final float mo54727m2() {
        return this.f46283g;
    }

    /* renamed from: n2 */
    public final float mo54728n2() {
        return this.f46284o;
    }

    /* renamed from: o2 */
    public final float mo54729o2() {
        return this.f46275B;
    }

    /* renamed from: p2 */
    public final float mo54730p2() {
        return this.f46276C;
    }

    /* renamed from: q2 */
    public final LatLng mo54731q2() {
        return this.f46279a;
    }

    /* renamed from: r2 */
    public final float mo54732r2() {
        return this.f46274A;
    }

    /* renamed from: s2 */
    public final String mo54733s2() {
        return this.f46281d;
    }

    /* renamed from: t2 */
    public final String mo54734t2() {
        return this.f46280c;
    }

    /* renamed from: u2 */
    public final float mo54735u2() {
        return this.f46278E;
    }

    /* renamed from: v2 */
    public final MarkerOptions mo54736v2(@Nullable BitmapDescriptor bitmapDescriptor) {
        this.f46282f = bitmapDescriptor;
        return this;
    }

    /* renamed from: w2 */
    public final boolean mo54737w2() {
        return this.f46285p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, mo54731q2(), i, false);
        SafeParcelWriter.m4586x(parcel, 3, mo54734t2(), false);
        SafeParcelWriter.m4586x(parcel, 4, mo54733s2(), false);
        BitmapDescriptor bitmapDescriptor = this.f46282f;
        if (bitmapDescriptor == null) {
            iBinder = null;
        } else {
            iBinder = bitmapDescriptor.mo54669a().asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 5, iBinder, false);
        SafeParcelWriter.m4573k(parcel, 6, mo54727m2());
        SafeParcelWriter.m4573k(parcel, 7, mo54728n2());
        SafeParcelWriter.m4565c(parcel, 8, mo54737w2());
        SafeParcelWriter.m4565c(parcel, 9, mo54740y2());
        SafeParcelWriter.m4565c(parcel, 10, mo54739x2());
        SafeParcelWriter.m4573k(parcel, 11, mo54732r2());
        SafeParcelWriter.m4573k(parcel, 12, mo54729o2());
        SafeParcelWriter.m4573k(parcel, 13, mo54730p2());
        SafeParcelWriter.m4573k(parcel, 14, mo54726l2());
        SafeParcelWriter.m4573k(parcel, 15, mo54735u2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* renamed from: x2 */
    public final boolean mo54739x2() {
        return this.f46287z;
    }

    /* renamed from: y2 */
    public final boolean mo54740y2() {
        return this.f46286s;
    }

    /* renamed from: z2 */
    public final MarkerOptions mo54741z2(@NonNull LatLng latLng) {
        if (latLng != null) {
            this.f46279a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @SafeParcelable.Constructor
    MarkerOptions(@SafeParcelable.Param LatLng latLng, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param float f, @SafeParcelable.Param float f2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param float f3, @SafeParcelable.Param float f4, @SafeParcelable.Param float f5, @SafeParcelable.Param float f6, @SafeParcelable.Param float f7) {
        this.f46279a = latLng;
        this.f46280c = str;
        this.f46281d = str2;
        if (iBinder == null) {
            this.f46282f = null;
        } else {
            this.f46282f = new BitmapDescriptor(IObjectWrapper.Stub.m5043t1(iBinder));
        }
        this.f46283g = f;
        this.f46284o = f2;
        this.f46285p = z;
        this.f46286s = z2;
        this.f46287z = z3;
        this.f46274A = f3;
        this.f46275B = f4;
        this.f46276C = f5;
        this.f46277D = f6;
        this.f46278E = f7;
    }
}
