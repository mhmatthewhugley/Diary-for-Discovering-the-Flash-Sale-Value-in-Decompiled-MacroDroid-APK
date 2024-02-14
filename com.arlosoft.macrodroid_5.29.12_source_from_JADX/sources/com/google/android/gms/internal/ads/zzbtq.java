package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbtq extends zzcho {

    /* renamed from: c */
    private final Object f27755c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzbtv f27756d;

    /* renamed from: e */
    private boolean f27757e;

    public zzbtq(zzbtv zzbtv) {
        this.f27756d = zzbtv;
    }

    /* renamed from: g */
    public final void mo42983g() {
        synchronized (this.f27755c) {
            if (!this.f27757e) {
                this.f27757e = true;
                mo43584e(new zzbtn(this), new zzchk());
                mo43584e(new zzbto(this), new zzbtp(this));
            }
        }
    }
}
