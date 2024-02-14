package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzai();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f3674a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f3675c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f3676d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f3677f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f3678g;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f3674a = i;
        this.f3675c = z;
        this.f3676d = z2;
        this.f3677f = i2;
        this.f3678g = i3;
    }

    @KeepForSdk
    public int getVersion() {
        return this.f3674a;
    }

    @KeepForSdk
    /* renamed from: l2 */
    public int mo21725l2() {
        return this.f3677f;
    }

    @KeepForSdk
    /* renamed from: m2 */
    public int mo21726m2() {
        return this.f3678g;
    }

    @KeepForSdk
    /* renamed from: n2 */
    public boolean mo21727n2() {
        return this.f3675c;
    }

    @KeepForSdk
    /* renamed from: o2 */
    public boolean mo21728o2() {
        return this.f3676d;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, getVersion());
        SafeParcelWriter.m4565c(parcel, 2, mo21727n2());
        SafeParcelWriter.m4565c(parcel, 3, mo21728o2());
        SafeParcelWriter.m4576n(parcel, 4, mo21725l2());
        SafeParcelWriter.m4576n(parcel, 5, mo21726m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
