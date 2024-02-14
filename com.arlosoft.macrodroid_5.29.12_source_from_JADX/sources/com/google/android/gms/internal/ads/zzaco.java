package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaco extends zzadd {
    public static final Parcelable.Creator<zzaco> CREATOR = new zzacn();

    /* renamed from: c */
    public final String f23931c;
    @Nullable

    /* renamed from: d */
    public final String f23932d;

    /* renamed from: f */
    public final int f23933f;

    /* renamed from: g */
    public final byte[] f23934g;

    zzaco(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzen.f34500a;
        this.f23931c = readString;
        this.f23932d = parcel.readString();
        this.f23933f = parcel.readInt();
        this.f23934g = (byte[]) zzen.m49166h(parcel.createByteArray());
    }

    /* renamed from: Q1 */
    public final void mo41259Q1(zzbk zzbk) {
        zzbk.mo42710q(this.f23934g, this.f23933f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaco.class == obj.getClass()) {
            zzaco zzaco = (zzaco) obj;
            return this.f23933f == zzaco.f23933f && zzen.m49181t(this.f23931c, zzaco.f23931c) && zzen.m49181t(this.f23932d, zzaco.f23932d) && Arrays.equals(this.f23934g, zzaco.f23934g);
        }
    }

    public final int hashCode() {
        int i = (this.f23933f + 527) * 31;
        String str = this.f23931c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23932d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f23934g);
    }

    public final String toString() {
        String str = this.f23988a;
        String str2 = this.f23931c;
        String str3 = this.f23932d;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23931c);
        parcel.writeString(this.f23932d);
        parcel.writeInt(this.f23933f);
        parcel.writeByteArray(this.f23934g);
    }

    public zzaco(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.f23931c = str;
        this.f23932d = str2;
        this.f23933f = i;
        this.f23934g = bArr;
    }
}
