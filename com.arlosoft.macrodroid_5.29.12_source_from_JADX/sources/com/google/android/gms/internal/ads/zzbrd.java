package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbrd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrd> CREATOR = new zzbre();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f27671a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String[] f27672c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String[] f27673d;

    @SafeParcelable.Constructor
    zzbrd(@SafeParcelable.Param String str, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param String[] strArr2) {
        this.f27671a = str;
        this.f27672c = strArr;
        this.f27673d = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f27671a, false);
        SafeParcelWriter.m4587y(parcel, 2, this.f27672c, false);
        SafeParcelWriter.m4587y(parcel, 3, this.f27673d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
