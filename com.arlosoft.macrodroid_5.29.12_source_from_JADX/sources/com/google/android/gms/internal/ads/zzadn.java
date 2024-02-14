package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadn extends zzadd {
    public static final Parcelable.Creator<zzadn> CREATOR = new zzadm();
    @Nullable

    /* renamed from: c */
    public final String f24001c;

    /* renamed from: d */
    public final String f24002d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzadn(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f24001c = r0
            java.lang.String r3 = r3.readString()
            r2.f24002d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.<init>(android.os.Parcel):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadn.class == obj.getClass()) {
            zzadn zzadn = (zzadn) obj;
            return this.f23988a.equals(zzadn.f23988a) && zzen.m49181t(this.f24001c, zzadn.f24001c) && zzen.m49181t(this.f24002d, zzadn.f24002d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f23988a.hashCode() + 527) * 31;
        String str = this.f24001c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24002d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23988a;
        String str2 = this.f24002d;
        return str + ": url=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23988a);
        parcel.writeString(this.f24001c);
        parcel.writeString(this.f24002d);
    }

    public zzadn(String str, @Nullable String str2, String str3) {
        super(str);
        this.f24001c = str2;
        this.f24002d = str3;
    }
}
