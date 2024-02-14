package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
    @SafeParcelable.Field

    /* renamed from: a */
    public final boolean f1974a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f1975c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f1976d;

    public zzff(VideoOptions videoOptions) {
        this(videoOptions.mo19762c(), videoOptions.mo19761b(), videoOptions.mo19760a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 2, this.f1974a);
        SafeParcelWriter.m4565c(parcel, 3, this.f1975c);
        SafeParcelWriter.m4565c(parcel, 4, this.f1976d);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzff(@SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3) {
        this.f1974a = z;
        this.f1975c = z2;
        this.f1976d = z3;
    }
}
