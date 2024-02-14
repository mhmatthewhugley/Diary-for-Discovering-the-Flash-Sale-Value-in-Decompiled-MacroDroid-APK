package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzag extends zzaa {

    /* renamed from: d */
    private final transient zzy f43093d;

    /* renamed from: f */
    private final transient zzv f43094f;

    zzag(zzy zzy, zzv zzv) {
        this.f43093d = zzy;
        this.f43094f = zzv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo52031c(Object[] objArr, int i) {
        return this.f43094f.mo52031c(objArr, 0);
    }

    public final boolean contains(Object obj) {
        return this.f43093d.get(obj) != null;
    }

    /* renamed from: h */
    public final zzam mo52023h() {
        return this.f43094f.listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f43094f.listIterator(0);
    }

    public final int size() {
        return this.f43093d.size();
    }
}
