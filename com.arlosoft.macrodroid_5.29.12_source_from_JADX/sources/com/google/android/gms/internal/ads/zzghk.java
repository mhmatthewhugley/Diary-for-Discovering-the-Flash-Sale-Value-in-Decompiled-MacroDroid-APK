package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzghk {

    /* renamed from: a */
    private HashMap f36846a = new HashMap();

    /* renamed from: a */
    public final zzghm mo46805a() {
        if (this.f36846a != null) {
            zzghm zzghm = new zzghm(Collections.unmodifiableMap(this.f36846a), (zzghl) null);
            this.f36846a = null;
            return zzghm;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
