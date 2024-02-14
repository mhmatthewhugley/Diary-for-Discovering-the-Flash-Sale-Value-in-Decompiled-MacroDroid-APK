package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzmu {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f37889a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f37890b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f37891c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzsi f37892d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f37893e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f37894f;

    /* renamed from: g */
    final /* synthetic */ zzmv f37895g;

    public zzmu(zzmv zzmv, String str, @Nullable int i, zzsi zzsi) {
        this.f37895g = zzmv;
        this.f37889a = str;
        this.f37890b = i;
        this.f37891c = zzsi == null ? -1 : zzsi.f27572d;
        if (zzsi != null && zzsi.mo42817b()) {
            this.f37892d = zzsi;
        }
    }

    /* renamed from: g */
    public final void mo47852g(int i, @Nullable zzsi zzsi) {
        if (this.f37891c == -1 && i == this.f37890b && zzsi != null) {
            this.f37891c = zzsi.f27572d;
        }
    }

    /* renamed from: j */
    public final boolean mo47853j(int i, @Nullable zzsi zzsi) {
        if (zzsi == null) {
            return i == this.f37890b;
        }
        zzsi zzsi2 = this.f37892d;
        return zzsi2 == null ? !zzsi.mo42817b() && zzsi.f27572d == this.f37891c : zzsi.f27572d == zzsi2.f27572d && zzsi.f27570b == zzsi2.f27570b && zzsi.f27571c == zzsi2.f27571c;
    }

    /* renamed from: k */
    public final boolean mo47854k(zzkp zzkp) {
        long j = this.f37891c;
        if (j == -1) {
            return false;
        }
        zzsi zzsi = zzkp.f37763d;
        if (zzsi == null) {
            return this.f37890b != zzkp.f37762c;
        }
        if (zzsi.f27572d > j) {
            return true;
        }
        if (this.f37892d == null) {
            return false;
        }
        int a = zzkp.f37761b.mo43599a(zzsi.f27569a);
        int a2 = zzkp.f37761b.mo43599a(this.f37892d.f27569a);
        zzsi zzsi2 = zzkp.f37763d;
        if (zzsi2.f27572d < this.f37892d.f27572d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (zzsi2.mo42817b()) {
            zzsi zzsi3 = zzkp.f37763d;
            int i = zzsi3.f27570b;
            int i2 = zzsi3.f27571c;
            zzsi zzsi4 = this.f37892d;
            int i3 = zzsi4.f27570b;
            if (i > i3 || (i == i3 && i2 > zzsi4.f27571c)) {
                return true;
            }
            return false;
        }
        int i4 = zzkp.f37763d.f27573e;
        return i4 == -1 || i4 > this.f37892d.f27570b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.mo43601c()) goto L_0x004a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47855l(com.google.android.gms.internal.ads.zzcn r7, com.google.android.gms.internal.ads.zzcn r8) {
        /*
            r6 = this;
            int r0 = r6.f37890b
            int r1 = r7.mo43601c()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.mo43601c()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = -1
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzmv r1 = r6.f37895g
            com.google.android.gms.internal.ads.zzcm r1 = r1.f37898a
            r4 = 0
            r7.mo43603e(r0, r1, r4)
            com.google.android.gms.internal.ads.zzmv r0 = r6.f37895g
            com.google.android.gms.internal.ads.zzcm r0 = r0.f37898a
            int r0 = r0.f28947m
        L_0x0026:
            com.google.android.gms.internal.ads.zzmv r1 = r6.f37895g
            com.google.android.gms.internal.ads.zzcm r1 = r1.f37898a
            int r1 = r1.f28948n
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.mo43604f(r0)
            int r1 = r8.mo43599a(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzmv r7 = r6.f37895g
            com.google.android.gms.internal.ads.zzck r7 = r7.f37899b
            com.google.android.gms.internal.ads.zzck r7 = r8.mo43602d(r1, r7, r2)
            int r0 = r7.f28721c
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.f37890b = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zzsi r7 = r6.f37892d
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.f27569a
            int r7 = r8.mo43599a(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmu.mo47855l(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcn):boolean");
    }
}
