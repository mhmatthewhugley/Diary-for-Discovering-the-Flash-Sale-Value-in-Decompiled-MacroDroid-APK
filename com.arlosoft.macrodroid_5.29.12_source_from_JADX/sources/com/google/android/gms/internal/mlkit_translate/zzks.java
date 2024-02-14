package com.google.android.gms.internal.mlkit_translate;

import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzks {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Long f43927a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzld f43928b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Boolean f43929c;

    /* renamed from: a */
    public final zzks mo52235a(Long l) {
        this.f43927a = Long.valueOf(l.longValue() & LocationRequestCompat.PASSIVE_INTERVAL);
        return this;
    }

    /* renamed from: b */
    public final zzks mo52236b(zzld zzld) {
        this.f43928b = zzld;
        return this;
    }

    /* renamed from: c */
    public final zzks mo52237c(Boolean bool) {
        this.f43929c = bool;
        return this;
    }

    /* renamed from: d */
    public final zzku mo52238d() {
        return new zzku(this, (zzkt) null);
    }
}
