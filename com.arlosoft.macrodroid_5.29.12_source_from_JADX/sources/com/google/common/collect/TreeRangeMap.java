package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {

    /* renamed from: c */
    private static final RangeMap<Comparable<?>, Object> f17267c = new RangeMap<Comparable<?>, Object>() {
        /* renamed from: a */
        public Map<Range<Comparable<?>>, Object> mo35481a() {
            return Collections.emptyMap();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NavigableMap<Cut<K>, RangeMapEntry<K, V>> f17268a = Maps.m28062E();

    private final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {

        /* renamed from: a */
        final Iterable<Map.Entry<Range<K>, V>> f17269a;

        AsMapOfRanges(Iterable<RangeMapEntry<K, V>> iterable) {
            this.f17269a = iterable;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<Range<K>, V>> mo34750a() {
            return this.f17269a.iterator();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        public V get(Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            RangeMapEntry rangeMapEntry = (RangeMapEntry) TreeRangeMap.this.f17268a.get(range.lowerBound);
            if (rangeMapEntry == null || !rangeMapEntry.getKey().equals(range)) {
                return null;
            }
            return rangeMapEntry.getValue();
        }

        public int size() {
            return TreeRangeMap.this.f17268a.size();
        }
    }

    private static final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {

        /* renamed from: a */
        private final Range<K> f17271a;

        /* renamed from: c */
        private final V f17272c;

        RangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
            this(Range.m28548h(cut, cut2), v);
        }

        /* renamed from: a */
        public Range<K> getKey() {
            return this.f17271a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Cut<K> mo36707b() {
            return this.f17271a.lowerBound;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Cut<K> mo36708e() {
            return this.f17271a.upperBound;
        }

        public V getValue() {
            return this.f17272c;
        }

        RangeMapEntry(Range<K> range, V v) {
            this.f17271a = range;
            this.f17272c = v;
        }
    }

    private class SubRangeMap implements RangeMap<K, V> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Range<K> f17273a;

        /* renamed from: c */
        final /* synthetic */ TreeRangeMap f17274c;

        /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1 */
        class C71271 extends TreeRangeMap<Comparable, Object>.SubRangeMap.SubRangeMapAsMap {

            /* renamed from: c */
            final /* synthetic */ SubRangeMap f17275c;

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Iterator<Map.Entry<Range<Comparable>, Object>> mo36713b() {
                if (this.f17275c.f17273a.mo36282q()) {
                    return Iterators.m27717m();
                }
                final Iterator it = this.f17275c.f17274c.f17268a.headMap(this.f17275c.f17273a.upperBound, false).descendingMap().values().iterator();
                return new AbstractIterator<Map.Entry<Range<Comparable>, Object>>() {
                    /* access modifiers changed from: protected */
                    /* renamed from: d */
                    public Map.Entry<Range<Comparable>, Object> mo34417a() {
                        if (!it.hasNext()) {
                            return (Map.Entry) mo34418b();
                        }
                        RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                        if (rangeMapEntry.mo36708e().compareTo(C71271.this.f17275c.f17273a.lowerBound) <= 0) {
                            return (Map.Entry) mo34418b();
                        }
                        return Maps.m28105t(rangeMapEntry.getKey().mo36280n(C71271.this.f17275c.f17273a), rangeMapEntry.getValue());
                    }
                };
            }
        }

        class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {
            SubRangeMapAsMap() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public boolean m29137c(Predicate<? super Map.Entry<Range<K>, V>> predicate) {
                ArrayList<Range> h = Lists.m27832h();
                for (Map.Entry entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        h.add((Range) entry.getKey());
                    }
                }
                for (Range d : h) {
                    SubRangeMap.this.f17274c.mo36699d(d);
                }
                return !h.isEmpty();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Iterator<Map.Entry<Range<K>, V>> mo36715b() {
                if (SubRangeMap.this.f17273a.mo36282q()) {
                    return Iterators.m27717m();
                }
                final Iterator it = SubRangeMap.this.f17274c.f17268a.tailMap((Cut) MoreObjects.m5332a((Cut) SubRangeMap.this.f17274c.f17268a.floorKey(SubRangeMap.this.f17273a.lowerBound), SubRangeMap.this.f17273a.lowerBound), true).values().iterator();
                return new AbstractIterator<Map.Entry<Range<K>, V>>() {
                    /* access modifiers changed from: protected */
                    /* renamed from: d */
                    public Map.Entry<Range<K>, V> mo34417a() {
                        while (it.hasNext()) {
                            RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                            if (rangeMapEntry.mo36707b().compareTo(SubRangeMap.this.f17273a.upperBound) >= 0) {
                                return (Map.Entry) mo34418b();
                            }
                            if (rangeMapEntry.mo36708e().compareTo(SubRangeMap.this.f17273a.lowerBound) > 0) {
                                return Maps.m28105t(rangeMapEntry.getKey().mo36280n(SubRangeMap.this.f17273a), rangeMapEntry.getValue());
                            }
                        }
                        return (Map.Entry) mo34418b();
                    }
                };
            }

            public void clear() {
                SubRangeMap.this.mo36709c();
            }

            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new Maps.EntrySet<Range<K>, V>() {
                    /* access modifiers changed from: package-private */
                    /* renamed from: i */
                    public Map<Range<K>, V> mo34465i() {
                        return SubRangeMapAsMap.this;
                    }

                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }

                    public Iterator<Map.Entry<Range<K>, V>> iterator() {
                        return SubRangeMapAsMap.this.mo36715b();
                    }

                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.m29137c(Predicates.m5409j(Predicates.m5406g(collection)));
                    }

                    public int size() {
                        return Iterators.m27701H(iterator());
                    }
                };
            }

            public V get(Object obj) {
                RangeMapEntry rangeMapEntry;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (SubRangeMap.this.f17273a.mo36277j(range)) {
                            if (!range.mo36282q()) {
                                if (range.lowerBound.compareTo(SubRangeMap.this.f17273a.lowerBound) == 0) {
                                    Map.Entry<K, V> floorEntry = SubRangeMap.this.f17274c.f17268a.floorEntry(range.lowerBound);
                                    rangeMapEntry = floorEntry != null ? (RangeMapEntry) floorEntry.getValue() : null;
                                } else {
                                    rangeMapEntry = (RangeMapEntry) SubRangeMap.this.f17274c.f17268a.get(range.lowerBound);
                                }
                                if (rangeMapEntry != null && rangeMapEntry.getKey().mo36281p(SubRangeMap.this.f17273a) && rangeMapEntry.getKey().mo36280n(SubRangeMap.this.f17273a).equals(range)) {
                                    return rangeMapEntry.getValue();
                                }
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public Set<Range<K>> keySet() {
                return new Maps.KeySet<Range<K>, V>(this) {
                    public boolean remove(Object obj) {
                        return SubRangeMapAsMap.this.remove(obj) != null;
                    }

                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.m29137c(Predicates.m5404e(Predicates.m5409j(Predicates.m5406g(collection)), Maps.m28107v()));
                    }
                };
            }

            public V remove(Object obj) {
                V v = get(obj);
                if (v == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                SubRangeMap.this.f17274c.mo36699d((Range) obj);
                return v;
            }

            public Collection<V> values() {
                return new Maps.Values<Range<K>, V>(this) {
                    public boolean removeAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.m29137c(Predicates.m5404e(Predicates.m5406g(collection), Maps.m28082Y()));
                    }

                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.m29137c(Predicates.m5404e(Predicates.m5409j(Predicates.m5406g(collection)), Maps.m28082Y()));
                    }
                };
            }
        }

        /* renamed from: a */
        public Map<Range<K>, V> mo35481a() {
            return new SubRangeMapAsMap();
        }

        /* renamed from: c */
        public void mo36709c() {
            this.f17274c.mo36699d(this.f17273a);
        }

        public boolean equals(Object obj) {
            if (obj instanceof RangeMap) {
                return mo35481a().equals(((RangeMap) obj).mo35481a());
            }
            return false;
        }

        public int hashCode() {
            return mo35481a().hashCode();
        }

        public String toString() {
            return mo35481a().toString();
        }
    }

    private TreeRangeMap() {
    }

    /* renamed from: c */
    private void m29122c(Cut<K> cut, Cut<K> cut2, V v) {
        this.f17268a.put(cut, new RangeMapEntry(cut, cut2, v));
    }

    /* renamed from: a */
    public Map<Range<K>, V> mo35481a() {
        return new AsMapOfRanges(this.f17268a.values());
    }

    /* renamed from: d */
    public void mo36699d(Range<K> range) {
        if (!range.mo36282q()) {
            Map.Entry<Cut<K>, RangeMapEntry<K, V>> lowerEntry = this.f17268a.lowerEntry(range.lowerBound);
            if (lowerEntry != null) {
                RangeMapEntry value = lowerEntry.getValue();
                if (value.mo36708e().compareTo(range.lowerBound) > 0) {
                    if (value.mo36708e().compareTo(range.upperBound) > 0) {
                        m29122c(range.upperBound, value.mo36708e(), lowerEntry.getValue().getValue());
                    }
                    m29122c(value.mo36707b(), range.lowerBound, lowerEntry.getValue().getValue());
                }
            }
            Map.Entry<Cut<K>, RangeMapEntry<K, V>> lowerEntry2 = this.f17268a.lowerEntry(range.upperBound);
            if (lowerEntry2 != null) {
                RangeMapEntry value2 = lowerEntry2.getValue();
                if (value2.mo36708e().compareTo(range.upperBound) > 0) {
                    m29122c(range.upperBound, value2.mo36708e(), lowerEntry2.getValue().getValue());
                }
            }
            this.f17268a.subMap(range.lowerBound, range.upperBound).clear();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return mo35481a().equals(((RangeMap) obj).mo35481a());
        }
        return false;
    }

    public int hashCode() {
        return mo35481a().hashCode();
    }

    public String toString() {
        return this.f17268a.values().toString();
    }
}
