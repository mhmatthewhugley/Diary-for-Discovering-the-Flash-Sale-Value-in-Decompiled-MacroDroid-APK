package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2851a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f2852c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final PendingIntent f2853d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final int f2854f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final Bundle f2855g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final byte[] f2856o;

    @SafeParcelable.Constructor
    ProxyResponse(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param int i3, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param byte[] bArr) {
        this.f2851a = i;
        this.f2852c = i2;
        this.f2854f = i3;
        this.f2855g = bundle;
        this.f2856o = bArr;
        this.f2853d = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2852c);
        SafeParcelWriter.m4584v(parcel, 2, this.f2853d, i, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f2854f);
        SafeParcelWriter.m4567e(parcel, 4, this.f2855g, false);
        SafeParcelWriter.m4569g(parcel, 5, this.f2856o, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f2851a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
