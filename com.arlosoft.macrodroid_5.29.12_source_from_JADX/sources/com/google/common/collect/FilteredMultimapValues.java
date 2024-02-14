package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {
    @Weak

    /* renamed from: a */
    private final FilteredMultimap<K, V> f16594a;

    FilteredMultimapValues(FilteredMultimap<K, V> filteredMultimap) {
        this.f16594a = (FilteredMultimap) Preconditions.m5392s(filteredMultimap);
    }

    public void clear() {
        this.f16594a.clear();
    }

    public boolean contains(Object obj) {
        return this.f16594a.containsValue(obj);
    }

    public Iterator<V> iterator() {
        return Maps.m28083Z(this.f16594a.mo34445i().iterator());
    }

    public boolean remove(Object obj) {
        Predicate<? super Map.Entry<K, V>> n = this.f16594a.mo35061n();
        Iterator<Map.Entry<K, V>> it = this.f16594a.mo35064t().mo34445i().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (n.apply(next) && Objects.m5349a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return Iterables.m27683j(this.f16594a.mo35064t().mo34445i(), Predicates.m5402c(this.f16594a.mo35061n(), Maps.m28087b0(Predicates.m5406g(collection))));
    }

    public boolean retainAll(Collection<?> collection) {
        return Iterables.m27683j(this.f16594a.mo35064t().mo34445i(), Predicates.m5402c(this.f16594a.mo35061n(), Maps.m28087b0(Predicates.m5409j(Predicates.m5406g(collection)))));
    }

    public int size() {
        return this.f16594a.size();
    }
}
