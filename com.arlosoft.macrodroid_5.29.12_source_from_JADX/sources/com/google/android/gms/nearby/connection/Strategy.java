package com.google.android.gms.nearby.connection;

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
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class Strategy extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzr();
    @NonNull

    /* renamed from: d */
    public static final Strategy f47473d = new Strategy(1, 3);
    @NonNull

    /* renamed from: f */
    public static final Strategy f47474f = new Strategy(1, 2);
    @NonNull

    /* renamed from: g */
    public static final Strategy f47475g = new Strategy(1, 1);
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f47476a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f47477c;

    @SafeParcelable.Constructor
    Strategy(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f47476a = i;
        this.f47477c = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.f47476a == strategy.f47476a && this.f47477c == strategy.f47477c;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47476a), Integer.valueOf(this.f47477c));
    }

    @NonNull
    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        if (f47473d.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (f47474f.equals(this)) {
            str = "P2P_STAR";
        } else {
            str = f47475g.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.f47476a);
        objArr[2] = Integer.valueOf(this.f47477c);
        return String.format(locale, "Strategy(%s){connectionType=%d, topology=%d}", objArr);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 3, this.f47476a);
        SafeParcelWriter.m4576n(parcel, 4, this.f47477c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
