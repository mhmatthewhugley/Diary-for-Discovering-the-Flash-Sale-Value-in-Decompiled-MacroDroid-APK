package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgte implements Iterator {

    /* renamed from: a */
    private final ArrayDeque f37260a;

    /* renamed from: c */
    private zzgpr f37261c;

    /* synthetic */ zzgte(zzgpw zzgpw, zzgtd zzgtd) {
        if (zzgpw instanceof zzgtg) {
            zzgtg zzgtg = (zzgtg) zzgpw;
            ArrayDeque arrayDeque = new ArrayDeque(zzgtg.mo47086p());
            this.f37260a = arrayDeque;
            arrayDeque.push(zzgtg);
            this.f37261c = m53228b(zzgtg.zzd);
            return;
        }
        this.f37260a = null;
        this.f37261c = (zzgpr) zzgpw;
    }

    /* renamed from: b */
    private final zzgpr m53228b(zzgpw zzgpw) {
        while (zzgpw instanceof zzgtg) {
            zzgtg zzgtg = (zzgtg) zzgpw;
            this.f37260a.push(zzgtg);
            zzgpw = zzgtg.zzd;
        }
        return (zzgpr) zzgpw;
    }

    /* renamed from: a */
    public final zzgpr next() {
        zzgpr zzgpr;
        zzgpr zzgpr2 = this.f37261c;
        if (zzgpr2 != null) {
            do {
                ArrayDeque arrayDeque = this.f37260a;
                zzgpr = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f37261c = zzgpr;
                } else {
                    zzgpr = m53228b(((zzgtg) this.f37260a.pop()).zze);
                }
            } while (zzgpr.mo47107h());
            this.f37261c = zzgpr;
            return zzgpr2;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f37261c != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
