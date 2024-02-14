package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() {
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    };

    /* renamed from: a */
    private final MaxInputValidator f50678a;

    /* renamed from: c */
    private final MaxInputValidator f50679c;

    /* renamed from: d */
    final int f50680d;

    /* renamed from: f */
    int f50681f;

    /* renamed from: g */
    int f50682g;

    /* renamed from: o */
    int f50683o;

    /* renamed from: p */
    int f50684p;

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m70012a(Resources resources, CharSequence charSequence) {
        return m70013b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m70013b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: f */
    private static int m70014f(int i) {
        return i >= 12 ? 1 : 0;
    }

    /* renamed from: c */
    public int mo59381c() {
        if (this.f50680d == 1) {
            return this.f50681f % 24;
        }
        int i = this.f50681f;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f50684p == 1 ? i - 12 : i;
    }

    /* renamed from: d */
    public MaxInputValidator mo59382d() {
        return this.f50679c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public MaxInputValidator mo59384e() {
        return this.f50678a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f50681f == timeModel.f50681f && this.f50682g == timeModel.f50682g && this.f50680d == timeModel.f50680d && this.f50683o == timeModel.f50683o) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo59386g(int i) {
        if (this.f50680d == 1) {
            this.f50681f = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f50684p != 1) {
            i2 = 0;
        }
        this.f50681f = i3 + i2;
    }

    /* renamed from: h */
    public void mo59387h(@IntRange(from = 0, mo610to = 60) int i) {
        this.f50682g = i % 60;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50680d), Integer.valueOf(this.f50681f), Integer.valueOf(this.f50682g), Integer.valueOf(this.f50683o)});
    }

    /* renamed from: i */
    public void mo59389i(int i) {
        if (i != this.f50684p) {
            this.f50684p = i;
            int i2 = this.f50681f;
            if (i2 < 12 && i == 1) {
                this.f50681f = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.f50681f = i2 - 12;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50681f);
        parcel.writeInt(this.f50682g);
        parcel.writeInt(this.f50683o);
        parcel.writeInt(this.f50680d);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f50681f = i;
        this.f50682g = i2;
        this.f50683o = i3;
        this.f50680d = i4;
        this.f50684p = m70014f(i);
        this.f50678a = new MaxInputValidator(59);
        this.f50679c = new MaxInputValidator(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
