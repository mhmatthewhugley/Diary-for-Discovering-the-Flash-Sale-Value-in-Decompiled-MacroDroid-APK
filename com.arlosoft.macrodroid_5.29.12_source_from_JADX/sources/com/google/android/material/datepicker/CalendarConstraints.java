package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.MiuiFaceManagerImpl;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() {
        @NonNull
        /* renamed from: a */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        @NonNull
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    };
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: a */
    public final Month f49115a;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: c */
    public final Month f49116c;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: d */
    public final DateValidator f49117d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public Month f49118f;

    /* renamed from: g */
    private final int f49119g;

    /* renamed from: o */
    private final int f49120o;

    public interface DateValidator extends Parcelable {
        /* renamed from: C0 */
        boolean mo57564C0(long j);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Month mo57547e(Month month) {
        if (month.compareTo(this.f49115a) < 0) {
            return this.f49115a;
        }
        return month.compareTo(this.f49116c) > 0 ? this.f49116c : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f49115a.equals(calendarConstraints.f49115a) || !this.f49116c.equals(calendarConstraints.f49116c) || !ObjectsCompat.equals(this.f49118f, calendarConstraints.f49118f) || !this.f49117d.equals(calendarConstraints.f49117d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public DateValidator mo57549f() {
        return this.f49117d;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: g */
    public Month mo57550g() {
        return this.f49116c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo57551h() {
        return this.f49120o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49115a, this.f49116c, this.f49118f, this.f49117d});
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: i */
    public Month mo57553i() {
        return this.f49118f;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: j */
    public Month mo57554j() {
        return this.f49115a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo57555k() {
        return this.f49119g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo57556l(long j) {
        if (this.f49115a.mo57652i(1) <= j) {
            Month month = this.f49116c;
            if (j <= month.mo57652i(month.f49234g)) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f49115a, 0);
        parcel.writeParcelable(this.f49116c, 0);
        parcel.writeParcelable(this.f49118f, 0);
        parcel.writeParcelable(this.f49117d, 0);
    }

    private CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3) {
        this.f49115a = month;
        this.f49116c = month2;
        this.f49118f = month3;
        this.f49117d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.compareTo(month2) <= 0) {
            this.f49120o = month.mo57657n(month2) + 1;
            this.f49119g = (month2.f49232d - month.f49232d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public static final class Builder {

        /* renamed from: e */
        static final long f49121e = UtcDates.m68314a(Month.m68234d(1900, 0).f49235o);

        /* renamed from: f */
        static final long f49122f = UtcDates.m68314a(Month.m68234d(MiuiFaceManagerImpl.ERROR_BINDER_CALL, 11).f49235o);

        /* renamed from: a */
        private long f49123a = f49121e;

        /* renamed from: b */
        private long f49124b = f49122f;

        /* renamed from: c */
        private Long f49125c;

        /* renamed from: d */
        private DateValidator f49126d = DateValidatorPointForward.m68172a(Long.MIN_VALUE);

        public Builder() {
        }

        @NonNull
        /* renamed from: a */
        public CalendarConstraints mo57562a() {
            Month month;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f49126d);
            Month e = Month.m68235e(this.f49123a);
            Month e2 = Month.m68235e(this.f49124b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f49125c;
            if (l == null) {
                month = null;
            } else {
                month = Month.m68235e(l.longValue());
            }
            return new CalendarConstraints(e, e2, dateValidator, month);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo57563b(long j) {
            this.f49125c = Long.valueOf(j);
            return this;
        }

        Builder(@NonNull CalendarConstraints calendarConstraints) {
            this.f49123a = calendarConstraints.f49115a.f49235o;
            this.f49124b = calendarConstraints.f49116c.f49235o;
            this.f49125c = Long.valueOf(calendarConstraints.f49118f.f49235o);
            this.f49126d = calendarConstraints.f49117d;
        }
    }
}
