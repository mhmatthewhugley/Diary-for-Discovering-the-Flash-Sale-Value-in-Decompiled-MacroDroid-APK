package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Immutable
@Beta
public final class ImmutableLongArray implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ImmutableLongArray f53228c = new ImmutableLongArray(new long[0]);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient int f53229a;
    /* access modifiers changed from: private */
    public final long[] array;
    private final int end;

    static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

        /* renamed from: c */
        public Long get(int i) {
            return Long.valueOf(this.parent.mo61313f(i));
        }

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int b = this.parent.f53229a;
            for (Object next : list) {
                if (next instanceof Long) {
                    int i = b + 1;
                    if (this.parent.array[b] == ((Long) next).longValue()) {
                        b = i;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.parent.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.mo61314g(((Long) obj).longValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.mo61317j(((Long) obj).longValue());
            }
            return -1;
        }

        public int size() {
            return this.parent.mo61318k();
        }

        public List<Long> subList(int i, int i2) {
            return this.parent.mo61319l(i, i2).mo61311d();
        }

        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableLongArray immutableLongArray) {
            this.parent = immutableLongArray;
        }
    }

    @CanIgnoreReturnValue
    public static final class Builder {

        /* renamed from: a */
        private long[] f53230a;

        /* renamed from: b */
        private int f53231b = 0;

        Builder(int i) {
            this.f53230a = new long[i];
        }

        /* renamed from: c */
        private void m73608c(int i) {
            int i2 = this.f53231b + i;
            long[] jArr = this.f53230a;
            if (i2 > jArr.length) {
                this.f53230a = Arrays.copyOf(jArr, m73609d(jArr.length, i2));
            }
        }

        /* renamed from: d */
        private static int m73609d(int i, int i2) {
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

        /* renamed from: a */
        public Builder mo61335a(long j) {
            m73608c(1);
            long[] jArr = this.f53230a;
            int i = this.f53231b;
            jArr[i] = j;
            this.f53231b = i + 1;
            return this;
        }

        @CheckReturnValue
        /* renamed from: b */
        public ImmutableLongArray mo61336b() {
            return this.f53231b == 0 ? ImmutableLongArray.f53228c : new ImmutableLongArray(this.f53230a, 0, this.f53231b);
        }
    }

    /* renamed from: e */
    public static Builder m73596e() {
        return new Builder(10);
    }

    /* renamed from: i */
    private boolean m73597i() {
        return this.f53229a > 0 || this.end < this.array.length;
    }

    /* renamed from: d */
    public List<Long> mo61311d() {
        return new AsList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (mo61318k() != immutableLongArray.mo61318k()) {
            return false;
        }
        for (int i = 0; i < mo61318k(); i++) {
            if (mo61313f(i) != immutableLongArray.mo61313f(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public long mo61313f(int i) {
        Preconditions.m5390q(i, mo61318k());
        return this.array[this.f53229a + i];
    }

    /* renamed from: g */
    public int mo61314g(long j) {
        for (int i = this.f53229a; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.f53229a;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public boolean mo61315h() {
        return this.end == this.f53229a;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f53229a; i2 < this.end; i2++) {
            i = (i * 31) + Longs.m73635e(this.array[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public int mo61317j(long j) {
        int i = this.end;
        while (true) {
            i--;
            int i2 = this.f53229a;
            if (i < i2) {
                return -1;
            }
            if (this.array[i] == j) {
                return i - i2;
            }
        }
    }

    /* renamed from: k */
    public int mo61318k() {
        return this.end - this.f53229a;
    }

    /* renamed from: l */
    public ImmutableLongArray mo61319l(int i, int i2) {
        Preconditions.m5397x(i, i2, mo61318k());
        if (i == i2) {
            return f53228c;
        }
        long[] jArr = this.array;
        int i3 = this.f53229a;
        return new ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    /* renamed from: m */
    public long[] mo61320m() {
        return Arrays.copyOfRange(this.array, this.f53229a, this.end);
    }

    /* renamed from: n */
    public ImmutableLongArray mo61321n() {
        return m73597i() ? new ImmutableLongArray(mo61320m()) : this;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return mo61315h() ? f53228c : this;
    }

    public String toString() {
        if (mo61315h()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(mo61318k() * 5);
        sb.append('[');
        sb.append(this.array[this.f53229a]);
        int i = this.f53229a;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return mo61321n();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.f53229a = i;
        this.end = i2;
    }
}
