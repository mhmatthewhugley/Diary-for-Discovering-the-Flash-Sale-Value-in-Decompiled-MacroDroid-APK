package com.google.android.gms.internal.mlkit_common;

import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzjd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzjp f42921a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Long f42922b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zziy f42923c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Long f42924d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzje f42925e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Long f42926f;

    /* renamed from: b */
    public final zzjd mo51897b(Long l) {
        this.f42926f = l;
        return this;
    }

    /* renamed from: c */
    public final zzjd mo51898c(zzje zzje) {
        this.f42925e = zzje;
        return this;
    }

    /* renamed from: d */
    public final zzjd mo51899d(zziy zziy) {
        this.f42923c = zziy;
        return this;
    }

    /* renamed from: e */
    public final zzjd mo51900e(Long l) {
        this.f42924d = Long.valueOf(l.longValue() & LocationRequestCompat.PASSIVE_INTERVAL);
        return this;
    }

    /* renamed from: f */
    public final zzjd mo51901f(zzjp zzjp) {
        this.f42921a = zzjp;
        return this;
    }

    /* renamed from: g */
    public final zzjd mo51902g(Long l) {
        this.f42922b = Long.valueOf(l.longValue() & LocationRequestCompat.PASSIVE_INTERVAL);
        return this;
    }

    /* renamed from: i */
    public final zzjg mo51903i() {
        return new zzjg(this, (zzjf) null);
    }
}
