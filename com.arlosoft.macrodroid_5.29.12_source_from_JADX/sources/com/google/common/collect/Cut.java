package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    /* renamed from: com.google.common.collect.Cut$1 */
    static /* synthetic */ class C69481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16544a;

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
                f16544a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16544a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Cut.C69481.<clinit>():void");
        }
    }

    private static final class AboveAll extends Cut<Comparable<?>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final AboveAll f16545a = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super("");
        }

        private Object readResolve() {
            return f16545a;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* renamed from: i */
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo34948j(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo34949k(StringBuilder sb) {
            sb.append("+∞)");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Comparable<?> mo34950l() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Comparable<?> mo34951m(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.mo35003b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo34952n(Comparable<?> comparable) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public Comparable<?> mo34953q(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public BoundType mo34954r() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public BoundType mo34955t() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public Cut<Comparable<?>> mo34956v(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public Cut<Comparable<?>> mo34957w(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }
    }

    private static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        AboveValue(C c) {
            super((Comparable) Preconditions.m5392s(c));
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Cut<C> mo34945g(DiscreteDomain<C> discreteDomain) {
            C q = mo34953q(discreteDomain);
            return q != null ? Cut.m26754f(q) : Cut.m26751b();
        }

        public int hashCode() {
            return ~this.endpoint.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo34948j(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo34949k(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C mo34951m(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo34952n(C c) {
            return Range.m28547f(this.endpoint, c) < 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C mo34953q(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.mo35005d(this.endpoint);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public BoundType mo34954r() {
            return BoundType.OPEN;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public BoundType mo34955t() {
            return BoundType.CLOSED;
        }

        public String toString() {
            String valueOf = String.valueOf(this.endpoint);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2);
            sb.append("/");
            sb.append(valueOf);
            sb.append("\\");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public Cut<C> mo34956v(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C69481.f16544a[boundType.ordinal()];
            if (i == 1) {
                C d = discreteDomain.mo35005d(this.endpoint);
                return d == null ? Cut.m26753e() : Cut.m26754f(d);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public Cut<C> mo34957w(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C69481.f16544a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C d = discreteDomain.mo35005d(this.endpoint);
                return d == null ? Cut.m26751b() : Cut.m26754f(d);
            }
            throw new AssertionError();
        }
    }

    private static final class BelowAll extends Cut<Comparable<?>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final BelowAll f16546a = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super("");
        }

        private Object readResolve() {
            return f16546a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Cut<Comparable<?>> mo34945g(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return Cut.m26754f(discreteDomain.mo35004c());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* renamed from: i */
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo34948j(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo34949k(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Comparable<?> mo34950l() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Comparable<?> mo34951m(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo34952n(Comparable<?> comparable) {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public Comparable<?> mo34953q(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.mo35004c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public BoundType mo34954r() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public BoundType mo34955t() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public Cut<Comparable<?>> mo34956v(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public Cut<Comparable<?>> mo34957w(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    private static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        BelowValue(C c) {
            super((Comparable) Preconditions.m5392s(c));
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public int hashCode() {
            return this.endpoint.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo34948j(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo34949k(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C mo34951m(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.mo35007f(this.endpoint);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo34952n(C c) {
            return Range.m28547f(this.endpoint, c) <= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C mo34953q(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public BoundType mo34954r() {
            return BoundType.CLOSED;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public BoundType mo34955t() {
            return BoundType.OPEN;
        }

        public String toString() {
            String valueOf = String.valueOf(this.endpoint);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2);
            sb.append("\\");
            sb.append(valueOf);
            sb.append("/");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public Cut<C> mo34956v(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C69481.f16544a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C f = discreteDomain.mo35007f(this.endpoint);
                return f == null ? Cut.m26753e() : new AboveValue(f);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public Cut<C> mo34957w(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C69481.f16544a[boundType.ordinal()];
            if (i == 1) {
                C f = discreteDomain.mo35007f(this.endpoint);
                return f == null ? Cut.m26751b() : new AboveValue(f);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }
    }

    Cut(C c) {
        this.endpoint = c;
    }

    /* renamed from: b */
    static <C extends Comparable> Cut<C> m26751b() {
        return AboveAll.f16545a;
    }

    /* renamed from: d */
    static <C extends Comparable> Cut<C> m26752d(C c) {
        return new AboveValue(c);
    }

    /* renamed from: e */
    static <C extends Comparable> Cut<C> m26753e() {
        return BelowAll.f16546a;
    }

    /* renamed from: f */
    static <C extends Comparable> Cut<C> m26754f(C c) {
        return new BelowValue(c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            if (compareTo((Cut) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Cut<C> mo34945g(DiscreteDomain<C> discreteDomain) {
        return this;
    }

    public abstract int hashCode();

    /* renamed from: i */
    public int compareTo(Cut<C> cut) {
        if (cut == m26753e()) {
            return 1;
        }
        if (cut == m26751b()) {
            return -1;
        }
        int f = Range.m28547f(this.endpoint, cut.endpoint);
        if (f != 0) {
            return f;
        }
        return Booleans.m73511c(this instanceof AboveValue, cut instanceof AboveValue);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo34948j(StringBuilder sb);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo34949k(StringBuilder sb);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C mo34950l() {
        return this.endpoint;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract C mo34951m(DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract boolean mo34952n(C c);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract C mo34953q(DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract BoundType mo34954r();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract BoundType mo34955t();

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public abstract Cut<C> mo34956v(BoundType boundType, DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public abstract Cut<C> mo34957w(BoundType boundType, DiscreteDomain<C> discreteDomain);
}
