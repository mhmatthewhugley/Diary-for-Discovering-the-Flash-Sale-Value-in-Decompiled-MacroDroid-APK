package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    private transient Class<E> f16565d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient E[] f16566f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public transient int[] f16567g;

    /* renamed from: o */
    private transient int f16568o;

    /* renamed from: p */
    private transient long f16569p;

    abstract class Itr<T> implements Iterator<T> {

        /* renamed from: a */
        int f16574a = 0;

        /* renamed from: c */
        int f16575c = -1;

        Itr() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo35045a(int i);

        public boolean hasNext() {
            while (this.f16574a < EnumMultiset.this.f16566f.length) {
                int[] k = EnumMultiset.this.f16567g;
                int i = this.f16574a;
                if (k[i] > 0) {
                    return true;
                }
                this.f16574a = i + 1;
            }
            return false;
        }

        public T next() {
            if (hasNext()) {
                T a = mo35045a(this.f16574a);
                int i = this.f16574a;
                this.f16575c = i;
                this.f16574a = i + 1;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.m26538e(this.f16575c >= 0);
            if (EnumMultiset.this.f16567g[this.f16575c] > 0) {
                EnumMultiset.m26944l(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.m26945m(enumMultiset, (long) enumMultiset.f16567g[this.f16575c]);
                EnumMultiset.this.f16567g[this.f16575c] = 0;
            }
            this.f16575c = -1;
        }
    }

    /* renamed from: l */
    static /* synthetic */ int m26944l(EnumMultiset enumMultiset) {
        int i = enumMultiset.f16568o;
        enumMultiset.f16568o = i - 1;
        return i;
    }

    /* renamed from: m */
    static /* synthetic */ long m26945m(EnumMultiset enumMultiset, long j) {
        long j2 = enumMultiset.f16569p - j;
        enumMultiset.f16569p = j2;
        return j2;
    }

    /* renamed from: p */
    private void m26946p(Object obj) {
        Preconditions.m5392s(obj);
        if (!m26947q(obj)) {
            String valueOf = String.valueOf(this.f16565d);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
            sb.append("Expected an ");
            sb.append(valueOf);
            sb.append(" but got ");
            sb.append(valueOf2);
            throw new ClassCastException(sb.toString());
        }
    }

    /* renamed from: q */
    private boolean m26947q(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        E e = (Enum) obj;
        int ordinal = e.ordinal();
        E[] eArr = this.f16566f;
        if (ordinal >= eArr.length || eArr[ordinal] != e) {
            return false;
        }
        return true;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f16565d = cls;
        E[] eArr = (Enum[]) cls.getEnumConstants();
        this.f16566f = eArr;
        this.f16567g = new int[eArr.length];
        Serialization.m28708f(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16565d);
        Serialization.m28713k(this, objectOutputStream);
    }

    /* renamed from: C */
    public /* bridge */ /* synthetic */ Set mo34642C() {
        return super.mo34642C();
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        if (obj == null || !m26947q(obj)) {
            return 0;
        }
        return this.f16567g[((Enum) obj).ordinal()];
    }

    public void clear() {
        Arrays.fill(this.f16567g, 0);
        this.f16569p = 0;
        this.f16568o = 0;
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo34604f() {
        return this.f16568o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<E> mo34605h() {
        return new EnumMultiset<E>.Itr<E>() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public E mo35045a(int i) {
                return EnumMultiset.this.f16566f[i];
            }
        };
    }

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    public int mo34606h1(Object obj, int i) {
        if (obj == null || !m26947q(obj)) {
            return 0;
        }
        Enum enumR = (Enum) obj;
        CollectPreconditions.m26535b(i, "occurrences");
        if (i == 0) {
            return mo34601J1(obj);
        }
        int ordinal = enumR.ordinal();
        int[] iArr = this.f16567g;
        int i2 = iArr[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[ordinal] = 0;
            this.f16568o--;
            this.f16569p -= (long) i2;
        } else {
            iArr[ordinal] = i2 - i;
            this.f16569p -= (long) i;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Iterator<Multiset.Entry<E>> mo34607i() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Multiset.Entry<E> mo35045a(final int i) {
                return new Multisets.AbstractEntry<E>() {
                    /* renamed from: a */
                    public E mo35049b() {
                        return EnumMultiset.this.f16566f[i];
                    }

                    public int getCount() {
                        return EnumMultiset.this.f16567g[i];
                    }
                };
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
    /* renamed from: n */
    public int mo34611k1(E e, int i) {
        m26946p(e);
        CollectPreconditions.m26535b(i, "occurrences");
        if (i == 0) {
            return mo34601J1(e);
        }
        int ordinal = e.ordinal();
        int i2 = this.f16567g[ordinal];
        long j = (long) i;
        long j2 = ((long) i2) + j;
        Preconditions.m5383j(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.f16567g[ordinal] = (int) j2;
        if (i2 == 0) {
            this.f16568o++;
        }
        this.f16569p += j;
        return i2;
    }

    public int size() {
        return Ints.m73622k(this.f16569p);
    }

    @CanIgnoreReturnValue
    /* renamed from: t */
    public int mo34603e0(E e, int i) {
        m26946p(e);
        CollectPreconditions.m26535b(i, "count");
        int ordinal = e.ordinal();
        int[] iArr = this.f16567g;
        int i2 = iArr[ordinal];
        iArr[ordinal] = i;
        this.f16569p += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.f16568o++;
        } else if (i2 > 0 && i == 0) {
            this.f16568o--;
        }
        return i2;
    }

    @CanIgnoreReturnValue
    /* renamed from: z1 */
    public /* bridge */ /* synthetic */ boolean mo34613z1(@ParametricNullness Object obj, int i, int i2) {
        return super.mo34613z1(obj, i, i2);
    }
}
