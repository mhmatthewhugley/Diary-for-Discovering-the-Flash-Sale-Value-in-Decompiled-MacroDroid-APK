package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadf extends zzadd {
    public static final Parcelable.Creator<zzadf> CREATOR = new zzade();

    /* renamed from: c */
    public final String f23989c;

    /* renamed from: d */
    public final String f23990d;

    /* renamed from: f */
    public final String f23991f;

    zzadf(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23989c = readString;
        this.f23990d = parcel.readString();
        this.f23991f = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadf.class == obj.getClass()) {
            zzadf zzadf = (zzadf) obj;
            return zzen.m49181t(this.f23990d, zzadf.f23990d) && zzen.m49181t(this.f23989c, zzadf.f23989c) && zzen.m49181t(this.f23991f, zzadf.f23991f);
        }
    }

    public final int hashCode() {
        String str = this.f23989c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23990d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23991f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23988a;
        String str2 = this.f23989c;
        String str3 = this.f23990d;
        return str + ": domain=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23988a);
        parcel.writeString(this.f23989c);
        parcel.writeString(this.f23991f);
    }

    public zzadf(String str, String str2, String str3) {
        super("----");
        this.f23989c = str;
        this.f23990d = str2;
        this.f23991f = str3;
    }
}
