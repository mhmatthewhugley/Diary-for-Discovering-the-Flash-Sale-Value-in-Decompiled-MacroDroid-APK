package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* renamed from: o */
    final Multimap<K, V> f16589o;

    /* renamed from: p */
    final Predicate<? super K> f16590p;

    static class AddRejectingList<K, V> extends ForwardingList<V> {
        @ParametricNullness

        /* renamed from: a */
        final K f16591a;

        AddRejectingList(@ParametricNullness K k) {
            this.f16591a = k;
        }

        public boolean add(@ParametricNullness V v) {
            add(0, v);
            return true;
        }

        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public List<V> mo34397R() {
            return Collections.emptyList();
        }

        public void add(int i, @ParametricNullness V v) {
            Preconditions.m5395v(i, 0);
            String valueOf = String.valueOf(this.f16591a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @CanIgnoreReturnValue
        public boolean addAll(int i, Collection<? extends V> collection) {
            Preconditions.m5392s(collection);
            Preconditions.m5395v(i, 0);
            String valueOf = String.valueOf(this.f16591a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static class AddRejectingSet<K, V> extends ForwardingSet<V> {
        @ParametricNullness

        /* renamed from: a */
        final K f16592a;

        AddRejectingSet(@ParametricNullness K k) {
            this.f16592a = k;
        }

        public boolean add(@ParametricNullness V v) {
            String valueOf = String.valueOf(this.f16592a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        public boolean addAll(Collection<? extends V> collection) {
            Preconditions.m5392s(collection);
            String valueOf = String.valueOf(this.f16592a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<V> mo34397R() {
            return Collections.emptySet();
        }
    }

    class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        Entries() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Collection<Map.Entry<K, V>> mo22325Q() {
            return Collections2.m26542d(FilteredKeyMultimap.this.f16589o.mo34445i(), FilteredKeyMultimap.this.mo35061n());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!FilteredKeyMultimap.this.f16589o.containsKey(entry.getKey()) || !FilteredKeyMultimap.this.f16590p.apply(entry.getKey())) {
                return false;
            }
            return FilteredKeyMultimap.this.f16589o.remove(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<K, Collection<V>> mo34436a() {
        return Maps.m28104s(this.f16589o.mo34430w(), this.f16590p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo34437b() {
        return new Entries();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo34438c() {
        return Sets.m28721d(this.f16589o.keySet(), this.f16590p);
    }

    public void clear() {
        keySet().clear();
    }

    public boolean containsKey(Object obj) {
        if (this.f16589o.containsKey(obj)) {
            return this.f16590p.apply(obj);
        }
        return false;
    }

    /* renamed from: d */
    public Collection<V> mo34426d(Object obj) {
        return containsKey(obj) ? this.f16589o.mo34426d(obj) : mo35085l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Multiset<K> mo34441e() {
        return Multisets.m28378g(this.f16589o.mo34630k(), this.f16590p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Collection<V> mo34442f() {
        return new FilteredMultimapValues(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<K, V>> mo34443g() {
        throw new AssertionError("should never be called");
    }

    public Collection<V> get(@ParametricNullness K k) {
        if (this.f16590p.apply(k)) {
            return this.f16589o.get(k);
        }
        if (this.f16589o instanceof SetMultimap) {
            return new AddRejectingSet(k);
        }
        return new AddRejectingList(k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Collection<V> mo35085l() {
        if (this.f16589o instanceof SetMultimap) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }

    /* renamed from: n */
    public Predicate<? super Map.Entry<K, V>> mo35061n() {
        return Maps.m28110y(this.f16590p);
    }

    public int size() {
        int i = 0;
        for (Collection size : mo34430w().values()) {
            i += size.size();
        }
        return i;
    }

    /* renamed from: t */
    public Multimap<K, V> mo35064t() {
        return this.f16589o;
    }
}
