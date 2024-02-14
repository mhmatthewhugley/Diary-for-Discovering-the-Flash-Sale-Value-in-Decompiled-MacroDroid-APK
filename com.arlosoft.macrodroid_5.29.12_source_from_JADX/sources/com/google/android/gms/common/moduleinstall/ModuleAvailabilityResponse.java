package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zaa();
    @SafeParcelable.Field

    /* renamed from: a */
    private final boolean f3795a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f3796c;

    @Retention(RetentionPolicy.CLASS)
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public @interface AvailabilityStatus {
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleAvailabilityResponse(@SafeParcelable.Param boolean z, @SafeParcelable.Param int i) {
        this.f3795a = z;
        this.f3796c = i;
    }

    /* renamed from: l2 */
    public boolean mo21848l2() {
        return this.f3795a;
    }

    @AvailabilityStatus
    /* renamed from: m2 */
    public int mo21849m2() {
        return this.f3796c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, mo21848l2());
        SafeParcelWriter.m4576n(parcel, 2, mo21849m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
