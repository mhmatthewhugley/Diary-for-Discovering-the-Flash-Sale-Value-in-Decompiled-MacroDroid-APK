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

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f45794a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45795c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final long f45796d;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param long j) {
        ActivityTransition.m64632n2(i2);
        this.f45794a = i;
        this.f45795c = i2;
        this.f45796d = j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f45794a == activityTransitionEvent.f45794a && this.f45795c == activityTransitionEvent.f45795c && this.f45796d == activityTransitionEvent.f45796d;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45794a), Integer.valueOf(this.f45795c), Long.valueOf(this.f45796d));
    }

    /* renamed from: l2 */
    public int mo54131l2() {
        return this.f45794a;
    }

    /* renamed from: m2 */
    public long mo54132m2() {
        return this.f45796d;
    }

    /* renamed from: n2 */
    public int mo54133n2() {
        return this.f45795c;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f45794a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f45795c;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f45796d;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo54131l2());
        SafeParcelWriter.m4576n(parcel, 2, mo54133n2());
        SafeParcelWriter.m4581s(parcel, 3, mo54132m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
