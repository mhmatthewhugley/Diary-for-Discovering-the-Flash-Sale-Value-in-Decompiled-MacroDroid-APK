package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfze implements Runnable {

    /* renamed from: a */
    final Future f36601a;

    /* renamed from: c */
    final zzfzc f36602c;

    zzfze(Future future, zzfzc zzfzc) {
        this.f36601a = future;
        this.f36602c = zzfzc;
    }

    public final void run() {
        Throwable a;
        Future future = this.f36601a;
        if (!(future instanceof zzgai) || (a = zzgaj.m51466a((zzgai) future)) == null) {
            try {
                this.f36602c.mo20700c(zzfzg.m51421p(this.f36601a));
            } catch (ExecutionException e) {
                this.f36602c.mo20699a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f36602c.mo20699a(e2);
            }
        } else {
            this.f36602c.mo20699a(a);
        }
    }

    public final String toString() {
        zzfsq a = zzfsr.m50928a(this);
        a.mo46170a(this.f36602c);
        return a.toString();
    }
}
