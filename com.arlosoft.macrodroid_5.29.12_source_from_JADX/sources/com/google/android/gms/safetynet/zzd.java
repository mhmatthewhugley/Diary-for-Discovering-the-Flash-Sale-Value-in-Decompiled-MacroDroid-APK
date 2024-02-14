package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: a */
    public final long f47916a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final HarmfulAppsData[] f47917c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f47918d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f47919f;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param long j, @SafeParcelable.Param HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param int i, @SafeParcelable.Param boolean z) {
        this.f47916a = j;
        this.f47917c = harmfulAppsDataArr;
        this.f47919f = z;
        if (z) {
            this.f47918d = i;
        } else {
            this.f47918d = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 2, this.f47916a);
        SafeParcelWriter.m4557A(parcel, 3, this.f47917c, i, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f47918d);
        SafeParcelWriter.m4565c(parcel, 5, this.f47919f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
