package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f2635a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f2636c;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param int i) {
        this.f2635a = str;
        this.f2636c = i;
    }

    /* renamed from: l2 */
    public final String mo20742l2() {
        return this.f2635a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f2635a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f2636c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f2636c;
    }
}
