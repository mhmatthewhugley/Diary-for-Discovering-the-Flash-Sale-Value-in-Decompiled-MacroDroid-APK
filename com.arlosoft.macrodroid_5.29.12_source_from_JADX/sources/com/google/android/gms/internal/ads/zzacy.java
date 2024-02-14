package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacy extends zzadd {
    public static final Parcelable.Creator<zzacy> CREATOR = new zzacx();

    /* renamed from: c */
    public final String f23950c;

    /* renamed from: d */
    public final String f23951d;

    /* renamed from: f */
    public final String f23952f;

    /* renamed from: g */
    public final byte[] f23953g;

    zzacy(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23950c = readString;
        this.f23951d = parcel.readString();
        this.f23952f = parcel.readString();
        this.f23953g = (byte[]) zzen.m49166h(parcel.createByteArray());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacy.class == obj.getClass()) {
            zzacy zzacy = (zzacy) obj;
            return zzen.m49181t(this.f23950c, zzacy.f23950c) && zzen.m49181t(this.f23951d, zzacy.f23951d) && zzen.m49181t(this.f23952f, zzacy.f23952f) && Arrays.equals(this.f23953g, zzacy.f23953g);
        }
    }

    public final int hashCode() {
        String str = this.f23950c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23951d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23952f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f23953g);
    }

    public final String toString() {
        String str = this.f23988a;
        String str2 = this.f23950c;
        String str3 = this.f23951d;
        String str4 = this.f23952f;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23950c);
        parcel.writeString(this.f23951d);
        parcel.writeString(this.f23952f);
        parcel.writeByteArray(this.f23953g);
    }

    public zzacy(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f23950c = str;
        this.f23951d = str2;
        this.f23952f = str3;
        this.f23953g = bArr;
    }
}
