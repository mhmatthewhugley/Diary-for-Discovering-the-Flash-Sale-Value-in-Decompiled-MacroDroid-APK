package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfwg extends AbstractCollection {

    /* renamed from: a */
    final Map f36494a;

    zzfwg(Map map) {
        this.f36494a = map;
    }

    public final void clear() {
        this.f36494a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f36494a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f36494a.isEmpty();
    }

    public final Iterator iterator() {
        return new zzfwd(this.f36494a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f36494a.entrySet()) {
                if (zzfss.m50929a(obj, entry.getValue())) {
                    this.f36494a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f36494a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f36494a.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f36494a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f36494a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f36494a.size();
    }
}
