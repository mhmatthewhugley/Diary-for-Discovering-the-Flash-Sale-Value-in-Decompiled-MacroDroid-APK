package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: A */
    private float f46247A = 0.5f;
    @SafeParcelable.Field

    /* renamed from: B */
    private float f46248B = 0.5f;
    @SafeParcelable.Field

    /* renamed from: C */
    private boolean f46249C = false;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: a */
    private BitmapDescriptor f46250a;
    @SafeParcelable.Field

    /* renamed from: c */
    private LatLng f46251c;
    @SafeParcelable.Field

    /* renamed from: d */
    private float f46252d;
    @SafeParcelable.Field

    /* renamed from: f */
    private float f46253f;
    @SafeParcelable.Field

    /* renamed from: g */
    private LatLngBounds f46254g;
    @SafeParcelable.Field

    /* renamed from: o */
    private float f46255o;
    @SafeParcelable.Field

    /* renamed from: p */
    private float f46256p;
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f46257s = true;
    @SafeParcelable.Field

    /* renamed from: z */
    private float f46258z = 0.0f;

    @SafeParcelable.Constructor
    GroundOverlayOptions(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param LatLng latLng, @SafeParcelable.Param float f, @SafeParcelable.Param float f2, @SafeParcelable.Param LatLngBounds latLngBounds, @SafeParcelable.Param float f3, @SafeParcelable.Param float f4, @SafeParcelable.Param boolean z, @SafeParcelable.Param float f5, @SafeParcelable.Param float f6, @SafeParcelable.Param float f7, @SafeParcelable.Param boolean z2) {
        this.f46250a = new BitmapDescriptor(IObjectWrapper.Stub.m5043t1(iBinder));
        this.f46251c = latLng;
        this.f46252d = f;
        this.f46253f = f2;
        this.f46254g = latLngBounds;
        this.f46255o = f3;
        this.f46256p = f4;
        this.f46257s = z;
        this.f46258z = f5;
        this.f46247A = f6;
        this.f46248B = f7;
        this.f46249C = z2;
    }

    /* renamed from: l2 */
    public final float mo54698l2() {
        return this.f46247A;
    }

    /* renamed from: m2 */
    public final float mo54699m2() {
        return this.f46248B;
    }

    /* renamed from: n2 */
    public final float mo54700n2() {
        return this.f46255o;
    }

    /* renamed from: o2 */
    public final LatLngBounds mo54701o2() {
        return this.f46254g;
    }

    /* renamed from: p2 */
    public final float mo54702p2() {
        return this.f46253f;
    }

    /* renamed from: q2 */
    public final LatLng mo54703q2() {
        return this.f46251c;
    }

    /* renamed from: r2 */
    public final float mo54704r2() {
        return this.f46258z;
    }

    /* renamed from: s2 */
    public final float mo54705s2() {
        return this.f46252d;
    }

    /* renamed from: t2 */
    public final float mo54706t2() {
        return this.f46256p;
    }

    /* renamed from: u2 */
    public final boolean mo54707u2() {
        return this.f46249C;
    }

    /* renamed from: v2 */
    public final boolean mo54708v2() {
        return this.f46257s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 2, this.f46250a.mo54669a().asBinder(), false);
        SafeParcelWriter.m4584v(parcel, 3, mo54703q2(), i, false);
        SafeParcelWriter.m4573k(parcel, 4, mo54705s2());
        SafeParcelWriter.m4573k(parcel, 5, mo54702p2());
        SafeParcelWriter.m4584v(parcel, 6, mo54701o2(), i, false);
        SafeParcelWriter.m4573k(parcel, 7, mo54700n2());
        SafeParcelWriter.m4573k(parcel, 8, mo54706t2());
        SafeParcelWriter.m4565c(parcel, 9, mo54708v2());
        SafeParcelWriter.m4573k(parcel, 10, mo54704r2());
        SafeParcelWriter.m4573k(parcel, 11, mo54698l2());
        SafeParcelWriter.m4573k(parcel, 12, mo54699m2());
        SafeParcelWriter.m4565c(parcel, 13, mo54707u2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    public GroundOverlayOptions() {
    }
}
