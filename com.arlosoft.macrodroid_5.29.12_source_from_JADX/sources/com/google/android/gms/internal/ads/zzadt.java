package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadt implements zzbp {
    public static final Parcelable.Creator<zzadt> CREATOR = new zzadr();

    /* renamed from: a */
    public final long f24007a;

    /* renamed from: c */
    public final long f24008c;

    /* renamed from: d */
    public final long f24009d;

    /* renamed from: f */
    public final long f24010f;

    /* renamed from: g */
    public final long f24011g;

    public zzadt(long j, long j2, long j3, long j4, long j5) {
        this.f24007a = j;
        this.f24008c = j2;
        this.f24009d = j3;
        this.f24010f = j4;
        this.f24011g = j5;
    }

    /* synthetic */ zzadt(Parcel parcel, zzads zzads) {
        this.f24007a = parcel.readLong();
        this.f24008c = parcel.readLong();
        this.f24009d = parcel.readLong();
        this.f24010f = parcel.readLong();
        this.f24011g = parcel.readLong();
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
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadt = (zzadt) obj;
            return this.f24007a == zzadt.f24007a && this.f24008c == zzadt.f24008c && this.f24009d == zzadt.f24009d && this.f24010f == zzadt.f24010f && this.f24011g == zzadt.f24011g;
        }
    }

    public final int hashCode() {
        long j = this.f24007a;
        long j2 = this.f24008c;
        long j3 = this.f24009d;
        long j4 = this.f24010f;
        long j5 = this.f24011g;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f24007a;
        long j2 = this.f24008c;
        long j3 = this.f24009d;
        long j4 = this.f24010f;
        long j5 = this.f24011g;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f24007a);
        parcel.writeLong(this.f24008c);
        parcel.writeLong(this.f24009d);
        parcel.writeLong(this.f24010f);
        parcel.writeLong(this.f24011g);
    }
}
