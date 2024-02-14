package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadj extends zzadd {
    public static final Parcelable.Creator<zzadj> CREATOR = new zzadi();

    /* renamed from: c */
    public final String f23997c;

    /* renamed from: d */
    public final byte[] f23998d;

    zzadj(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23997c = readString;
        this.f23998d = (byte[]) zzen.m49166h(parcel.createByteArray());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadj.class == obj.getClass()) {
            zzadj zzadj = (zzadj) obj;
            return zzen.m49181t(this.f23997c, zzadj.f23997c) && Arrays.equals(this.f23998d, zzadj.f23998d);
        }
    }

    public final int hashCode() {
        String str = this.f23997c;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f23998d);
    }

    public final String toString() {
        String str = this.f23988a;
        String str2 = this.f23997c;
        return str + ": owner=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23997c);
        parcel.writeByteArray(this.f23998d);
    }

    public zzadj(String str, byte[] bArr) {
        super("PRIV");
        this.f23997c = str;
        this.f23998d = bArr;
    }
}
