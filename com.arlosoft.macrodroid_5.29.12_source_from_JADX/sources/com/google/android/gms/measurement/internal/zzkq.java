package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzkq {

    /* renamed from: a */
    zzgd f47241a;

    /* renamed from: b */
    List f47242b;

    /* renamed from: c */
    List f47243c;

    /* renamed from: d */
    long f47244d;

    /* renamed from: e */
    final /* synthetic */ zzkt f47245e;

    /* synthetic */ zzkq(zzkt zzkt, zzkp zzkp) {
        this.f47245e = zzkt;
    }

    /* renamed from: b */
    private static final long m66019b(zzft zzft) {
        return ((zzft.mo51022E() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo55509a(long j, zzft zzft) {
        Preconditions.m4488k(zzft);
        if (this.f47243c == null) {
            this.f47243c = new ArrayList();
        }
        if (this.f47242b == null) {
            this.f47242b = new ArrayList();
        }
        if (!this.f47243c.isEmpty() && m66019b((zzft) this.f47243c.get(0)) != m66019b(zzft)) {
            return false;
        }
        long d = this.f47244d + ((long) zzft.mo51448d());
        this.f47245e.mo55517U();
        if (d >= ((long) Math.max(0, ((Integer) zzdu.f46614j.mo55037a((Object) null)).intValue()))) {
            return false;
        }
        this.f47244d = d;
        this.f47243c.add(zzft);
        this.f47242b.add(Long.valueOf(j));
        int size = this.f47243c.size();
        this.f47245e.mo55517U();
        if (size >= Math.max(1, ((Integer) zzdu.f46616k.mo55037a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
