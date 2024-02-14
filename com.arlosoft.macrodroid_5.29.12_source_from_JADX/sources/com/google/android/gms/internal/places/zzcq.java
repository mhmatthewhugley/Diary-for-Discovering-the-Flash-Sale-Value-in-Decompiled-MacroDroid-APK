package com.google.android.gms.internal.places;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzcq<T> implements zzda<T> {

    /* renamed from: a */
    private final zzck f45342a;

    /* renamed from: b */
    private final zzds<?, ?> f45343b;

    /* renamed from: c */
    private final boolean f45344c;

    /* renamed from: d */
    private final zzar<?> f45345d;

    private zzcq(zzds<?, ?> zzds, zzar<?> zzar, zzck zzck) {
        this.f45343b = zzds;
        this.f45344c = zzar.mo53417g(zzck);
        this.f45345d = zzar;
        this.f45342a = zzck;
    }

    /* renamed from: i */
    static <T> zzcq<T> m63503i(zzds<?, ?> zzds, zzar<?> zzar, zzck zzck) {
        return new zzcq<>(zzds, zzar, zzck);
    }

    /* renamed from: a */
    public final void mo53535a(T t) {
        this.f45343b.mo53606d(t);
        this.f45345d.mo53416f(t);
    }

    /* renamed from: b */
    public final int mo53536b(T t) {
        int hashCode = this.f45343b.mo53613k(t).hashCode();
        return this.f45344c ? (hashCode * 53) + this.f45345d.mo53412b(t).hashCode() : hashCode;
    }

    /* renamed from: c */
    public final boolean mo53537c(T t, T t2) {
        if (!this.f45343b.mo53613k(t).equals(this.f45343b.mo53613k(t2))) {
            return false;
        }
        if (this.f45344c) {
            return this.f45345d.mo53412b(t).equals(this.f45345d.mo53412b(t2));
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.places.zzbc$zzf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53538d(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.places.zzr r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.places.zzbc r0 = (com.google.android.gms.internal.places.zzbc) r0
            com.google.android.gms.internal.places.zzdr r1 = r0.zzih
            com.google.android.gms.internal.places.zzdr r2 = com.google.android.gms.internal.places.zzdr.m63623i()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.places.zzdr r1 = com.google.android.gms.internal.places.zzdr.m63624j()
            r0.zzih = r1
        L_0x0011:
            com.google.android.gms.internal.places.zzbc$zzc r10 = (com.google.android.gms.internal.places.zzbc.zzc) r10
            r10.mo53466t()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r11, r12, r14)
            int r2 = r14.f45464a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.places.zzar<?> r12 = r9.f45345d
            com.google.android.gms.internal.places.zzap r0 = r14.f45467d
            com.google.android.gms.internal.places.zzck r3 = r9.f45342a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo53413c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.places.zzbc$zzf r0 = (com.google.android.gms.internal.places.zzbc.zzf) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.places.zzs.m63841b(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.places.zzcv.m63517a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.places.zzs.m63842c(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r11, r4, r14)
            int r5 = r14.f45464a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.places.zzs.m63856q(r11, r4, r14)
            java.lang.Object r2 = r14.f45466c
            com.google.android.gms.internal.places.zzw r2 = (com.google.android.gms.internal.places.zzw) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.places.zzcv.m63517a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r11, r4, r14)
            int r12 = r14.f45464a
            com.google.android.gms.internal.places.zzar<?> r0 = r9.f45345d
            com.google.android.gms.internal.places.zzap r5 = r14.f45467d
            com.google.android.gms.internal.places.zzck r6 = r9.f45342a
            java.lang.Object r0 = r0.mo53413c(r5, r6, r12)
            com.google.android.gms.internal.places.zzbc$zzf r0 = (com.google.android.gms.internal.places.zzbc.zzf) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.places.zzs.m63842c(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.mo53599f(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.places.zzbk r10 = com.google.android.gms.internal.places.zzbk.m63366e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzcq.mo53538d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.places.zzr):void");
    }

    /* renamed from: e */
    public final boolean mo53539e(T t) {
        return this.f45345d.mo53412b(t).mo53420c();
    }

    /* renamed from: f */
    public final int mo53540f(T t) {
        zzds<?, ?> zzds = this.f45343b;
        int l = zzds.mo53614l(zzds.mo53613k(t)) + 0;
        return this.f45344c ? l + this.f45345d.mo53412b(t).mo53425g() : l;
    }

    /* renamed from: g */
    public final void mo53541g(T t, zzel zzel) throws IOException {
        Iterator<Map.Entry<?, Object>> d = this.f45345d.mo53412b(t).mo53422d();
        while (d.hasNext()) {
            Map.Entry next = d.next();
            zzax zzax = (zzax) next.getKey();
            if (zzax.mo53435z() != zzem.MESSAGE || zzax.mo53429B() || zzax.mo53430F1()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzbn) {
                zzel.mo53374f(zzax.mo53433h(), ((zzbn) next).mo53481a().mo53487d());
            } else {
                zzel.mo53374f(zzax.mo53433h(), next.getValue());
            }
        }
        zzds<?, ?> zzds = this.f45343b;
        zzds.mo53607e(zzds.mo53613k(t), zzel);
    }

    /* renamed from: h */
    public final void mo53542h(T t, T t2) {
        zzdc.m63590h(this.f45343b, t, t2);
        if (this.f45344c) {
            zzdc.m63588f(this.f45345d, t, t2);
        }
    }

    public final T newInstance() {
        return this.f45342a.mo53448d().mo53458Q();
    }
}
