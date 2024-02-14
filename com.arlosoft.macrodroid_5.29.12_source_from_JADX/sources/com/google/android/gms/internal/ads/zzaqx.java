package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqx implements Callable {

    /* renamed from: a */
    private final zzaqe f25355a;

    /* renamed from: c */
    private final zzamk f25356c;

    public zzaqx(zzaqe zzaqe, zzamk zzamk) {
        this.f25355a = zzaqe;
        this.f25356c = zzamk;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f25355a.mo41815l() != null) {
            this.f25355a.mo41815l().get();
        }
        zzana c = this.f25355a.mo41807c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.f25356c) {
                zzamk zzamk = this.f25356c;
                byte[] p = c.mo47050p();
                zzamk.mo47340g(p, 0, p.length, zzgqq.m52900a());
            }
            return null;
        } catch (zzgrq | NullPointerException unused) {
            return null;
        }
    }
}
