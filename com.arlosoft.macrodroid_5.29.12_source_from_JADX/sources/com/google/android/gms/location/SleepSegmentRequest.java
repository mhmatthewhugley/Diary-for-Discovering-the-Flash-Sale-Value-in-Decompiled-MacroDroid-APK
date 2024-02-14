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
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new zzbw();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final List<zzbx> f45878a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45879c;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentRequest(@SafeParcelable.Param @Nullable List<zzbx> list, @SafeParcelable.Param int i) {
        this.f45878a = list;
        this.f45879c = i;
    }

    @NonNull
    /* renamed from: l2 */
    public static SleepSegmentRequest m64699l2() {
        return new SleepSegmentRequest((List<zzbx>) null, 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return Objects.m4470a(this.f45878a, sleepSegmentRequest.f45878a) && this.f45879c == sleepSegmentRequest.f45879c;
    }

    public int hashCode() {
        return Objects.m4471b(this.f45878a, Integer.valueOf(this.f45879c));
    }

    /* renamed from: m2 */
    public int mo54223m2() {
        return this.f45879c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f45878a, false);
        SafeParcelWriter.m4576n(parcel, 2, mo54223m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
