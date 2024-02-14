package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzof;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzka {
    @VisibleForTesting

    /* renamed from: a */
    protected long f47212a;
    @VisibleForTesting

    /* renamed from: b */
    protected long f47213b;

    /* renamed from: c */
    private final zzap f47214c;

    /* renamed from: d */
    final /* synthetic */ zzkc f47215d;

    public zzka(zzkc zzkc) {
        this.f47215d = zzkc;
        this.f47214c = new zzjz(this, zzkc.f46899a);
        long c = zzkc.f46899a.mo55201a().mo21952c();
        this.f47212a = c;
        this.f47213b = c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo55491a() {
        this.f47214c.mo54996b();
        this.f47212a = 0;
        this.f47213b = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo55492b(long j) {
        this.f47214c.mo54996b();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final void mo55493c(long j) {
        this.f47215d.mo55073e();
        this.f47214c.mo54996b();
        this.f47212a = j;
        this.f47213b = j;
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo55494d(boolean z, boolean z2, long j) {
        this.f47215d.mo55073e();
        this.f47215d.mo55140f();
        zzof.m61057b();
        if (!this.f47215d.f46899a.mo55219x().mo54919A((String) null, zzdu.f46607f0)) {
            this.f47215d.f46899a.mo55189F().f46748o.mo55121b(this.f47215d.f46899a.mo55201a().mo21950a());
        } else if (this.f47215d.f46899a.mo55212m()) {
            this.f47215d.f46899a.mo55189F().f46748o.mo55121b(this.f47215d.f46899a.mo55201a().mo21950a());
        }
        long j2 = j - this.f47212a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f47213b;
                this.f47213b = j;
            }
            this.f47215d.f46899a.mo55221z().mo55102t().mo55092b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            zzlb.m66134w(this.f47215d.f46899a.mo55193K().mo55410q(!this.f47215d.f46899a.mo55219x().mo54921D()), bundle, true);
            if (!z2) {
                this.f47215d.f46899a.mo55191I().mo55375s("auto", "_e", bundle);
            }
            this.f47212a = j;
            this.f47214c.mo54996b();
            this.f47214c.mo54998d(3600000);
            return true;
        }
        this.f47215d.f46899a.mo55221z().mo55102t().mo55092b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
