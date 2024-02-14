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
import java.util.Locale;

@SafeParcelable.Class
@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ExposureConfiguration extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ExposureConfiguration> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: A */
    int[] f47520A;
    @SafeParcelable.Field

    /* renamed from: a */
    int f47521a;
    @SafeParcelable.Field

    /* renamed from: c */
    int[] f47522c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f47523d;
    @SafeParcelable.Field

    /* renamed from: f */
    int[] f47524f;
    @SafeParcelable.Field

    /* renamed from: g */
    int f47525g;
    @SafeParcelable.Field

    /* renamed from: o */
    int[] f47526o;
    @SafeParcelable.Field

    /* renamed from: p */
    int f47527p;
    @SafeParcelable.Field

    /* renamed from: s */
    int[] f47528s;
    @SafeParcelable.Field

    /* renamed from: z */
    int f47529z;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class ExposureConfigurationBuilder {

        /* renamed from: a */
        private int f47530a = 4;

        /* renamed from: b */
        private int[] f47531b = {4, 4, 4, 4, 4, 4, 4, 4};

        /* renamed from: c */
        private int f47532c = 50;

        /* renamed from: d */
        private int[] f47533d = {4, 4, 4, 4, 4, 4, 4, 4};

        /* renamed from: e */
        private int f47534e = 50;

        /* renamed from: f */
        private int[] f47535f = {4, 4, 4, 4, 4, 4, 4, 4};

        /* renamed from: g */
        private int f47536g = 50;

        /* renamed from: h */
        private int[] f47537h = {4, 4, 4, 4, 4, 4, 4, 4};

        /* renamed from: i */
        private int f47538i = 50;

        /* renamed from: j */
        private int[] f47539j = {50, 74};
    }

    @SafeParcelable.Constructor
    ExposureConfiguration(@SafeParcelable.Param int i, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int i2, @SafeParcelable.Param int[] iArr2, @SafeParcelable.Param int i3, @SafeParcelable.Param int[] iArr3, @SafeParcelable.Param int i4, @SafeParcelable.Param int[] iArr4, @SafeParcelable.Param int i5, @SafeParcelable.Param int[] iArr5) {
        this.f47521a = i;
        this.f47522c = iArr;
        this.f47523d = i2;
        this.f47524f = iArr2;
        this.f47525g = i3;
        this.f47526o = iArr3;
        this.f47527p = i4;
        this.f47528s = iArr4;
        this.f47529z = i5;
        this.f47520A = iArr5;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ExposureConfiguration) {
            ExposureConfiguration exposureConfiguration = (ExposureConfiguration) obj;
            if (!Objects.m4470a(Integer.valueOf(this.f47521a), Integer.valueOf(exposureConfiguration.mo55785s2())) || !Arrays.equals(this.f47522c, exposureConfiguration.mo55778l2()) || !Objects.m4470a(Integer.valueOf(this.f47523d), Integer.valueOf(exposureConfiguration.mo55779m2())) || !Arrays.equals(this.f47524f, exposureConfiguration.mo55780n2()) || !Objects.m4470a(Integer.valueOf(this.f47525g), Integer.valueOf(exposureConfiguration.mo55781o2())) || !Arrays.equals(this.f47526o, exposureConfiguration.mo55783q2()) || !Objects.m4470a(Integer.valueOf(this.f47527p), Integer.valueOf(exposureConfiguration.mo55784r2())) || !Arrays.equals(this.f47528s, exposureConfiguration.mo55786t2()) || !Objects.m4470a(Integer.valueOf(this.f47529z), Integer.valueOf(exposureConfiguration.mo55788u2())) || !Arrays.equals(this.f47520A, exposureConfiguration.mo55782p2())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47521a), this.f47522c, Integer.valueOf(this.f47523d), this.f47524f, Integer.valueOf(this.f47525g), this.f47526o, Integer.valueOf(this.f47527p), this.f47528s, Integer.valueOf(this.f47529z), this.f47520A);
    }

    @NonNull
    /* renamed from: l2 */
    public int[] mo55778l2() {
        int[] iArr = this.f47522c;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: m2 */
    public int mo55779m2() {
        return this.f47523d;
    }

    @NonNull
    /* renamed from: n2 */
    public int[] mo55780n2() {
        int[] iArr = this.f47524f;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: o2 */
    public int mo55781o2() {
        return this.f47525g;
    }

    @NonNull
    /* renamed from: p2 */
    public int[] mo55782p2() {
        int[] iArr = this.f47520A;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @NonNull
    /* renamed from: q2 */
    public int[] mo55783q2() {
        int[] iArr = this.f47526o;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: r2 */
    public int mo55784r2() {
        return this.f47527p;
    }

    /* renamed from: s2 */
    public int mo55785s2() {
        return this.f47521a;
    }

    @NonNull
    /* renamed from: t2 */
    public int[] mo55786t2() {
        int[] iArr = this.f47528s;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "ExposureConfiguration<minimumRiskScore: %d, attenuationScores: %s, attenuationWeight: %d, daysSinceLastExposureScores: %s, daysSinceLastExposureWeight: %d, durationScores: %s, durationWeight: %d, transmissionRiskScores: %s, transmissionRiskWeight: %d, durationAtAttenuationThresholds: %s>", new Object[]{Integer.valueOf(this.f47521a), Arrays.toString(this.f47522c), Integer.valueOf(this.f47523d), Arrays.toString(this.f47524f), Integer.valueOf(this.f47525g), Arrays.toString(this.f47526o), Integer.valueOf(this.f47527p), Arrays.toString(this.f47528s), Integer.valueOf(this.f47529z), Arrays.toString(this.f47520A)});
    }

    /* renamed from: u2 */
    public int mo55788u2() {
        return this.f47529z;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo55785s2());
        SafeParcelWriter.m4577o(parcel, 2, mo55778l2(), false);
        SafeParcelWriter.m4576n(parcel, 3, mo55779m2());
        SafeParcelWriter.m4577o(parcel, 4, mo55780n2(), false);
        SafeParcelWriter.m4576n(parcel, 5, mo55781o2());
        SafeParcelWriter.m4577o(parcel, 6, mo55783q2(), false);
        SafeParcelWriter.m4576n(parcel, 7, mo55784r2());
        SafeParcelWriter.m4577o(parcel, 8, mo55786t2(), false);
        SafeParcelWriter.m4576n(parcel, 9, mo55788u2());
        SafeParcelWriter.m4577o(parcel, 10, mo55782p2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
