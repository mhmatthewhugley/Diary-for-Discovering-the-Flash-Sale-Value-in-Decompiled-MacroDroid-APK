package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfwz extends zzfvs {

    /* renamed from: d */
    private final transient zzfvq f36508d;

    /* renamed from: f */
    private final transient zzfvn f36509f;

    zzfwz(zzfvq zzfvq, zzfvn zzfvn) {
        this.f36508d = zzfvq;
        this.f36509f = zzfvn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo46413c(Object[] objArr, int i) {
        return this.f36509f.mo46413c(objArr, i);
    }

    public final boolean contains(Object obj) {
        return this.f36508d.get(obj) != null;
    }

    /* renamed from: h */
    public final zzfvn mo46418h() {
        return this.f36509f;
    }

    /* renamed from: i */
    public final zzfxm mo46419i() {
        return this.f36509f.listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f36509f.listIterator(0);
    }

    public final int size() {
        return this.f36508d.size();
    }
}
