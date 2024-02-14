package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgtc {

    /* renamed from: a */
    private final ArrayDeque f37259a = new ArrayDeque();

    private zzgtc() {
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ zzgpw m53225a(zzgtc zzgtc, zzgpw zzgpw, zzgpw zzgpw2) {
        zzgtc.m53226b(zzgpw);
        zzgtc.m53226b(zzgpw2);
        zzgpw zzgpw3 = (zzgpw) zzgtc.f37259a.pop();
        while (!zzgtc.f37259a.isEmpty()) {
            zzgpw3 = new zzgtg((zzgpw) zzgtc.f37259a.pop(), zzgpw3);
        }
        return zzgpw3;
    }

    /* renamed from: b */
    private final void m53226b(zzgpw zzgpw) {
        if (zzgpw.mo47087q()) {
            int c = m53227c(zzgpw.mo47083m());
            int d0 = zzgtg.m53233d0(c + 1);
            if (this.f37259a.isEmpty() || ((zzgpw) this.f37259a.peek()).mo47083m() >= d0) {
                this.f37259a.push(zzgpw);
                return;
            }
            int d02 = zzgtg.m53233d0(c);
            zzgpw zzgpw2 = (zzgpw) this.f37259a.pop();
            while (!this.f37259a.isEmpty() && ((zzgpw) this.f37259a.peek()).mo47083m() < d02) {
                zzgpw2 = new zzgtg((zzgpw) this.f37259a.pop(), zzgpw2);
            }
            zzgtg zzgtg = new zzgtg(zzgpw2, zzgpw);
            while (!this.f37259a.isEmpty() && ((zzgpw) this.f37259a.peek()).mo47083m() < zzgtg.m53233d0(m53227c(zzgtg.mo47083m()) + 1)) {
                zzgtg = new zzgtg((zzgpw) this.f37259a.pop(), zzgtg);
            }
            this.f37259a.push(zzgtg);
        } else if (zzgpw instanceof zzgtg) {
            zzgtg zzgtg2 = (zzgtg) zzgpw;
            m53226b(zzgtg2.zzd);
            m53226b(zzgtg2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgpw.getClass())));
        }
    }

    /* renamed from: c */
    private static final int m53227c(int i) {
        int binarySearch = Arrays.binarySearch(zzgtg.f37262f, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgtc(zzgtb zzgtb) {
    }
}
