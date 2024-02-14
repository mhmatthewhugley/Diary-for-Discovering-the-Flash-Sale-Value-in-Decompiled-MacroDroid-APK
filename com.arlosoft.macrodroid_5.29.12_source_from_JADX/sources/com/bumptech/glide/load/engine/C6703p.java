package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
import p102h4.C7380e;

/* renamed from: com.bumptech.glide.load.engine.p */
/* compiled from: Jobs */
final class C6703p {

    /* renamed from: a */
    private final Map<C7380e, C6692k<?>> f15669a = new HashMap();

    /* renamed from: b */
    private final Map<C7380e, C6692k<?>> f15670b = new HashMap();

    C6703p() {
    }

    /* renamed from: b */
    private Map<C7380e, C6692k<?>> m25392b(boolean z) {
        return z ? this.f15670b : this.f15669a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6692k<?> mo33112a(C7380e eVar, boolean z) {
        return m25392b(z).get(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33113c(C7380e eVar, C6692k<?> kVar) {
        m25392b(kVar.mo33084p()).put(eVar, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo33114d(C7380e eVar, C6692k<?> kVar) {
        Map<C7380e, C6692k<?>> b = m25392b(kVar.mo33084p());
        if (kVar.equals(b.get(eVar))) {
            b.remove(eVar);
        }
    }
}
