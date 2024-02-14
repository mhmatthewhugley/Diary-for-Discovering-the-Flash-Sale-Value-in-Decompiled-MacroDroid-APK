package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f47026a;

    /* renamed from: c */
    final /* synthetic */ Uri f47027c;

    /* renamed from: d */
    final /* synthetic */ String f47028d;

    /* renamed from: f */
    final /* synthetic */ String f47029f;

    /* renamed from: g */
    final /* synthetic */ zzhw f47030g;

    zzhu(zzhw zzhw, boolean z, Uri uri, String str, String str2) {
        this.f47030g = zzhw;
        this.f47026a = z;
        this.f47027c = uri;
        this.f47028d = str;
        this.f47029f = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[SYNTHETIC, Splitter:B:27:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ RuntimeException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[Catch:{ RuntimeException -> 0x0160 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.measurement.internal.zzhw r2 = r1.f47030g
            boolean r0 = r1.f47026a
            android.net.Uri r3 = r1.f47027c
            java.lang.String r4 = r1.f47028d
            java.lang.String r5 = r1.f47029f
            com.google.android.gms.measurement.internal.zzhx r6 = r2.f47031a
            r6.mo55073e()
            com.google.android.gms.measurement.internal.zzhx r6 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzlb r6 = r6.mo55196N()     // Catch:{ RuntimeException -> 0x0160 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0160 }
            java.lang.String r8 = "Activity created with data 'referrer' without required params"
            java.lang.String r9 = "utm_medium"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_source"
            java.lang.String r12 = "utm_campaign"
            r13 = 0
            java.lang.String r14 = "gclid"
            if (r7 == 0) goto L_0x002e
        L_0x002c:
            r6 = r13
            goto L_0x0081
        L_0x002e:
            boolean r7 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            boolean r7 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            boolean r7 = r5.contains(r11)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            boolean r7 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = "utm_id"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = "dclid"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = "srsltid"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0160 }
            if (r7 != 0) goto L_0x006c
            com.google.android.gms.measurement.internal.zzfr r6 = r6.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55097o()     // Catch:{ RuntimeException -> 0x0160 }
            r6.mo55091a(r8)     // Catch:{ RuntimeException -> 0x0160 }
            goto L_0x002c
        L_0x006c:
            java.lang.String r7 = "https://google.com/search?"
            java.lang.String r7 = r7.concat(r5)     // Catch:{ RuntimeException -> 0x0160 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ RuntimeException -> 0x0160 }
            android.os.Bundle r6 = r6.mo55611t0(r7)     // Catch:{ RuntimeException -> 0x0160 }
            if (r6 == 0) goto L_0x0081
            java.lang.String r7 = "referrer"
            r6.putString(r10, r7)     // Catch:{ RuntimeException -> 0x0160 }
        L_0x0081:
            java.lang.String r7 = "_cmp"
            r15 = 1
            if (r0 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzlb r0 = r0.mo55196N()     // Catch:{ RuntimeException -> 0x0160 }
            android.os.Bundle r0 = r0.mo55611t0(r3)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r3 = "intent"
            r0.putString(r10, r3)     // Catch:{ RuntimeException -> 0x0160 }
            boolean r3 = r0.containsKey(r14)     // Catch:{ RuntimeException -> 0x0160 }
            if (r3 != 0) goto L_0x00bb
            if (r6 == 0) goto L_0x00bb
            boolean r3 = r6.containsKey(r14)     // Catch:{ RuntimeException -> 0x0160 }
            if (r3 == 0) goto L_0x00bb
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ RuntimeException -> 0x0160 }
            r10 = 0
            java.lang.String r16 = r6.getString(r14)     // Catch:{ RuntimeException -> 0x0160 }
            r3[r10] = r16     // Catch:{ RuntimeException -> 0x0160 }
            java.lang.String r10 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.String r3 = java.lang.String.format(r15, r3)     // Catch:{ RuntimeException -> 0x0160 }
            r0.putString(r10, r3)     // Catch:{ RuntimeException -> 0x0160 }
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzhx r3 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            r3.mo55375s(r4, r7, r0)     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzhx r3 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzs r3 = r3.f47043n     // Catch:{ RuntimeException -> 0x0160 }
            r3.mo55624a(r4, r0)     // Catch:{ RuntimeException -> 0x0160 }
        L_0x00c7:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 == 0) goto L_0x00cf
            goto L_0x014f
        L_0x00cf:
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()     // Catch:{ RuntimeException -> 0x0160 }
            java.lang.String r3 = "Activity created with referrer"
            r0.mo55092b(r3, r5)     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzdt r3 = com.google.android.gms.measurement.internal.zzdu.f46597a0     // Catch:{ RuntimeException -> 0x0160 }
            boolean r0 = r0.mo54919A(r13, r3)     // Catch:{ RuntimeException -> 0x0160 }
            java.lang.String r3 = "_ldl"
            java.lang.String r10 = "auto"
            if (r0 == 0) goto L_0x011b
            if (r6 == 0) goto L_0x0103
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            r0.mo55375s(r4, r7, r6)     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzs r0 = r0.f47043n     // Catch:{ RuntimeException -> 0x0160 }
            r0.mo55624a(r4, r6)     // Catch:{ RuntimeException -> 0x0160 }
            goto L_0x0114
        L_0x0103:
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()     // Catch:{ RuntimeException -> 0x0160 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo55092b(r4, r5)     // Catch:{ RuntimeException -> 0x0160 }
        L_0x0114:
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            r4 = 1
            r0.mo55353K(r10, r3, r13, r4)     // Catch:{ RuntimeException -> 0x0160 }
            return
        L_0x011b:
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 == 0) goto L_0x0150
            boolean r0 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 != 0) goto L_0x0143
            boolean r0 = r5.contains(r11)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 != 0) goto L_0x0143
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 == 0) goto L_0x0150
        L_0x0143:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0160 }
            if (r0 != 0) goto L_0x014f
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            r4 = 1
            r0.mo55353K(r10, r3, r5, r4)     // Catch:{ RuntimeException -> 0x0160 }
        L_0x014f:
            return
        L_0x0150:
            com.google.android.gms.measurement.internal.zzhx r0 = r2.f47031a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ RuntimeException -> 0x0160 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()     // Catch:{ RuntimeException -> 0x0160 }
            r0.mo55091a(r8)     // Catch:{ RuntimeException -> 0x0160 }
            return
        L_0x0160:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhx r2 = r2.f47031a
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo55092b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhu.run():void");
    }
}
