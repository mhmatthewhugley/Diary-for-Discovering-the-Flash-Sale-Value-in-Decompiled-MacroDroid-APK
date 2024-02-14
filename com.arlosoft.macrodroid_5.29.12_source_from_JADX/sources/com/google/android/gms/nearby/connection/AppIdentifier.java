package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class AppIdentifier extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f47399a;

    @SafeParcelable.Constructor
    public AppIdentifier(@SafeParcelable.Param @NonNull String str) {
        this.f47399a = Preconditions.m4485h(str, "Missing application identifier value");
    }

    @NonNull
    /* renamed from: l2 */
    public String mo55647l2() {
        return this.f47399a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, mo55647l2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
