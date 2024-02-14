package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaxh implements Parcelable {
    public static final Parcelable.Creator<zzaxh> CREATOR = new zzaxf();

    /* renamed from: a */
    private final zzaxg[] f26168a;

    zzaxh(Parcel parcel) {
        this.f26168a = new zzaxg[parcel.readInt()];
        int i = 0;
        while (true) {
            zzaxg[] zzaxgArr = this.f26168a;
            if (i < zzaxgArr.length) {
                zzaxgArr[i] = (zzaxg) parcel.readParcelable(zzaxg.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo42168a() {
        return this.f26168a.length;
    }

    /* renamed from: b */
    public final zzaxg mo42169b(int i) {
        return this.f26168a[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaxh.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26168a, ((zzaxh) obj).f26168a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26168a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26168a.length);
        for (zzaxg writeParcelable : this.f26168a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzaxh(List list) {
        zzaxg[] zzaxgArr = new zzaxg[list.size()];
        this.f26168a = zzaxgArr;
        list.toArray(zzaxgArr);
    }
}
