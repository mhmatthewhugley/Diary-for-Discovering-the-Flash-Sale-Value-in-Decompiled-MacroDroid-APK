package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzsd extends zzrr {

    /* renamed from: k */
    private final zzsk f38410k;

    /* renamed from: l */
    private final boolean f38411l;

    /* renamed from: m */
    private final zzcm f38412m;

    /* renamed from: n */
    private final zzck f38413n;

    /* renamed from: o */
    private zzsb f38414o;
    @Nullable

    /* renamed from: p */
    private zzsa f38415p;

    /* renamed from: q */
    private boolean f38416q;

    /* renamed from: r */
    private boolean f38417r;

    /* renamed from: s */
    private boolean f38418s;

    public zzsd(zzsk zzsk, boolean z) {
        boolean z2;
        this.f38410k = zzsk;
        if (z) {
            zzsk.mo48114u();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f38411l = z2;
        this.f38412m = new zzcm();
        this.f38413n = new zzck();
        zzsk.mo48096J();
        this.f38414o = zzsb.m54852q(zzsk.mo48158I());
    }

    /* renamed from: C */
    private final Object m54866C(Object obj) {
        return (this.f38414o.f38408e == null || !obj.equals(zzsb.f38406f)) ? obj : this.f38414o.f38408e;
    }

    /* renamed from: D */
    private final void m54867D(long j) {
        zzsa zzsa = this.f38415p;
        int a = this.f38414o.mo43599a(zzsa.f38399a.f27569a);
        if (a != -1) {
            zzsb zzsb = this.f38414o;
            zzck zzck = this.f38413n;
            zzsb.mo43602d(a, zzck, false);
            long j2 = zzck.f28722d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            zzsa.mo48152p(j);
        }
    }

    /* renamed from: A */
    public final zzcn mo48156A() {
        return this.f38414o;
    }

    /* renamed from: B */
    public final zzsa mo48160g(zzsi zzsi, zzwi zzwi, long j) {
        zzsa zzsa = new zzsa(zzsi, zzwi, j, (byte[]) null);
        zzsa.mo48154s(this.f38410k);
        if (this.f38417r) {
            zzsa.mo48151k(zzsi.mo48161c(m54866C(zzsi.f27569a)));
        } else {
            this.f38415p = zzsa;
            if (!this.f38416q) {
                this.f38416q = true;
                mo48146z((Object) null, this.f38410k);
            }
        }
        return zzsa;
    }

    /* renamed from: I */
    public final zzbg mo48158I() {
        return this.f38410k.mo48158I();
    }

    /* renamed from: K */
    public final void mo48143K() {
    }

    /* renamed from: c */
    public final void mo48159c(zzsg zzsg) {
        ((zzsa) zzsg).mo48153r();
        if (zzsg == this.f38415p) {
            this.f38415p = null;
        }
    }

    /* renamed from: s */
    public final void mo48112s(@Nullable zzfz zzfz) {
        super.mo48112s(zzfz);
        if (!this.f38411l) {
            this.f38416q = true;
            mo48146z((Object) null, this.f38410k);
        }
    }

    /* renamed from: v */
    public final void mo48115v() {
        this.f38417r = false;
        this.f38416q = false;
        super.mo48115v();
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ zzsi mo48144x(Object obj, zzsi zzsi) {
        Void voidR = (Void) obj;
        Object obj2 = zzsi.f27569a;
        if (this.f38414o.f38408e != null && this.f38414o.f38408e.equals(obj2)) {
            obj2 = zzsb.f38406f;
        }
        return zzsi.mo48161c(obj2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo48145y(java.lang.Object r13, com.google.android.gms.internal.ads.zzsk r14, com.google.android.gms.internal.ads.zzcn r15) {
        /*
            r12 = this;
            java.lang.Void r13 = (java.lang.Void) r13
            boolean r13 = r12.f38417r
            r14 = 0
            if (r13 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzsb r13 = r12.f38414o
            com.google.android.gms.internal.ads.zzsb r13 = r13.mo48155p(r15)
            r12.f38414o = r13
            com.google.android.gms.internal.ads.zzsa r13 = r12.f38415p
            if (r13 == 0) goto L_0x009d
            long r0 = r13.mo48149h()
            r12.m54867D(r0)
            goto L_0x009d
        L_0x001c:
            boolean r13 = r15.mo44135o()
            if (r13 == 0) goto L_0x0038
            boolean r13 = r12.f38418s
            if (r13 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzsb r13 = r12.f38414o
            com.google.android.gms.internal.ads.zzsb r13 = r13.mo48155p(r15)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r13 = com.google.android.gms.internal.ads.zzcm.f28931o
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzsb.f38406f
            com.google.android.gms.internal.ads.zzsb r13 = com.google.android.gms.internal.ads.zzsb.m54853r(r15, r13, r0)
        L_0x0035:
            r12.f38414o = r13
            goto L_0x009d
        L_0x0038:
            com.google.android.gms.internal.ads.zzcm r13 = r12.f38412m
            r0 = 0
            r1 = 0
            r15.mo43603e(r0, r13, r1)
            com.google.android.gms.internal.ads.zzcm r13 = r12.f38412m
            java.lang.Object r13 = r13.f28935a
            com.google.android.gms.internal.ads.zzsa r3 = r12.f38415p
            if (r3 == 0) goto L_0x0064
            long r4 = r3.mo48150j()
            com.google.android.gms.internal.ads.zzsb r6 = r12.f38414o
            com.google.android.gms.internal.ads.zzsi r3 = r3.f38399a
            java.lang.Object r3 = r3.f27569a
            com.google.android.gms.internal.ads.zzck r7 = r12.f38413n
            r6.mo44134n(r3, r7)
            com.google.android.gms.internal.ads.zzsb r3 = r12.f38414o
            com.google.android.gms.internal.ads.zzcm r6 = r12.f38412m
            r3.mo43603e(r0, r6, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            r10 = r4
            goto L_0x0065
        L_0x0064:
            r10 = r1
        L_0x0065:
            com.google.android.gms.internal.ads.zzcm r7 = r12.f38412m
            com.google.android.gms.internal.ads.zzck r8 = r12.f38413n
            r9 = 0
            r6 = r15
            android.util.Pair r0 = r6.mo44132l(r7, r8, r9, r10)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r12.f38418s
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.internal.ads.zzsb r13 = r12.f38414o
            com.google.android.gms.internal.ads.zzsb r13 = r13.mo48155p(r15)
            goto L_0x0088
        L_0x0084:
            com.google.android.gms.internal.ads.zzsb r13 = com.google.android.gms.internal.ads.zzsb.m54853r(r15, r13, r1)
        L_0x0088:
            r12.f38414o = r13
            com.google.android.gms.internal.ads.zzsa r13 = r12.f38415p
            if (r13 == 0) goto L_0x009d
            r12.m54867D(r2)
            com.google.android.gms.internal.ads.zzsi r13 = r13.f38399a
            java.lang.Object r14 = r13.f27569a
            java.lang.Object r14 = r12.m54866C(r14)
            com.google.android.gms.internal.ads.zzsi r14 = r13.mo48161c(r14)
        L_0x009d:
            r13 = 1
            r12.f38418s = r13
            r12.f38417r = r13
            com.google.android.gms.internal.ads.zzsb r13 = r12.f38414o
            r12.mo48113t(r13)
            if (r14 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzsa r13 = r12.f38415p
            java.util.Objects.requireNonNull(r13)
            r13.mo48151k(r14)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsd.mo48145y(java.lang.Object, com.google.android.gms.internal.ads.zzsk, com.google.android.gms.internal.ads.zzcn):void");
    }
}
