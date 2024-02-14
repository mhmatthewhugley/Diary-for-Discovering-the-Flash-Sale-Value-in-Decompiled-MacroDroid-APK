package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzeh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeh> CREATOR = new zzei();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f1954a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f1955c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f1956d;

    public zzeh() {
        this(ModuleDescriptor.MODULE_VERSION, 223104000, "21.3.0");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f1954a);
        SafeParcelWriter.m4576n(parcel, 2, this.f1955c);
        SafeParcelWriter.m4586x(parcel, 3, this.f1956d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f1955c;
    }

    @SafeParcelable.Constructor
    public zzeh(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param String str) {
        this.f1954a = i;
        this.f1955c = i2;
        this.f1956d = str;
    }
}
