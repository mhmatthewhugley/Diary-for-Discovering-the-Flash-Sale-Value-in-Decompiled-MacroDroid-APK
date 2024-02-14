package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzbv();
    @SafeParcelable.Field

    /* renamed from: a */
    private final long f45873a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final long f45874c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f45875d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f45876f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f45877g;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        Preconditions.m4479b(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f45873a = j;
        this.f45874c = j2;
        this.f45875d = i;
        this.f45876f = i2;
        this.f45877g = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f45873a == sleepSegmentEvent.mo54217m2() && this.f45874c == sleepSegmentEvent.mo54216l2() && this.f45875d == sleepSegmentEvent.mo54218n2() && this.f45876f == sleepSegmentEvent.f45876f && this.f45877g == sleepSegmentEvent.f45877g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f45873a), Long.valueOf(this.f45874c), Integer.valueOf(this.f45875d));
    }

    /* renamed from: l2 */
    public long mo54216l2() {
        return this.f45874c;
    }

    /* renamed from: m2 */
    public long mo54217m2() {
        return this.f45873a;
    }

    /* renamed from: n2 */
    public int mo54218n2() {
        return this.f45875d;
    }

    @NonNull
    public String toString() {
        long j = this.f45873a;
        long j2 = this.f45874c;
        int i = this.f45875d;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, mo54217m2());
        SafeParcelWriter.m4581s(parcel, 2, mo54216l2());
        SafeParcelWriter.m4576n(parcel, 3, mo54218n2());
        SafeParcelWriter.m4576n(parcel, 4, this.f45876f);
        SafeParcelWriter.m4576n(parcel, 5, this.f45877g);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
