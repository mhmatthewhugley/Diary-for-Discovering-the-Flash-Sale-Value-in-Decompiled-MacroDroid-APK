package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    private final transient Reference<AvlNode<E>> f17242f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final transient GeneralRange<E> f17243g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final transient AvlNode<E> f17244o;

    /* renamed from: com.google.common.collect.TreeMultiset$4 */
    static /* synthetic */ class C71234 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17253a;

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
                f17253a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17253a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.C71234.<clinit>():void");
        }
    }

    private enum Aggregate {
        SIZE {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public int mo36686d(AvlNode<?> avlNode) {
                return avlNode.f17258b;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public long mo36687e(AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.f17260d;
            }
        },
        DISTINCT {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public int mo36686d(AvlNode<?> avlNode) {
                return 1;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public long mo36687e(AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0;
                }
                return (long) avlNode.f17259c;
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract int mo36686d(AvlNode<?> avlNode);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract long mo36687e(AvlNode<?> avlNode);
    }

    private static final class Reference<T> {

        /* renamed from: a */
        private T f17266a;

        private Reference() {
        }

        /* renamed from: a */
        public void mo36696a(T t, T t2) {
            if (this.f17266a == t) {
                this.f17266a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36697b() {
            this.f17266a = null;
        }

        /* renamed from: c */
        public T mo36698c() {
            return this.f17266a;
        }
    }

    TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
        super(generalRange.mo35254b());
        this.f17242f = reference;
        this.f17243g = generalRange;
        this.f17244o = avlNode;
    }

    /* renamed from: B */
    private long m29039B(Aggregate aggregate, AvlNode<E> avlNode) {
        long e;
        long B;
        if (avlNode == null) {
            return 0;
        }
        int compare = comparator().compare(NullnessCasts.m28457a(this.f17243g.mo35258f()), avlNode.mo36695x());
        if (compare < 0) {
            return m29039B(aggregate, avlNode.f17262f);
        }
        if (compare == 0) {
            int i = C71234.f17253a[this.f17243g.mo35256e().ordinal()];
            if (i == 1) {
                e = (long) aggregate.mo36686d(avlNode);
                B = aggregate.mo36687e(avlNode.f17262f);
            } else if (i == 2) {
                return aggregate.mo36687e(avlNode.f17262f);
            } else {
                throw new AssertionError();
            }
        } else {
            e = aggregate.mo36687e(avlNode.f17262f) + ((long) aggregate.mo36686d(avlNode));
            B = m29039B(aggregate, avlNode.f17263g);
        }
        return e + B;
    }

    /* renamed from: D */
    private long m29040D(Aggregate aggregate) {
        AvlNode c = this.f17242f.mo36698c();
        long e = aggregate.mo36687e(c);
        if (this.f17243g.mo35262i()) {
            e -= m29039B(aggregate, c);
        }
        return this.f17243g.mo35263j() ? e - m29054z(aggregate, c) : e;
    }

    /* renamed from: F */
    static int m29041F(AvlNode<?> avlNode) {
        if (avlNode == null) {
            return 0;
        }
        return avlNode.f17259c;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public AvlNode<E> m29042I() {
        AvlNode<E> avlNode;
        AvlNode c = this.f17242f.mo36698c();
        if (c == null) {
            return null;
        }
        if (this.f17243g.mo35262i()) {
            Object a = NullnessCasts.m28457a(this.f17243g.mo35258f());
            avlNode = c.m29106s(comparator(), a);
            if (avlNode == null) {
                return null;
            }
            if (this.f17243g.mo35256e() == BoundType.OPEN && comparator().compare(a, avlNode.mo36695x()) == 0) {
                avlNode = avlNode.m29087L();
            }
        } else {
            avlNode = this.f17244o.m29087L();
        }
        if (avlNode == this.f17244o || !this.f17243g.mo35255c(avlNode.mo36695x())) {
            return null;
        }
        return avlNode;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public AvlNode<E> m29043J() {
        AvlNode<E> avlNode;
        AvlNode c = this.f17242f.mo36698c();
        if (c == null) {
            return null;
        }
        if (this.f17243g.mo35263j()) {
            Object a = NullnessCasts.m28457a(this.f17243g.mo35260h());
            avlNode = c.m29108v(comparator(), a);
            if (avlNode == null) {
                return null;
            }
            if (this.f17243g.mo35259g() == BoundType.OPEN && comparator().compare(a, avlNode.mo36695x()) == 0) {
                avlNode = avlNode.m29110z();
            }
        } else {
            avlNode = this.f17244o.m29110z();
        }
        if (avlNode == this.f17244o || !this.f17243g.mo35255c(avlNode.mo36695x())) {
            return null;
        }
        return avlNode;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static <T> void m29044M(AvlNode<T> avlNode, AvlNode<T> avlNode2) {
        AvlNode unused = avlNode.f17265i = avlNode2;
        AvlNode unused2 = avlNode2.f17264h = avlNode;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static <T> void m29045O(AvlNode<T> avlNode, AvlNode<T> avlNode2, AvlNode<T> avlNode3) {
        m29044M(avlNode, avlNode2);
        m29044M(avlNode2, avlNode3);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public Multiset.Entry<E> m29046P(final AvlNode<E> avlNode) {
        return new Multisets.AbstractEntry<E>() {
            @ParametricNullness
            /* renamed from: b */
            public E mo35049b() {
                return avlNode.mo36695x();
            }

            public int getCount() {
                int w = avlNode.mo36694w();
                return w == 0 ? TreeMultiset.this.mo34601J1(mo35049b()) : w;
            }
        };
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        Serialization.m28703a(AbstractSortedMultiset.class, "comparator").mo36337b(this, comparator);
        Serialization.m28703a(TreeMultiset.class, "range").mo36337b(this, GeneralRange.m27166a(comparator));
        Serialization.m28703a(TreeMultiset.class, "rootReference").mo36337b(this, new Reference());
        AvlNode avlNode = new AvlNode();
        Serialization.m28703a(TreeMultiset.class, "header").mo36337b(this, avlNode);
        m29044M(avlNode, avlNode);
        Serialization.m28708f(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo34642C().comparator());
        Serialization.m28713k(this, objectOutputStream);
    }

    /* renamed from: z */
    private long m29054z(Aggregate aggregate, AvlNode<E> avlNode) {
        long e;
        long z;
        if (avlNode == null) {
            return 0;
        }
        int compare = comparator().compare(NullnessCasts.m28457a(this.f17243g.mo35260h()), avlNode.mo36695x());
        if (compare > 0) {
            return m29054z(aggregate, avlNode.f17263g);
        }
        if (compare == 0) {
            int i = C71234.f17253a[this.f17243g.mo35259g().ordinal()];
            if (i == 1) {
                e = (long) aggregate.mo36686d(avlNode);
                z = aggregate.mo36687e(avlNode.f17263g);
            } else if (i == 2) {
                return aggregate.mo36687e(avlNode.f17263g);
            } else {
                throw new AssertionError();
            }
        } else {
            e = aggregate.mo36687e(avlNode.f17263g) + ((long) aggregate.mo36686d(avlNode));
            z = m29054z(aggregate, avlNode.f17262f);
        }
        return e + z;
    }

    /* renamed from: C */
    public /* bridge */ /* synthetic */ NavigableSet mo34642C() {
        return super.m26439C();
    }

    /* renamed from: E1 */
    public SortedMultiset<E> mo34979E1(@ParametricNullness E e, BoundType boundType) {
        return new TreeMultiset(this.f17242f, this.f17243g.mo35264k(GeneralRange.m27168n(comparator(), e, boundType)), this.f17244o);
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        try {
            AvlNode c = this.f17242f.mo36698c();
            if (this.f17243g.mo35255c(obj)) {
                if (c != null) {
                    return c.mo36692t(comparator(), obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* renamed from: T1 */
    public SortedMultiset<E> mo34981T1(@ParametricNullness E e, BoundType boundType) {
        return new TreeMultiset(this.f17242f, this.f17243g.mo35264k(GeneralRange.m27167d(comparator(), e, boundType)), this.f17244o);
    }

    /* renamed from: Z0 */
    public /* bridge */ /* synthetic */ SortedMultiset mo34696Z0(@ParametricNullness Object obj, BoundType boundType, @ParametricNullness Object obj2, BoundType boundType2) {
        return super.mo34696Z0(obj, boundType, obj2, boundType2);
    }

    public void clear() {
        if (this.f17243g.mo35262i() || this.f17243g.mo35263j()) {
            Iterators.m27709e(mo34607i());
            return;
        }
        AvlNode<E> l = this.f17244o.m29087L();
        while (true) {
            AvlNode<E> avlNode = this.f17244o;
            if (l != avlNode) {
                AvlNode<E> l2 = l.m29087L();
                int unused = l.f17258b = 0;
                AvlNode unused2 = l.f17262f = null;
                AvlNode unused3 = l.f17263g = null;
                AvlNode unused4 = l.f17264h = null;
                AvlNode unused5 = l.f17265i = null;
                l = l2;
            } else {
                m29044M(avlNode, avlNode);
                this.f17242f.mo36697b();
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @CanIgnoreReturnValue
    /* renamed from: e0 */
    public int mo34603e0(@ParametricNullness E e, int i) {
        CollectPreconditions.m26535b(i, "count");
        boolean z = true;
        if (!this.f17243g.mo35255c(e)) {
            if (i != 0) {
                z = false;
            }
            Preconditions.m5377d(z);
            return 0;
        }
        AvlNode c = this.f17242f.mo36698c();
        if (c == null) {
            if (i > 0) {
                mo34611k1(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f17242f.mo36696a(c, c.mo36690K(comparator(), e, i, iArr));
        return iArr[0];
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo34604f() {
        return Ints.m73622k(m29040D(Aggregate.DISTINCT));
    }

    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<E> mo34605h() {
        return Multisets.m28376e(mo34607i());
    }

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    public int mo34606h1(Object obj, int i) {
        CollectPreconditions.m26535b(i, "occurrences");
        if (i == 0) {
            return mo34601J1(obj);
        }
        AvlNode c = this.f17242f.mo36698c();
        int[] iArr = new int[1];
        try {
            if (this.f17243g.mo35255c(obj)) {
                if (c != null) {
                    this.f17242f.mo36696a(c, c.mo36688E(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Iterator<Multiset.Entry<E>> mo34607i() {
        return new Iterator<Multiset.Entry<E>>() {

            /* renamed from: a */
            AvlNode<E> f17247a;

            /* renamed from: c */
            Multiset.Entry<E> f17248c;

            {
                this.f17247a = TreeMultiset.this.m29042I();
            }

            /* renamed from: a */
            public Multiset.Entry<E> next() {
                if (hasNext()) {
                    TreeMultiset treeMultiset = TreeMultiset.this;
                    AvlNode<E> avlNode = this.f17247a;
                    Objects.requireNonNull(avlNode);
                    Multiset.Entry<E> p = treeMultiset.m29046P(avlNode);
                    this.f17248c = p;
                    if (this.f17247a.m29087L() == TreeMultiset.this.f17244o) {
                        this.f17247a = null;
                    } else {
                        this.f17247a = this.f17247a.m29087L();
                    }
                    return p;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.f17247a == null) {
                    return false;
                }
                if (!TreeMultiset.this.f17243g.mo35265l(this.f17247a.mo36695x())) {
                    return true;
                }
                this.f17247a = null;
                return false;
            }

            public void remove() {
                Preconditions.m5399z(this.f17248c != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.mo34603e0(this.f17248c.mo35049b(), 0);
                this.f17248c = null;
            }
        };
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator<E> iterator() {
        return Multisets.m28381j(this);
    }

    @CanIgnoreReturnValue
    /* renamed from: k1 */
    public int mo34611k1(@ParametricNullness E e, int i) {
        CollectPreconditions.m26535b(i, "occurrences");
        if (i == 0) {
            return mo34601J1(e);
        }
        Preconditions.m5377d(this.f17243g.mo35255c(e));
        AvlNode c = this.f17242f.mo36698c();
        if (c == null) {
            comparator().compare(e, e);
            AvlNode avlNode = new AvlNode(e, i);
            AvlNode<E> avlNode2 = this.f17244o;
            m29045O(avlNode2, avlNode, avlNode2);
            this.f17242f.mo36696a(c, avlNode);
            return 0;
        }
        int[] iArr = new int[1];
        this.f17242f.mo36696a(c, c.mo36691o(comparator(), e, i, iArr));
        return iArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Iterator<Multiset.Entry<E>> mo34702l() {
        return new Iterator<Multiset.Entry<E>>() {

            /* renamed from: a */
            AvlNode<E> f17250a;

            /* renamed from: c */
            Multiset.Entry<E> f17251c = null;

            {
                this.f17250a = TreeMultiset.this.m29043J();
            }

            /* renamed from: a */
            public Multiset.Entry<E> next() {
                if (hasNext()) {
                    Objects.requireNonNull(this.f17250a);
                    Multiset.Entry<E> p = TreeMultiset.this.m29046P(this.f17250a);
                    this.f17251c = p;
                    if (this.f17250a.m29110z() == TreeMultiset.this.f17244o) {
                        this.f17250a = null;
                    } else {
                        this.f17250a = this.f17250a.m29110z();
                    }
                    return p;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.f17250a == null) {
                    return false;
                }
                if (!TreeMultiset.this.f17243g.mo35266m(this.f17250a.mo36695x())) {
                    return true;
                }
                this.f17250a = null;
                return false;
            }

            public void remove() {
                Preconditions.m5399z(this.f17251c != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.mo34603e0(this.f17251c.mo35049b(), 0);
                this.f17251c = null;
            }
        };
    }

    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    public int size() {
        return Ints.m73622k(m29040D(Aggregate.SIZE));
    }

    /* renamed from: t1 */
    public /* bridge */ /* synthetic */ SortedMultiset mo34706t1() {
        return super.mo34706t1();
    }

    @CanIgnoreReturnValue
    /* renamed from: z1 */
    public boolean mo34613z1(@ParametricNullness E e, int i, int i2) {
        CollectPreconditions.m26535b(i2, "newCount");
        CollectPreconditions.m26535b(i, "oldCount");
        Preconditions.m5377d(this.f17243g.mo35255c(e));
        AvlNode c = this.f17242f.mo36698c();
        if (c != null) {
            int[] iArr = new int[1];
            this.f17242f.mo36696a(c, c.mo36689J(comparator(), e, i, i2, iArr));
            if (iArr[0] == i) {
                return true;
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                mo34611k1(e, i2);
            }
            return true;
        }
    }

    private static final class AvlNode<E> {

        /* renamed from: a */
        private final E f17257a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f17258b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f17259c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f17260d;

        /* renamed from: e */
        private int f17261e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public AvlNode<E> f17262f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public AvlNode<E> f17263g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public AvlNode<E> f17264h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public AvlNode<E> f17265i;

        AvlNode(@ParametricNullness E e, int i) {
            Preconditions.m5377d(i > 0);
            this.f17257a = e;
            this.f17258b = i;
            this.f17260d = (long) i;
            this.f17259c = 1;
            this.f17261e = 1;
            this.f17262f = null;
            this.f17263g = null;
        }

        /* renamed from: A */
        private AvlNode<E> m29079A() {
            int r = m29105r();
            if (r == -2) {
                Objects.requireNonNull(this.f17263g);
                if (this.f17263g.m29105r() > 0) {
                    this.f17263g = this.f17263g.m29086I();
                }
                return m29085H();
            } else if (r != 2) {
                m29081C();
                return this;
            } else {
                Objects.requireNonNull(this.f17262f);
                if (this.f17262f.m29105r() < 0) {
                    this.f17262f = this.f17262f.m29085H();
                }
                return m29086I();
            }
        }

        /* renamed from: B */
        private void m29080B() {
            m29082D();
            m29081C();
        }

        /* renamed from: C */
        private void m29081C() {
            this.f17261e = Math.max(m29109y(this.f17262f), m29109y(this.f17263g)) + 1;
        }

        /* renamed from: D */
        private void m29082D() {
            this.f17259c = TreeMultiset.m29041F(this.f17262f) + 1 + TreeMultiset.m29041F(this.f17263g);
            this.f17260d = ((long) this.f17258b) + m29088M(this.f17262f) + m29088M(this.f17263g);
        }

        /* renamed from: F */
        private AvlNode<E> m29083F(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.f17263g;
            if (avlNode2 == null) {
                return this.f17262f;
            }
            this.f17263g = avlNode2.m29083F(avlNode);
            this.f17259c--;
            this.f17260d -= (long) avlNode.f17258b;
            return m29079A();
        }

        /* renamed from: G */
        private AvlNode<E> m29084G(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.f17262f;
            if (avlNode2 == null) {
                return this.f17263g;
            }
            this.f17262f = avlNode2.m29084G(avlNode);
            this.f17259c--;
            this.f17260d -= (long) avlNode.f17258b;
            return m29079A();
        }

        /* renamed from: H */
        private AvlNode<E> m29085H() {
            Preconditions.m5398y(this.f17263g != null);
            AvlNode<E> avlNode = this.f17263g;
            this.f17263g = avlNode.f17262f;
            avlNode.f17262f = this;
            avlNode.f17260d = this.f17260d;
            avlNode.f17259c = this.f17259c;
            m29080B();
            avlNode.m29081C();
            return avlNode;
        }

        /* renamed from: I */
        private AvlNode<E> m29086I() {
            Preconditions.m5398y(this.f17262f != null);
            AvlNode<E> avlNode = this.f17262f;
            this.f17262f = avlNode.f17263g;
            avlNode.f17263g = this;
            avlNode.f17260d = this.f17260d;
            avlNode.f17259c = this.f17259c;
            m29080B();
            avlNode.m29081C();
            return avlNode;
        }

        /* access modifiers changed from: private */
        /* renamed from: L */
        public AvlNode<E> m29087L() {
            AvlNode<E> avlNode = this.f17265i;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        /* renamed from: M */
        private static long m29088M(AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return avlNode.f17260d;
        }

        /* renamed from: p */
        private AvlNode<E> m29103p(@ParametricNullness E e, int i) {
            this.f17262f = new AvlNode<>(e, i);
            TreeMultiset.m29045O(m29110z(), this.f17262f, this);
            this.f17261e = Math.max(2, this.f17261e);
            this.f17259c++;
            this.f17260d += (long) i;
            return this;
        }

        /* renamed from: q */
        private AvlNode<E> m29104q(@ParametricNullness E e, int i) {
            AvlNode<E> avlNode = new AvlNode<>(e, i);
            this.f17263g = avlNode;
            TreeMultiset.m29045O(this, avlNode, m29087L());
            this.f17261e = Math.max(2, this.f17261e);
            this.f17259c++;
            this.f17260d += (long) i;
            return this;
        }

        /* renamed from: r */
        private int m29105r() {
            return m29109y(this.f17262f) - m29109y(this.f17263g);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public AvlNode<E> m29106s(Comparator<? super E> comparator, @ParametricNullness E e) {
            int compare = comparator.compare(e, mo36695x());
            if (compare < 0) {
                AvlNode<E> avlNode = this.f17262f;
                return avlNode == null ? this : (AvlNode) MoreObjects.m5332a(avlNode.m29106s(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                AvlNode<E> avlNode2 = this.f17263g;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.m29106s(comparator, e);
            }
        }

        /* renamed from: u */
        private AvlNode<E> m29107u() {
            int i = this.f17258b;
            this.f17258b = 0;
            TreeMultiset.m29044M(m29110z(), m29087L());
            AvlNode<E> avlNode = this.f17262f;
            if (avlNode == null) {
                return this.f17263g;
            }
            AvlNode<E> avlNode2 = this.f17263g;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.f17261e >= avlNode2.f17261e) {
                AvlNode z = m29110z();
                z.f17262f = this.f17262f.m29083F(z);
                z.f17263g = this.f17263g;
                z.f17259c = this.f17259c - 1;
                z.f17260d = this.f17260d - ((long) i);
                return z.m29079A();
            }
            AvlNode L = m29087L();
            L.f17263g = this.f17263g.m29084G(L);
            L.f17262f = this.f17262f;
            L.f17259c = this.f17259c - 1;
            L.f17260d = this.f17260d - ((long) i);
            return L.m29079A();
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public AvlNode<E> m29108v(Comparator<? super E> comparator, @ParametricNullness E e) {
            int compare = comparator.compare(e, mo36695x());
            if (compare > 0) {
                AvlNode<E> avlNode = this.f17263g;
                return avlNode == null ? this : (AvlNode) MoreObjects.m5332a(avlNode.m29108v(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                AvlNode<E> avlNode2 = this.f17262f;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.m29108v(comparator, e);
            }
        }

        /* renamed from: y */
        private static int m29109y(AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return avlNode.f17261e;
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public AvlNode<E> m29110z() {
            AvlNode<E> avlNode = this.f17264h;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public AvlNode<E> mo36688E(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int compare = comparator.compare(e, mo36695x());
            if (compare < 0) {
                AvlNode<E> avlNode = this.f17262f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f17262f = avlNode.mo36688E(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f17259c--;
                        this.f17260d -= (long) iArr[0];
                    } else {
                        this.f17260d -= (long) i;
                    }
                }
                return iArr[0] == 0 ? this : m29079A();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.f17263g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f17263g = avlNode2.mo36688E(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f17259c--;
                        this.f17260d -= (long) iArr[0];
                    } else {
                        this.f17260d -= (long) i;
                    }
                }
                return m29079A();
            } else {
                int i2 = this.f17258b;
                iArr[0] = i2;
                if (i >= i2) {
                    return m29107u();
                }
                this.f17258b = i2 - i;
                this.f17260d -= (long) i;
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public AvlNode<E> mo36689J(Comparator<? super E> comparator, @ParametricNullness E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, mo36695x());
            if (compare < 0) {
                AvlNode<E> avlNode = this.f17262f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : m29103p(e, i2);
                }
                this.f17262f = avlNode.mo36689J(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f17259c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f17259c++;
                    }
                    this.f17260d += (long) (i2 - iArr[0]);
                }
                return m29079A();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.f17263g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : m29104q(e, i2);
                }
                this.f17263g = avlNode2.mo36689J(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f17259c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f17259c++;
                    }
                    this.f17260d += (long) (i2 - iArr[0]);
                }
                return m29079A();
            } else {
                int i3 = this.f17258b;
                iArr[0] = i3;
                if (i == i3) {
                    if (i2 == 0) {
                        return m29107u();
                    }
                    this.f17260d += (long) (i2 - i3);
                    this.f17258b = i2;
                }
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public AvlNode<E> mo36690K(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int compare = comparator.compare(e, mo36695x());
            if (compare < 0) {
                AvlNode<E> avlNode = this.f17262f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return i > 0 ? m29103p(e, i) : this;
                }
                this.f17262f = avlNode.mo36690K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f17259c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f17259c++;
                }
                this.f17260d += (long) (i - iArr[0]);
                return m29079A();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.f17263g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return i > 0 ? m29104q(e, i) : this;
                }
                this.f17263g = avlNode2.mo36690K(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f17259c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f17259c++;
                }
                this.f17260d += (long) (i - iArr[0]);
                return m29079A();
            } else {
                int i2 = this.f17258b;
                iArr[0] = i2;
                if (i == 0) {
                    return m29107u();
                }
                this.f17260d += (long) (i - i2);
                this.f17258b = i;
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public AvlNode<E> mo36691o(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int compare = comparator.compare(e, mo36695x());
            boolean z = true;
            if (compare < 0) {
                AvlNode<E> avlNode = this.f17262f;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return m29103p(e, i);
                }
                int i2 = avlNode.f17261e;
                AvlNode<E> o = avlNode.mo36691o(comparator, e, i, iArr);
                this.f17262f = o;
                if (iArr[0] == 0) {
                    this.f17259c++;
                }
                this.f17260d += (long) i;
                return o.f17261e == i2 ? this : m29079A();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.f17263g;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return m29104q(e, i);
                }
                int i3 = avlNode2.f17261e;
                AvlNode<E> o2 = avlNode2.mo36691o(comparator, e, i, iArr);
                this.f17263g = o2;
                if (iArr[0] == 0) {
                    this.f17259c++;
                }
                this.f17260d += (long) i;
                return o2.f17261e == i3 ? this : m29079A();
            } else {
                int i4 = this.f17258b;
                iArr[0] = i4;
                long j = (long) i;
                if (((long) i4) + j > 2147483647L) {
                    z = false;
                }
                Preconditions.m5377d(z);
                this.f17258b += i;
                this.f17260d += j;
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public int mo36692t(Comparator<? super E> comparator, @ParametricNullness E e) {
            int compare = comparator.compare(e, mo36695x());
            if (compare < 0) {
                AvlNode<E> avlNode = this.f17262f;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.mo36692t(comparator, e);
            } else if (compare <= 0) {
                return this.f17258b;
            } else {
                AvlNode<E> avlNode2 = this.f17263g;
                if (avlNode2 == null) {
                    return 0;
                }
                return avlNode2.mo36692t(comparator, e);
            }
        }

        public String toString() {
            return Multisets.m28379h(mo36695x(), mo36694w()).toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public int mo36694w() {
            return this.f17258b;
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: x */
        public E mo36695x() {
            return NullnessCasts.m28457a(this.f17257a);
        }

        AvlNode() {
            this.f17257a = null;
            this.f17258b = 1;
        }
    }
}
