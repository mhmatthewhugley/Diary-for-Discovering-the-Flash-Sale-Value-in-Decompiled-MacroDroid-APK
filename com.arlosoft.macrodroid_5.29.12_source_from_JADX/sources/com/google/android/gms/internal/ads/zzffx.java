package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzffx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffx> CREATOR = new zzffy();
    @SafeParcelable.Field

    /* renamed from: A */
    private final int f35715A;

    /* renamed from: B */
    private final int[] f35716B;

    /* renamed from: C */
    private final int[] f35717C;

    /* renamed from: D */
    public final int f35718D;

    /* renamed from: a */
    private final zzffu[] f35719a;

    /* renamed from: c */
    public final Context f35720c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f35721d;

    /* renamed from: f */
    public final zzffu f35722f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f35723g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final int f35724o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final int f35725p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final String f35726s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final int f35727z;

    @SafeParcelable.Constructor
    public zzffx(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param String str, @SafeParcelable.Param int i5, @SafeParcelable.Param int i6) {
        zzffu[] values = zzffu.values();
        this.f35719a = values;
        int[] a = zzffv.m50121a();
        this.f35716B = a;
        int[] a2 = zzffw.m50122a();
        this.f35717C = a2;
        this.f35720c = null;
        this.f35721d = i;
        this.f35722f = values[i];
        this.f35723g = i2;
        this.f35724o = i3;
        this.f35725p = i4;
        this.f35726s = str;
        this.f35727z = i5;
        this.f35718D = a[i5];
        this.f35715A = i6;
        int i7 = a2[i6];
    }

    /* renamed from: l2 */
    public static zzffx m50123l2(zzffu zzffu, Context context) {
        if (zzffu == zzffu.Rewarded) {
            return new zzffx(context, zzffu, ((Integer) zzay.m1924c().mo42663b(zzbjc.f27287w5)).intValue(), ((Integer) zzay.m1924c().mo42663b(zzbjc.f26832C5)).intValue(), ((Integer) zzay.m1924c().mo42663b(zzbjc.f26852E5)).intValue(), (String) zzay.m1924c().mo42663b(zzbjc.f26872G5), (String) zzay.m1924c().mo42663b(zzbjc.f27307y5), (String) zzay.m1924c().mo42663b(zzbjc.f26812A5));
        } else if (zzffu == zzffu.Interstitial) {
            return new zzffx(context, zzffu, ((Integer) zzay.m1924c().mo42663b(zzbjc.f27297x5)).intValue(), ((Integer) zzay.m1924c().mo42663b(zzbjc.f26842D5)).intValue(), ((Integer) zzay.m1924c().mo42663b(zzbjc.f26862F5)).intValue(), (String) zzay.m1924c().mo42663b(zzbjc.f26882H5), (String) zzay.m1924c().mo42663b(zzbjc.f27317z5), (String) zzay.m1924c().mo42663b(zzbjc.f26822B5));
        } else if (zzffu != zzffu.AppOpen) {
            return null;
        } else {
            return new zzffx(context, zzffu, ((Integer) zzay.m1924c().mo42663b(zzbjc.f26912K5)).intValue(), ((Integer) zzay.m1924c().mo42663b(zzbjc.f26932M5)).intValue(), ((Integer) zzay.m1924c().mo42663b(zzbjc.f26942N5)).intValue(), (String) zzay.m1924c().mo42663b(zzbjc.f26892I5), (String) zzay.m1924c().mo42663b(zzbjc.f26902J5), (String) zzay.m1924c().mo42663b(zzbjc.f26922L5));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f35721d);
        SafeParcelWriter.m4576n(parcel, 2, this.f35723g);
        SafeParcelWriter.m4576n(parcel, 3, this.f35724o);
        SafeParcelWriter.m4576n(parcel, 4, this.f35725p);
        SafeParcelWriter.m4586x(parcel, 5, this.f35726s, false);
        SafeParcelWriter.m4576n(parcel, 6, this.f35727z);
        SafeParcelWriter.m4576n(parcel, 7, this.f35715A);
        SafeParcelWriter.m4564b(parcel, a);
    }

    private zzffx(Context context, zzffu zzffu, int i, int i2, int i3, String str, String str2, String str3) {
        this.f35719a = zzffu.values();
        this.f35716B = zzffv.m50121a();
        this.f35717C = zzffw.m50122a();
        this.f35720c = context;
        this.f35721d = zzffu.ordinal();
        this.f35722f = zzffu;
        this.f35723g = i;
        this.f35724o = i2;
        this.f35725p = i3;
        this.f35726s = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.f35718D = i4;
        this.f35727z = i4 - 1;
        "onAdClosed".equals(str3);
        this.f35715A = 0;
    }
}
