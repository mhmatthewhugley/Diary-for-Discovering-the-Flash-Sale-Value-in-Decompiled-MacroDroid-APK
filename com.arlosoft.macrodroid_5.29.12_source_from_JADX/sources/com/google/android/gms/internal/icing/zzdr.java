package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdr extends zzds {
    private zzdr() {
        super((zzdp) null);
    }

    /* synthetic */ zzdr(zzdp zzdp) {
        super((zzdp) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50333a(Object obj, long j) {
        ((zzdg) zzfn.m59087s(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo50334b(Object obj, Object obj2, long j) {
        zzdg zzdg = (zzdg) zzfn.m59087s(obj, j);
        zzdg zzdg2 = (zzdg) zzfn.m59087s(obj2, j);
        int size = zzdg.size();
        int size2 = zzdg2.size();
        if (size > 0 && size2 > 0) {
            if (!zzdg.zza()) {
                zzdg = zzdg.mo50201A(size2 + size);
            }
            zzdg.addAll(zzdg2);
        }
        if (size > 0) {
            zzdg2 = zzdg;
        }
        zzfn.m59088t(obj, j, zzdg2);
    }
}
