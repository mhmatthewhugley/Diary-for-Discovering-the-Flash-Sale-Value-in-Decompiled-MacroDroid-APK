package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaef */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaef {
    zzaef() {
    }

    /* renamed from: a */
    public static final int m56520a(int i, Object obj, Object obj2) {
        zzaee zzaee = (zzaee) obj;
        zzaed zzaed = (zzaed) obj2;
        if (zzaee.isEmpty()) {
            return 0;
        }
        Iterator it = zzaee.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m56521b(Object obj) {
        return !((zzaee) obj).mo49129e();
    }

    /* renamed from: c */
    public static final Object m56522c(Object obj, Object obj2) {
        zzaee zzaee = (zzaee) obj;
        zzaee zzaee2 = (zzaee) obj2;
        if (!zzaee2.isEmpty()) {
            if (!zzaee.mo49129e()) {
                zzaee = zzaee.mo49125b();
            }
            zzaee.mo49128d(zzaee2);
        }
        return zzaee;
    }
}
