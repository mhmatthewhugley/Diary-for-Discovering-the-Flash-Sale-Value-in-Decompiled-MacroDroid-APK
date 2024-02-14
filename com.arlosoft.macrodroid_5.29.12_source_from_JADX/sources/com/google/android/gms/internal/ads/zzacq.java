package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzacq extends zzadd {
    public static final Parcelable.Creator<zzacq> CREATOR = new zzacp();

    /* renamed from: c */
    public final byte[] f23935c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzacq(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzen.m49166h(r3)
            byte[] r3 = (byte[]) r3
            r2.f23935c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacq.<init>(android.os.Parcel):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacq.class == obj.getClass()) {
            zzacq zzacq = (zzacq) obj;
            return this.f23988a.equals(zzacq.f23988a) && Arrays.equals(this.f23935c, zzacq.f23935c);
        }
    }

    public final int hashCode() {
        return ((this.f23988a.hashCode() + 527) * 31) + Arrays.hashCode(this.f23935c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23988a);
        parcel.writeByteArray(this.f23935c);
    }

    public zzacq(String str, byte[] bArr) {
        super(str);
        this.f23935c = bArr;
    }
}
