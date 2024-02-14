package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadh extends zzadd {
    public static final Parcelable.Creator<zzadh> CREATOR = new zzadg();

    /* renamed from: c */
    public final int f23992c;

    /* renamed from: d */
    public final int f23993d;

    /* renamed from: f */
    public final int f23994f;

    /* renamed from: g */
    public final int[] f23995g;

    /* renamed from: o */
    public final int[] f23996o;

    public zzadh(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f23992c = i;
        this.f23993d = i2;
        this.f23994f = i3;
        this.f23995g = iArr;
        this.f23996o = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadh.class == obj.getClass()) {
            zzadh zzadh = (zzadh) obj;
            return this.f23992c == zzadh.f23992c && this.f23993d == zzadh.f23993d && this.f23994f == zzadh.f23994f && Arrays.equals(this.f23995g, zzadh.f23995g) && Arrays.equals(this.f23996o, zzadh.f23996o);
        }
    }

    public final int hashCode() {
        return ((((((((this.f23992c + 527) * 31) + this.f23993d) * 31) + this.f23994f) * 31) + Arrays.hashCode(this.f23995g)) * 31) + Arrays.hashCode(this.f23996o);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23992c);
        parcel.writeInt(this.f23993d);
        parcel.writeInt(this.f23994f);
        parcel.writeIntArray(this.f23995g);
        parcel.writeIntArray(this.f23996o);
    }

    zzadh(Parcel parcel) {
        super("MLLT");
        this.f23992c = parcel.readInt();
        this.f23993d = parcel.readInt();
        this.f23994f = parcel.readInt();
        this.f23995g = (int[]) zzen.m49166h(parcel.createIntArray());
        this.f23996o = (int[]) zzen.m49166h(parcel.createIntArray());
    }
}
