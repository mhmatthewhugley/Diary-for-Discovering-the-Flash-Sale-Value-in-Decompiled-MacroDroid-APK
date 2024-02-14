package com.google.mlkit.p229nl.translate.internal;

/* renamed from: com.google.mlkit.nl.translate.internal.zzz */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public double f56549a;

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m79275b(zzz zzz) {
        double max = Math.max(zzz.f56549a, 0.5d);
        double d = max + max;
        zzz.f56549a = d;
        if (d > 60.0d) {
            zzz.f56549a = 60.0d;
            d = 60.0d;
        }
        zzz.f56549a = d + (Math.random() * zzz.f56549a);
    }
}
