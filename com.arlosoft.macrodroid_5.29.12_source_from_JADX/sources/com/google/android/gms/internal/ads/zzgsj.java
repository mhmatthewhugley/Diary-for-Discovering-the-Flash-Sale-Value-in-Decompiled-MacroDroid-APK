package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsj {
    zzgsj() {
    }

    /* renamed from: a */
    public static final int m53094a(int i, Object obj, Object obj2) {
        zzgsi zzgsi = (zzgsi) obj;
        zzgsh zzgsh = (zzgsh) obj2;
        if (zzgsi.isEmpty()) {
            return 0;
        }
        Iterator it = zzgsi.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m53095b(Object obj) {
        return !((zzgsi) obj).mo47401e();
    }

    /* renamed from: c */
    public static final Object m53096c(Object obj, Object obj2) {
        zzgsi zzgsi = (zzgsi) obj;
        zzgsi zzgsi2 = (zzgsi) obj2;
        if (!zzgsi2.isEmpty()) {
            if (!zzgsi.mo47401e()) {
                zzgsi = zzgsi.mo47397b();
            }
            zzgsi.mo47400d(zzgsi2);
        }
        return zzgsi;
    }
}
