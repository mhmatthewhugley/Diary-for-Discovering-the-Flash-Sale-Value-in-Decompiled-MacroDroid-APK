package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadw implements zzbp {
    public static final Parcelable.Creator<zzadw> CREATOR = new zzadu();

    /* renamed from: a */
    public final float f24012a;

    /* renamed from: c */
    public final int f24013c;

    public zzadw(float f, int i) {
        this.f24012a = f;
        this.f24013c = i;
    }

    /* synthetic */ zzadw(Parcel parcel, zzadv zzadv) {
        this.f24012a = parcel.readFloat();
        this.f24013c = parcel.readInt();
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
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadw = (zzadw) obj;
            return this.f24012a == zzadw.f24012a && this.f24013c == zzadw.f24013c;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f24012a).hashCode() + 527) * 31) + this.f24013c;
    }

    public final String toString() {
        float f = this.f24012a;
        int i = this.f24013c;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f24012a);
        parcel.writeInt(this.f24013c);
    }
}
