package com.google.android.gms.internal.icing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdz {
    zzdz() {
    }

    /* renamed from: a */
    public static final int m58863a(int i, Object obj, Object obj2) {
        zzdy zzdy = (zzdy) obj;
        zzdx zzdx = (zzdx) obj2;
        if (zzdy.isEmpty()) {
            return 0;
        }
        Iterator it = zzdy.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
