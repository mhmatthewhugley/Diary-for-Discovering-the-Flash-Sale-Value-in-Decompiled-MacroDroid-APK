package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbo();

    /* renamed from: a */
    private final zzbp[] f27635a;

    /* renamed from: c */
    public final long f27636c;

    public zzbq(long j, zzbp... zzbpArr) {
        this.f27636c = j;
        this.f27635a = zzbpArr;
    }

    zzbq(Parcel parcel) {
        this.f27635a = new zzbp[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbp[] zzbpArr = this.f27635a;
            if (i < zzbpArr.length) {
                zzbpArr[i] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
                i++;
            } else {
                this.f27636c = parcel.readLong();
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo42875a() {
        return this.f27635a.length;
    }

    /* renamed from: b */
    public final zzbp mo42876b(int i) {
        return this.f27635a[i];
    }

    /* renamed from: c */
    public final zzbq mo42877c(zzbp... zzbpArr) {
        if (zzbpArr.length == 0) {
            return this;
        }
        return new zzbq(this.f27636c, (zzbp[]) zzen.m49130E(this.f27635a, zzbpArr));
    }

    /* renamed from: d */
    public final zzbq mo42878d(@Nullable zzbq zzbq) {
        return zzbq == null ? this : mo42877c(zzbq.f27635a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbq = (zzbq) obj;
            return Arrays.equals(this.f27635a, zzbq.f27635a) && this.f27636c == zzbq.f27636c;
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f27635a);
        long j = this.f27636c;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f27635a);
        long j = this.f27636c;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27635a.length);
        for (zzbp writeParcelable : this.f27635a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f27636c);
    }

    public zzbq(List list) {
        this(-9223372036854775807L, (zzbp[]) list.toArray(new zzbp[0]));
    }
}
