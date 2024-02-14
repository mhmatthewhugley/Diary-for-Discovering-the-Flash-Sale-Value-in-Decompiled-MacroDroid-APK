package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbj {

    /* renamed from: b */
    private static volatile zzbj f45561b;

    /* renamed from: c */
    static final zzbj f45562c = new zzbj(true);

    /* renamed from: a */
    private final Map f45563a;

    zzbj() {
        this.f45563a = new HashMap();
    }

    /* renamed from: a */
    public static zzbj m64158a() {
        zzbj zzbj = f45561b;
        if (zzbj == null) {
            synchronized (zzbj.class) {
                zzbj = f45561b;
                if (zzbj == null) {
                    zzbj = f45562c;
                    f45561b = zzbj;
                }
            }
        }
        return zzbj;
    }

    zzbj(boolean z) {
        this.f45563a = Collections.emptyMap();
    }
}
