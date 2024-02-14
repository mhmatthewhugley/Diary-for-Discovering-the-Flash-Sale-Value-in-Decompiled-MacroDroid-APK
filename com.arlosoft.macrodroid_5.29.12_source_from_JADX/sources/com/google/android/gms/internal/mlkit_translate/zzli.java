package com.google.android.gms.internal.mlkit_translate;

import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzli {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzlu f44190a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Long f44191b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzld f44192c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzlj f44193d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Long f44194e;

    /* renamed from: b */
    public final zzli mo52264b(Long l) {
        this.f44194e = l;
        return this;
    }

    /* renamed from: c */
    public final zzli mo52265c(zzlj zzlj) {
        this.f44193d = zzlj;
        return this;
    }

    /* renamed from: d */
    public final zzli mo52266d(zzld zzld) {
        this.f44192c = zzld;
        return this;
    }

    /* renamed from: e */
    public final zzli mo52267e(zzlu zzlu) {
        this.f44190a = zzlu;
        return this;
    }

    /* renamed from: f */
    public final zzli mo52268f(Long l) {
        this.f44191b = Long.valueOf(l.longValue() & LocationRequestCompat.PASSIVE_INTERVAL);
        return this;
    }

    /* renamed from: h */
    public final zzll mo52269h() {
        return new zzll(this, (zzlk) null);
    }
}
