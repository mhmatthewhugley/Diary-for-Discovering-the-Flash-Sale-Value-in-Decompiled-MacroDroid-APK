package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    @NonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzbm();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Status f45856a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final LocationSettingsStates f45857c;

    @SafeParcelable.Constructor
    public LocationSettingsResult(@SafeParcelable.Param @NonNull Status status, @SafeParcelable.Param @Nullable LocationSettingsStates locationSettingsStates) {
        this.f45856a = status;
        this.f45857c = locationSettingsStates;
    }

    @NonNull
    public Status getStatus() {
        return this.f45856a;
    }

    @Nullable
    /* renamed from: l2 */
    public LocationSettingsStates mo54198l2() {
        return this.f45857c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.m4584v(parcel, 2, mo54198l2(), i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
