package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzet;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzz extends zzy {

    /* renamed from: g */
    private final zzet f47356g;

    /* renamed from: h */
    final /* synthetic */ zzaa f47357h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzz(zzaa zzaa, String str, int i, zzet zzet) {
        super(str, i);
        this.f47357h = zzaa;
        this.f47356g = zzet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo55632a() {
        return this.f47356g.mo50930B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo55633b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo55634c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55636k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.zzgm r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.zznz.m61044b()
            com.google.android.gms.measurement.internal.zzaa r0 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()
            java.lang.String r1 = r10.f47350a
            com.google.android.gms.measurement.internal.zzdt r2 = com.google.android.gms.measurement.internal.zzdu.f46592W
            boolean r0 = r0.mo54919A(r1, r2)
            com.google.android.gms.internal.measurement.zzet r1 = r10.f47356g
            boolean r1 = r1.mo50933I()
            com.google.android.gms.internal.measurement.zzet r2 = r10.f47356g
            boolean r2 = r2.mo50934J()
            com.google.android.gms.internal.measurement.zzet r3 = r10.f47356g
            boolean r3 = r3.mo50935K()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.zzaa r11 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r11 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r11 = r11.mo55221z()
            com.google.android.gms.measurement.internal.zzef r11 = r11.mo55102t()
            int r12 = r10.f47351b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.zzet r13 = r10.f47356g
            boolean r13 = r13.mo50936L()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzet r13 = r10.f47356g
            int r13 = r13.mo50930B()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo55093c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.zzet r6 = r10.f47356g
            com.google.android.gms.internal.measurement.zzem r6 = r6.mo50931C()
            boolean r7 = r6.mo50913I()
            boolean r8 = r13.mo51239S()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo50915K()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.zzaa r6 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55103u()
            com.google.android.gms.measurement.internal.zzaa r7 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r7 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r7 = r7.mo55187D()
            java.lang.String r8 = r13.mo51236H()
            java.lang.String r7 = r7.mo55089f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo55092b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo51234C()
            com.google.android.gms.internal.measurement.zzer r2 = r6.mo50910D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66202h(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66204j(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo51238R()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo50915K()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.zzaa r6 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55103u()
            com.google.android.gms.measurement.internal.zzaa r7 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r7 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r7 = r7.mo55187D()
            java.lang.String r8 = r13.mo51236H()
            java.lang.String r7 = r7.mo55089f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo55092b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo51233B()
            com.google.android.gms.internal.measurement.zzer r2 = r6.mo50910D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66201g(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66204j(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo51241U()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo50917M()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo50915K()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.zzaa r6 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55103u()
            com.google.android.gms.measurement.internal.zzaa r7 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r7 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r7 = r7.mo55187D()
            java.lang.String r8 = r13.mo51236H()
            java.lang.String r7 = r7.mo55089f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo55092b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo51237I()
            boolean r8 = com.google.android.gms.measurement.internal.zzkv.m66088N(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo51237I()
            com.google.android.gms.internal.measurement.zzer r6 = r6.mo50910D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66203i(r2, r6)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66204j(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.zzaa r6 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55103u()
            com.google.android.gms.measurement.internal.zzaa r7 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r7 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r7 = r7.mo55187D()
            java.lang.String r8 = r13.mo51236H()
            java.lang.String r7 = r7.mo55089f(r8)
            java.lang.String r8 = r13.mo51237I()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo55093c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo51237I()
            com.google.android.gms.internal.measurement.zzey r6 = r6.mo50911E()
            com.google.android.gms.measurement.internal.zzaa r8 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r8 = r8.f46899a
            com.google.android.gms.measurement.internal.zzeh r8 = r8.mo55221z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66200f(r2, r6, r8)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.zzy.m66204j(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.zzaa r6 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55103u()
            com.google.android.gms.measurement.internal.zzaa r7 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r7 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r7 = r7.mo55187D()
            java.lang.String r8 = r13.mo51236H()
            java.lang.String r7 = r7.mo55089f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo55092b(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.zzaa r6 = r10.f47357h
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55102t()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo55092b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f47352c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            com.google.android.gms.internal.measurement.zzet r14 = r10.f47356g
            boolean r14 = r14.mo50933I()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f47353d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo51240T()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo51235D()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.zzet r11 = r10.f47356g
            boolean r11 = r11.mo50933I()
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.zzet r11 = r10.f47356g
            boolean r11 = r11.mo50934J()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            com.google.android.gms.internal.measurement.zzet r11 = r10.f47356g
            boolean r11 = r11.mo50934J()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f47355f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f47354e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzz.mo55636k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzgm, boolean):boolean");
    }
}
