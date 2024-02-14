package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityTransition extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f45790a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45791c;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static class Builder {

        /* renamed from: a */
        private int f45792a = -1;

        /* renamed from: b */
        private int f45793b = -1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    ActivityTransition(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f45790a = i;
        this.f45791c = i2;
    }

    /* renamed from: n2 */
    public static void m64632n2(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.m4479b(z, sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f45790a == activityTransition.f45790a && this.f45791c == activityTransition.f45791c;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45790a), Integer.valueOf(this.f45791c));
    }

    /* renamed from: l2 */
    public int mo54125l2() {
        return this.f45790a;
    }

    /* renamed from: m2 */
    public int mo54126m2() {
        return this.f45791c;
    }

    @NonNull
    public String toString() {
        int i = this.f45790a;
        int i2 = this.f45791c;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo54125l2());
        SafeParcelWriter.m4576n(parcel, 2, mo54126m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
