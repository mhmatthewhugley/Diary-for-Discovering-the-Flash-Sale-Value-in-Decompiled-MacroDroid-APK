package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacs extends zzadd {
    public static final Parcelable.Creator<zzacs> CREATOR = new zzacr();

    /* renamed from: c */
    public final String f23936c;

    /* renamed from: d */
    public final int f23937d;

    /* renamed from: f */
    public final int f23938f;

    /* renamed from: g */
    public final long f23939g;

    /* renamed from: o */
    public final long f23940o;

    /* renamed from: p */
    private final zzadd[] f23941p;

    zzacs(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23936c = readString;
        this.f23937d = parcel.readInt();
        this.f23938f = parcel.readInt();
        this.f23939g = parcel.readLong();
        this.f23940o = parcel.readLong();
        int readInt = parcel.readInt();
        this.f23941p = new zzadd[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f23941p[i2] = (zzadd) parcel.readParcelable(zzadd.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacs.class == obj.getClass()) {
            zzacs zzacs = (zzacs) obj;
            return this.f23937d == zzacs.f23937d && this.f23938f == zzacs.f23938f && this.f23939g == zzacs.f23939g && this.f23940o == zzacs.f23940o && zzen.m49181t(this.f23936c, zzacs.f23936c) && Arrays.equals(this.f23941p, zzacs.f23941p);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f23937d + 527) * 31) + this.f23938f) * 31) + ((int) this.f23939g)) * 31) + ((int) this.f23940o)) * 31;
        String str = this.f23936c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23936c);
        parcel.writeInt(this.f23937d);
        parcel.writeInt(this.f23938f);
        parcel.writeLong(this.f23939g);
        parcel.writeLong(this.f23940o);
        parcel.writeInt(this.f23941p.length);
        for (zzadd writeParcelable : this.f23941p) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzacs(String str, int i, int i2, long j, long j2, zzadd[] zzaddArr) {
        super("CHAP");
        this.f23936c = str;
        this.f23937d = i;
        this.f23938f = i2;
        this.f23939g = j;
        this.f23940o = j2;
        this.f23941p = zzaddArr;
    }
}
