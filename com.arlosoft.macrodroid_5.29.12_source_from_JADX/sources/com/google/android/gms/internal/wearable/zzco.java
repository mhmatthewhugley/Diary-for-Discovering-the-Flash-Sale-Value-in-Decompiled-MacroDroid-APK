package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzco extends zzcq {
    private zzco() {
        super((zzcp) null);
    }

    /* synthetic */ zzco(zzcn zzcn) {
        super((zzcp) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53972a(Object obj, long j) {
        ((zzcc) zzeo.m64499k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo53973b(Object obj, Object obj2, long j) {
        zzcc zzcc = (zzcc) zzeo.m64499k(obj, j);
        zzcc zzcc2 = (zzcc) zzeo.m64499k(obj2, j);
        int size = zzcc.size();
        int size2 = zzcc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzcc.mo53802a()) {
                zzcc = zzcc.mo53817G(size2 + size);
            }
            zzcc.addAll(zzcc2);
        }
        if (size > 0) {
            zzcc2 = zzcc;
        }
        zzeo.m64512x(obj, j, zzcc2);
    }
}
