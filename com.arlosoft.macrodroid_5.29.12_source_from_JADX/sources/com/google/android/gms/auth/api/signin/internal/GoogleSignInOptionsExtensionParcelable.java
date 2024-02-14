package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f2911a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f2912c;
    @SafeParcelable.Field

    /* renamed from: d */
    private Bundle f2913d;

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param Bundle bundle) {
        this.f2911a = i;
        this.f2912c = i2;
        this.f2913d = bundle;
    }

    @KeepForSdk
    /* renamed from: l2 */
    public int mo21003l2() {
        return this.f2912c;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2911a);
        SafeParcelWriter.m4576n(parcel, 2, mo21003l2());
        SafeParcelWriter.m4567e(parcel, 3, this.f2913d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
