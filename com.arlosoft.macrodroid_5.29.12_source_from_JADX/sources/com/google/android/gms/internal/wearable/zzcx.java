package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzcx {
    zzcx() {
    }

    /* renamed from: a */
    public static final int m64274a(int i, Object obj, Object obj2) {
        zzcw zzcw = (zzcw) obj;
        zzcv zzcv = (zzcv) obj2;
        if (zzcw.isEmpty()) {
            return 0;
        }
        Iterator it = zzcw.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m64275b(Object obj, Object obj2) {
        zzcw zzcw = (zzcw) obj;
        zzcw zzcw2 = (zzcw) obj2;
        if (!zzcw2.isEmpty()) {
            if (!zzcw.mo53986d()) {
                zzcw = zzcw.mo53982a();
            }
            zzcw.mo53984c(zzcw2);
        }
        return zzcw;
    }
}
