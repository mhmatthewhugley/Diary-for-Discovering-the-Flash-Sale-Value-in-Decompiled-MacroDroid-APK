package com.google.android.gms.internal.icing;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzey extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ zzez f40960a;

    /* synthetic */ zzey(zzez zzez, zzes zzes) {
        this.f40960a = zzez;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f40960a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f40960a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f40960a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new zzex(this.f40960a, (zzes) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f40960a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f40960a.size();
    }
}
