package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.p353io.FileUtils;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Collections2 {

    static class FilteredCollection<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f16477a;

        /* renamed from: c */
        final Predicate<? super E> f16478c;

        FilteredCollection(Collection<E> collection, Predicate<? super E> predicate) {
            this.f16477a = collection;
            this.f16478c = predicate;
        }

        public boolean add(@ParametricNullness E e) {
            Preconditions.m5377d(this.f16478c.apply(e));
            return this.f16477a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                Preconditions.m5377d(this.f16478c.apply(apply));
            }
            return this.f16477a.addAll(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public FilteredCollection<E> mo34785c(Predicate<? super E> predicate) {
            return new FilteredCollection<>(this.f16477a, Predicates.m5402c(this.f16478c, predicate));
        }

        public void clear() {
            Iterables.m27683j(this.f16477a, this.f16478c);
        }

        public boolean contains(Object obj) {
            if (Collections2.m26545g(this.f16477a, obj)) {
                return this.f16478c.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return Collections2.m26540b(this, collection);
        }

        public boolean isEmpty() {
            return !Iterables.m27675b(this.f16477a, this.f16478c);
        }

        public Iterator<E> iterator() {
            return Iterators.m27720p(this.f16477a.iterator(), this.f16478c);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.f16477a.remove(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f16477a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f16478c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f16477a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f16478c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            int i = 0;
            for (E apply : this.f16477a) {
                if (this.f16478c.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public Object[] toArray() {
            return Lists.m27834j(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return Lists.m27834j(iterator()).toArray(tArr);
        }
    }

    private static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {

        /* renamed from: a */
        final ImmutableList<E> f16479a;

        /* renamed from: c */
        final Comparator<? super E> f16480c;

        /* renamed from: d */
        final int f16481d;

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.m26543e(this.f16479a, (List) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<List<E>> iterator() {
            return new OrderedPermutationIterator(this.f16479a, this.f16480c);
        }

        public int size() {
            return this.f16481d;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f16479a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 30);
            sb.append("orderedPermutationCollection(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {

        /* renamed from: d */
        List<E> f16482d;

        /* renamed from: f */
        final Comparator<? super E> f16483f;

        OrderedPermutationIterator(List<E> list, Comparator<? super E> comparator) {
            this.f16482d = Lists.m27833i(list);
            this.f16483f = comparator;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo34802d() {
            int g = mo34804g();
            if (g == -1) {
                this.f16482d = null;
                return;
            }
            Objects.requireNonNull(this.f16482d);
            Collections.swap(this.f16482d, g, mo34805h(g));
            Collections.reverse(this.f16482d.subList(g + 1, this.f16482d.size()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public List<E> mo34417a() {
            List<E> list = this.f16482d;
            if (list == null) {
                return (List) mo34418b();
            }
            ImmutableList<E> t = ImmutableList.m27309t(list);
            mo34802d();
            return t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo34804g() {
            Objects.requireNonNull(this.f16482d);
            for (int size = this.f16482d.size() - 2; size >= 0; size--) {
                if (this.f16483f.compare(this.f16482d.get(size), this.f16482d.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo34805h(int i) {
            Objects.requireNonNull(this.f16482d);
            E e = this.f16482d.get(i);
            for (int size = this.f16482d.size() - 1; size > i; size--) {
                if (this.f16483f.compare(e, this.f16482d.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    private static final class PermutationCollection<E> extends AbstractCollection<List<E>> {

        /* renamed from: a */
        final ImmutableList<E> f16484a;

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.m26543e(this.f16484a, (List) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<List<E>> iterator() {
            return new PermutationIterator(this.f16484a);
        }

        public int size() {
            return IntMath.m73469e(this.f16484a.size());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f16484a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append("permutations(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class PermutationIterator<E> extends AbstractIterator<List<E>> {

        /* renamed from: d */
        final List<E> f16485d;

        /* renamed from: f */
        final int[] f16486f;

        /* renamed from: g */
        final int[] f16487g;

        /* renamed from: o */
        int f16488o = Integer.MAX_VALUE;

        PermutationIterator(List<E> list) {
            this.f16485d = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f16486f = iArr;
            int[] iArr2 = new int[size];
            this.f16487g = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo34811d() {
            int size = this.f16485d.size() - 1;
            this.f16488o = size;
            if (size != -1) {
                int i = 0;
                while (true) {
                    int[] iArr = this.f16486f;
                    int i2 = this.f16488o;
                    int i3 = iArr[i2] + this.f16487g[i2];
                    if (i3 < 0) {
                        mo34813g();
                    } else if (i3 != i2 + 1) {
                        Collections.swap(this.f16485d, (i2 - iArr[i2]) + i, (i2 - i3) + i);
                        this.f16486f[this.f16488o] = i3;
                        return;
                    } else if (i2 != 0) {
                        i++;
                        mo34813g();
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public List<E> mo34417a() {
            if (this.f16488o <= 0) {
                return (List) mo34418b();
            }
            ImmutableList<E> t = ImmutableList.m27309t(this.f16485d);
            mo34811d();
            return t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo34813g() {
            int[] iArr = this.f16487g;
            int i = this.f16488o;
            iArr[i] = -iArr[i];
            this.f16488o = i - 1;
        }
    }

    static class TransformedCollection<F, T> extends AbstractCollection<T> {

        /* renamed from: a */
        final Collection<F> f16489a;

        /* renamed from: c */
        final Function<? super F, ? extends T> f16490c;

        TransformedCollection(Collection<F> collection, Function<? super F, ? extends T> function) {
            this.f16489a = (Collection) Preconditions.m5392s(collection);
            this.f16490c = (Function) Preconditions.m5392s(function);
        }

        public void clear() {
            this.f16489a.clear();
        }

        public boolean isEmpty() {
            return this.f16489a.isEmpty();
        }

        public Iterator<T> iterator() {
            return Iterators.m27703J(this.f16489a.iterator(), this.f16490c);
        }

        public int size() {
            return this.f16489a.size();
        }
    }

    private Collections2() {
    }

    /* renamed from: b */
    static boolean m26540b(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static <E> ObjectCountHashMap<E> m26541c(Collection<E> collection) {
        ObjectCountHashMap<E> objectCountHashMap = new ObjectCountHashMap<>();
        for (E next : collection) {
            objectCountHashMap.mo36260u(next, objectCountHashMap.mo36250f(next) + 1);
        }
        return objectCountHashMap;
    }

    /* renamed from: d */
    public static <E> Collection<E> m26542d(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof FilteredCollection) {
            return ((FilteredCollection) collection).mo34785c(predicate);
        }
        return new FilteredCollection((Collection) Preconditions.m5392s(collection), (Predicate) Preconditions.m5392s(predicate));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m26543e(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ObjectCountHashMap<?> c = m26541c(list);
        ObjectCountHashMap<?> c2 = m26541c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (c.mo36253k(i) != c2.mo36250f(c.mo36252i(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    static StringBuilder m26544f(int i) {
        CollectPreconditions.m26535b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, FileUtils.ONE_GB));
    }

    /* renamed from: g */
    static boolean m26545g(Collection<?> collection, Object obj) {
        Preconditions.m5392s(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: h */
    static boolean m26546h(Collection<?> collection, Object obj) {
        Preconditions.m5392s(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: i */
    static String m26547i(Collection<?> collection) {
        StringBuilder f = m26544f(collection.size());
        f.append('[');
        boolean z = true;
        for (Object next : collection) {
            if (!z) {
                f.append(", ");
            }
            z = false;
            if (next == collection) {
                f.append("(this Collection)");
            } else {
                f.append(next);
            }
        }
        f.append(']');
        return f.toString();
    }

    /* renamed from: j */
    public static <F, T> Collection<T> m26548j(Collection<F> collection, Function<? super F, T> function) {
        return new TransformedCollection(collection, function);
    }
}
