package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    private static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<K, V> map;

        EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {

        /* renamed from: d */
        private final transient ImmutableMap<K, V> f16669d;

        /* renamed from: f */
        private final transient ImmutableList<Map.Entry<K, V>> f16670f;

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public ImmutableList<Map.Entry<K, V>> mo35439B() {
            return this.f16670f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public ImmutableMap<K, V> mo35428O() {
            return this.f16669d;
        }

        /* access modifiers changed from: package-private */
        @GwtIncompatible
        /* renamed from: d */
        public int mo35355d(Object[] objArr, int i) {
            return this.f16670f.mo35355d(objArr, i);
        }

        /* renamed from: k */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f16670f.iterator();
        }
    }

    ImmutableMapEntrySet() {
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: D */
    public boolean mo35028D() {
        return mo35428O().mo35417i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract ImmutableMap<K, V> mo35428O();

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo35428O().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo35428O().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return mo35428O().mo34967j();
    }

    public int size() {
        return mo35428O().size();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new EntrySetSerializedForm(mo35428O());
    }
}
