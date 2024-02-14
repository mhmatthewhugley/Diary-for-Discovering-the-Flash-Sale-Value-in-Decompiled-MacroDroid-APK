package com.google.common.graph;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    /* renamed from: c */
    private volatile transient CacheEntry<K, V> f17453c;

    /* renamed from: d */
    private volatile transient CacheEntry<K, V> f17454d;

    private static final class CacheEntry<K, V> {

        /* renamed from: a */
        final K f17455a;

        /* renamed from: b */
        final V f17456b;

        CacheEntry(K k, V v) {
            this.f17455a = k;
            this.f17456b = v;
        }
    }

    /* renamed from: h */
    private void m29494h(CacheEntry<K, V> cacheEntry) {
        this.f17454d = this.f17453c;
        this.f17453c = cacheEntry;
    }

    /* renamed from: i */
    private void m29495i(K k, V v) {
        m29494h(new CacheEntry(k, v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public V mo36922d(Object obj) {
        Preconditions.m5392s(obj);
        V e = mo36923e(obj);
        if (e != null) {
            return e;
        }
        V f = mo36924f(obj);
        if (f != null) {
            m29495i(obj, f);
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public V mo36923e(Object obj) {
        V e = super.mo36923e(obj);
        if (e != null) {
            return e;
        }
        CacheEntry<K, V> cacheEntry = this.f17453c;
        if (cacheEntry != null && cacheEntry.f17455a == obj) {
            return cacheEntry.f17456b;
        }
        CacheEntry<K, V> cacheEntry2 = this.f17454d;
        if (cacheEntry2 == null || cacheEntry2.f17455a != obj) {
            return null;
        }
        m29494h(cacheEntry2);
        return cacheEntry2.f17456b;
    }
}
