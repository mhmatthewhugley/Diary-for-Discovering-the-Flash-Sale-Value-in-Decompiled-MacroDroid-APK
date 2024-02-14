package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Hex;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class TemporaryExposureKey extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<TemporaryExposureKey> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a */
    byte[] f47596a;
    @SafeParcelable.Field

    /* renamed from: c */
    int f47597c;
    @SafeParcelable.Field
    @RiskLevel

    /* renamed from: d */
    int f47598d;
    @SafeParcelable.Field

    /* renamed from: f */
    int f47599f;
    @SafeParcelable.Field
    @ReportType

    /* renamed from: g */
    int f47600g;
    @SafeParcelable.Field

    /* renamed from: o */
    int f47601o;
    @SafeParcelable.Field

    /* renamed from: p */
    int f47602p;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class TemporaryExposureKeyBuilder {

        /* renamed from: a */
        private byte[] f47603a = new byte[0];

        /* renamed from: b */
        private int f47604b = 0;
        @RiskLevel

        /* renamed from: c */
        private int f47605c = 0;

        /* renamed from: d */
        private int f47606d = 1;
        @ReportType

        /* renamed from: e */
        private int f47607e = 0;

        /* renamed from: f */
        private int f47608f = Integer.MAX_VALUE;

        /* renamed from: g */
        private int f47609g = 0;
    }

    @SafeParcelable.Constructor
    TemporaryExposureKey(@SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i, @SafeParcelable.Param @RiskLevel int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param @ReportType int i4, @SafeParcelable.Param int i5, @SafeParcelable.Param int i6) {
        this.f47596a = bArr;
        this.f47597c = i;
        this.f47598d = i2;
        this.f47599f = i3;
        this.f47600g = i4;
        this.f47601o = i5;
        this.f47602p = i6;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TemporaryExposureKey) {
            TemporaryExposureKey temporaryExposureKey = (TemporaryExposureKey) obj;
            if (!Arrays.equals(this.f47596a, temporaryExposureKey.mo55834m2()) || !Objects.m4470a(Integer.valueOf(this.f47597c), Integer.valueOf(temporaryExposureKey.mo55837p2())) || !Objects.m4470a(Integer.valueOf(this.f47598d), Integer.valueOf(temporaryExposureKey.mo55838q2())) || !Objects.m4470a(Integer.valueOf(this.f47599f), Integer.valueOf(temporaryExposureKey.mo55836o2())) || !Objects.m4470a(Integer.valueOf(this.f47600g), Integer.valueOf(temporaryExposureKey.mo55835n2())) || this.f47601o != temporaryExposureKey.f47601o || this.f47602p != temporaryExposureKey.f47602p) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(Arrays.hashCode(this.f47596a)), Integer.valueOf(this.f47597c), Integer.valueOf(this.f47598d), Integer.valueOf(this.f47599f), Integer.valueOf(this.f47600g), Integer.valueOf(this.f47601o), Integer.valueOf(this.f47602p));
    }

    /* renamed from: l2 */
    public int mo55833l2() {
        return this.f47601o;
    }

    @NonNull
    /* renamed from: m2 */
    public byte[] mo55834m2() {
        byte[] bArr = this.f47596a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @ReportType
    /* renamed from: n2 */
    public int mo55835n2() {
        return this.f47600g;
    }

    /* renamed from: o2 */
    public int mo55836o2() {
        return this.f47599f;
    }

    /* renamed from: p2 */
    public int mo55837p2() {
        return this.f47597c;
    }

    @RiskLevel
    /* renamed from: q2 */
    public int mo55838q2() {
        return this.f47598d;
    }

    /* renamed from: r2 */
    public int mo55839r2() {
        return this.f47602p;
    }

    @NonNull
    public String toString() {
        Object obj;
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = Hex.m4884a(this.f47596a);
        objArr[1] = new Date(TimeUnit.MINUTES.toMillis(((long) this.f47597c) * 10));
        objArr[2] = Integer.valueOf(this.f47598d);
        objArr[3] = Integer.valueOf(this.f47599f);
        objArr[4] = Integer.valueOf(this.f47600g);
        int i = this.f47601o;
        if (i == Integer.MAX_VALUE) {
            obj = EnvironmentCompat.MEDIA_UNKNOWN;
        } else {
            obj = Integer.valueOf(i);
        }
        objArr[5] = obj;
        return String.format(locale, "TemporaryExposureKey<keyData: %s, rollingStartIntervalNumber: %s, transmissionRiskLevel: %d, rollingPeriod: %d, reportType: %d, daysSinceOnsetOfSymptoms: %s>", objArr);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4569g(parcel, 1, mo55834m2(), false);
        SafeParcelWriter.m4576n(parcel, 2, mo55837p2());
        SafeParcelWriter.m4576n(parcel, 3, mo55838q2());
        SafeParcelWriter.m4576n(parcel, 4, mo55836o2());
        SafeParcelWriter.m4576n(parcel, 5, mo55835n2());
        SafeParcelWriter.m4576n(parcel, 6, mo55833l2());
        SafeParcelWriter.m4576n(parcel, 7, mo55839r2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
