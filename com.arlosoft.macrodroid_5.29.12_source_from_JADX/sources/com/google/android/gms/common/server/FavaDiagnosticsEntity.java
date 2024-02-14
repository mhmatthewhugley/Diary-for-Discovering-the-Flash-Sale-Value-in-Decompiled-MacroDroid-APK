package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3850a;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: c */
    public final String f3851c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f3852d;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param int i, @SafeParcelable.Param @NonNull String str, @SafeParcelable.Param int i2) {
        this.f3850a = i;
        this.f3851c = str;
        this.f3852d = i2;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3850a);
        SafeParcelWriter.m4586x(parcel, 2, this.f3851c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f3852d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
