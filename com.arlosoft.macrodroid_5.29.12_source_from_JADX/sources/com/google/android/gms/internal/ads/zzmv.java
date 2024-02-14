package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzmv implements zzmz {

    /* renamed from: h */
    public static final zzftn f37896h = zzmt.f37888a;

    /* renamed from: i */
    private static final Random f37897i = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzcm f37898a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzck f37899b;

    /* renamed from: c */
    private final HashMap f37900c;

    /* renamed from: d */
    private final zzftn f37901d;

    /* renamed from: e */
    private zzmy f37902e;

    /* renamed from: f */
    private zzcn f37903f;
    @Nullable

    /* renamed from: g */
    private String f37904g;

    public zzmv() {
        throw null;
    }

    /* renamed from: k */
    private final zzmu m54253k(int i, @Nullable zzsi zzsi) {
        int i2;
        zzmu zzmu = null;
        long j = LocationRequestCompat.PASSIVE_INTERVAL;
        for (zzmu zzmu2 : this.f37900c.values()) {
            zzmu2.mo47852g(i, zzsi);
            if (zzmu2.mo47853j(i, zzsi)) {
                long b = zzmu2.f37891c;
                if (b == -1 || b < j) {
                    zzmu = zzmu2;
                    j = b;
                } else if (i2 == 0) {
                    int i3 = zzen.f34500a;
                    if (!(zzmu.f37892d == null || zzmu2.f37892d == null)) {
                        zzmu = zzmu2;
                    }
                }
            }
        }
        if (zzmu != null) {
            return zzmu;
        }
        String l = m54254l();
        zzmu zzmu3 = new zzmu(this, l, i, zzsi);
        this.f37900c.put(l, zzmu3);
        return zzmu3;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static String m54254l() {
        byte[] bArr = new byte[12];
        f37897i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: m */
    private final void m54255m(zzkp zzkp) {
        if (zzkp.f37761b.mo44135o()) {
            this.f37904g = null;
            return;
        }
        zzmu zzmu = (zzmu) this.f37900c.get(this.f37904g);
        zzmu k = m54253k(zzkp.f37762c, zzkp.f37763d);
        this.f37904g = k.f37889a;
        mo47862g(zzkp);
        zzsi zzsi = zzkp.f37763d;
        if (zzsi != null && zzsi.mo42817b()) {
            if (zzmu == null || zzmu.f37891c != zzkp.f37763d.f27572d || zzmu.f37892d == null || zzmu.f37892d.f27570b != zzkp.f37763d.f27570b || zzmu.f37892d.f27571c != zzkp.f37763d.f27571c) {
                zzsi zzsi2 = zzkp.f37763d;
                String unused = m54253k(zzkp.f37762c, new zzsi(zzsi2.f27569a, zzsi2.f27572d)).f37889a;
                String unused2 = k.f37889a;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47856a(zzkp zzkp) {
        Objects.requireNonNull(this.f37902e);
        zzcn zzcn = this.f37903f;
        this.f37903f = zzkp.f37761b;
        Iterator it = this.f37900c.values().iterator();
        while (it.hasNext()) {
            zzmu zzmu = (zzmu) it.next();
            if (!zzmu.mo47855l(zzcn, this.f37903f) || zzmu.mo47854k(zzkp)) {
                it.remove();
                if (zzmu.f37893e) {
                    if (zzmu.f37889a.equals(this.f37904g)) {
                        this.f37904g = null;
                    }
                    this.f37902e.mo47863b(zzkp, zzmu.f37889a, false);
                }
            }
        }
        m54255m(zzkp);
    }

    /* renamed from: b */
    public final synchronized String mo47857b(zzcn zzcn, zzsi zzsi) {
        return m54253k(zzcn.mo44134n(zzsi.f27569a, this.f37899b).f28721c, zzsi).f37889a;
    }

    /* renamed from: c */
    public final void mo47858c(zzmy zzmy) {
        this.f37902e = zzmy;
    }

    @Nullable
    /* renamed from: d */
    public final synchronized String mo47859d() {
        return this.f37904g;
    }

    /* renamed from: e */
    public final synchronized void mo47860e(zzkp zzkp) {
        zzmy zzmy;
        this.f37904g = null;
        Iterator it = this.f37900c.values().iterator();
        while (it.hasNext()) {
            zzmu zzmu = (zzmu) it.next();
            it.remove();
            if (zzmu.f37893e && (zzmy = this.f37902e) != null) {
                zzmy.mo47863b(zzkp, zzmu.f37889a, false);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo47861f(zzkp zzkp, int i) {
        Objects.requireNonNull(this.f37902e);
        Iterator it = this.f37900c.values().iterator();
        while (it.hasNext()) {
            zzmu zzmu = (zzmu) it.next();
            if (zzmu.mo47854k(zzkp)) {
                it.remove();
                if (zzmu.f37893e) {
                    boolean equals = zzmu.f37889a.equals(this.f37904g);
                    boolean z = false;
                    if (i == 0 && equals && zzmu.f37894f) {
                        z = true;
                    }
                    if (equals) {
                        this.f37904g = null;
                    }
                    this.f37902e.mo47863b(zzkp, zzmu.f37889a, z);
                }
            }
        }
        m54255m(zzkp);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r10.f37763d.f27572d < com.google.android.gms.internal.ads.zzmu.m54239b(r0)) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo47862g(com.google.android.gms.internal.ads.zzkp r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzmy r0 = r9.f37902e     // Catch:{ all -> 0x00cb }
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcn r0 = r10.f37761b     // Catch:{ all -> 0x00cb }
            boolean r0 = r0.mo44135o()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            java.util.HashMap r0 = r9.f37900c     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.f37904g     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzmu r0 = (com.google.android.gms.internal.ads.zzmu) r0     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzsi r1 = r10.f37763d     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            long r1 = r0.f37891c     // Catch:{ all -> 0x00cb }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0033
            int r0 = r0.f37890b     // Catch:{ all -> 0x00cb }
            int r1 = r10.f37762c     // Catch:{ all -> 0x00cb }
            if (r0 != r1) goto L_0x003f
            goto L_0x0041
        L_0x0033:
            com.google.android.gms.internal.ads.zzsi r1 = r10.f37763d     // Catch:{ all -> 0x00cb }
            long r1 = r1.f27572d     // Catch:{ all -> 0x00cb }
            long r3 = r0.f37891c     // Catch:{ all -> 0x00cb }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
        L_0x003f:
            monitor-exit(r9)
            return
        L_0x0041:
            int r0 = r10.f37762c     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzsi r1 = r10.f37763d     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzmu r0 = r9.m54253k(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r9.f37904g     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = r0.f37889a     // Catch:{ all -> 0x00cb }
            r9.f37904g = r1     // Catch:{ all -> 0x00cb }
        L_0x0053:
            com.google.android.gms.internal.ads.zzsi r1 = r10.f37763d     // Catch:{ all -> 0x00cb }
            r2 = 1
            if (r1 == 0) goto L_0x009d
            boolean r3 = r1.mo42817b()     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.zzsi r3 = new com.google.android.gms.internal.ads.zzsi     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r1.f27569a     // Catch:{ all -> 0x00cb }
            long r5 = r1.f27572d     // Catch:{ all -> 0x00cb }
            int r1 = r1.f27570b     // Catch:{ all -> 0x00cb }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00cb }
            int r1 = r10.f37762c     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzmu r1 = r9.m54253k(r1, r3)     // Catch:{ all -> 0x00cb }
            boolean r3 = r1.f37893e     // Catch:{ all -> 0x00cb }
            if (r3 != 0) goto L_0x009d
            r1.f37893e = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcn r3 = r10.f37761b     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzsi r4 = r10.f37763d     // Catch:{ all -> 0x00cb }
            java.lang.Object r4 = r4.f27569a     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzck r5 = r9.f37899b     // Catch:{ all -> 0x00cb }
            r3.mo44134n(r4, r5)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzck r3 = r9.f37899b     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzsi r4 = r10.f37763d     // Catch:{ all -> 0x00cb }
            int r4 = r4.f27570b     // Catch:{ all -> 0x00cb }
            r3.mo43855h(r4)     // Catch:{ all -> 0x00cb }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzen.m49171j0(r3)     // Catch:{ all -> 0x00cb }
            long r7 = com.google.android.gms.internal.ads.zzen.m49171j0(r3)     // Catch:{ all -> 0x00cb }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r1.f37889a     // Catch:{ all -> 0x00cb }
        L_0x009d:
            boolean r1 = r0.f37893e     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00a9
            r0.f37893e = true     // Catch:{ all -> 0x00cb }
            java.lang.String unused = r0.f37889a     // Catch:{ all -> 0x00cb }
        L_0x00a9:
            java.lang.String r1 = r0.f37889a     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = r9.f37904g     // Catch:{ all -> 0x00cb }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r0.f37894f     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x00c9
            r0.f37894f = true     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.ads.zzmy r1 = r9.f37902e     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.f37889a     // Catch:{ all -> 0x00cb }
            r1.mo47864c(r10, r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r9)
            return
        L_0x00c9:
            monitor-exit(r9)
            return
        L_0x00cb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmv.mo47862g(com.google.android.gms.internal.ads.zzkp):void");
    }

    public zzmv(zzftn zzftn) {
        this.f37901d = zzftn;
        this.f37898a = new zzcm();
        this.f37899b = new zzck();
        this.f37900c = new HashMap();
        this.f37903f = zzcn.f29060a;
    }
}
