package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaxj extends zzaxn {
    public static final Parcelable.Creator<zzaxj> CREATOR = new zzaxi();

    /* renamed from: c */
    public final String f26169c;

    /* renamed from: d */
    public final String f26170d;

    /* renamed from: f */
    public final int f26171f;

    /* renamed from: g */
    public final byte[] f26172g;

    zzaxj(Parcel parcel) {
        super("APIC");
        this.f26169c = parcel.readString();
        this.f26170d = parcel.readString();
        this.f26171f = parcel.readInt();
        this.f26172g = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxj.class == obj.getClass()) {
            zzaxj zzaxj = (zzaxj) obj;
            return this.f26171f == zzaxj.f26171f && zzbar.m42999o(this.f26169c, zzaxj.f26169c) && zzbar.m42999o(this.f26170d, zzaxj.f26170d) && Arrays.equals(this.f26172g, zzaxj.f26172g);
        }
    }

    public final int hashCode() {
        int i = (this.f26171f + 527) * 31;
        String str = this.f26169c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26170d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f26172g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26169c);
        parcel.writeString(this.f26170d);
        parcel.writeInt(this.f26171f);
        parcel.writeByteArray(this.f26172g);
    }

    public zzaxj(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f26169c = str;
        this.f26170d = null;
        this.f26171f = 3;
        this.f26172g = bArr;
    }
}
