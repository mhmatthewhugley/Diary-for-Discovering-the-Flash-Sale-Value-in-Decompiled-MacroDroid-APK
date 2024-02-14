package com.google.android.gms.internal.mlkit_translate;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzcf extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ zzci f43174a;

    zzcf(zzci zzci) {
        this.f43174a = zzci;
    }

    public final void clear() {
        this.f43174a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f43174a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new zzce(this);
    }

    public final boolean remove(Object obj) {
        return this.f43174a.mo52158d(obj) != null;
    }

    public final int size() {
        return this.f43174a.zzc;
    }
}
