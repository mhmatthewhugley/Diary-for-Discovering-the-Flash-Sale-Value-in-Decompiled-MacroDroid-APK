package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() {
        @NonNull
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            Operator operator;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                operator = CompositeDateValidator.f49142f;
            } else if (readInt == 1) {
                operator = CompositeDateValidator.f49141d;
            } else {
                operator = CompositeDateValidator.f49142f;
            }
            return new CompositeDateValidator((List) Preconditions.checkNotNull(readArrayList), operator);
        }

        @NonNull
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Operator f49141d = new Operator() {
        /* renamed from: a */
        public boolean mo57572a(@NonNull List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.mo57564C0(j)) {
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return 1;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Operator f49142f = new Operator() {
        /* renamed from: a */
        public boolean mo57572a(@NonNull List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.mo57564C0(j)) {
                    return false;
                }
            }
            return true;
        }

        public int getId() {
            return 2;
        }
    };
    @NonNull

    /* renamed from: a */
    private final Operator f49143a;
    @NonNull

    /* renamed from: c */
    private final List<CalendarConstraints.DateValidator> f49144c;

    private interface Operator {
        /* renamed from: a */
        boolean mo57572a(@NonNull List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    /* renamed from: C0 */
    public boolean mo57564C0(long j) {
        return this.f49143a.mo57572a(this.f49144c, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f49144c.equals(compositeDateValidator.f49144c) || this.f49143a.getId() != compositeDateValidator.f49143a.getId()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f49144c.hashCode();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.f49144c);
        parcel.writeInt(this.f49143a.getId());
    }

    private CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, Operator operator) {
        this.f49144c = list;
        this.f49143a = operator;
    }
}
