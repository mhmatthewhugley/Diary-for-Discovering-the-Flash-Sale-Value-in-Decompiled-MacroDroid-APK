package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzru {

    /* renamed from: a */
    private final zzzp f38381a;

    /* renamed from: b */
    private final Map f38382b = new HashMap();

    /* renamed from: c */
    private final Set f38383c = new HashSet();

    /* renamed from: d */
    private final Map f38384d = new HashMap();

    /* renamed from: e */
    private zzew f38385e;

    public zzru(zzzp zzzp) {
        this.f38381a = zzzp;
    }

    /* renamed from: a */
    public final void mo48147a(zzew zzew) {
        if (zzew != this.f38385e) {
            this.f38385e = zzew;
            this.f38382b.clear();
            this.f38384d.clear();
        }
    }
}
