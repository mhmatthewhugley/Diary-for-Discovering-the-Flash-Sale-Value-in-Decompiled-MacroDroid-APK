package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoq> CREATOR = new zzfor();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f36211a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final byte[] f36212c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f36213d;

    @SafeParcelable.Constructor
    zzfoq(@SafeParcelable.Param int i, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i2) {
        byte[] bArr2;
        this.f36211a = i;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.f36212c = bArr2;
        this.f36213d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f36211a);
        SafeParcelWriter.m4569g(parcel, 2, this.f36212c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f36213d);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzfoq(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }
}
