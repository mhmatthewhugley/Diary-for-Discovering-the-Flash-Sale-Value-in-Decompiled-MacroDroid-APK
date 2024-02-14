package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
abstract class zzgl extends zzgk {

    /* renamed from: b */
    private boolean f46900b;

    zzgl(zzfr zzfr) {
        super(zzfr);
        this.f46899a.mo55205f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo55126f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo55000g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo55243i() {
        if (!mo55246l()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo55244j() {
        if (this.f46900b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo55000g()) {
            this.f46899a.mo55203d();
            this.f46900b = true;
        }
    }

    /* renamed from: k */
    public final void mo55245k() {
        if (!this.f46900b) {
            mo55126f();
            this.f46899a.mo55203d();
            this.f46900b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo55246l() {
        return this.f46900b;
    }
}
