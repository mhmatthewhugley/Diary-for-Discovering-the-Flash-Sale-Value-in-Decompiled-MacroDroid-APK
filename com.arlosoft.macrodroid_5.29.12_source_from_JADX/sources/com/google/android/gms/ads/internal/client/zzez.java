package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzez extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzez> CREATOR = new zzfa();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f1969a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f1970c;

    @SafeParcelable.Constructor
    public zzez(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f1969a = i;
        this.f1970c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f1969a);
        SafeParcelWriter.m4576n(parcel, 2, this.f1970c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzez(RequestConfiguration requestConfiguration) {
        this.f1969a = requestConfiguration.mo19738b();
        this.f1970c = requestConfiguration.mo19739c();
    }
}
