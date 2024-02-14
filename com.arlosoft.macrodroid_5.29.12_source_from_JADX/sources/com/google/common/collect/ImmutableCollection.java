package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f16642a = new Object[0];

    static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* renamed from: a */
        Object[] f16643a;

        /* renamed from: b */
        int f16644b = 0;

        /* renamed from: c */
        boolean f16645c;

        ArrayBasedBuilder(int i) {
            CollectPreconditions.m26535b(i, "initialCapacity");
            this.f16643a = new Object[i];
        }

        /* renamed from: h */
        private void m27286h(int i) {
            Object[] objArr = this.f16643a;
            if (objArr.length < i) {
                this.f16643a = Arrays.copyOf(objArr, Builder.m27291d(objArr.length, i));
                this.f16645c = false;
            } else if (this.f16645c) {
                this.f16643a = (Object[]) objArr.clone();
                this.f16645c = false;
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public ArrayBasedBuilder<E> mo35364a(E e) {
            Preconditions.m5392s(e);
            m27286h(this.f16644b + 1);
            Object[] objArr = this.f16643a;
            int i = this.f16644b;
            this.f16644b = i + 1;
            objArr[i] = e;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public Builder<E> mo35366f(E... eArr) {
            mo35367g(eArr, eArr.length);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final void mo35367g(Object[] objArr, int i) {
            ObjectArrays.m28467c(objArr, i);
            m27286h(this.f16644b + i);
            System.arraycopy(objArr, 0, this.f16643a, this.f16644b, i);
            this.f16644b += i;
        }
    }

    @DoNotMock
    public static abstract class Builder<E> {
        Builder() {
        }

        /* renamed from: d */
        static int m27291d(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public abstract Builder<E> mo35364a(E e);

        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder<E> mo35368b(Iterable<? extends E> iterable) {
            for (Object a : iterable) {
                mo35364a(a);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder<E> mo35369c(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo35364a(it.next());
            }
            return this;
        }
    }

    ImmutableCollection() {
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public ImmutableList<E> mo35029c() {
        return isEmpty() ? ImmutableList.m27301D() : ImmutableList.m27304l(toArray());
    }

    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        UnmodifiableIterator k = iterator();
        while (k.hasNext()) {
            objArr[i] = k.next();
            i++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo35356f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo35357h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo35358i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo34781j();

    /* renamed from: k */
    public abstract UnmodifiableIterator<E> iterator();

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f16642a);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.m5392s(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f = mo35356f();
            if (f != null) {
                return Platform.m28532a(f, mo35358i(), mo35357h(), tArr);
            }
            tArr = ObjectArrays.m28471g(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo35355d(tArr, 0);
        return tArr;
    }
}
