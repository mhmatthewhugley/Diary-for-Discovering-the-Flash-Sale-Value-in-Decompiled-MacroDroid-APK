package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class DailySummary extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<DailySummary> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    int f47507a;
    @SafeParcelable.Field

    /* renamed from: c */
    List f47508c;
    @SafeParcelable.Field

    /* renamed from: d */
    ExposureSummaryData f47509d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    String f47510f;

    @SafeParcelable.Class
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class ExposureSummaryData extends AbstractSafeParcelable implements ReflectedParcelable {
        @NonNull
        public static final Parcelable.Creator<ExposureSummaryData> CREATOR = new zzl();
        @SafeParcelable.Field

        /* renamed from: a */
        double f47511a;
        @SafeParcelable.Field

        /* renamed from: c */
        double f47512c;
        @SafeParcelable.Field

        /* renamed from: d */
        double f47513d;

        @SafeParcelable.Constructor
        ExposureSummaryData(@SafeParcelable.Param double d, @SafeParcelable.Param double d2, @SafeParcelable.Param double d3) {
            this.f47511a = d;
            this.f47512c = d2;
            this.f47513d = d3;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof ExposureSummaryData) {
                ExposureSummaryData exposureSummaryData = (ExposureSummaryData) obj;
                if (this.f47511a == exposureSummaryData.f47511a && this.f47512c == exposureSummaryData.f47512c && this.f47513d == exposureSummaryData.f47513d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return Objects.m4471b(Double.valueOf(this.f47511a), Double.valueOf(this.f47512c), Double.valueOf(this.f47513d));
        }

        /* renamed from: l2 */
        public double mo55762l2() {
            return this.f47511a;
        }

        /* renamed from: m2 */
        public double mo55763m2() {
            return this.f47512c;
        }

        /* renamed from: n2 */
        public double mo55764n2() {
            return this.f47513d;
        }

        @NonNull
        public String toString() {
            return String.format(Locale.US, "ExposureSummaryData<maximumScore: %.3f, scoreSum: %.3f, weightedDurationSum: %.3f>", new Object[]{Double.valueOf(this.f47511a), Double.valueOf(this.f47512c), Double.valueOf(this.f47513d)});
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int a = SafeParcelWriter.m4563a(parcel);
            SafeParcelWriter.m4570h(parcel, 1, mo55762l2());
            SafeParcelWriter.m4570h(parcel, 2, mo55763m2());
            SafeParcelWriter.m4570h(parcel, 3, mo55764n2());
            SafeParcelWriter.m4564b(parcel, a);
        }
    }

    @SafeParcelable.Constructor
    DailySummary(@SafeParcelable.Param int i, @SafeParcelable.Param List list, @SafeParcelable.Param ExposureSummaryData exposureSummaryData, @SafeParcelable.Param @Nullable String str) {
        this.f47507a = i;
        this.f47508c = list;
        this.f47509d = exposureSummaryData;
        this.f47510f = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DailySummary) {
            DailySummary dailySummary = (DailySummary) obj;
            if (this.f47507a != dailySummary.f47507a || !this.f47508c.equals(dailySummary.f47508c) || !Objects.m4470a(this.f47509d, dailySummary.f47509d) || !Objects.m4470a(this.f47510f, dailySummary.f47510f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47507a), this.f47508c, this.f47509d, this.f47510f);
    }

    /* renamed from: l2 */
    public int mo55756l2() {
        return this.f47507a;
    }

    @NonNull
    /* renamed from: m2 */
    public ExposureSummaryData mo55757m2() {
        return this.f47509d;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "DailySummary<daysSinceEpoch: %d, reportSummaries: %s, daySummary: %s, deviceName: %s>", new Object[]{Integer.valueOf(this.f47507a), this.f47508c, this.f47509d, this.f47510f});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo55756l2());
        SafeParcelWriter.m4558B(parcel, 2, this.f47508c, false);
        SafeParcelWriter.m4584v(parcel, 3, mo55757m2(), i, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f47510f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
