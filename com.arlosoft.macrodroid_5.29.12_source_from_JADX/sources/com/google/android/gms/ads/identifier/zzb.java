package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class zzb extends Thread {

    /* renamed from: a */
    private final WeakReference<AdvertisingIdClient> f1777a;

    /* renamed from: c */
    private final long f1778c;

    /* renamed from: d */
    final CountDownLatch f1779d = new CountDownLatch(1);

    /* renamed from: f */
    boolean f1780f = false;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        this.f1777a = new WeakReference<>(advertisingIdClient);
        this.f1778c = j;
        start();
    }

    /* renamed from: a */
    private final void m1829a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f1777a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.mo19844f();
            this.f1780f = true;
        }
    }

    public final void run() {
        try {
            if (!this.f1779d.await(this.f1778c, TimeUnit.MILLISECONDS)) {
                m1829a();
            }
        } catch (InterruptedException unused) {
            m1829a();
        }
    }
}
