package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzky extends zzla {
    private zzky() {
        super((zzkz) null);
    }

    /* synthetic */ zzky(zzkx zzkx) {
        super((zzkz) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51485a(Object obj, long j) {
        ((zzkm) zzmy.m60856k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo51486b(Object obj, Object obj2, long j) {
        zzkm zzkm = (zzkm) zzmy.m60856k(obj, j);
        zzkm zzkm2 = (zzkm) zzmy.m60856k(obj2, j);
        int size = zzkm.size();
        int size2 = zzkm2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkm.mo51307a()) {
                zzkm = zzkm.mo51322G(size2 + size);
            }
            zzkm.addAll(zzkm2);
        }
        if (size > 0) {
            zzkm2 = zzkm;
        }
        zzmy.m60869x(obj, j, zzkm2);
    }
}
