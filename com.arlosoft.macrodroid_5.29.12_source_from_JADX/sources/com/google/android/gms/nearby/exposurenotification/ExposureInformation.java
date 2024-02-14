package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

@SafeParcelable.Class
@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ExposureInformation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ExposureInformation> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    long f47540a;
    @SafeParcelable.Field

    /* renamed from: c */
    int f47541c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f47542d;
    @SafeParcelable.Field
    @RiskLevel

    /* renamed from: f */
    int f47543f;
    @SafeParcelable.Field

    /* renamed from: g */
    int f47544g;
    @SafeParcelable.Field

    /* renamed from: o */
    int[] f47545o;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class ExposureInformationBuilder {

        /* renamed from: a */
        private long f47546a = 0;

        /* renamed from: b */
        private int f47547b = 0;

        /* renamed from: c */
        private int f47548c = 0;
        @RiskLevel

        /* renamed from: d */
        private int f47549d = 0;

        /* renamed from: e */
        private int f47550e = 0;

        /* renamed from: f */
        private int[] f47551f = {0, 0};
    }

    @SafeParcelable.Constructor
    ExposureInformation(@SafeParcelable.Param long j, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param int[] iArr) {
        this.f47540a = j;
        this.f47541c = i;
        this.f47542d = i2;
        this.f47543f = i3;
        this.f47544g = i4;
        this.f47545o = iArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ExposureInformation) {
            ExposureInformation exposureInformation = (ExposureInformation) obj;
            if (!Objects.m4470a(Long.valueOf(this.f47540a), Long.valueOf(exposureInformation.mo55794n2())) || !Objects.m4470a(Integer.valueOf(this.f47541c), Integer.valueOf(exposureInformation.mo55795o2())) || !Objects.m4470a(Integer.valueOf(this.f47542d), Integer.valueOf(exposureInformation.mo55793m2())) || !Objects.m4470a(Integer.valueOf(this.f47543f), Integer.valueOf(exposureInformation.mo55797q2())) || !Objects.m4470a(Integer.valueOf(this.f47544g), Integer.valueOf(exposureInformation.mo55796p2())) || !Arrays.equals(this.f47545o, exposureInformation.mo55792l2())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f47540a), Integer.valueOf(this.f47541c), Integer.valueOf(this.f47542d), Integer.valueOf(this.f47543f), Integer.valueOf(this.f47544g), this.f47545o);
    }

    @NonNull
    /* renamed from: l2 */
    public int[] mo55792l2() {
        int[] iArr = this.f47545o;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: m2 */
    public int mo55793m2() {
        return this.f47542d;
    }

    /* renamed from: n2 */
    public long mo55794n2() {
        return this.f47540a;
    }

    /* renamed from: o2 */
    public int mo55795o2() {
        return this.f47541c;
    }

    /* renamed from: p2 */
    public int mo55796p2() {
        return this.f47544g;
    }

    @RiskLevel
    /* renamed from: q2 */
    public int mo55797q2() {
        return this.f47543f;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "ExposureInformation<date: %s, dateMillisSinceEpoch: %d, durationMinutes: %d, attenuationValue: %d, transmissionRiskLevel: %d, totalRiskScore: %d, attenuationDurations: %s>", new Object[]{new Date(this.f47540a), Long.valueOf(this.f47540a), Integer.valueOf(this.f47541c), Integer.valueOf(this.f47542d), Integer.valueOf(this.f47543f), Integer.valueOf(this.f47544g), Arrays.toString(this.f47545o)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, mo55794n2());
        SafeParcelWriter.m4576n(parcel, 2, mo55795o2());
        SafeParcelWriter.m4576n(parcel, 3, mo55793m2());
        SafeParcelWriter.m4576n(parcel, 4, mo55797q2());
        SafeParcelWriter.m4576n(parcel, 5, mo55796p2());
        SafeParcelWriter.m4577o(parcel, 6, mo55792l2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
