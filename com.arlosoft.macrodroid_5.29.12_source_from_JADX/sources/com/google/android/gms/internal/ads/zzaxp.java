package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaxp extends zzaxn {
    public static final Parcelable.Creator<zzaxp> CREATOR = new zzaxo();

    /* renamed from: c */
    public final String f26177c;

    /* renamed from: d */
    public final String f26178d;

    zzaxp(Parcel parcel) {
        super(parcel.readString());
        this.f26177c = parcel.readString();
        this.f26178d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxp.class == obj.getClass()) {
            zzaxp zzaxp = (zzaxp) obj;
            return this.f26176a.equals(zzaxp.f26176a) && zzbar.m42999o(this.f26177c, zzaxp.f26177c) && zzbar.m42999o(this.f26178d, zzaxp.f26178d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f26176a.hashCode() + 527) * 31;
        String str = this.f26177c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26178d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26176a);
        parcel.writeString(this.f26177c);
        parcel.writeString(this.f26178d);
    }

    public zzaxp(String str, String str2, String str3) {
        super(str);
        this.f26177c = null;
        this.f26178d = str3;
    }
}
