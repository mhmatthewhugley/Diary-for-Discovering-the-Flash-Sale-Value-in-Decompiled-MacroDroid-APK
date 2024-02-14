package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfof extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfof> CREATOR = new zzfog();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f36187a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f36188c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f36189d;

    @SafeParcelable.Constructor
    zzfof(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f36187a = i;
        this.f36188c = str;
        this.f36189d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f36187a);
        SafeParcelWriter.m4586x(parcel, 2, this.f36188c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f36189d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzfof(String str, String str2) {
        this(1, str, str2);
    }
}
