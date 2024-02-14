package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzbz extends zzce {

    /* renamed from: a */
    private final AtomicReference f41300a = new AtomicReference();

    /* renamed from: c */
    private boolean f41301c;

    /* renamed from: Z8 */
    public static final Object m59542Z8(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* renamed from: A1 */
    public final Long mo50777A1(long j) {
        return (Long) m59542Z8(mo50780t1(j), Long.class);
    }

    /* renamed from: g8 */
    public final String mo50778g8(long j) {
        return (String) m59542Z8(mo50780t1(j), String.class);
    }

    /* renamed from: m1 */
    public final void mo50779m1(Bundle bundle) {
        synchronized (this.f41300a) {
            try {
                this.f41300a.set(bundle);
                this.f41301c = true;
                this.f41300a.notify();
            } catch (Throwable th) {
                this.f41300a.notify();
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: t1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo50780t1(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f41300a
            monitor-enter(r0)
            boolean r1 = r2.f41301c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f41300a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f41300a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbz.mo50780t1(long):android.os.Bundle");
    }
}
