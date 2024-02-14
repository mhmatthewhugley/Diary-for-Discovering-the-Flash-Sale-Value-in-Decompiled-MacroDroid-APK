package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacf implements zzbp {
    public static final Parcelable.Creator<zzacf> CREATOR = new zzace();

    /* renamed from: p */
    private static final zzaf f23905p;

    /* renamed from: s */
    private static final zzaf f23906s;

    /* renamed from: a */
    public final String f23907a;

    /* renamed from: c */
    public final String f23908c;

    /* renamed from: d */
    public final long f23909d;

    /* renamed from: f */
    public final long f23910f;

    /* renamed from: g */
    public final byte[] f23911g;

    /* renamed from: o */
    private int f23912o;

    static {
        zzad zzad = new zzad();
        zzad.mo41343s("application/id3");
        f23905p = zzad.mo41349y();
        zzad zzad2 = new zzad();
        zzad2.mo41343s("application/x-scte35");
        f23906s = zzad2.mo41349y();
    }

    zzacf(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23907a = readString;
        this.f23908c = parcel.readString();
        this.f23909d = parcel.readLong();
        this.f23910f = parcel.readLong();
        this.f23911g = (byte[]) zzen.m49166h(parcel.createByteArray());
    }

    public zzacf(String str, String str2, long j, long j2, byte[] bArr) {
        this.f23907a = str;
        this.f23908c = str2;
        this.f23909d = j;
        this.f23910f = j2;
        this.f23911g = bArr;
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
        if (obj != null && zzacf.class == obj.getClass()) {
            zzacf zzacf = (zzacf) obj;
            return this.f23909d == zzacf.f23909d && this.f23910f == zzacf.f23910f && zzen.m49181t(this.f23907a, zzacf.f23907a) && zzen.m49181t(this.f23908c, zzacf.f23908c) && Arrays.equals(this.f23911g, zzacf.f23911g);
        }
    }

    public final int hashCode() {
        int i = this.f23912o;
        if (i != 0) {
            return i;
        }
        String str = this.f23907a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23908c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f23909d;
        long j2 = this.f23910f;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f23911g);
        this.f23912o = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f23907a;
        long j = this.f23910f;
        long j2 = this.f23909d;
        String str2 = this.f23908c;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23907a);
        parcel.writeString(this.f23908c);
        parcel.writeLong(this.f23909d);
        parcel.writeLong(this.f23910f);
        parcel.writeByteArray(this.f23911g);
    }
}
