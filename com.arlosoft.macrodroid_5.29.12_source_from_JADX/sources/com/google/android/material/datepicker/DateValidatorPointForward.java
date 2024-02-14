package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() {
        @NonNull
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(@NonNull Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        @NonNull
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    };

    /* renamed from: a */
    private final long f49156a;

    @NonNull
    /* renamed from: a */
    public static DateValidatorPointForward m68172a(long j) {
        return new DateValidatorPointForward(j);
    }

    /* renamed from: C0 */
    public boolean mo57564C0(long j) {
        return j >= this.f49156a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.f49156a == ((DateValidatorPointForward) obj).f49156a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f49156a)});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.f49156a);
    }

    private DateValidatorPointForward(long j) {
        this.f49156a = j;
    }
}
