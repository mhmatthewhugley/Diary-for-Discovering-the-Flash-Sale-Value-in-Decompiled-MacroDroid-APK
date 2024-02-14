package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfk> CREATOR = new zzcfl();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: a */
    public final String f28347a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f28348c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d */
    public final zzq f28349d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final zzl f28350f;

    @SafeParcelable.Constructor
    public zzcfk(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zzq zzq, @SafeParcelable.Param zzl zzl) {
        this.f28347a = str;
        this.f28348c = str2;
        this.f28349d = zzq;
        this.f28350f = zzl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f28347a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f28348c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f28349d, i, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f28350f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
