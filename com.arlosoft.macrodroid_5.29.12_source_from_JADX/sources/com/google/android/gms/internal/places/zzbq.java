package com.google.android.gms.internal.places;

import java.util.Iterator;
import java.util.Map;

final class zzbq<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Map.Entry<K, Object>> f45300a;

    public zzbq(Iterator<Map.Entry<K, Object>> it) {
        this.f45300a = it;
    }

    public final boolean hasNext() {
        return this.f45300a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f45300a.next();
        return next.getValue() instanceof zzbl ? new zzbn(next) : next;
    }

    public final void remove() {
        this.f45300a.remove();
    }
}
