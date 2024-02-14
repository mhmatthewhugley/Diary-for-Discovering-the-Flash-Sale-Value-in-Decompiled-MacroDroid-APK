package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqj extends zzfrc {

    /* renamed from: a */
    private final IBinder f36267a;

    /* renamed from: b */
    private final String f36268b;

    /* renamed from: c */
    private final int f36269c;

    /* renamed from: d */
    private final float f36270d;

    /* renamed from: e */
    private final int f36271e;

    /* renamed from: f */
    private final String f36272f;

    /* synthetic */ zzfqj(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, zzfqi zzfqi) {
        this.f36267a = iBinder;
        this.f36268b = str;
        this.f36269c = i;
        this.f36270d = f;
        this.f36271e = i3;
        this.f36272f = str3;
    }

    /* renamed from: a */
    public final float mo46099a() {
        return this.f36270d;
    }

    /* renamed from: b */
    public final int mo46100b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo46101c() {
        return this.f36269c;
    }

    /* renamed from: d */
    public final int mo46102d() {
        return this.f36271e;
    }

    /* renamed from: e */
    public final IBinder mo46103e() {
        return this.f36267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r1 = r4.f36272f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzfrc
            r2 = 0
            if (r1 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzfrc r5 = (com.google.android.gms.internal.ads.zzfrc) r5
            android.os.IBinder r1 = r4.f36267a
            android.os.IBinder r3 = r5.mo46103e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006c
            r5.mo46109i()
            java.lang.String r1 = r4.f36268b
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r5.mo46106g()
            if (r1 != 0) goto L_0x006c
            goto L_0x002f
        L_0x0025:
            java.lang.String r3 = r5.mo46106g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006c
        L_0x002f:
            int r1 = r4.f36269c
            int r3 = r5.mo46101c()
            if (r1 != r3) goto L_0x006c
            float r1 = r4.f36270d
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.mo46099a()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x006c
            r5.mo46100b()
            r5.mo46107h()
            int r1 = r4.f36271e
            int r3 = r5.mo46102d()
            if (r1 != r3) goto L_0x006c
            java.lang.String r1 = r4.f36272f
            if (r1 != 0) goto L_0x0060
            java.lang.String r5 = r5.mo46105f()
            if (r5 != 0) goto L_0x006c
            goto L_0x006b
        L_0x0060:
            java.lang.String r5 = r5.mo46105f()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            return r0
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqj.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* renamed from: f */
    public final String mo46105f() {
        return this.f36272f;
    }

    @Nullable
    /* renamed from: g */
    public final String mo46106g() {
        return this.f36268b;
    }

    @Nullable
    /* renamed from: h */
    public final String mo46107h() {
        return null;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f36267a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003;
        String str = this.f36268b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int floatToIntBits = (((((((hashCode ^ i) * 1000003) ^ this.f36269c) * 1000003) ^ Float.floatToIntBits(this.f36270d)) * 583896283) ^ this.f36271e) * 1000003;
        String str2 = this.f36272f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return floatToIntBits ^ i2;
    }

    /* renamed from: i */
    public final boolean mo46109i() {
        return false;
    }

    public final String toString() {
        String obj = this.f36267a.toString();
        String str = this.f36268b;
        int i = this.f36269c;
        float f = this.f36270d;
        int i2 = this.f36271e;
        String str2 = this.f36272f;
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", stableSessionToken=false, appId=" + str + ", layoutGravity=" + i + ", layoutVerticalMargin=" + f + ", displayMode=0, sessionToken=null, windowWidthPx=" + i2 + ", adFieldEnifd=" + str2 + "}";
    }
}
