package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzft {

    /* renamed from: a */
    private final Map f36350a = new HashMap();
    @Nullable

    /* renamed from: b */
    private Map f36351b;

    /* renamed from: a */
    public final synchronized Map mo46172a() {
        if (this.f36351b == null) {
            this.f36351b = Collections.unmodifiableMap(new HashMap(this.f36350a));
        }
        return this.f36351b;
    }
}
