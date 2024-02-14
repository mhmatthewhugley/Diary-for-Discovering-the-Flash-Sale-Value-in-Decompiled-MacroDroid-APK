package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.Nullable;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqf {
    @Nullable

    /* renamed from: a */
    private static zzqe f44454a;

    /* renamed from: a */
    public static synchronized zzps m62199a(zzpl zzpl) {
        zzps zzps;
        synchronized (zzqf.class) {
            if (f44454a == null) {
                f44454a = new zzqe((zzqd) null);
            }
            zzps = (zzps) f44454a.mo64548b(zzpl);
        }
        return zzps;
    }

    /* renamed from: b */
    public static synchronized zzps m62200b(String str) {
        zzps a;
        synchronized (zzqf.class) {
            a = m62199a(zzpl.m62154d("translate").mo52405c());
        }
        return a;
    }
}
