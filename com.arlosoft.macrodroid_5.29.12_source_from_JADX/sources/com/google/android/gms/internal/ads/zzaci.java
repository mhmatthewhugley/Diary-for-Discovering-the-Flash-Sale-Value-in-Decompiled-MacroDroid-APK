package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaci implements zzbp {
    public static final Parcelable.Creator<zzaci> CREATOR = new zzach();

    /* renamed from: a */
    public final int f23915a;

    /* renamed from: c */
    public final String f23916c;

    /* renamed from: d */
    public final String f23917d;

    /* renamed from: f */
    public final int f23918f;

    /* renamed from: g */
    public final int f23919g;

    /* renamed from: o */
    public final int f23920o;

    /* renamed from: p */
    public final int f23921p;

    /* renamed from: s */
    public final byte[] f23922s;

    public zzaci(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f23915a = i;
        this.f23916c = str;
        this.f23917d = str2;
        this.f23918f = i2;
        this.f23919g = i3;
        this.f23920o = i4;
        this.f23921p = i5;
        this.f23922s = bArr;
    }

    zzaci(Parcel parcel) {
        this.f23915a = parcel.readInt();
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23916c = readString;
        this.f23917d = parcel.readString();
        this.f23918f = parcel.readInt();
        this.f23919g = parcel.readInt();
        this.f23920o = parcel.readInt();
        this.f23921p = parcel.readInt();
        this.f23922s = (byte[]) zzen.m49166h(parcel.createByteArray());
    }

    /* renamed from: a */
    public static zzaci m41046a(zzef zzef) {
        int m = zzef.mo45237m();
        String F = zzef.mo45222F(zzef.mo45237m(), zzfsk.f36337a);
        String F2 = zzef.mo45222F(zzef.mo45237m(), zzfsk.f36339c);
        int m2 = zzef.mo45237m();
        int m3 = zzef.mo45237m();
        int m4 = zzef.mo45237m();
        int m5 = zzef.mo45237m();
        int m6 = zzef.mo45237m();
        byte[] bArr = new byte[m6];
        zzef.mo45226b(bArr, 0, m6);
        return new zzaci(m, F, F2, m2, m3, m4, m5, bArr);
    }

    /* renamed from: Q1 */
    public final void mo41259Q1(zzbk zzbk) {
        zzbk.mo42710q(this.f23922s, this.f23915a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaci.class == obj.getClass()) {
            zzaci zzaci = (zzaci) obj;
            return this.f23915a == zzaci.f23915a && this.f23916c.equals(zzaci.f23916c) && this.f23917d.equals(zzaci.f23917d) && this.f23918f == zzaci.f23918f && this.f23919g == zzaci.f23919g && this.f23920o == zzaci.f23920o && this.f23921p == zzaci.f23921p && Arrays.equals(this.f23922s, zzaci.f23922s);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f23915a + 527) * 31) + this.f23916c.hashCode()) * 31) + this.f23917d.hashCode()) * 31) + this.f23918f) * 31) + this.f23919g) * 31) + this.f23920o) * 31) + this.f23921p) * 31) + Arrays.hashCode(this.f23922s);
    }

    public final String toString() {
        String str = this.f23916c;
        String str2 = this.f23917d;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23915a);
        parcel.writeString(this.f23916c);
        parcel.writeString(this.f23917d);
        parcel.writeInt(this.f23918f);
        parcel.writeInt(this.f23919g);
        parcel.writeInt(this.f23920o);
        parcel.writeInt(this.f23921p);
        parcel.writeByteArray(this.f23922s);
    }
}
