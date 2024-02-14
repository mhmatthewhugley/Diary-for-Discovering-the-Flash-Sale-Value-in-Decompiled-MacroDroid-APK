package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzv();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2696a;
    @SafeParcelable.Field

    /* renamed from: c */
    private boolean f2697c;
    @SafeParcelable.Field

    /* renamed from: d */
    private long f2698d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f2699f;

    @SafeParcelable.Constructor
    DeviceMetaData(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z2) {
        this.f2696a = i;
        this.f2697c = z;
        this.f2698d = j;
        this.f2699f = z2;
    }

    /* renamed from: l2 */
    public long mo20782l2() {
        return this.f2698d;
    }

    /* renamed from: m2 */
    public boolean mo20783m2() {
        return this.f2699f;
    }

    /* renamed from: n2 */
    public boolean mo20784n2() {
        return this.f2697c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2696a);
        SafeParcelWriter.m4565c(parcel, 2, mo20784n2());
        SafeParcelWriter.m4581s(parcel, 3, mo20782l2());
        SafeParcelWriter.m4565c(parcel, 4, mo20783m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
