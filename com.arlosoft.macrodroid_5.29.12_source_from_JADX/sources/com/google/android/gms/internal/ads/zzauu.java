package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzauu implements Parcelable {
    public static final Parcelable.Creator<zzauu> CREATOR = new zzaut();

    /* renamed from: a */
    private int f25711a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final UUID f25712c;

    /* renamed from: d */
    public final String f25713d;

    /* renamed from: f */
    public final byte[] f25714f;

    /* renamed from: g */
    public final boolean f25715g;

    zzauu(Parcel parcel) {
        this.f25712c = new UUID(parcel.readLong(), parcel.readLong());
        this.f25713d = parcel.readString();
        this.f25714f = parcel.createByteArray();
        this.f25715g = parcel.readByte() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzauu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzauu zzauu = (zzauu) obj;
        return this.f25713d.equals(zzauu.f25713d) && zzbar.m42999o(this.f25712c, zzauu.f25712c) && Arrays.equals(this.f25714f, zzauu.f25714f);
    }

    public final int hashCode() {
        int i = this.f25711a;
        if (i != 0) {
            return i;
        }
        int hashCode = (((this.f25712c.hashCode() * 31) + this.f25713d.hashCode()) * 31) + Arrays.hashCode(this.f25714f);
        this.f25711a = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f25712c.getMostSignificantBits());
        parcel.writeLong(this.f25712c.getLeastSignificantBits());
        parcel.writeString(this.f25713d);
        parcel.writeByteArray(this.f25714f);
        parcel.writeByte(this.f25715g ? (byte) 1 : 0);
    }

    public zzauu(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f25712c = uuid;
        this.f25713d = str;
        Objects.requireNonNull(bArr);
        this.f25714f = bArr;
        this.f25715g = false;
    }
}
