package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzkg implements zzji {

    /* renamed from: a */
    private final zzde f37743a;

    /* renamed from: c */
    private boolean f37744c;

    /* renamed from: d */
    private long f37745d;

    /* renamed from: f */
    private long f37746f;

    /* renamed from: g */
    private zzby f37747g = zzby.f27965d;

    public zzkg(zzde zzde) {
        this.f37743a = zzde;
    }

    /* renamed from: a */
    public final zzby mo47609a() {
        return this.f37747g;
    }

    /* renamed from: b */
    public final void mo47797b(long j) {
        this.f37745d = j;
        if (this.f37744c) {
            this.f37746f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public final void mo47798c() {
        if (!this.f37744c) {
            this.f37746f = SystemClock.elapsedRealtime();
            this.f37744c = true;
        }
    }

    /* renamed from: d */
    public final void mo47799d() {
        if (this.f37744c) {
            mo47797b(zza());
            this.f37744c = false;
        }
    }

    /* renamed from: f */
    public final void mo47614f(zzby zzby) {
        if (this.f37744c) {
            mo47797b(zza());
        }
        this.f37747g = zzby;
    }

    public final long zza() {
        long j;
        long j2 = this.f37745d;
        if (!this.f37744c) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37746f;
        zzby zzby = this.f37747g;
        if (zzby.f27967a == 1.0f) {
            j = zzen.m49163f0(elapsedRealtime);
        } else {
            j = zzby.mo43204a(elapsedRealtime);
        }
        return j2 + j;
    }
}
