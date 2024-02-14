package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: A */
    public boolean f2019A;
    @SafeParcelable.Field

    /* renamed from: B */
    public boolean f2020B;
    @SafeParcelable.Field

    /* renamed from: C */
    public boolean f2021C;
    @SafeParcelable.Field

    /* renamed from: D */
    public boolean f2022D;
    @SafeParcelable.Field

    /* renamed from: E */
    public boolean f2023E;
    @SafeParcelable.Field

    /* renamed from: F */
    public boolean f2024F;
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f2025a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f2026c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f2027d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f2028f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f2029g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final int f2030o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final zzq[] f2031p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final boolean f2032s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final boolean f2033z;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzq[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: l2 */
    public static int m2417l2(DisplayMetrics displayMetrics) {
        return (int) (((float) m2422q2(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: m2 */
    public static zzq m2418m2() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, (zzq[]) null, false, false, false, false, true, false, false, false);
    }

    /* renamed from: n2 */
    public static zzq m2419n2() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, (zzq[]) null, true, false, false, false, false, false, false, false);
    }

    /* renamed from: o2 */
    public static zzq m2420o2() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, (zzq[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: p2 */
    public static zzq m2421p2() {
        return new zzq("invalid", 0, 0, false, 0, 0, (zzq[]) null, false, false, false, true, false, false, false, false);
    }

    /* renamed from: q2 */
    private static int m2422q2(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f2025a, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f2026c);
        SafeParcelWriter.m4576n(parcel, 4, this.f2027d);
        SafeParcelWriter.m4565c(parcel, 5, this.f2028f);
        SafeParcelWriter.m4576n(parcel, 6, this.f2029g);
        SafeParcelWriter.m4576n(parcel, 7, this.f2030o);
        SafeParcelWriter.m4557A(parcel, 8, this.f2031p, i, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f2032s);
        SafeParcelWriter.m4565c(parcel, 10, this.f2033z);
        SafeParcelWriter.m4565c(parcel, 11, this.f2019A);
        SafeParcelWriter.m4565c(parcel, 12, this.f2020B);
        SafeParcelWriter.m4565c(parcel, 13, this.f2021C);
        SafeParcelWriter.m4565c(parcel, 14, this.f2022D);
        SafeParcelWriter.m4565c(parcel, 15, this.f2023E);
        SafeParcelWriter.m4565c(parcel, 16, this.f2024F);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzq(android.content.Context r14, com.google.android.gms.ads.AdSize[] r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r1 = r15[r0]
            r13.f2028f = r0
            boolean r2 = r1.mo19684f()
            r13.f2033z = r2
            boolean r3 = com.google.android.gms.ads.zzb.m3106f(r1)
            r13.f2022D = r3
            boolean r3 = com.google.android.gms.ads.zzb.m3107g(r1)
            r13.f2023E = r3
            boolean r3 = com.google.android.gms.ads.zzb.m3108h(r1)
            r13.f2024F = r3
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.ads.AdSize r3 = com.google.android.gms.ads.AdSize.f1675i
            int r4 = r3.mo19680c()
            r13.f2029g = r4
            int r3 = r3.mo19678a()
            r13.f2026c = r3
            goto L_0x005d
        L_0x0031:
            boolean r4 = r13.f2023E
            if (r4 == 0) goto L_0x0042
            int r3 = r1.mo19680c()
            r13.f2029g = r3
            int r3 = com.google.android.gms.ads.zzb.m3101a(r1)
            r13.f2026c = r3
            goto L_0x005d
        L_0x0042:
            if (r3 == 0) goto L_0x0051
            int r3 = r1.mo19680c()
            r13.f2029g = r3
            int r3 = com.google.android.gms.ads.zzb.m3102b(r1)
            r13.f2026c = r3
            goto L_0x005d
        L_0x0051:
            int r3 = r1.mo19680c()
            r13.f2029g = r3
            int r3 = r1.mo19678a()
            r13.f2026c = r3
        L_0x005d:
            int r4 = r13.f2029g
            android.content.res.Resources r5 = r14.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r6 = -1
            if (r4 != r6) goto L_0x00f5
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            android.content.res.Resources r7 = r14.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 == r8) goto L_0x007b
            goto L_0x00dd
        L_0x007b:
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r8 = r7.heightPixels
            float r8 = (float) r8
            float r7 = r7.density
            float r8 = r8 / r7
            int r7 = (int) r8
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto L_0x00dd
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "window"
            java.lang.Object r8 = r14.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto L_0x00dd
            android.view.Display r8 = r8.getDefaultDisplay()
            r8.getRealMetrics(r7)
            int r9 = r7.heightPixels
            int r10 = r7.widthPixels
            r8.getMetrics(r7)
            int r8 = r7.heightPixels
            int r7 = r7.widthPixels
            if (r8 != r9) goto L_0x00dd
            if (r7 != r10) goto L_0x00dd
            int r7 = r5.widthPixels
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = "navigation_bar_width"
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            int r8 = r8.getIdentifier(r9, r10, r11)
            if (r8 <= 0) goto L_0x00d8
            android.content.res.Resources r9 = r14.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            int r7 = r7 - r8
            r13.f2030o = r7
            goto L_0x00e1
        L_0x00dd:
            int r7 = r5.widthPixels
            r13.f2030o = r7
        L_0x00e1:
            float r7 = (float) r7
            float r8 = r5.density
            float r7 = r7 / r8
            double r7 = (double) r7
            int r9 = (int) r7
            double r10 = (double) r9
            double r7 = r7 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0102
            int r9 = r9 + 1
            goto L_0x0102
        L_0x00f5:
            int r9 = r13.f2029g
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            int r7 = r13.f2029g
            int r7 = com.google.android.gms.internal.ads.zzcgi.m45179o(r5, r7)
            r13.f2030o = r7
        L_0x0102:
            r7 = -2
            if (r3 != r7) goto L_0x010a
            int r8 = m2422q2(r5)
            goto L_0x010c
        L_0x010a:
            int r8 = r13.f2026c
        L_0x010c:
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            int r5 = com.google.android.gms.internal.ads.zzcgi.m45179o(r5, r8)
            r13.f2027d = r5
            java.lang.String r5 = "_as"
            java.lang.String r10 = "x"
            if (r4 == r6) goto L_0x0150
            if (r3 != r7) goto L_0x011f
            goto L_0x0150
        L_0x011f:
            boolean r3 = r13.f2023E
            if (r3 != 0) goto L_0x0134
            boolean r3 = r13.f2024F
            if (r3 == 0) goto L_0x0128
            goto L_0x0134
        L_0x0128:
            if (r2 == 0) goto L_0x012d
            java.lang.String r1 = "320x50_mb"
            goto L_0x014d
        L_0x012d:
            java.lang.String r1 = r1.toString()
            r13.f2025a = r1
            goto L_0x0167
        L_0x0134:
            int r1 = r13.f2029g
            int r2 = r13.f2026c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r10)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
        L_0x014d:
            r13.f2025a = r1
            goto L_0x0167
        L_0x0150:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.f2025a = r1
        L_0x0167:
            int r1 = r15.length
            r2 = 1
            if (r1 <= r2) goto L_0x0181
            com.google.android.gms.ads.internal.client.zzq[] r1 = new com.google.android.gms.ads.internal.client.zzq[r1]
            r13.f2031p = r1
            r1 = 0
        L_0x0170:
            int r2 = r15.length
            if (r1 >= r2) goto L_0x0184
            com.google.android.gms.ads.internal.client.zzq[] r2 = r13.f2031p
            com.google.android.gms.ads.internal.client.zzq r3 = new com.google.android.gms.ads.internal.client.zzq
            r4 = r15[r1]
            r3.<init>((android.content.Context) r14, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0170
        L_0x0181:
            r14 = 0
            r13.f2031p = r14
        L_0x0184:
            r13.f2032s = r0
            r13.f2019A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzq.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param zzq[] zzqArr, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param boolean z5, @SafeParcelable.Param boolean z6, @SafeParcelable.Param boolean z7, @SafeParcelable.Param boolean z8, @SafeParcelable.Param boolean z9) {
        this.f2025a = str;
        this.f2026c = i;
        this.f2027d = i2;
        this.f2028f = z;
        this.f2029g = i3;
        this.f2030o = i4;
        this.f2031p = zzqArr;
        this.f2032s = z2;
        this.f2033z = z3;
        this.f2019A = z4;
        this.f2020B = z5;
        this.f2021C = z6;
        this.f2022D = z7;
        this.f2023E = z8;
        this.f2024F = z9;
    }
}
