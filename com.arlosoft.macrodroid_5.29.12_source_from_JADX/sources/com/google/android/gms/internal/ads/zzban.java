package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzban implements zzbag {

    /* renamed from: a */
    private boolean f26413a;

    /* renamed from: b */
    private long f26414b;

    /* renamed from: c */
    private long f26415c;

    /* renamed from: d */
    private zzata f26416d = zzata.f25533d;

    /* renamed from: Q */
    public final zzata mo42049Q() {
        throw null;
    }

    /* renamed from: S */
    public final long mo42050S() {
        long j;
        long j2 = this.f26414b;
        if (!this.f26413a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f26415c;
        zzata zzata = this.f26416d;
        if (zzata.f25534a == 1.0f) {
            j = zzash.m42273a(elapsedRealtime);
        } else {
            j = zzata.mo41976a(elapsedRealtime);
        }
        return j2 + j;
    }

    /* renamed from: X */
    public final zzata mo42051X(zzata zzata) {
        if (this.f26413a) {
            mo42343a(mo42050S());
        }
        this.f26416d = zzata;
        return zzata;
    }

    /* renamed from: a */
    public final void mo42343a(long j) {
        this.f26414b = j;
        if (this.f26413a) {
            this.f26415c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo42344b() {
        if (!this.f26413a) {
            this.f26415c = SystemClock.elapsedRealtime();
            this.f26413a = true;
        }
    }

    /* renamed from: c */
    public final void mo42345c() {
        if (this.f26413a) {
            mo42343a(mo42050S());
            this.f26413a = false;
        }
    }

    /* renamed from: d */
    public final void mo42346d(zzbag zzbag) {
        mo42343a(zzbag.mo42050S());
        this.f26416d = zzbag.mo42049Q();
    }
}
