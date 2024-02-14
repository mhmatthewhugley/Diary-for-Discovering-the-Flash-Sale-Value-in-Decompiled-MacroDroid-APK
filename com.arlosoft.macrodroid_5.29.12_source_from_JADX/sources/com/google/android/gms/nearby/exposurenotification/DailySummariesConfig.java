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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class DailySummariesConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<DailySummariesConfig> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: a */
    List f47497a;
    @SafeParcelable.Field

    /* renamed from: c */
    List f47498c;
    @SafeParcelable.Field

    /* renamed from: d */
    List f47499d;
    @SafeParcelable.Field

    /* renamed from: f */
    List f47500f;
    @SafeParcelable.Field

    /* renamed from: g */
    int f47501g;
    @SafeParcelable.Field

    /* renamed from: o */
    double f47502o;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class DailySummariesConfigBuilder {

        /* renamed from: a */
        private Double[] f47503a = new Double[6];

        /* renamed from: b */
        private Double[] f47504b = new Double[zzj.values().length];

        /* renamed from: c */
        int f47505c = 0;

        /* renamed from: d */
        double f47506d = 0.0d;

        public DailySummariesConfigBuilder() {
            Double[] dArr = this.f47503a;
            Double valueOf = Double.valueOf(0.0d);
            Arrays.fill(dArr, valueOf);
            Arrays.fill(this.f47504b, valueOf);
        }
    }

    @SafeParcelable.Constructor
    DailySummariesConfig(@SafeParcelable.Param List list, @SafeParcelable.Param List list2, @SafeParcelable.Param List list3, @SafeParcelable.Param List list4, @SafeParcelable.Param int i, @SafeParcelable.Param double d) {
        this.f47497a = list;
        this.f47498c = list2;
        this.f47499d = list3;
        this.f47500f = list4;
        this.f47501g = i;
        this.f47502o = d;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DailySummariesConfig) {
            DailySummariesConfig dailySummariesConfig = (DailySummariesConfig) obj;
            if (!this.f47497a.equals(dailySummariesConfig.f47497a) || !this.f47498c.equals(dailySummariesConfig.f47498c) || !this.f47499d.equals(dailySummariesConfig.f47499d) || !this.f47500f.equals(dailySummariesConfig.f47500f) || this.f47501g != dailySummariesConfig.f47501g || this.f47502o != dailySummariesConfig.f47502o) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(this.f47497a, this.f47498c, this.f47499d, this.f47500f, Integer.valueOf(this.f47501g), Double.valueOf(this.f47502o));
    }

    @NonNull
    /* renamed from: l2 */
    public List<Integer> mo55748l2() {
        return new ArrayList(this.f47499d);
    }

    @NonNull
    /* renamed from: m2 */
    public List<Double> mo55749m2() {
        return new ArrayList(this.f47500f);
    }

    /* renamed from: n2 */
    public int mo55750n2() {
        return this.f47501g;
    }

    /* renamed from: o2 */
    public double mo55751o2() {
        return this.f47502o;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "DailySummariesConfig<reportTypeWeights: %s, infectiousnessWeights: %s, attenuationBucketThresholdDb: %s, attenuationBucketWeights: %sdaysSinceExposureThreshold: %d,minimumWindowScore: %.3f>", new Object[]{this.f47497a, this.f47498c, this.f47499d, this.f47500f, Integer.valueOf(this.f47501g), Double.valueOf(this.f47502o)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4571i(parcel, 1, new ArrayList(this.f47497a), false);
        SafeParcelWriter.m4571i(parcel, 2, new ArrayList(this.f47498c), false);
        SafeParcelWriter.m4578p(parcel, 3, mo55748l2(), false);
        SafeParcelWriter.m4571i(parcel, 4, mo55749m2(), false);
        SafeParcelWriter.m4576n(parcel, 5, mo55750n2());
        SafeParcelWriter.m4570h(parcel, 6, mo55751o2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
