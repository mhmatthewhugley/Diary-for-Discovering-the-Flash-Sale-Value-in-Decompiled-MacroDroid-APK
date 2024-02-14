package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzajt implements Runnable {

    /* renamed from: a */
    private final zzakd f24855a;

    /* renamed from: c */
    private final zzakj f24856c;

    /* renamed from: d */
    private final Runnable f24857d;

    public zzajt(zzakd zzakd, zzakj zzakj, Runnable runnable) {
        this.f24855a = zzakd;
        this.f24856c = zzakj;
        this.f24857d = runnable;
    }

    public final void run() {
        this.f24855a.mo41580C();
        zzakj zzakj = this.f24856c;
        if (zzakj.mo41607c()) {
            this.f24855a.mo20328r(zzakj.f24898a);
        } else {
            this.f24855a.mo41592q(zzakj.f24900c);
        }
        if (this.f24856c.f24901d) {
            this.f24855a.mo41591o("intermediate-response");
        } else {
            this.f24855a.mo41593s("done");
        }
        Runnable runnable = this.f24857d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
