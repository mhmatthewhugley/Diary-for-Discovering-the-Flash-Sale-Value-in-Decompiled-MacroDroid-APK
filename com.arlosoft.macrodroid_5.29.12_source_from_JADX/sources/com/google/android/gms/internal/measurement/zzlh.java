package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlh {
    zzlh() {
    }

    /* renamed from: a */
    public static final int m60596a(int i, Object obj, Object obj2) {
        zzlg zzlg = (zzlg) obj;
        zzlf zzlf = (zzlf) obj2;
        if (zzlg.isEmpty()) {
            return 0;
        }
        Iterator it = zzlg.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m60597b(Object obj, Object obj2) {
        zzlg zzlg = (zzlg) obj;
        zzlg zzlg2 = (zzlg) obj2;
        if (!zzlg2.isEmpty()) {
            if (!zzlg.mo51498e()) {
                zzlg = zzlg.mo51494b();
            }
            zzlg.mo51497d(zzlg2);
        }
        return zzlg;
    }
}
