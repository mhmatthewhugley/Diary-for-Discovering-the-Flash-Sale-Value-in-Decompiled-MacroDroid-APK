package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbz {

    /* renamed from: a */
    private long f2235a;

    /* renamed from: b */
    private long f2236b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f2237c = new Object();

    public zzbz(long j) {
        this.f2235a = j;
    }

    /* renamed from: a */
    public final void mo20336a(long j) {
        synchronized (this.f2237c) {
            this.f2235a = j;
        }
    }

    /* renamed from: b */
    public final boolean mo20337b() {
        synchronized (this.f2237c) {
            long c = zzt.m2889b().mo21952c();
            if (this.f2236b + this.f2235a > c) {
                return false;
            }
            this.f2236b = c;
            return true;
        }
    }
}
