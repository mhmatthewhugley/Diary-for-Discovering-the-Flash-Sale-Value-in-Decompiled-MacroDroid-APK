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
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class
@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ExposureSummary extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<ExposureSummary> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a */
    int f47566a;
    @SafeParcelable.Field

    /* renamed from: c */
    int f47567c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f47568d;
    @SafeParcelable.Field

    /* renamed from: f */
    int[] f47569f;
    @SafeParcelable.Field

    /* renamed from: g */
    int f47570g;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class ExposureSummaryBuilder {

        /* renamed from: a */
        private int f47571a = 0;

        /* renamed from: b */
        private int f47572b = 0;

        /* renamed from: c */
        private int f47573c = 0;

        /* renamed from: d */
        private int[] f47574d = {0, 0, 0};

        /* renamed from: e */
        private int f47575e = 0;
    }

    @SafeParcelable.Constructor
    ExposureSummary(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int i4) {
        this.f47566a = i;
        this.f47567c = i2;
        this.f47568d = i3;
        this.f47569f = iArr;
        this.f47570g = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ExposureSummary) {
            ExposureSummary exposureSummary = (ExposureSummary) obj;
            if (!Objects.m4470a(Integer.valueOf(this.f47566a), Integer.valueOf(exposureSummary.mo55803m2())) || !Objects.m4470a(Integer.valueOf(this.f47567c), Integer.valueOf(exposureSummary.mo55804n2())) || !Objects.m4470a(Integer.valueOf(this.f47568d), Integer.valueOf(exposureSummary.mo55805o2())) || !Arrays.equals(this.f47569f, exposureSummary.mo55802l2()) || !Objects.m4470a(Integer.valueOf(this.f47570g), Integer.valueOf(exposureSummary.mo55806p2()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47566a), Integer.valueOf(this.f47567c), Integer.valueOf(this.f47568d), this.f47569f, Integer.valueOf(this.f47570g));
    }

    @NonNull
    /* renamed from: l2 */
    public int[] mo55802l2() {
        int[] iArr = this.f47569f;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: m2 */
    public int mo55803m2() {
        return this.f47566a;
    }

    /* renamed from: n2 */
    public int mo55804n2() {
        return this.f47567c;
    }

    /* renamed from: o2 */
    public int mo55805o2() {
        return this.f47568d;
    }

    /* renamed from: p2 */
    public int mo55806p2() {
        return this.f47570g;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "ExposureSummary<daysSinceLastExposure: %d, matchedKeyCount: %d, maximumRiskScore: %d, attenuationDurations: %s, summationRiskScore: %d>", new Object[]{Integer.valueOf(this.f47566a), Integer.valueOf(this.f47567c), Integer.valueOf(this.f47568d), Arrays.toString(this.f47569f), Integer.valueOf(this.f47570g)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo55803m2());
        SafeParcelWriter.m4576n(parcel, 2, mo55804n2());
        SafeParcelWriter.m4576n(parcel, 3, mo55805o2());
        SafeParcelWriter.m4577o(parcel, 4, mo55802l2(), false);
        SafeParcelWriter.m4576n(parcel, 5, mo55806p2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
