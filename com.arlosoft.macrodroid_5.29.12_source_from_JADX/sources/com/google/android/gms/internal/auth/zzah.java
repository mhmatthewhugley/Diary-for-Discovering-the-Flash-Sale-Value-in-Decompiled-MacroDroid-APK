package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f39169a = 1;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f39170c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final PendingIntent f39171d;

    @SafeParcelable.Constructor
    zzah(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param PendingIntent pendingIntent) {
        this.f39170c = (String) Preconditions.m4488k(str);
        this.f39171d = (PendingIntent) Preconditions.m4488k(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f39169a);
        SafeParcelWriter.m4586x(parcel, 2, this.f39170c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f39171d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
