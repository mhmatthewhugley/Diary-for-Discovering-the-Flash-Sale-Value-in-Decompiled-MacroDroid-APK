package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzazu {

    /* renamed from: a */
    private final Map f26378a = new HashMap();

    /* renamed from: b */
    private Map f26379b;

    /* renamed from: a */
    public final synchronized Map mo42295a() {
        if (this.f26379b == null) {
            this.f26379b = Collections.unmodifiableMap(new HashMap(this.f26378a));
        }
        return this.f26379b;
    }
}
