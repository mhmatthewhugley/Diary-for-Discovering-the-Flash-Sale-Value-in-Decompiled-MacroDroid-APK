package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacu extends zzadd {
    public static final Parcelable.Creator<zzacu> CREATOR = new zzact();

    /* renamed from: c */
    public final String f23942c;

    /* renamed from: d */
    public final boolean f23943d;

    /* renamed from: f */
    public final boolean f23944f;

    /* renamed from: g */
    public final String[] f23945g;

    /* renamed from: o */
    private final zzadd[] f23946o;

    zzacu(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23942c = readString;
        boolean z = true;
        this.f23943d = parcel.readByte() != 0;
        this.f23944f = parcel.readByte() == 0 ? false : z;
        this.f23945g = (String[]) zzen.m49166h(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f23946o = new zzadd[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f23946o[i2] = (zzadd) parcel.readParcelable(zzadd.class.getClassLoader());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacu.class == obj.getClass()) {
            zzacu zzacu = (zzacu) obj;
            return this.f23943d == zzacu.f23943d && this.f23944f == zzacu.f23944f && zzen.m49181t(this.f23942c, zzacu.f23942c) && Arrays.equals(this.f23945g, zzacu.f23945g) && Arrays.equals(this.f23946o, zzacu.f23946o);
        }
    }

    public final int hashCode() {
        int i = ((((this.f23943d ? 1 : 0) + true) * 31) + (this.f23944f ? 1 : 0)) * 31;
        String str = this.f23942c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23942c);
        parcel.writeByte(this.f23943d ? (byte) 1 : 0);
        parcel.writeByte(this.f23944f ? (byte) 1 : 0);
        parcel.writeStringArray(this.f23945g);
        parcel.writeInt(this.f23946o.length);
        for (zzadd writeParcelable : this.f23946o) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzacu(String str, boolean z, boolean z2, String[] strArr, zzadd[] zzaddArr) {
        super("CTOC");
        this.f23942c = str;
        this.f23943d = z;
        this.f23944f = z2;
        this.f23945g = strArr;
        this.f23946o = zzaddArr;
    }
}
