package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a */
    public final boolean f48444a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final List f48445c;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable List list) {
        this.f48444a = z;
        this.f48445c = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r2 = r4.f48445c;
        r5 = r5.f48445c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x0027
            java.lang.Class<com.google.android.gms.wearable.internal.zzs> r2 = com.google.android.gms.wearable.internal.zzs.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x0027
        L_0x0010:
            com.google.android.gms.wearable.internal.zzs r5 = (com.google.android.gms.wearable.internal.zzs) r5
            boolean r2 = r4.f48444a
            boolean r3 = r5.f48444a
            if (r2 != r3) goto L_0x0027
            java.util.List r2 = r4.f48445c
            java.util.List r5 = r5.f48445c
            if (r2 == r5) goto L_0x0026
            if (r2 == 0) goto L_0x0027
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0027
        L_0x0026:
            return r0
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48444a), this.f48445c});
    }

    public final String toString() {
        boolean z = this.f48444a;
        String valueOf = String.valueOf(this.f48445c);
        return "AppWearDetailsParcelable{isWatchface=" + z + ", watchfaceCategories=" + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f48444a);
        SafeParcelWriter.m4588z(parcel, 2, this.f48445c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
