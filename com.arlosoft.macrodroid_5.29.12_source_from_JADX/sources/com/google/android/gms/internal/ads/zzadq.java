package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadq implements zzbp {
    public static final Parcelable.Creator<zzadq> CREATOR = new zzado();

    /* renamed from: a */
    public final String f24003a;

    /* renamed from: c */
    public final byte[] f24004c;

    /* renamed from: d */
    public final int f24005d;

    /* renamed from: f */
    public final int f24006f;

    /* synthetic */ zzadq(Parcel parcel, zzadp zzadp) {
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f24003a = readString;
        this.f24004c = (byte[]) zzen.m49166h(parcel.createByteArray());
        this.f24005d = parcel.readInt();
        this.f24006f = parcel.readInt();
    }

    public zzadq(String str, byte[] bArr, int i, int i2) {
        this.f24003a = str;
        this.f24004c = bArr;
        this.f24005d = i;
        this.f24006f = i2;
    }

    /* renamed from: Q1 */
    public final /* synthetic */ void mo41259Q1(zzbk zzbk) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadq.class == obj.getClass()) {
            zzadq zzadq = (zzadq) obj;
            return this.f24003a.equals(zzadq.f24003a) && Arrays.equals(this.f24004c, zzadq.f24004c) && this.f24005d == zzadq.f24005d && this.f24006f == zzadq.f24006f;
        }
    }

    public final int hashCode() {
        return ((((((this.f24003a.hashCode() + 527) * 31) + Arrays.hashCode(this.f24004c)) * 31) + this.f24005d) * 31) + this.f24006f;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f24003a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24003a);
        parcel.writeByteArray(this.f24004c);
        parcel.writeInt(this.f24005d);
        parcel.writeInt(this.f24006f);
    }
}
