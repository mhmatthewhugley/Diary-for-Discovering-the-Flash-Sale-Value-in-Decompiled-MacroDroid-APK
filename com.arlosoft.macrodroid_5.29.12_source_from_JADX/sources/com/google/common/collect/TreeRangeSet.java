package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    /* renamed from: a */
    private transient Set<Range<C>> f17284a;
    @VisibleForTesting
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {

        /* renamed from: a */
        final Collection<Range<C>> f17285a;

        AsRanges(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f17285a = collection;
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Collection<Range<C>> mo22325Q() {
            return this.f17285a;
        }

        public boolean equals(Object obj) {
            return Sets.m28719b(this, obj);
        }

        public int hashCode() {
            return Sets.m28723f(this);
        }
    }

    private final class Complement extends TreeRangeSet<C> {
        final /* synthetic */ TreeRangeSet this$0;
    }

    private static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: a */
        private final NavigableMap<Cut<C>, Range<C>> f17286a;

        /* renamed from: c */
        private final NavigableMap<Cut<C>, Range<C>> f17287c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Range<Cut<C>> f17288d;

        private ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f17286a = navigableMap;
            this.f17287c = new RangesByUpperBound(navigableMap);
            this.f17288d = range;
        }

        /* renamed from: g */
        private NavigableMap<Cut<C>, Range<C>> m29147g(Range<Cut<C>> range) {
            if (!this.f17288d.mo36281p(range)) {
                return ImmutableSortedMap.m27546C();
            }
            return new ComplementRangesByLowerBound(this.f17286a, range.mo36280n(this.f17288d));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo34750a() {
            Collection collection;
            Cut<C> cut;
            if (this.f17288d.mo36278l()) {
                collection = this.f17287c.tailMap(this.f17288d.mo36286v(), this.f17288d.mo36285u() == BoundType.CLOSED).values();
            } else {
                collection = this.f17287c.values();
            }
            PeekingIterator B = Iterators.m27695B(collection.iterator());
            if (this.f17288d.mo36275g(Cut.m26753e()) && (!B.hasNext() || ((Range) B.peek()).lowerBound != Cut.m26753e())) {
                cut = Cut.m26753e();
            } else if (!B.hasNext()) {
                return Iterators.m27717m();
            } else {
                cut = ((Range) B.next()).upperBound;
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(cut, B) {

                /* renamed from: d */
                Cut<C> f17289d;

                /* renamed from: f */
                final /* synthetic */ Cut f17290f;

                /* renamed from: g */
                final /* synthetic */ PeekingIterator f17291g;

                {
                    this.f17290f = r2;
                    this.f17291g = r3;
                    this.f17289d = r2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<Cut<C>, Range<C>> mo34417a() {
                    Range<C> range;
                    if (ComplementRangesByLowerBound.this.f17288d.upperBound.mo34952n(this.f17289d) || this.f17289d == Cut.m26751b()) {
                        return (Map.Entry) mo34418b();
                    }
                    if (this.f17291g.hasNext()) {
                        Range range2 = (Range) this.f17291g.next();
                        range = Range.m28548h(this.f17289d, range2.lowerBound);
                        this.f17289d = range2.upperBound;
                    } else {
                        range = Range.m28548h(this.f17289d, Cut.m26751b());
                        this.f17289d = Cut.m26751b();
                    }
                    return Maps.m28105t(range.lowerBound, range);
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo34661b() {
            Cut cut;
            Cut<C> cut2;
            if (this.f17288d.mo36279m()) {
                cut = this.f17288d.mo36272C();
            } else {
                cut = Cut.m26751b();
            }
            PeekingIterator B = Iterators.m27695B(this.f17287c.headMap(cut, this.f17288d.mo36279m() && this.f17288d.mo36271B() == BoundType.CLOSED).descendingMap().values().iterator());
            if (B.hasNext()) {
                if (((Range) B.peek()).upperBound == Cut.m26751b()) {
                    cut2 = ((Range) B.next()).lowerBound;
                } else {
                    cut2 = this.f17286a.higherKey(((Range) B.peek()).upperBound);
                }
            } else if (!this.f17288d.mo36275g(Cut.m26753e()) || this.f17286a.containsKey(Cut.m26753e())) {
                return Iterators.m27717m();
            } else {
                cut2 = this.f17286a.higherKey(Cut.m26753e());
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>((Cut) MoreObjects.m5332a(cut2, Cut.m26751b()), B) {

                /* renamed from: d */
                Cut<C> f17293d;

                /* renamed from: f */
                final /* synthetic */ Cut f17294f;

                /* renamed from: g */
                final /* synthetic */ PeekingIterator f17295g;

                {
                    this.f17294f = r2;
                    this.f17295g = r3;
                    this.f17293d = r2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<Cut<C>, Range<C>> mo34417a() {
                    if (this.f17293d == Cut.m26753e()) {
                        return (Map.Entry) mo34418b();
                    }
                    if (this.f17295g.hasNext()) {
                        Range range = (Range) this.f17295g.next();
                        Range<C> h = Range.m28548h(range.upperBound, this.f17293d);
                        this.f17293d = range.lowerBound;
                        if (ComplementRangesByLowerBound.this.f17288d.lowerBound.mo34952n(h.lowerBound)) {
                            return Maps.m28105t(h.lowerBound, h);
                        }
                    } else if (ComplementRangesByLowerBound.this.f17288d.lowerBound.mo34952n(Cut.m26753e())) {
                        Range<C> h2 = Range.m28548h(Cut.m26753e(), this.f17293d);
                        this.f17293d = Cut.m26753e();
                        return Maps.m28105t(Cut.m26753e(), h2);
                    }
                    return (Map.Entry) mo34418b();
                }
            };
        }

        public Comparator<? super Cut<C>> comparator() {
            return Ordering.m28521e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    Map.Entry firstEntry = tailMap(cut, true).firstEntry();
                    if (firstEntry != null && ((Cut) firstEntry.getKey()).equals(cut)) {
                        return (Range) firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: e */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return m29147g(Range.m28556z(cut, BoundType.m26528d(z)));
        }

        /* renamed from: f */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m29147g(Range.m28553w(cut, BoundType.m26528d(z), cut2, BoundType.m26528d(z2)));
        }

        /* renamed from: h */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m29147g(Range.m28549i(cut, BoundType.m26528d(z)));
        }

        public int size() {
            return Iterators.m27701H(mo34750a());
        }
    }

    private final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;
        final /* synthetic */ TreeRangeSet this$0;

        /* renamed from: c */
        public Range<C> mo34686c(C c) {
            Range c2;
            if (this.restriction.mo36275g(c) && (c2 = this.this$0.mo34686c(c)) != null) {
                return c2.mo36280n(this.restriction);
            }
            return null;
        }
    }

    private static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Range<Cut<C>> f17303a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Range<C> f17304c;

        /* renamed from: d */
        private final NavigableMap<Cut<C>, Range<C>> f17305d;

        /* renamed from: f */
        private final NavigableMap<Cut<C>, Range<C>> f17306f;

        private SubRangeSetRangesByLowerBound(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f17303a = (Range) Preconditions.m5392s(range);
            this.f17304c = (Range) Preconditions.m5392s(range2);
            this.f17305d = (NavigableMap) Preconditions.m5392s(navigableMap);
            this.f17306f = new RangesByUpperBound(navigableMap);
        }

        /* renamed from: h */
        private NavigableMap<Cut<C>, Range<C>> m29173h(Range<Cut<C>> range) {
            if (!range.mo36281p(this.f17303a)) {
                return ImmutableSortedMap.m27546C();
            }
            return new SubRangeSetRangesByLowerBound(this.f17303a.mo36280n(range), this.f17304c, this.f17305d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo34750a() {
            final Iterator it;
            if (this.f17304c.mo36282q()) {
                return Iterators.m27717m();
            }
            if (this.f17303a.upperBound.mo34952n(this.f17304c.lowerBound)) {
                return Iterators.m27717m();
            }
            boolean z = false;
            if (this.f17303a.lowerBound.mo34952n(this.f17304c.lowerBound)) {
                it = this.f17306f.tailMap(this.f17304c.lowerBound, false).values().iterator();
            } else {
                NavigableMap<Cut<C>, Range<C>> navigableMap = this.f17305d;
                Cut cut = (Cut) this.f17303a.lowerBound.mo34950l();
                if (this.f17303a.mo36285u() == BoundType.CLOSED) {
                    z = true;
                }
                it = navigableMap.tailMap(cut, z).values().iterator();
            }
            final Cut cut2 = (Cut) Ordering.m28521e().mo36266d(this.f17303a.upperBound, Cut.m26754f(this.f17304c.upperBound));
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<Cut<C>, Range<C>> mo34417a() {
                    if (!it.hasNext()) {
                        return (Map.Entry) mo34418b();
                    }
                    Range range = (Range) it.next();
                    if (cut2.mo34952n(range.lowerBound)) {
                        return (Map.Entry) mo34418b();
                    }
                    Range n = range.mo36280n(SubRangeSetRangesByLowerBound.this.f17304c);
                    return Maps.m28105t(n.lowerBound, n);
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo34661b() {
            if (this.f17304c.mo36282q()) {
                return Iterators.m27717m();
            }
            Cut cut = (Cut) Ordering.m28521e().mo36266d(this.f17303a.upperBound, Cut.m26754f(this.f17304c.upperBound));
            final Iterator it = this.f17305d.headMap((Cut) cut.mo34950l(), cut.mo34955t() == BoundType.CLOSED).descendingMap().values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<Cut<C>, Range<C>> mo34417a() {
                    if (!it.hasNext()) {
                        return (Map.Entry) mo34418b();
                    }
                    Range range = (Range) it.next();
                    if (SubRangeSetRangesByLowerBound.this.f17304c.lowerBound.compareTo(range.upperBound) >= 0) {
                        return (Map.Entry) mo34418b();
                    }
                    Range n = range.mo36280n(SubRangeSetRangesByLowerBound.this.f17304c);
                    if (SubRangeSetRangesByLowerBound.this.f17303a.mo36275g(n.lowerBound)) {
                        return Maps.m28105t(n.lowerBound, n);
                    }
                    return (Map.Entry) mo34418b();
                }
            };
        }

        public Comparator<? super Cut<C>> comparator() {
            return Ordering.m28521e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: e */
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f17303a.mo36275g(cut) && cut.compareTo(this.f17304c.lowerBound) >= 0) {
                        if (cut.compareTo(this.f17304c.upperBound) < 0) {
                            if (cut.equals(this.f17304c.lowerBound)) {
                                Range range = (Range) Maps.m28085a0(this.f17305d.floorEntry(cut));
                                if (range != null && range.upperBound.compareTo(this.f17304c.lowerBound) > 0) {
                                    return range.mo36280n(this.f17304c);
                                }
                            } else {
                                Range range2 = (Range) this.f17305d.get(cut);
                                if (range2 != null) {
                                    return range2.mo36280n(this.f17304c);
                                }
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: f */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return m29173h(Range.m28556z(cut, BoundType.m26528d(z)));
        }

        /* renamed from: g */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m29173h(Range.m28553w(cut, BoundType.m26528d(z), cut2, BoundType.m26528d(z2)));
        }

        /* renamed from: i */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m29173h(Range.m28549i(cut, BoundType.m26528d(z)));
        }

        public int size() {
            return Iterators.m27701H(mo34750a());
        }
    }

    /* renamed from: a */
    public Set<Range<C>> mo35494a() {
        Set<Range<C>> set = this.f17284a;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this, this.rangesByLowerBound.values());
        this.f17284a = asRanges;
        return asRanges;
    }

    /* renamed from: c */
    public Range<C> mo34686c(C c) {
        Preconditions.m5392s(c);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(Cut.m26754f(c));
        if (floorEntry == null || !floorEntry.getValue().mo36275g(c)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @VisibleForTesting
    static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: a */
        private final NavigableMap<Cut<C>, Range<C>> f17297a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Range<Cut<C>> f17298c;

        RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f17297a = navigableMap;
            this.f17298c = Range.m28544a();
        }

        /* renamed from: g */
        private NavigableMap<Cut<C>, Range<C>> m29159g(Range<Cut<C>> range) {
            if (range.mo36281p(this.f17298c)) {
                return new RangesByUpperBound(this.f17297a, range.mo36280n(this.f17298c));
            }
            return ImmutableSortedMap.m27546C();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo34750a() {
            final Iterator it;
            if (!this.f17298c.mo36278l()) {
                it = this.f17297a.values().iterator();
            } else {
                Map.Entry<Cut<C>, Range<C>> lowerEntry = this.f17297a.lowerEntry(this.f17298c.mo36286v());
                if (lowerEntry == null) {
                    it = this.f17297a.values().iterator();
                } else if (this.f17298c.lowerBound.mo34952n(lowerEntry.getValue().upperBound)) {
                    it = this.f17297a.tailMap(lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.f17297a.tailMap(this.f17298c.mo36286v(), true).values().iterator();
                }
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<Cut<C>, Range<C>> mo34417a() {
                    if (!it.hasNext()) {
                        return (Map.Entry) mo34418b();
                    }
                    Range range = (Range) it.next();
                    if (RangesByUpperBound.this.f17298c.upperBound.mo34952n(range.upperBound)) {
                        return (Map.Entry) mo34418b();
                    }
                    return Maps.m28105t(range.upperBound, range);
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo34661b() {
            Collection collection;
            if (this.f17298c.mo36279m()) {
                collection = this.f17297a.headMap(this.f17298c.mo36272C(), false).descendingMap().values();
            } else {
                collection = this.f17297a.descendingMap().values();
            }
            final PeekingIterator B = Iterators.m27695B(collection.iterator());
            if (B.hasNext() && this.f17298c.upperBound.mo34952n(((Range) B.peek()).upperBound)) {
                B.next();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* access modifiers changed from: protected */
                /* renamed from: d */
                public Map.Entry<Cut<C>, Range<C>> mo34417a() {
                    if (!B.hasNext()) {
                        return (Map.Entry) mo34418b();
                    }
                    Range range = (Range) B.next();
                    if (RangesByUpperBound.this.f17298c.lowerBound.mo34952n(range.upperBound)) {
                        return Maps.m28105t(range.upperBound, range);
                    }
                    return (Map.Entry) mo34418b();
                }
            };
        }

        public Comparator<? super Cut<C>> comparator() {
            return Ordering.m28521e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public Range<C> get(Object obj) {
            Map.Entry<Cut<C>, Range<C>> lowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f17298c.mo36275g(cut) && (lowerEntry = this.f17297a.lowerEntry(cut)) != null && lowerEntry.getValue().upperBound.equals(cut)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: e */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
            return m29159g(Range.m28556z(cut, BoundType.m26528d(z)));
        }

        /* renamed from: f */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
            return m29159g(Range.m28553w(cut, BoundType.m26528d(z), cut2, BoundType.m26528d(z2)));
        }

        /* renamed from: h */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
            return m29159g(Range.m28549i(cut, BoundType.m26528d(z)));
        }

        public boolean isEmpty() {
            if (this.f17298c.equals(Range.m28544a())) {
                return this.f17297a.isEmpty();
            }
            return !mo34750a().hasNext();
        }

        public int size() {
            if (this.f17298c.equals(Range.m28544a())) {
                return this.f17297a.size();
            }
            return Iterators.m27701H(mo34750a());
        }

        private RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f17297a = navigableMap;
            this.f17298c = range;
        }
    }
}
