package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgw> CREATOR = new zzgx();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f48353a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzfa f48354c;

    @SafeParcelable.Constructor
    zzgw(@SafeParcelable.Param int i, @SafeParcelable.Param IBinder iBinder) {
        this.f48353a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f48354c = queryLocalInterface instanceof zzfa ? (zzfa) queryLocalInterface : new zzey(iBinder);
            return;
        }
        this.f48354c = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f48353a);
        zzfa zzfa = this.f48354c;
        if (zzfa == null) {
            iBinder = null;
        } else {
            iBinder = zzfa.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzgw(zzfa zzfa) {
        this.f48353a = 1;
        this.f48354c = zzfa;
    }
}
