package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcln implements zzjh {

    /* renamed from: a */
    private final zzwi f28883a = new zzwi(true, 65536);

    /* renamed from: b */
    private long f28884b = 15000000;

    /* renamed from: c */
    private long f28885c = 30000000;

    /* renamed from: d */
    private long f28886d = 2500000;

    /* renamed from: e */
    private long f28887e = 5000000;

    /* renamed from: f */
    private int f28888f;

    /* renamed from: g */
    private boolean f28889g;

    zzcln() {
    }

    /* renamed from: a */
    public final void mo43930a() {
        mo43937h(true);
    }

    /* renamed from: b */
    public final boolean mo43931b(long j, float f, boolean z, long j2) {
        long j3 = z ? this.f28887e : this.f28886d;
        return j3 <= 0 || j >= j3;
    }

    /* renamed from: c */
    public final boolean mo43932c() {
        return false;
    }

    /* renamed from: d */
    public final void mo43933d() {
        mo43937h(true);
    }

    /* renamed from: e */
    public final boolean mo43934e(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.f28885c ? 0 : j2 < this.f28884b ? (char) 2 : 1;
        int a = this.f28883a.mo48338a();
        int i = this.f28888f;
        if (c != 2 && (c != 1 || !this.f28889g || a >= i)) {
            z = false;
        }
        this.f28889g = z;
        return z;
    }

    /* renamed from: f */
    public final void mo43935f(zzka[] zzkaArr, zzuh zzuh, zzvt[] zzvtArr) {
        int i = 0;
        this.f28888f = 0;
        while (true) {
            int length = zzkaArr.length;
            if (i < 2) {
                if (zzvtArr[i] != null) {
                    this.f28888f += zzkaArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                this.f28883a.mo48343f(this.f28888f);
                return;
            }
        }
    }

    /* renamed from: g */
    public final zzwi mo43936g() {
        return this.f28883a;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h */
    public final void mo43937h(boolean z) {
        this.f28888f = 0;
        this.f28889g = false;
        if (z) {
            this.f28883a.mo48342e();
        }
    }

    /* renamed from: i */
    public final synchronized void mo43938i(int i) {
        this.f28886d = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized void mo43939j(int i) {
        this.f28887e = ((long) i) * 1000;
    }

    /* renamed from: k */
    public final synchronized void mo43940k(int i) {
        this.f28885c = ((long) i) * 1000;
    }

    /* renamed from: l */
    public final synchronized void mo43941l(int i) {
        this.f28884b = ((long) i) * 1000;
    }

    public final long zza() {
        return 0;
    }

    public final void zzb() {
        mo43937h(false);
    }
}
