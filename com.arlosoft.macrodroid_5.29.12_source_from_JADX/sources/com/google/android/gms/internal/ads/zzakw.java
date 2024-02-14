package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzakw {

    /* renamed from: a */
    long f24923a;

    /* renamed from: b */
    final String f24924b;

    /* renamed from: c */
    final String f24925c;

    /* renamed from: d */
    final long f24926d;

    /* renamed from: e */
    final long f24927e;

    /* renamed from: f */
    final long f24928f;

    /* renamed from: g */
    final long f24929g;

    /* renamed from: h */
    final List f24930h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzakw(java.lang.String r14, com.google.android.gms.internal.ads.zzajm r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f24836b
            long r3 = r15.f24837c
            long r5 = r15.f24838d
            long r7 = r15.f24839e
            long r9 = r15.f24840f
            java.util.List r0 = r15.f24842h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map r15 = r15.f24841g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzajv r11 = new com.google.android.gms.internal.ads.zzajv
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.<init>(java.lang.String, com.google.android.gms.internal.ads.zzajm):void");
    }

    /* renamed from: a */
    static zzakw m41672a(zzakx zzakx) throws IOException {
        List list;
        if (zzakz.m41674a(zzakx) == 538247942) {
            String d = zzakz.m41676d(zzakx);
            String d2 = zzakz.m41676d(zzakx);
            long b = zzakz.m41675b(zzakx);
            long b2 = zzakz.m41675b(zzakx);
            long b3 = zzakz.m41675b(zzakx);
            long b4 = zzakz.m41675b(zzakx);
            int a = zzakz.m41674a(zzakx);
            if (a >= 0) {
                if (a == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new ArrayList();
                }
                List list2 = list;
                for (int i = 0; i < a; i++) {
                    list2.add(new zzajv(zzakz.m41676d(zzakx).intern(), zzakz.m41676d(zzakx).intern()));
                }
                return new zzakw(d, d2, b, b2, b3, b4, list2);
            }
            throw new IOException("readHeaderList size=" + a);
        }
        throw new IOException();
    }

    private zzakw(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f24924b = str;
        this.f24925c = true == "".equals(str2) ? null : str2;
        this.f24926d = j;
        this.f24927e = j2;
        this.f24928f = j3;
        this.f24929g = j4;
        this.f24930h = list;
    }
}
