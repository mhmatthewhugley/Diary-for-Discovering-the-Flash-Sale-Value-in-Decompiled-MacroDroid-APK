package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() {
        @NonNull
        /* renamed from: a */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.m68234d(parcel.readInt(), parcel.readInt());
        }

        @NonNull
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    };
    @NonNull

    /* renamed from: a */
    private final Calendar f49230a;

    /* renamed from: c */
    final int f49231c;

    /* renamed from: d */
    final int f49232d;

    /* renamed from: f */
    final int f49233f;

    /* renamed from: g */
    final int f49234g;

    /* renamed from: o */
    final long f49235o;
    @Nullable

    /* renamed from: p */
    private String f49236p;

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = UtcDates.m68319f(calendar);
        this.f49230a = f;
        this.f49231c = f.get(2);
        this.f49232d = f.get(1);
        this.f49233f = f.getMaximum(7);
        this.f49234g = f.getActualMaximum(5);
        this.f49235o = f.getTimeInMillis();
    }

    @NonNull
    /* renamed from: d */
    static Month m68234d(int i, int i2) {
        Calendar q = UtcDates.m68330q();
        q.set(1, i);
        q.set(2, i2);
        return new Month(q);
    }

    @NonNull
    /* renamed from: e */
    static Month m68235e(long j) {
        Calendar q = UtcDates.m68330q();
        q.setTimeInMillis(j);
        return new Month(q);
    }

    @NonNull
    /* renamed from: f */
    static Month m68236f() {
        return new Month(UtcDates.m68328o());
    }

    /* renamed from: b */
    public int compareTo(@NonNull Month month) {
        return this.f49230a.compareTo(month.f49230a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f49231c == month.f49231c && this.f49232d == month.f49232d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo57650g() {
        int firstDayOfWeek = this.f49230a.get(7) - this.f49230a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f49233f : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49231c), Integer.valueOf(this.f49232d)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo57652i(int i) {
        Calendar f = UtcDates.m68319f(this.f49230a);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo57653j(long j) {
        Calendar f = UtcDates.m68319f(this.f49230a);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: k */
    public String mo57654k(Context context) {
        if (this.f49236p == null) {
            this.f49236p = DateStrings.m68164i(context, this.f49230a.getTimeInMillis());
        }
        return this.f49236p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public long mo57655l() {
        return this.f49230a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: m */
    public Month mo57656m(int i) {
        Calendar f = UtcDates.m68319f(this.f49230a);
        f.add(2, i);
        return new Month(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo57657n(@NonNull Month month) {
        if (this.f49230a instanceof GregorianCalendar) {
            return ((month.f49232d - this.f49232d) * 12) + (month.f49231c - this.f49231c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f49232d);
        parcel.writeInt(this.f49231c);
    }
}
