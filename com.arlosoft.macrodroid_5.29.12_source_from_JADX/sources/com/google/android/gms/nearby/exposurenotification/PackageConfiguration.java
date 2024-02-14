package com.google.android.gms.nearby.exposurenotification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class PackageConfiguration extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PackageConfiguration> CREATOR = new zzn();
    @SafeParcelable.Field

    /* renamed from: a */
    Bundle f47589a;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class PackageConfigurationBuilder {
    }

    @SafeParcelable.Constructor
    PackageConfiguration(@SafeParcelable.Param Bundle bundle) {
        this.f47589a = bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof PackageConfiguration) {
            return Objects.m4470a(this.f47589a, ((PackageConfiguration) obj).mo55821l2());
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(this.f47589a);
    }

    @NonNull
    /* renamed from: l2 */
    public Bundle mo55821l2() {
        return this.f47589a;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "PackageConfiguration<values: %s>", new Object[]{this.f47589a});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4567e(parcel, 1, mo55821l2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
