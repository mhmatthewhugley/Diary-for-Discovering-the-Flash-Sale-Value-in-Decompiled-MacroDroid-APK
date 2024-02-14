package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zza {

    /* renamed from: a */
    private final Map f51648a = new HashMap();

    /* renamed from: b */
    private final AtomicBoolean f51649b = new AtomicBoolean(false);

    /* renamed from: b */
    private final synchronized void m70769b() {
        this.f51648a.put("assetOnlyUpdates", Boolean.FALSE);
    }

    /* renamed from: a */
    public final synchronized boolean mo59791a(String str) {
        if (!this.f51649b.get()) {
            m70769b();
        }
        Object obj = this.f51648a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
