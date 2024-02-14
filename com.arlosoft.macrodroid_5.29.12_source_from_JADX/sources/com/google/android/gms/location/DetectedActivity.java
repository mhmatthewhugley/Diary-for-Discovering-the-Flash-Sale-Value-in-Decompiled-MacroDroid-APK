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
import java.util.Comparator;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class DetectedActivity extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();
    @NonNull

    /* renamed from: d */
    public static final Comparator<DetectedActivity> f45804d = new zzq();
    @SafeParcelable.Field

    /* renamed from: a */
    int f45805a;
    @SafeParcelable.Field

    /* renamed from: c */
    int f45806c;

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f45805a = i;
        this.f45806c = i2;
    }

    @ShowFirstParty
    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f45805a == detectedActivity.f45805a && this.f45806c == detectedActivity.f45806c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45805a), Integer.valueOf(this.f45806c));
    }

    /* renamed from: l2 */
    public int mo54146l2() {
        return this.f45806c;
    }

    /* renamed from: m2 */
    public int mo54147m2() {
        int i = this.f45805a;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    @NonNull
    public String toString() {
        int m2 = mo54147m2();
        String num = m2 != 0 ? m2 != 1 ? m2 != 2 ? m2 != 3 ? m2 != 4 ? m2 != 5 ? m2 != 7 ? m2 != 8 ? m2 != 16 ? m2 != 17 ? Integer.toString(m2) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i = this.f45806c;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(num);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45805a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45806c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
