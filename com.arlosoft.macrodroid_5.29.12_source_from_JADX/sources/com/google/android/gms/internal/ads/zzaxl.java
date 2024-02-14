package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaxl extends zzaxn {
    public static final Parcelable.Creator<zzaxl> CREATOR = new zzaxk();

    /* renamed from: c */
    public final String f26173c;

    /* renamed from: d */
    public final String f26174d;

    /* renamed from: f */
    public final String f26175f;

    zzaxl(Parcel parcel) {
        super("COMM");
        this.f26173c = parcel.readString();
        this.f26174d = parcel.readString();
        this.f26175f = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxl.class == obj.getClass()) {
            zzaxl zzaxl = (zzaxl) obj;
            return zzbar.m42999o(this.f26174d, zzaxl.f26174d) && zzbar.m42999o(this.f26173c, zzaxl.f26173c) && zzbar.m42999o(this.f26175f, zzaxl.f26175f);
        }
    }

    public final int hashCode() {
        String str = this.f26173c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f26174d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26175f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26176a);
        parcel.writeString(this.f26173c);
        parcel.writeString(this.f26175f);
    }

    public zzaxl(String str, String str2, String str3) {
        super("COMM");
        this.f26173c = "und";
        this.f26174d = str2;
        this.f26175f = str3;
    }
}
