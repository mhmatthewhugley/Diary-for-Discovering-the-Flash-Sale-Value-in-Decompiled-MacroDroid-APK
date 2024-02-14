package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ScanInstance extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ScanInstance> CREATOR = new zzo();
    @SafeParcelable.Field

    /* renamed from: a */
    int f47590a;
    @SafeParcelable.Field

    /* renamed from: c */
    int f47591c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f47592d;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private int f47593a = 0;

        /* renamed from: b */
        private int f47594b = 0;

        /* renamed from: c */
        private int f47595c = 0;
    }

    @SafeParcelable.Constructor
    ScanInstance(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f47590a = i;
        this.f47591c = i2;
        this.f47592d = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ScanInstance.class == obj.getClass()) {
            ScanInstance scanInstance = (ScanInstance) obj;
            return this.f47590a == scanInstance.f47590a && this.f47591c == scanInstance.f47591c && this.f47592d == scanInstance.f47592d;
        }
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47590a), Integer.valueOf(this.f47591c), Integer.valueOf(this.f47592d));
    }

    /* renamed from: l2 */
    public int mo55826l2() {
        return this.f47591c;
    }

    /* renamed from: m2 */
    public int mo55827m2() {
        return this.f47592d;
    }

    /* renamed from: n2 */
    public int mo55828n2() {
        return this.f47590a;
    }

    @NonNull
    public String toString() {
        int i = this.f47590a;
        int i2 = this.f47591c;
        int i3 = this.f47592d;
        return "ScanInstance{typicalAttenuationDb=" + i + ", minAttenuationDb=" + i2 + ", secondsSinceLastScan=" + i3 + "}";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo55828n2());
        SafeParcelWriter.m4576n(parcel, 2, mo55826l2());
        SafeParcelWriter.m4576n(parcel, 3, mo55827m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
