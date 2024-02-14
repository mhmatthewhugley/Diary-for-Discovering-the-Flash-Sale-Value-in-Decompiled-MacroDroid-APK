package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzal extends zzaa {

    /* renamed from: d */
    final transient Object f43109d;

    zzal(Object obj) {
        Objects.requireNonNull(obj);
        this.f43109d = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo52031c(Object[] objArr, int i) {
        objArr[0] = this.f43109d;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f43109d.equals(obj);
    }

    /* renamed from: h */
    public final zzam mo52023h() {
        return new zzab(this.f43109d);
    }

    public final int hashCode() {
        return this.f43109d.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzab(this.f43109d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.f43109d.toString() + ']';
    }
}
