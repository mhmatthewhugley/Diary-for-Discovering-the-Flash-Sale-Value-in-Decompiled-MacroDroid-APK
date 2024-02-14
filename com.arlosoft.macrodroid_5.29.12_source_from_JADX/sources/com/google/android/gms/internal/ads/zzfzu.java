package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxx;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfzu extends zzfxx.zzi implements Runnable {

    /* renamed from: s */
    private final Runnable f36614s;

    public zzfzu(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f36614s = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo46078d() {
        return "task=[" + this.f36614s + "]";
    }

    public final void run() {
        try {
            this.f36614s.run();
        } catch (Error | RuntimeException e) {
            mo46081g(e);
            throw e;
        }
    }
}
