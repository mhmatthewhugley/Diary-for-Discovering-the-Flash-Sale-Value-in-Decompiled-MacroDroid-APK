package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacm implements zzbp {
    public static final Parcelable.Creator<zzacm> CREATOR = new zzacl();

    /* renamed from: a */
    public final int f23925a;
    @Nullable

    /* renamed from: c */
    public final String f23926c;
    @Nullable

    /* renamed from: d */
    public final String f23927d;
    @Nullable

    /* renamed from: f */
    public final String f23928f;

    /* renamed from: g */
    public final boolean f23929g;

    /* renamed from: o */
    public final int f23930o;

    public zzacm(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzdd.m47210d(z2);
        this.f23925a = i;
        this.f23926c = str;
        this.f23927d = str2;
        this.f23928f = str3;
        this.f23929g = z;
        this.f23930o = i2;
    }

    /* renamed from: Q1 */
    public final void mo41259Q1(zzbk zzbk) {
        String str = this.f23927d;
        if (str != null) {
            zzbk.mo42704G(str);
        }
        String str2 = this.f23926c;
        if (str2 != null) {
            zzbk.mo42719z(str2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacm.class == obj.getClass()) {
            zzacm zzacm = (zzacm) obj;
            return this.f23925a == zzacm.f23925a && zzen.m49181t(this.f23926c, zzacm.f23926c) && zzen.m49181t(this.f23927d, zzacm.f23927d) && zzen.m49181t(this.f23928f, zzacm.f23928f) && this.f23929g == zzacm.f23929g && this.f23930o == zzacm.f23930o;
        }
    }

    public final int hashCode() {
        int i = (this.f23925a + 527) * 31;
        String str = this.f23926c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23927d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23928f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f23929g ? 1 : 0)) * 31) + this.f23930o;
    }

    public final String toString() {
        String str = this.f23927d;
        String str2 = this.f23926c;
        int i = this.f23925a;
        int i2 = this.f23930o;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23925a);
        parcel.writeString(this.f23926c);
        parcel.writeString(this.f23927d);
        parcel.writeString(this.f23928f);
        zzen.m49180s(parcel, this.f23929g);
        parcel.writeInt(this.f23930o);
    }

    zzacm(Parcel parcel) {
        this.f23925a = parcel.readInt();
        this.f23926c = parcel.readString();
        this.f23927d = parcel.readString();
        this.f23928f = parcel.readString();
        this.f23929g = zzen.m49187z(parcel);
        this.f23930o = parcel.readInt();
    }
}
