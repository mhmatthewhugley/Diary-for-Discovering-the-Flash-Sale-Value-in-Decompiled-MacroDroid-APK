package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarr {

    /* renamed from: a */
    private final Map f25391a = new HashMap();

    /* renamed from: a */
    public final AtomicReference mo41850a(String str) {
        synchronized (this) {
            if (!this.f25391a.containsKey(str)) {
                this.f25391a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f25391a.get(str);
    }
}
