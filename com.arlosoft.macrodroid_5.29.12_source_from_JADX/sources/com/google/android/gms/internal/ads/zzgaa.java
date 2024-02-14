package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgaa implements Runnable {

    /* renamed from: a */
    zzgac f36616a;

    zzgaa(zzgac zzgac) {
        this.f36616a = zzgac;
    }

    public final void run() {
        zzfzp D;
        String str;
        zzgac zzgac = this.f36616a;
        if (zzgac != null && (D = zzgac.f36617s) != null) {
            this.f36616a = null;
            if (D.isDone()) {
                zzgac.mo46564v(D);
                return;
            }
            try {
                ScheduledFuture F = zzgac.f36618z;
                ScheduledFuture unused = zzgac.f36618z = null;
                str = "Timed out";
                if (F != null) {
                    long abs = Math.abs(F.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzgac.mo46081g(new zzgab(str + ": " + D, (zzfzz) null));
                D.cancel(true);
            } catch (Throwable th) {
                D.cancel(true);
                throw th;
            }
        }
    }
}
