package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbch implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzbci f26581a;

    zzbch(zzbci zzbci) {
        this.f26581a = zzbci;
    }

    public final void run() {
        synchronized (this.f26581a.f26585d) {
            zzbci zzbci = this.f26581a;
            if (!zzbci.f26586f || !zzbci.f26587g) {
                zzcgp.m45224b("App is still foreground");
            } else {
                zzbci.f26586f = false;
                zzcgp.m45224b("App went background");
                for (zzbcj O : this.f26581a.f26588o) {
                    try {
                        O.mo42459O(false);
                    } catch (Exception e) {
                        zzcgp.m45227e("", e);
                    }
                }
            }
        }
    }
}
