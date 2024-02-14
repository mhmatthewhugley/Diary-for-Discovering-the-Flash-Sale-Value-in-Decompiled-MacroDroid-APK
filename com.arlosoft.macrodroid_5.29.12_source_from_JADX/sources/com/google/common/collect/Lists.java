package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Lists {

    /* renamed from: com.google.common.collect.Lists$1 */
    class C70101 extends RandomAccessListWrapper<Object> {
        public ListIterator<Object> listIterator(int i) {
            return this.f16845a.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.Lists$2 */
    class C70112 extends AbstractListWrapper<Object> {
        public ListIterator<Object> listIterator(int i) {
            return this.f16845a.listIterator(i);
        }
    }

    private static class AbstractListWrapper<E> extends AbstractList<E> {

        /* renamed from: a */
        final List<E> f16845a;

        public void add(int i, @ParametricNullness E e) {
            this.f16845a.add(i, e);
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.f16845a.addAll(i, collection);
        }

        public boolean contains(Object obj) {
            return this.f16845a.contains(obj);
        }

        @ParametricNullness
        public E get(int i) {
            return this.f16845a.get(i);
        }

        @ParametricNullness
        public E remove(int i) {
            return this.f16845a.remove(i);
        }

        @ParametricNullness
        public E set(int i, @ParametricNullness E e) {
            return this.f16845a.set(i, e);
        }

        public int size() {
            return this.f16845a.size();
        }
    }

    private static final class CharSequenceAsList extends AbstractList<Character> {

        /* renamed from: a */
        private final CharSequence f16846a;

        /* renamed from: c */
        public Character get(int i) {
            Preconditions.m5390q(i, size());
            return Character.valueOf(this.f16846a.charAt(i));
        }

        public int size() {
            return this.f16846a.length();
        }
    }

    private static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        final E first;
        final E[] rest;

        @ParametricNullness
        public E get(int i) {
            Preconditions.m5390q(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }

        public int size() {
            return IntMath.m73473i(this.rest.length, 1);
        }
    }

    private static class Partition<T> extends AbstractList<List<T>> {

        /* renamed from: a */
        final List<T> f16847a;

        /* renamed from: c */
        final int f16848c;

        /* renamed from: c */
        public List<T> get(int i) {
            Preconditions.m5390q(i, size());
            int i2 = this.f16848c;
            int i3 = i * i2;
            return this.f16847a.subList(i3, Math.min(i2 + i3, this.f16847a.size()));
        }

        public boolean isEmpty() {
            return this.f16847a.isEmpty();
        }

        public int size() {
            return IntMath.m73468d(this.f16847a.size(), this.f16848c, RoundingMode.CEILING);
        }
    }

    private static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    private static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
    }

    private static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    private static class ReverseList<T> extends AbstractList<T> {

        /* renamed from: a */
        private final List<T> f16849a;

        ReverseList(List<T> list) {
            this.f16849a = (List) Preconditions.m5392s(list);
        }

        /* renamed from: f */
        private int m27842f(int i) {
            int size = size();
            Preconditions.m5390q(i, size);
            return (size - 1) - i;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public int m27843h(int i) {
            int size = size();
            Preconditions.m5395v(i, size);
            return size - i;
        }

        public void add(int i, @ParametricNullness T t) {
            this.f16849a.add(m27843h(i), t);
        }

        public void clear() {
            this.f16849a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public List<T> mo35739d() {
            return this.f16849a;
        }

        @ParametricNullness
        public T get(int i) {
            return this.f16849a.get(m27842f(i));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.f16849a.listIterator(m27843h(i));
            return new ListIterator<T>() {

                /* renamed from: a */
                boolean f16850a;

                public void add(@ParametricNullness T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.f16850a = false;
                }

                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        this.f16850a = true;
                        return listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                public int nextIndex() {
                    return ReverseList.this.m27843h(listIterator.nextIndex());
                }

                @ParametricNullness
                public T previous() {
                    if (hasPrevious()) {
                        this.f16850a = true;
                        return listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                public int previousIndex() {
                    return nextIndex() - 1;
                }

                public void remove() {
                    CollectPreconditions.m26538e(this.f16850a);
                    listIterator.remove();
                    this.f16850a = false;
                }

                public void set(@ParametricNullness T t) {
                    Preconditions.m5398y(this.f16850a);
                    listIterator.set(t);
                }
            };
        }

        @ParametricNullness
        public T remove(int i) {
            return this.f16849a.remove(m27842f(i));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @ParametricNullness
        public T set(int i, @ParametricNullness T t) {
            return this.f16849a.set(m27842f(i), t);
        }

        public int size() {
            return this.f16849a.size();
        }

        public List<T> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            return Lists.m27837m(this.f16849a.subList(m27843h(i2), m27843h(i)));
        }
    }

    private static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        StringAsImmutableList(String str) {
            this.string = str;
        }

        /* renamed from: M */
        public ImmutableList<Character> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            return Lists.m27825a(this.string.substring(i, i2));
        }

        /* renamed from: P */
        public Character get(int i) {
            Preconditions.m5390q(i, size());
            return Character.valueOf(this.string.charAt(i));
        }

        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public int size() {
            return this.string.length();
        }
    }

    private static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) Preconditions.m5392s(list);
            this.function = (Function) Preconditions.m5392s(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        @ParametricNullness
        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i)) {
                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public T mo34726a(F f) {
                    return TransformingRandomAccessList.this.function.apply(f);
                }
            };
        }

        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    private static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) Preconditions.m5392s(list);
            this.function = (Function) Preconditions.m5392s(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i)) {
                /* access modifiers changed from: package-private */
                @ParametricNullness
                /* renamed from: a */
                public T mo34726a(@ParametricNullness F f) {
                    return TransformingSequentialList.this.function.apply(f);
                }
            };
        }

        public int size() {
            return this.fromList.size();
        }
    }

    private static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        final E first;
        final E[] rest;
        @ParametricNullness
        final E second;

        @ParametricNullness
        public E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            Preconditions.m5390q(i, size());
            return this.rest[i - 2];
        }

        public int size() {
            return IntMath.m73473i(this.rest.length, 2);
        }
    }

    private Lists() {
    }

    /* renamed from: a */
    public static ImmutableList<Character> m27825a(String str) {
        return new StringAsImmutableList((String) Preconditions.m5392s(str));
    }

    @VisibleForTesting
    /* renamed from: b */
    static int m27826b(int i) {
        CollectPreconditions.m26535b(i, "arraySize");
        return Ints.m73622k(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: c */
    static boolean m27827c(List<?> list, Object obj) {
        if (obj == Preconditions.m5392s(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.m27716l(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.m5349a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    static int m27828d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m27829e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.m5349a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m27829e(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    static int m27830f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m27831g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.m5349a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static int m27831g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    @GwtCompatible
    /* renamed from: h */
    public static <E> ArrayList<E> m27832h() {
        return new ArrayList<>();
    }

    @GwtCompatible
    /* renamed from: i */
    public static <E> ArrayList<E> m27833i(Iterable<? extends E> iterable) {
        Preconditions.m5392s(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return m27834j(iterable.iterator());
    }

    @GwtCompatible
    /* renamed from: j */
    public static <E> ArrayList<E> m27834j(Iterator<? extends E> it) {
        ArrayList<E> h = m27832h();
        Iterators.m27705a(h, it);
        return h;
    }

    @GwtCompatible
    /* renamed from: k */
    public static <E> ArrayList<E> m27835k(int i) {
        CollectPreconditions.m26535b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    @GwtCompatible
    /* renamed from: l */
    public static <E> ArrayList<E> m27836l(int i) {
        return new ArrayList<>(m27826b(i));
    }

    /* renamed from: m */
    public static <T> List<T> m27837m(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).mo35381I();
        }
        if (list instanceof ReverseList) {
            return ((ReverseList) list).mo35739d();
        }
        if (list instanceof RandomAccess) {
            return new RandomAccessReverseList(list);
        }
        return new ReverseList(list);
    }

    /* renamed from: n */
    public static <F, T> List<T> m27838n(List<F> list, Function<? super F, ? extends T> function) {
        if (list instanceof RandomAccess) {
            return new TransformingRandomAccessList(list, function);
        }
        return new TransformingSequentialList(list, function);
    }
}
