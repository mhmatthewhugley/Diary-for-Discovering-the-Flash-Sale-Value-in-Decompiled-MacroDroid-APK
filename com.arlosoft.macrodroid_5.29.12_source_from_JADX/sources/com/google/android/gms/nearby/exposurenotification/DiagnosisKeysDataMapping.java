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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class DiagnosisKeysDataMapping extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<DiagnosisKeysDataMapping> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: a */
    List f47516a;
    @SafeParcelable.Field
    @ReportType

    /* renamed from: c */
    int f47517c;
    @SafeParcelable.Field
    @Infectiousness

    /* renamed from: d */
    int f47518d;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class DiagnosisKeysDataMappingBuilder {
        @ReportType

        /* renamed from: a */
        private int f47519a = 0;
    }

    @SafeParcelable.Constructor
    DiagnosisKeysDataMapping(@SafeParcelable.Param List list, @SafeParcelable.Param @ReportType int i, @SafeParcelable.Param @Infectiousness int i2) {
        this.f47516a = list;
        this.f47517c = i;
        this.f47518d = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DiagnosisKeysDataMapping) {
            DiagnosisKeysDataMapping diagnosisKeysDataMapping = (DiagnosisKeysDataMapping) obj;
            if (this.f47516a.equals(diagnosisKeysDataMapping.f47516a) && this.f47517c == diagnosisKeysDataMapping.f47517c && this.f47518d == diagnosisKeysDataMapping.f47518d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(this.f47516a, Integer.valueOf(this.f47517c), Integer.valueOf(this.f47518d));
    }

    @NonNull
    /* renamed from: l2 */
    public Map<Integer, Integer> mo55771l2() {
        HashMap hashMap = new HashMap((int) Math.ceil(38.666666666666664d));
        for (int i = 0; i < this.f47516a.size(); i++) {
            hashMap.put(Integer.valueOf(i - 14), (Integer) this.f47516a.get(i));
        }
        return hashMap;
    }

    @Infectiousness
    /* renamed from: m2 */
    public int mo55772m2() {
        return this.f47518d;
    }

    @ReportType
    /* renamed from: n2 */
    public int mo55773n2() {
        return this.f47517c;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "DiagnosisKeysDataMapping<daysSinceOnsetToInfectiousness: %s, reportTypeWhenMissing: %d, infectiousnessWhenDaysSinceOnsetMissing: %d>", new Object[]{mo55771l2(), Integer.valueOf(this.f47517c), Integer.valueOf(this.f47518d)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4578p(parcel, 1, new ArrayList(this.f47516a), false);
        SafeParcelWriter.m4576n(parcel, 2, mo55773n2());
        SafeParcelWriter.m4576n(parcel, 3, mo55772m2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
