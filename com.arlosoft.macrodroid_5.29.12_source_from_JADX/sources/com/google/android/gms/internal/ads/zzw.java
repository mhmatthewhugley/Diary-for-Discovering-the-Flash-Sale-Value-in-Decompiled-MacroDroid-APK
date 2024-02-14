package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzw implements Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzv();

    /* renamed from: a */
    private int f38756a;

    /* renamed from: c */
    public final UUID f38757c;
    @Nullable

    /* renamed from: d */
    public final String f38758d;

    /* renamed from: f */
    public final String f38759f;
    @Nullable

    /* renamed from: g */
    public final byte[] f38760g;

    zzw(Parcel parcel) {
        this.f38757c = new UUID(parcel.readLong(), parcel.readLong());
        this.f38758d = parcel.readString();
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f38759f = readString;
        this.f38760g = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzw zzw = (zzw) obj;
        return zzen.m49181t(this.f38758d, zzw.f38758d) && zzen.m49181t(this.f38759f, zzw.f38759f) && zzen.m49181t(this.f38757c, zzw.f38757c) && Arrays.equals(this.f38760g, zzw.f38760g);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f38756a;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f38757c.hashCode() * 31;
        String str = this.f38758d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f38759f.hashCode()) * 31) + Arrays.hashCode(this.f38760g);
        this.f38756a = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f38757c.getMostSignificantBits());
        parcel.writeLong(this.f38757c.getLeastSignificantBits());
        parcel.writeString(this.f38758d);
        parcel.writeString(this.f38759f);
        parcel.writeByteArray(this.f38760g);
    }

    public zzw(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f38757c = uuid;
        this.f38758d = null;
        this.f38759f = str2;
        this.f38760g = bArr;
    }
}
