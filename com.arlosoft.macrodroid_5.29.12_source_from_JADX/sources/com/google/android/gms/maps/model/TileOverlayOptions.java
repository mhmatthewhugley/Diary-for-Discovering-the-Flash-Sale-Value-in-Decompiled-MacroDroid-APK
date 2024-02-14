package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzu();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzaf f46339a;

    /* renamed from: c */
    private TileProvider f46340c;
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f46341d = true;
    @SafeParcelable.Field

    /* renamed from: f */
    private float f46342f;
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f46343g = true;
    @SafeParcelable.Field

    /* renamed from: o */
    private float f46344o = 0.0f;

    public TileOverlayOptions() {
    }

    /* renamed from: l2 */
    public final boolean mo54799l2() {
        return this.f46343g;
    }

    /* renamed from: m2 */
    public final float mo54800m2() {
        return this.f46344o;
    }

    /* renamed from: n2 */
    public final float mo54801n2() {
        return this.f46342f;
    }

    /* renamed from: o2 */
    public final boolean mo54802o2() {
        return this.f46341d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 2, this.f46339a.asBinder(), false);
        SafeParcelWriter.m4565c(parcel, 3, mo54802o2());
        SafeParcelWriter.m4573k(parcel, 4, mo54801n2());
        SafeParcelWriter.m4565c(parcel, 5, mo54799l2());
        SafeParcelWriter.m4573k(parcel, 6, mo54800m2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    TileOverlayOptions(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z, @SafeParcelable.Param float f, @SafeParcelable.Param boolean z2, @SafeParcelable.Param float f2) {
        zzs zzs;
        zzaf t1 = zzag.m59340t1(iBinder);
        this.f46339a = t1;
        if (t1 == null) {
            zzs = null;
        } else {
            zzs = new zzs(this);
        }
        this.f46340c = zzs;
        this.f46341d = z;
        this.f46342f = f;
        this.f46343g = z2;
        this.f46344o = f2;
    }
}
