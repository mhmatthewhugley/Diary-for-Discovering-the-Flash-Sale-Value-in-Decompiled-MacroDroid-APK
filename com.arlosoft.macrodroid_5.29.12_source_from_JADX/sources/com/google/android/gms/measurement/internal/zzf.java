package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
abstract class zzf extends zze {

    /* renamed from: b */
    private boolean f46764b;

    zzf(zzfr zzfr) {
        super(zzfr);
        this.f46899a.mo55205f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo55140f() {
        if (!mo55143k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: g */
    public final void mo55141g() {
        if (this.f46764b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo55058l()) {
            this.f46899a.mo55203d();
            this.f46764b = true;
        }
    }

    /* renamed from: i */
    public final void mo55142i() {
        if (!this.f46764b) {
            mo55057j();
            this.f46899a.mo55203d();
            this.f46764b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: j */
    public void mo55057j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo55143k() {
        return this.f46764b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo55058l();
}
