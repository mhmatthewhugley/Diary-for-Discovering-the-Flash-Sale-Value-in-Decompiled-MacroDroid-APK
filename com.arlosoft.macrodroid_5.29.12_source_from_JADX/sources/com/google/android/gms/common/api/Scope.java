package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3131a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f3132c;

    @SafeParcelable.Constructor
    Scope(@SafeParcelable.Param int i, @SafeParcelable.Param String str) {
        Preconditions.m4485h(str, "scopeUri must not be null or empty");
        this.f3131a = i;
        this.f3132c = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3132c.equals(((Scope) obj).f3132c);
    }

    public int hashCode() {
        return this.f3132c.hashCode();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l2 */
    public String mo21286l2() {
        return this.f3132c;
    }

    @NonNull
    public String toString() {
        return this.f3132c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3131a);
        SafeParcelWriter.m4586x(parcel, 2, mo21286l2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
