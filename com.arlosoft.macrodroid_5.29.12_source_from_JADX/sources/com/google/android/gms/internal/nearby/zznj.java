package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznj> CREATOR = new zznk();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f44966a;
    @SafeParcelable.Field

    /* renamed from: c */
    final int f44967c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    final byte[] f44968d;
    @SafeParcelable.Field

    /* renamed from: f */
    final boolean f44969f;

    @SafeParcelable.Constructor
    zznj(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param boolean z) {
        this.f44966a = i;
        this.f44967c = i2;
        this.f44968d = bArr;
        this.f44969f = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f44967c);
        SafeParcelWriter.m4569g(parcel, 2, this.f44968d, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f44969f);
        SafeParcelWriter.m4576n(parcel, 1000, this.f44966a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
