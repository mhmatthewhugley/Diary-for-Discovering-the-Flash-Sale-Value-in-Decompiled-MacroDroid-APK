package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
abstract class zzkh extends zzkg {

    /* renamed from: c */
    private boolean f47228c;

    zzkh(zzkt zzkt) {
        super(zzkt);
        this.f47227b.mo55544p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo55503f() {
        if (!mo55505i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: g */
    public final void mo55504g() {
        if (!this.f47228c) {
            mo54913j();
            this.f47227b.mo55538k();
            this.f47228c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo55505i() {
        return this.f47228c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo54913j();
}
