package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbau implements Parcelable {
    public static final Parcelable.Creator<zzbau> CREATOR = new zzbat();

    /* renamed from: a */
    public final int f26429a;

    /* renamed from: c */
    public final int f26430c;

    /* renamed from: d */
    public final int f26431d;

    /* renamed from: f */
    public final byte[] f26432f;

    /* renamed from: g */
    private int f26433g;

    public zzbau(int i, int i2, int i3, byte[] bArr) {
        this.f26429a = i;
        this.f26430c = i2;
        this.f26431d = i3;
        this.f26432f = bArr;
    }

    zzbau(Parcel parcel) {
        this.f26429a = parcel.readInt();
        this.f26430c = parcel.readInt();
        this.f26431d = parcel.readInt();
        this.f26432f = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbau.class == obj.getClass()) {
            zzbau zzbau = (zzbau) obj;
            return this.f26429a == zzbau.f26429a && this.f26430c == zzbau.f26430c && this.f26431d == zzbau.f26431d && Arrays.equals(this.f26432f, zzbau.f26432f);
        }
    }

    public final int hashCode() {
        int i = this.f26433g;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f26429a + 527) * 31) + this.f26430c) * 31) + this.f26431d) * 31) + Arrays.hashCode(this.f26432f);
        this.f26433g = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f26429a;
        int i2 = this.f26430c;
        int i3 = this.f26431d;
        boolean z = this.f26432f != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26429a);
        parcel.writeInt(this.f26430c);
        parcel.writeInt(this.f26431d);
        parcel.writeInt(this.f26432f != null ? 1 : 0);
        byte[] bArr = this.f26432f;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
