package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.RegularImmutableMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: A */
    static final RegularImmutableBiMap<Object, Object> f17071A = new RegularImmutableBiMap<>();

    /* renamed from: g */
    private final transient Object f17072g;
    @VisibleForTesting

    /* renamed from: o */
    final transient Object[] f17073o;

    /* renamed from: p */
    private final transient int f17074p;

    /* renamed from: s */
    private final transient int f17075s;

    /* renamed from: z */
    private final transient RegularImmutableBiMap<V, K> f17076z;

    private RegularImmutableBiMap() {
        this.f17072g = null;
        this.f17073o = new Object[0];
        this.f17074p = 0;
        this.f17075s = 0;
        this.f17076z = this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ImmutableSet<Map.Entry<K, V>> mo35412e() {
        return new RegularImmutableMap.EntrySet(this, this.f17073o, this.f17074p, this.f17075s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ImmutableSet<K> mo34971f() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f17073o, this.f17074p, this.f17075s));
    }

    public V get(Object obj) {
        V v = RegularImmutableMap.m28619v(this.f17072g, this.f17073o, this.f17075s, this.f17074p, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34967j() {
        return false;
    }

    /* renamed from: r */
    public ImmutableBiMap<V, K> mo34390x0() {
        return this.f17076z;
    }

    public int size() {
        return this.f17075s;
    }

    RegularImmutableBiMap(Object[] objArr, int i) {
        this.f17073o = objArr;
        this.f17075s = i;
        this.f17074p = 0;
        int p = i >= 2 ? ImmutableSet.m27513p(i) : 0;
        this.f17072g = RegularImmutableMap.m28618u(objArr, i, p, 0);
        this.f17076z = new RegularImmutableBiMap<>(RegularImmutableMap.m28618u(objArr, i, p, 1), objArr, i, this);
    }

    private RegularImmutableBiMap(Object obj, Object[] objArr, int i, RegularImmutableBiMap<V, K> regularImmutableBiMap) {
        this.f17072g = obj;
        this.f17073o = objArr;
        this.f17074p = 1;
        this.f17075s = i;
        this.f17076z = regularImmutableBiMap;
    }
}
