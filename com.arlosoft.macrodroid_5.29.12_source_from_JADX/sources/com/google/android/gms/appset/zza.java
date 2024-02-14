package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final String f2633a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f2634c;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        this.f2633a = str;
        this.f2634c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f2633a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f2634c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
