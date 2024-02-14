package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Date;

public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    @NonNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() {
        /* renamed from: a */
        public Timestamp createFromParcel(Parcel parcel) {
            return new Timestamp(parcel);
        }

        /* renamed from: b */
        public Timestamp[] newArray(int i) {
            return new Timestamp[i];
        }
    };

    /* renamed from: a */
    private final long f53759a;

    /* renamed from: c */
    private final int f53760c;

    public Timestamp(long j, int i) {
        m74425g(j, i);
        this.f53759a = j;
        this.f53760c = i;
    }

    @NonNull
    /* renamed from: f */
    public static Timestamp m74424f() {
        return new Timestamp(new Date());
    }

    /* renamed from: g */
    private static void m74425g(long j, int i) {
        Preconditions.m76512a(i >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i));
        Preconditions.m76512a(((double) i) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i));
        Preconditions.m76512a(j >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j));
        Preconditions.m76512a(j < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j));
    }

    /* renamed from: b */
    public int compareTo(@NonNull Timestamp timestamp) {
        long j = this.f53759a;
        long j2 = timestamp.f53759a;
        if (j == j2) {
            return Integer.signum(this.f53760c - timestamp.f53760c);
        }
        return Long.signum(j - j2);
    }

    /* renamed from: d */
    public int mo61971d() {
        return this.f53760c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo61973e() {
        return this.f53759a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f53759a;
        return (((((int) j) * 37 * 37) + ((int) (j >> 32))) * 37) + this.f53760c;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f53759a + ", nanoseconds=" + this.f53760c + ")";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.f53759a);
        parcel.writeInt(this.f53760c);
    }

    protected Timestamp(@NonNull Parcel parcel) {
        this.f53759a = parcel.readLong();
        this.f53760c = parcel.readInt();
    }

    public Timestamp(@NonNull Date date) {
        long time = date.getTime();
        long j = time / 1000;
        int i = ((int) (time % 1000)) * 1000000;
        if (i < 0) {
            j--;
            i += 1000000000;
        }
        m74425g(j, i);
        this.f53759a = j;
        this.f53760c = i;
    }
}
