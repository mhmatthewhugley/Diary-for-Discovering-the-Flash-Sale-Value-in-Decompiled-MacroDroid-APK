package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.apache.http.cookie.ClientCookie;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Feature extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f3052a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c */
    private final int f3053c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final long f3054d;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param @NonNull String str, @SafeParcelable.Param int i, @SafeParcelable.Param long j) {
        this.f3052a = str;
        this.f3053c = i;
        this.f3054d = j;
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j) {
        this.f3052a = str;
        this.f3054d = j;
        this.f3053c = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() == null || !getName().equals(feature.getName())) && (getName() != null || feature.getName() != null)) || mo21147l2() != feature.mo21147l2()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.f3052a;
    }

    public final int hashCode() {
        return Objects.m4471b(getName(), Long.valueOf(mo21147l2()));
    }

    @KeepForSdk
    /* renamed from: l2 */
    public long mo21147l2() {
        long j = this.f3054d;
        return j == -1 ? (long) this.f3053c : j;
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper c = Objects.m4472c(this);
        c.mo21720a("name", getName());
        c.mo21720a(ClientCookie.VERSION_ATTR, Long.valueOf(mo21147l2()));
        return c.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, getName(), false);
        SafeParcelWriter.m4576n(parcel, 2, this.f3053c);
        SafeParcelWriter.m4581s(parcel, 3, mo21147l2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
