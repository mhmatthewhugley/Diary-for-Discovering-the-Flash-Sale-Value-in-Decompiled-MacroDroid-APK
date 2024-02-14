package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzczy implements zzo {

    /* renamed from: a */
    private final zzdeh f31929a;

    /* renamed from: c */
    private final AtomicBoolean f31930c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f31931d = new AtomicBoolean(false);

    public zzczy(zzdeh zzdeh) {
        this.f31929a = zzdeh;
    }

    /* renamed from: c */
    private final void m47099c() {
        if (!this.f31931d.get()) {
            this.f31931d.set(true);
            this.f31929a.zza();
        }
    }

    /* renamed from: Z8 */
    public final void mo20216Z8() {
    }

    /* renamed from: a */
    public final boolean mo44516a() {
        return this.f31930c.get();
    }

    /* renamed from: b */
    public final void mo20217b() {
    }

    /* renamed from: sb */
    public final void mo20218sb() {
        m47099c();
    }

    /* renamed from: t1 */
    public final void mo20219t1() {
    }

    /* renamed from: y */
    public final void mo20220y(int i) {
        this.f31930c.set(true);
        m47099c();
    }

    public final void zzb() {
        this.f31929a.mo44589a();
    }
}
