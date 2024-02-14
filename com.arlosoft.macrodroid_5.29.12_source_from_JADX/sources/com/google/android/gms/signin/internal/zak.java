package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47959a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final ConnectionResult f47960c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final zav f47961d;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param int i, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param @Nullable zav zav) {
        this.f47959a = i;
        this.f47960c = connectionResult;
        this.f47961d = zav;
    }

    /* renamed from: l2 */
    public final ConnectionResult mo56120l2() {
        return this.f47960c;
    }

    @Nullable
    /* renamed from: m2 */
    public final zav mo56121m2() {
        return this.f47961d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47959a);
        SafeParcelWriter.m4584v(parcel, 2, this.f47960c, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f47961d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
