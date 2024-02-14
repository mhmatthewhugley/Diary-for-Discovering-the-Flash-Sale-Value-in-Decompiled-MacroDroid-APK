package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final UnmodifiableListIterator<Object> f16649c = new Itr(RegularImmutableList.f17077g, 0);

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public Builder<E> mo35365e(E e) {
            super.mo35364a(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public Builder<E> mo35397j(Iterator<? extends E> it) {
            super.mo35369c(it);
            return this;
        }

        /* renamed from: k */
        public ImmutableList<E> mo35398k() {
            this.f16645c = true;
            return ImmutableList.m27305m(this.f16643a, this.f16644b);
        }

        Builder(int i) {
            super(i);
        }
    }

    static class Itr<E> extends AbstractIndexedListIterator<E> {

        /* renamed from: d */
        private final ImmutableList<E> f16650d;

        Itr(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f16650d = immutableList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo34410a(int i) {
            return this.f16650d.get(i);
        }
    }

    private static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: d */
        private final transient ImmutableList<E> f16651d;

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.f16651d = immutableList;
        }

        /* renamed from: P */
        private int m27326P(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: Q */
        private int m27327Q(int i) {
            return size() - i;
        }

        /* renamed from: I */
        public ImmutableList<E> mo35381I() {
            return this.f16651d;
        }

        /* renamed from: M */
        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            return this.f16651d.subList(m27327Q(i2), m27327Q(i)).mo35381I();
        }

        public boolean contains(Object obj) {
            return this.f16651d.contains(obj);
        }

        public E get(int i) {
            Preconditions.m5390q(i, size());
            return this.f16651d.get(m27326P(i));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f16651d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m27326P(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return this.f16651d.mo34781j();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f16651d.indexOf(obj);
            if (indexOf >= 0) {
                return m27326P(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.f16651d.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return ImmutableList.m27311w(this.elements);
        }
    }

    class SubList extends ImmutableList<E> {

        /* renamed from: d */
        final transient int f16652d;

        /* renamed from: f */
        final transient int f16653f;

        SubList(int i, int i2) {
            this.f16652d = i;
            this.f16653f = i2;
        }

        /* renamed from: M */
        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, this.f16653f);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f16652d;
            return immutableList.subList(i + i3, i2 + i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object[] mo35356f() {
            return ImmutableList.this.mo35356f();
        }

        public E get(int i) {
            Preconditions.m5390q(i, this.f16653f);
            return ImmutableList.this.get(i + this.f16652d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo35357h() {
            return ImmutableList.this.mo35358i() + this.f16652d + this.f16653f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo35358i() {
            return ImmutableList.this.mo35358i() + this.f16652d;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.f16653f;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }
    }

    ImmutableList() {
    }

    /* renamed from: D */
    public static <E> ImmutableList<E> m27301D() {
        return RegularImmutableList.f17077g;
    }

    /* renamed from: F */
    public static <E> ImmutableList<E> m27302F(E e) {
        return m27307p(e);
    }

    /* renamed from: J */
    public static <E> ImmutableList<E> m27303J(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.m5392s(comparator);
        Object[] n = Iterables.m27687n(iterable);
        ObjectArrays.m28466b(n);
        Arrays.sort(n, comparator);
        return m27304l(n);
    }

    /* renamed from: l */
    static <E> ImmutableList<E> m27304l(Object[] objArr) {
        return m27305m(objArr, objArr.length);
    }

    /* renamed from: m */
    static <E> ImmutableList<E> m27305m(Object[] objArr, int i) {
        if (i == 0) {
            return m27301D();
        }
        return new RegularImmutableList(objArr, i);
    }

    /* renamed from: n */
    public static <E> Builder<E> m27306n() {
        return new Builder<>();
    }

    /* renamed from: p */
    private static <E> ImmutableList<E> m27307p(Object... objArr) {
        return m27304l(ObjectArrays.m28466b(objArr));
    }

    /* renamed from: q */
    public static <E> ImmutableList<E> m27308q(Iterable<? extends E> iterable) {
        Preconditions.m5392s(iterable);
        if (iterable instanceof Collection) {
            return m27309t((Collection) iterable);
        }
        return m27310u(iterable.iterator());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: t */
    public static <E> ImmutableList<E> m27309t(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return m27307p(collection.toArray());
        }
        ImmutableList<E> c = ((ImmutableCollection) collection).mo35029c();
        return c.mo34781j() ? m27304l(c.toArray()) : c;
    }

    /* renamed from: u */
    public static <E> ImmutableList<E> m27310u(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m27301D();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m27302F(next);
        }
        return new Builder().mo35365e(next).mo35397j(it).mo35398k();
    }

    /* renamed from: w */
    public static <E> ImmutableList<E> m27311w(E[] eArr) {
        if (eArr.length == 0) {
            return m27301D();
        }
        return m27307p((Object[]) eArr.clone());
    }

    /* renamed from: B */
    public UnmodifiableListIterator<E> listIterator(int i) {
        Preconditions.m5395v(i, size());
        if (isEmpty()) {
            return f16649c;
        }
        return new Itr(this, i);
    }

    /* renamed from: I */
    public ImmutableList<E> mo35381I() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    /* renamed from: M */
    public ImmutableList<E> subList(int i, int i2) {
        Preconditions.m5397x(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m27301D();
        }
        return mo35383O(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public ImmutableList<E> mo35383O(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    @DoNotCall
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @InlineMe
    @Deprecated
    /* renamed from: c */
    public final ImmutableList<E> mo35029c() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return Lists.m27827c(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m27828d(this, obj);
    }

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m27830f(this, obj);
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: z */
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }
}
