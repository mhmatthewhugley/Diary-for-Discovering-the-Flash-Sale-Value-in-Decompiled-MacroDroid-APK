package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f47899a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final byte[] f47900c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f47901d;

    @SafeParcelable.Constructor
    public HarmfulAppsData(@SafeParcelable.Param String str, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i) {
        this.f47899a = str;
        this.f47900c = bArr;
        this.f47901d = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f47899a, false);
        SafeParcelWriter.m4569g(parcel, 3, this.f47900c, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f47901d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
