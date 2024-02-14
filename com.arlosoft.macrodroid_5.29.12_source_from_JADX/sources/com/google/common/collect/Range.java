package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.lang.Comparable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C> {

    /* renamed from: a */
    private static final Range<Comparable> f17062a = new Range<>(Cut.m26753e(), Cut.m26751b());
    private static final long serialVersionUID = 0;
    final Cut<C> lowerBound;
    final Cut<C> upperBound;

    /* renamed from: com.google.common.collect.Range$1 */
    static /* synthetic */ class C70701 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17063a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17063a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17063a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.C70701.<clinit>():void");
        }
    }

    static class LowerBoundFn implements Function<Range, Cut> {

        /* renamed from: a */
        static final LowerBoundFn f17064a = new LowerBoundFn();

        LowerBoundFn() {
        }

        /* renamed from: a */
        public Cut apply(Range range) {
            return range.lowerBound;
        }
    }

    private static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* renamed from: a */
        static final Ordering<Range<?>> f17065a = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        /* renamed from: k */
        public int compare(Range<?> range, Range<?> range2) {
            return ComparisonChain.m26697f().mo34896d(range.lowerBound, range2.lowerBound).mo34896d(range.upperBound, range2.upperBound).mo34897e();
        }
    }

    static class UpperBoundFn implements Function<Range, Cut> {

        /* renamed from: a */
        static final UpperBoundFn f17066a = new UpperBoundFn();

        UpperBoundFn() {
        }

        /* renamed from: a */
        public Cut apply(Range range) {
            return range.upperBound;
        }
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
        this.lowerBound = (Cut) Preconditions.m5392s(cut);
        this.upperBound = (Cut) Preconditions.m5392s(cut2);
        if (cut.compareTo(cut2) > 0 || cut == Cut.m26751b() || cut2 == Cut.m26753e()) {
            String valueOf = String.valueOf(m28555y(cut, cut2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid range: ".concat(valueOf) : new String("Invalid range: "));
        }
    }

    /* renamed from: A */
    static <C extends Comparable<?>> Function<Range<C>, Cut<C>> m28543A() {
        return UpperBoundFn.f17066a;
    }

    /* renamed from: a */
    public static <C extends Comparable<?>> Range<C> m28544a() {
        return f17062a;
    }

    /* renamed from: c */
    public static <C extends Comparable<?>> Range<C> m28545c(C c) {
        return m28548h(Cut.m26754f(c), Cut.m26751b());
    }

    /* renamed from: d */
    public static <C extends Comparable<?>> Range<C> m28546d(C c) {
        return m28548h(Cut.m26753e(), Cut.m26752d(c));
    }

    /* renamed from: f */
    static int m28547f(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: h */
    static <C extends Comparable<?>> Range<C> m28548h(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    /* renamed from: i */
    public static <C extends Comparable<?>> Range<C> m28549i(C c, BoundType boundType) {
        int i = C70701.f17063a[boundType.ordinal()];
        if (i == 1) {
            return m28550k(c);
        }
        if (i == 2) {
            return m28545c(c);
        }
        throw new AssertionError();
    }

    /* renamed from: k */
    public static <C extends Comparable<?>> Range<C> m28550k(C c) {
        return m28548h(Cut.m26752d(c), Cut.m26751b());
    }

    /* renamed from: r */
    public static <C extends Comparable<?>> Range<C> m28551r(C c) {
        return m28548h(Cut.m26753e(), Cut.m26754f(c));
    }

    /* renamed from: t */
    static <C extends Comparable<?>> Function<Range<C>, Cut<C>> m28552t() {
        return LowerBoundFn.f17064a;
    }

    /* renamed from: w */
    public static <C extends Comparable<?>> Range<C> m28553w(C c, BoundType boundType, C c2, BoundType boundType2) {
        Preconditions.m5392s(boundType);
        Preconditions.m5392s(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return m28548h(boundType == boundType3 ? Cut.m26752d(c) : Cut.m26754f(c), boundType2 == boundType3 ? Cut.m26754f(c2) : Cut.m26752d(c2));
    }

    /* renamed from: x */
    static <C extends Comparable<?>> Ordering<Range<C>> m28554x() {
        return RangeLexOrdering.f17065a;
    }

    /* renamed from: y */
    private static String m28555y(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb = new StringBuilder(16);
        cut.mo34948j(sb);
        sb.append("..");
        cut2.mo34949k(sb);
        return sb.toString();
    }

    /* renamed from: z */
    public static <C extends Comparable<?>> Range<C> m28556z(C c, BoundType boundType) {
        int i = C70701.f17063a[boundType.ordinal()];
        if (i == 1) {
            return m28551r(c);
        }
        if (i == 2) {
            return m28546d(c);
        }
        throw new AssertionError();
    }

    /* renamed from: B */
    public BoundType mo36271B() {
        return this.upperBound.mo34955t();
    }

    /* renamed from: C */
    public C mo36272C() {
        return this.upperBound.mo34950l();
    }

    @Deprecated
    /* renamed from: b */
    public boolean apply(C c) {
        return mo36275g(c);
    }

    /* renamed from: e */
    public Range<C> mo36274e(DiscreteDomain<C> discreteDomain) {
        Preconditions.m5392s(discreteDomain);
        Cut<C> g = this.lowerBound.mo34945g(discreteDomain);
        Cut<C> g2 = this.upperBound.mo34945g(discreteDomain);
        return (g == this.lowerBound && g2 == this.upperBound) ? this : m28548h(g, g2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.lowerBound.equals(range.lowerBound) || !this.upperBound.equals(range.upperBound)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo36275g(C c) {
        Preconditions.m5392s(c);
        return this.lowerBound.mo34952n(c) && !this.upperBound.mo34952n(c);
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    /* renamed from: j */
    public boolean mo36277j(Range<C> range) {
        return this.lowerBound.compareTo(range.lowerBound) <= 0 && this.upperBound.compareTo(range.upperBound) >= 0;
    }

    /* renamed from: l */
    public boolean mo36278l() {
        return this.lowerBound != Cut.m26753e();
    }

    /* renamed from: m */
    public boolean mo36279m() {
        return this.upperBound != Cut.m26751b();
    }

    /* renamed from: n */
    public Range<C> mo36280n(Range<C> range) {
        int i = this.lowerBound.compareTo(range.lowerBound);
        int i2 = this.upperBound.compareTo(range.upperBound);
        if (i >= 0 && i2 <= 0) {
            return this;
        }
        if (i <= 0 && i2 >= 0) {
            return range;
        }
        Cut<C> cut = i >= 0 ? this.lowerBound : range.lowerBound;
        Cut<C> cut2 = i2 <= 0 ? this.upperBound : range.upperBound;
        Preconditions.m5387n(cut.compareTo(cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return m28548h(cut, cut2);
    }

    /* renamed from: p */
    public boolean mo36281p(Range<C> range) {
        return this.lowerBound.compareTo(range.upperBound) <= 0 && range.lowerBound.compareTo(this.upperBound) <= 0;
    }

    /* renamed from: q */
    public boolean mo36282q() {
        return this.lowerBound.equals(this.upperBound);
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return equals(f17062a) ? m28544a() : this;
    }

    public String toString() {
        return m28555y(this.lowerBound, this.upperBound);
    }

    /* renamed from: u */
    public BoundType mo36285u() {
        return this.lowerBound.mo34954r();
    }

    /* renamed from: v */
    public C mo36286v() {
        return this.lowerBound.mo34950l();
    }
}
