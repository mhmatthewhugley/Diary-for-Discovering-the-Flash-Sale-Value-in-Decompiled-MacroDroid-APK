package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsa extends zzgsc {
    private zzgsa() {
        super((zzgsb) null);
    }

    /* synthetic */ zzgsa(zzgrz zzgrz) {
        super((zzgsb) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo47384a(Object obj, long j) {
        zzgrn zzgrn = (zzgrn) zzgui.m53446p(obj, j);
        if (zzgrn.mo47052a()) {
            return zzgrn;
        }
        int size = zzgrn.size();
        zzgrn G = zzgrn.mo47067G(size == 0 ? 10 : size + size);
        zzgui.m53426D(obj, j, G);
        return G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47385b(Object obj, long j) {
        ((zzgrn) zzgui.m53446p(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47386c(Object obj, Object obj2, long j) {
        zzgrn zzgrn = (zzgrn) zzgui.m53446p(obj, j);
        zzgrn zzgrn2 = (zzgrn) zzgui.m53446p(obj2, j);
        int size = zzgrn.size();
        int size2 = zzgrn2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgrn.mo47052a()) {
                zzgrn = zzgrn.mo47067G(size2 + size);
            }
            zzgrn.addAll(zzgrn2);
        }
        if (size > 0) {
            zzgrn2 = zzgrn;
        }
        zzgui.m53426D(obj, j, zzgrn2);
    }
}
