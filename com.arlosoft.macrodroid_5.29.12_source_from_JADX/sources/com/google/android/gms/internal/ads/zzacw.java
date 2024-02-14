package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacw extends zzadd {
    public static final Parcelable.Creator<zzacw> CREATOR = new zzacv();

    /* renamed from: c */
    public final String f23947c;

    /* renamed from: d */
    public final String f23948d;

    /* renamed from: f */
    public final String f23949f;

    zzacw(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23947c = readString;
        this.f23948d = parcel.readString();
        this.f23949f = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacw.class == obj.getClass()) {
            zzacw zzacw = (zzacw) obj;
            return zzen.m49181t(this.f23948d, zzacw.f23948d) && zzen.m49181t(this.f23947c, zzacw.f23947c) && zzen.m49181t(this.f23949f, zzacw.f23949f);
        }
    }

    public final int hashCode() {
        String str = this.f23947c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23948d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23949f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23988a;
        String str2 = this.f23947c;
        String str3 = this.f23948d;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23988a);
        parcel.writeString(this.f23947c);
        parcel.writeString(this.f23949f);
    }

    public zzacw(String str, String str2, String str3) {
        super("COMM");
        this.f23947c = str;
        this.f23948d = str2;
        this.f23949f = str3;
    }
}
