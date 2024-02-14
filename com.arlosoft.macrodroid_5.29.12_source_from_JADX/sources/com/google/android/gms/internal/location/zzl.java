package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzaw;
import com.google.android.gms.location.zzax;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a */
    final int f41150a;
    @SafeParcelable.Field

    /* renamed from: c */
    final zzj f41151c;
    @SafeParcelable.Field

    /* renamed from: d */
    final zzax f41152d;
    @SafeParcelable.Field

    /* renamed from: f */
    final zzai f41153f;

    @SafeParcelable.Constructor
    zzl(@SafeParcelable.Param int i, @SafeParcelable.Param zzj zzj, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        zzax zzax;
        this.f41150a = i;
        this.f41151c = zzj;
        zzai zzai = null;
        if (iBinder == null) {
            zzax = null;
        } else {
            zzax = zzaw.m64850t1(iBinder);
        }
        this.f41152d = zzax;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder2);
            }
        }
        this.f41153f = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f41150a);
        SafeParcelWriter.m4584v(parcel, 2, this.f41151c, i, false);
        zzax zzax = this.f41152d;
        IBinder iBinder2 = null;
        if (zzax == null) {
            iBinder = null;
        } else {
            iBinder = zzax.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 3, iBinder, false);
        zzai zzai = this.f41153f;
        if (zzai != null) {
            iBinder2 = zzai.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 4, iBinder2, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
