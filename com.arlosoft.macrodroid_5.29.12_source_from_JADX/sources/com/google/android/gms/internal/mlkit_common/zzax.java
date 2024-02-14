package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzax extends zzas {

    /* renamed from: d */
    private final transient zzar f41957d;

    /* renamed from: f */
    private final transient zzao f41958f;

    zzax(zzar zzar, zzao zzao) {
        this.f41957d = zzar;
        this.f41958f = zzao;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo51730c(Object[] objArr, int i) {
        return this.f41958f.mo51730c(objArr, 0);
    }

    public final boolean contains(Object obj) {
        return this.f41957d.get(obj) != null;
    }

    /* renamed from: h */
    public final zzbb mo51735h() {
        return this.f41958f.listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f41958f.listIterator(0);
    }

    public final int size() {
        return this.f41957d.size();
    }
}
