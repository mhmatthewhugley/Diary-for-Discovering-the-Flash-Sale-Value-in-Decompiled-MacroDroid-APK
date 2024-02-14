package com.google.android.gms.internal.mlkit_translate;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzox {

    /* renamed from: a */
    private long f44378a;

    /* renamed from: b */
    private long f44379b;

    /* renamed from: c */
    private final zzs f44380c = new zzs();

    /* renamed from: d */
    private final zzs f44381d = new zzs();

    /* renamed from: e */
    private final zzs f44382e = new zzs();

    /* renamed from: f */
    private int f44383f;

    /* renamed from: g */
    boolean f44384g;

    @VisibleForTesting
    /* renamed from: a */
    public final zznj mo52385a() {
        boolean z = true;
        zzj.m61893f(this.f44378a != 0);
        if (this.f44379b == 0) {
            z = false;
        }
        zzj.m61893f(z);
        long j = this.f44379b;
        long j2 = this.f44378a;
        zznj zznj = new zznj();
        zznj.mo52327d(Long.valueOf(j - j2));
        zznj.mo52331h(this.f44380c.mo52482e());
        zznj.mo52330g(this.f44381d.mo52482e());
        zznj.mo52328e(this.f44382e.mo52482e());
        int i = this.f44383f;
        if (i != 0) {
            zznj.mo52329f(Integer.valueOf(i));
        }
        return zznj;
    }

    /* renamed from: b */
    public final void mo52386b(zznk zznk) {
        this.f44382e.mo52481d(zznk);
    }

    /* renamed from: c */
    public final void mo52387c(zznk zznk) {
        this.f44381d.mo52481d(zznk);
    }

    /* renamed from: d */
    public final void mo52388d(zznk zznk) {
        if (this.f44384g) {
            this.f44381d.mo52481d(zznk);
        } else {
            this.f44380c.mo52481d(zznk);
        }
    }

    /* renamed from: e */
    public final void mo52389e() {
        this.f44379b = SystemClock.elapsedRealtime();
    }

    /* renamed from: f */
    public final void mo52390f(int i) {
        this.f44383f = i;
    }

    /* renamed from: g */
    public final void mo52391g() {
        this.f44378a = SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    public final void mo52392h() {
        this.f44384g = true;
    }
}
