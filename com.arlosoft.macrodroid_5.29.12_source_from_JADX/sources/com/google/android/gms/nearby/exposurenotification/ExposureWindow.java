package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzsq;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ExposureWindow extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ExposureWindow> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a */
    long f47576a;
    @SafeParcelable.Field

    /* renamed from: c */
    final List f47577c;
    @SafeParcelable.Field
    @ReportType

    /* renamed from: d */
    final int f47578d;
    @SafeParcelable.Field
    @Infectiousness

    /* renamed from: f */
    final int f47579f;
    @SafeParcelable.Field
    @CalibrationConfidence

    /* renamed from: g */
    final int f47580g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    final String f47581o;
    @SafeParcelable.Field
    @VariantOfConcern

    /* renamed from: p */
    final int f47582p;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private long f47583a = 0;

        /* renamed from: b */
        private List f47584b = zzsq.m63014q();
        @ReportType

        /* renamed from: c */
        private int f47585c = 1;
        @Infectiousness

        /* renamed from: d */
        private int f47586d = 1;
        @CalibrationConfidence

        /* renamed from: e */
        private int f47587e = 0;
        @VariantOfConcern

        /* renamed from: f */
        private int f47588f = 0;
    }

    @SafeParcelable.Constructor
    ExposureWindow(@SafeParcelable.Param long j, @SafeParcelable.Param List list, @SafeParcelable.Param @ReportType int i, @SafeParcelable.Param @Infectiousness int i2, @SafeParcelable.Param @CalibrationConfidence int i3, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @VariantOfConcern int i4) {
        this.f47576a = j;
        this.f47577c = zzsq.m63013p(list);
        this.f47578d = i;
        this.f47579f = i2;
        this.f47580g = i3;
        this.f47581o = str;
        this.f47582p = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ExposureWindow.class == obj.getClass()) {
            ExposureWindow exposureWindow = (ExposureWindow) obj;
            return this.f47578d == exposureWindow.f47578d && this.f47576a == exposureWindow.f47576a && this.f47577c.equals(exposureWindow.f47577c) && this.f47579f == exposureWindow.f47579f && this.f47580g == exposureWindow.f47580g && Objects.m4470a(this.f47581o, exposureWindow.f47581o) && this.f47582p == exposureWindow.f47582p;
        }
    }

    public int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f47576a), this.f47577c, Integer.valueOf(this.f47578d), Integer.valueOf(this.f47579f), Integer.valueOf(this.f47580g), this.f47581o, Integer.valueOf(this.f47582p));
    }

    @CalibrationConfidence
    /* renamed from: l2 */
    public int mo55811l2() {
        return this.f47580g;
    }

    /* renamed from: m2 */
    public long mo55812m2() {
        return this.f47576a;
    }

    @Infectiousness
    /* renamed from: n2 */
    public int mo55813n2() {
        return this.f47579f;
    }

    @ReportType
    /* renamed from: o2 */
    public int mo55814o2() {
        return this.f47578d;
    }

    @NonNull
    /* renamed from: p2 */
    public List<ScanInstance> mo55815p2() {
        return this.f47577c;
    }

    @VariantOfConcern
    /* renamed from: q2 */
    public int mo55816q2() {
        return this.f47582p;
    }

    @NonNull
    public String toString() {
        long j = this.f47576a;
        int i = this.f47578d;
        String valueOf = String.valueOf(this.f47577c);
        int i2 = this.f47579f;
        int i3 = this.f47580g;
        String str = this.f47581o;
        return "ExposureWindow{dateMillisSinceEpoch=" + j + ", reportType=" + i + ", scanInstances=" + valueOf + ", infectiousness=" + i2 + ", calibrationConfidence=" + i3 + ", deviceName=" + str + "}";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, mo55812m2());
        SafeParcelWriter.m4558B(parcel, 2, mo55815p2(), false);
        SafeParcelWriter.m4576n(parcel, 3, mo55814o2());
        SafeParcelWriter.m4576n(parcel, 4, mo55813n2());
        SafeParcelWriter.m4576n(parcel, 5, mo55811l2());
        SafeParcelWriter.m4586x(parcel, 6, this.f47581o, false);
        SafeParcelWriter.m4576n(parcel, 7, mo55816q2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
