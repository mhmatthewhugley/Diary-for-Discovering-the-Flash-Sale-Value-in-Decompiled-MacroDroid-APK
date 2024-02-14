package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzajo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzakd f24843a;

    /* renamed from: c */
    final /* synthetic */ zzajp f24844c;

    zzajo(zzajp zzajp, zzakd zzakd) {
        this.f24844c = zzajp;
        this.f24843a = zzakd;
    }

    public final void run() {
        try {
            this.f24844c.f24847c.put(this.f24843a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
