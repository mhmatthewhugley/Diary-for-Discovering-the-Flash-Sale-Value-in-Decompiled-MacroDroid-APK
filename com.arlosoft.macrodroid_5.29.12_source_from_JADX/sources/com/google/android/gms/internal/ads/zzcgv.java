package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcgv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcgv> CREATOR = new zzcgw();
    @SafeParcelable.Field

    /* renamed from: a */
    public String f28446a;
    @SafeParcelable.Field

    /* renamed from: c */
    public int f28447c;
    @SafeParcelable.Field

    /* renamed from: d */
    public int f28448d;
    @SafeParcelable.Field

    /* renamed from: f */
    public boolean f28449f;
    @SafeParcelable.Field

    /* renamed from: g */
    public boolean f28450g;

    public zzcgv(int i, int i2, boolean z, boolean z2) {
        this(223104000, i2, true, false, z2);
    }

    /* renamed from: l2 */
    public static zzcgv m45239l2() {
        return new zzcgv((int) GooglePlayServicesUtilLight.f3065a, (int) GooglePlayServicesUtilLight.f3065a, true, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f28446a, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f28447c);
        SafeParcelWriter.m4576n(parcel, 4, this.f28448d);
        SafeParcelWriter.m4565c(parcel, 5, this.f28449f);
        SafeParcelWriter.m4565c(parcel, 6, this.f28450g);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcgv(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>((java.lang.String) r3, (int) r4, (int) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgv.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    zzcgv(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f28446a = str;
        this.f28447c = i;
        this.f28448d = i2;
        this.f28449f = z;
        this.f28450g = z2;
    }
}
