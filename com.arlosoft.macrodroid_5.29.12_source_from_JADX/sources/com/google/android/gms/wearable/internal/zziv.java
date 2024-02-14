package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zziv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zziv> CREATOR = new zzfc();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f48419a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f48420c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f48421d;

    @SafeParcelable.Constructor
    public zziv(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f48419a = str;
        this.f48420c = i;
        this.f48421d = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r2 = r4.f48419a;
        r5 = r5.f48419a;
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
            if (r5 == 0) goto L_0x002d
            java.lang.Class<com.google.android.gms.wearable.internal.zziv> r2 = com.google.android.gms.wearable.internal.zziv.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            com.google.android.gms.wearable.internal.zziv r5 = (com.google.android.gms.wearable.internal.zziv) r5
            int r2 = r4.f48420c
            int r3 = r5.f48420c
            if (r2 != r3) goto L_0x002d
            int r2 = r4.f48421d
            int r3 = r5.f48421d
            if (r2 != r3) goto L_0x002d
            java.lang.String r2 = r4.f48419a
            java.lang.String r5 = r5.f48419a
            if (r2 == r5) goto L_0x002c
            if (r2 == 0) goto L_0x002d
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zziv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48419a, Integer.valueOf(this.f48420c), Integer.valueOf(this.f48421d)});
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", new Object[]{Integer.valueOf(this.f48420c), Integer.valueOf(this.f48421d), this.f48419a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f48419a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f48420c);
        SafeParcelWriter.m4576n(parcel, 3, this.f48421d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
