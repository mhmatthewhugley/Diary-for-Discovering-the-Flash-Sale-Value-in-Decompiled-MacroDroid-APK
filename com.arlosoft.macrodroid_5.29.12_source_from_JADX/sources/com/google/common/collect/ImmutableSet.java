package com.google.common.collect;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient ImmutableList<E> f16711c;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        @VisibleForTesting

        /* renamed from: d */
        Object[] f16712d;

        /* renamed from: e */
        private int f16713e;

        public Builder() {
            super(4);
        }

        /* renamed from: l */
        private void m27523l(E e) {
            Objects.requireNonNull(this.f16712d);
            int length = this.f16712d.length - 1;
            int hashCode = e.hashCode();
            int c = Hashing.m27249c(hashCode);
            while (true) {
                int i = c & length;
                Object[] objArr = this.f16712d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f16713e += hashCode;
                    super.mo35364a(e);
                    return;
                } else if (!obj.equals(e)) {
                    c = i + 1;
                } else {
                    return;
                }
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public Builder<E> mo35365e(E e) {
            Preconditions.m5392s(e);
            if (this.f16712d == null || ImmutableSet.m27513p(this.f16644b) > this.f16712d.length) {
                this.f16712d = null;
                super.mo35364a(e);
                return this;
            }
            m27523l(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public Builder<E> mo35518j(E... eArr) {
            if (this.f16712d != null) {
                for (E i : eArr) {
                    mo35365e(i);
                }
            } else {
                super.mo35366f(eArr);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: k */
        public Builder<E> mo35519k(Iterator<? extends E> it) {
            Preconditions.m5392s(it);
            while (it.hasNext()) {
                mo35365e(it.next());
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.ImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableSet<E> mo35520m() {
            /*
                r8 = this;
                int r0 = r8.f16644b
                if (r0 == 0) goto L_0x005c
                r1 = 1
                if (r0 == r1) goto L_0x004f
                java.lang.Object[] r2 = r8.f16712d
                if (r2 == 0) goto L_0x003b
                int r0 = com.google.common.collect.ImmutableSet.m27513p(r0)
                java.lang.Object[] r2 = r8.f16712d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003b
                int r0 = r8.f16644b
                java.lang.Object[] r2 = r8.f16643a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.m27509M(r0, r2)
                if (r0 == 0) goto L_0x0028
                java.lang.Object[] r0 = r8.f16643a
                int r2 = r8.f16644b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L_0x002a
            L_0x0028:
                java.lang.Object[] r0 = r8.f16643a
            L_0x002a:
                r3 = r0
                com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
                int r4 = r8.f16713e
                java.lang.Object[] r5 = r8.f16712d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f16644b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0049
            L_0x003b:
                int r0 = r8.f16644b
                java.lang.Object[] r2 = r8.f16643a
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m27514q(r0, r2)
                int r2 = r0.size()
                r8.f16644b = r2
            L_0x0049:
                r8.f16645c = r1
                r1 = 0
                r8.f16712d = r1
                return r0
            L_0x004f:
                java.lang.Object[] r0 = r8.f16643a
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m27507I(r0)
                return r0
            L_0x005c:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m27506F()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSet.Builder.mo35520m():com.google.common.collect.ImmutableSet");
        }
    }

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return ImmutableSet.m27518z(this.elements);
        }
    }

    ImmutableSet() {
    }

    /* renamed from: F */
    public static <E> ImmutableSet<E> m27506F() {
        return RegularImmutableSet.f17098z;
    }

    /* renamed from: I */
    public static <E> ImmutableSet<E> m27507I(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: J */
    public static <E> ImmutableSet<E> m27508J(E e, E e2, E e3) {
        return m27514q(3, e, e2, e3);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static boolean m27509M(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: n */
    public static <E> Builder<E> m27512n() {
        return new Builder<>();
    }

    @VisibleForTesting
    /* renamed from: p */
    static int m27513p(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.m5378e(z, "collection too large");
        return BasicMeasure.EXACTLY;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static <E> ImmutableSet<E> m27514q(int i, Object... objArr) {
        if (i == 0) {
            return m27506F();
        }
        if (i != 1) {
            int p = m27513p(i);
            Object[] objArr2 = new Object[p];
            int i2 = p - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object a = ObjectArrays.m28465a(objArr[i5], i5);
                int hashCode = a.hashCode();
                int c = Hashing.m27249c(hashCode);
                while (true) {
                    int i6 = c & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = a;
                        objArr2[i6] = a;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj.equals(a)) {
                        break;
                    } else {
                        c++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new SingletonImmutableSet(obj2);
            } else if (m27513p(i4) < p / 2) {
                return m27514q(i4, objArr);
            } else {
                if (m27509M(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return m27507I(obj3);
        }
    }

    /* renamed from: t */
    public static <E> ImmutableSet<E> m27515t(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return m27516u((Collection) iterable);
        }
        return m27517w(iterable.iterator());
    }

    /* renamed from: u */
    public static <E> ImmutableSet<E> m27516u(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.mo34781j()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m27514q(array.length, array);
    }

    /* renamed from: w */
    public static <E> ImmutableSet<E> m27517w(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m27506F();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m27507I(next);
        }
        return new Builder().mo35365e(next).mo35519k(it).mo35520m();
    }

    /* renamed from: z */
    public static <E> ImmutableSet<E> m27518z(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m27506F();
        }
        if (length != 1) {
            return m27514q(eArr.length, (Object[]) eArr.clone());
        }
        return m27507I(eArr[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public ImmutableList<E> mo35439B() {
        return ImmutableList.m27304l(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo35028D() {
        return false;
    }

    /* renamed from: c */
    public ImmutableList<E> mo35029c() {
        ImmutableList<E> immutableList = this.f16711c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> B = mo35439B();
        this.f16711c = B;
        return B;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !mo35028D() || !((ImmutableSet) obj).mo35028D() || hashCode() == obj.hashCode()) {
            return Sets.m28719b(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Sets.m28723f(this);
    }

    /* renamed from: k */
    public abstract UnmodifiableIterator<E> iterator();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
