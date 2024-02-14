package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzadw extends zzady {
    private zzadw() {
        super((zzadx) null);
    }

    /* synthetic */ zzadw(zzadv zzadv) {
        super((zzadx) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo49114a(Object obj, long j) {
        zzadk zzadk = (zzadk) zzafx.m56844k(obj, j);
        if (zzadk.mo48862a()) {
            return zzadk;
        }
        int size = zzadk.size();
        zzadk G = zzadk.mo48877G(size == 0 ? 10 : size + size);
        zzafx.m56857x(obj, j, G);
        return G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49115b(Object obj, long j) {
        ((zzadk) zzafx.m56844k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo49116c(Object obj, Object obj2, long j) {
        zzadk zzadk = (zzadk) zzafx.m56844k(obj, j);
        zzadk zzadk2 = (zzadk) zzafx.m56844k(obj2, j);
        int size = zzadk.size();
        int size2 = zzadk2.size();
        if (size > 0 && size2 > 0) {
            if (!zzadk.mo48862a()) {
                zzadk = zzadk.mo48877G(size2 + size);
            }
            zzadk.addAll(zzadk2);
        }
        if (size > 0) {
            zzadk2 = zzadk;
        }
        zzafx.m56857x(obj, j, zzadk2);
    }
}
