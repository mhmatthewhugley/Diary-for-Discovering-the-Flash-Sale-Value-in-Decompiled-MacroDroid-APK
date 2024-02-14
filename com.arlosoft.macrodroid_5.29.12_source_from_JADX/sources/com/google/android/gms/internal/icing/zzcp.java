package com.google.android.gms.internal.icing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzcp {

    /* renamed from: b */
    private static volatile zzcp f40809b;

    /* renamed from: c */
    static final zzcp f40810c = new zzcp(true);

    /* renamed from: a */
    private final Map f40811a;

    zzcp() {
        this.f40811a = new HashMap();
    }

    /* renamed from: a */
    public static zzcp m58768a() {
        zzcp zzcp = f40809b;
        if (zzcp == null) {
            synchronized (zzcp.class) {
                zzcp = f40809b;
                if (zzcp == null) {
                    zzcp = f40810c;
                    f40809b = zzcp;
                }
            }
        }
        return zzcp;
    }

    zzcp(boolean z) {
        this.f40811a = Collections.emptyMap();
    }
}
