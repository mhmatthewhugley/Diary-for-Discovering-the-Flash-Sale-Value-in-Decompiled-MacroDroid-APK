package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
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
public final class ImmutableIntArray implements Serializable {

    /* renamed from: c */
    private static final ImmutableIntArray f53226c = new ImmutableIntArray(new int[0]);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient int f53227a;
    /* access modifiers changed from: private */
    public final int[] array;
    private final int end;

    static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        /* renamed from: c */
        public Integer get(int i) {
            return Integer.valueOf(this.parent.mo61288d(i));
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
            int b = this.parent.f53227a;
            for (Object next : list) {
                if (next instanceof Integer) {
                    int i = b + 1;
                    if (this.parent.array[b] == ((Integer) next).intValue()) {
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
            if (obj instanceof Integer) {
                return this.parent.mo61289e(((Integer) obj).intValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.mo61292h(((Integer) obj).intValue());
            }
            return -1;
        }

        public int size() {
            return this.parent.mo61294i();
        }

        public List<Integer> subList(int i, int i2) {
            return this.parent.mo61295j(i, i2).mo61287c();
        }

        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
        }
    }

    @CanIgnoreReturnValue
    public static final class Builder {
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    /* renamed from: g */
    private boolean m73582g() {
        return this.f53227a > 0 || this.end < this.array.length;
    }

    /* renamed from: c */
    public List<Integer> mo61287c() {
        return new AsList();
    }

    /* renamed from: d */
    public int mo61288d(int i) {
        Preconditions.m5390q(i, mo61294i());
        return this.array[this.f53227a + i];
    }

    /* renamed from: e */
    public int mo61289e(int i) {
        for (int i2 = this.f53227a; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.f53227a;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (mo61294i() != immutableIntArray.mo61294i()) {
            return false;
        }
        for (int i = 0; i < mo61294i(); i++) {
            if (mo61288d(i) != immutableIntArray.mo61288d(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo61291f() {
        return this.end == this.f53227a;
    }

    /* renamed from: h */
    public int mo61292h(int i) {
        int i2 = this.end;
        while (true) {
            i2--;
            int i3 = this.f53227a;
            if (i2 < i3) {
                return -1;
            }
            if (this.array[i2] == i) {
                return i2 - i3;
            }
        }
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f53227a; i2 < this.end; i2++) {
            i = (i * 31) + Ints.m73618g(this.array[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public int mo61294i() {
        return this.end - this.f53227a;
    }

    /* renamed from: j */
    public ImmutableIntArray mo61295j(int i, int i2) {
        Preconditions.m5397x(i, i2, mo61294i());
        if (i == i2) {
            return f53226c;
        }
        int[] iArr = this.array;
        int i3 = this.f53227a;
        return new ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    /* renamed from: k */
    public int[] mo61296k() {
        return Arrays.copyOfRange(this.array, this.f53227a, this.end);
    }

    /* renamed from: l */
    public ImmutableIntArray mo61297l() {
        return m73582g() ? new ImmutableIntArray(mo61296k()) : this;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return mo61291f() ? f53226c : this;
    }

    public String toString() {
        if (mo61291f()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(mo61294i() * 5);
        sb.append('[');
        sb.append(this.array[this.f53227a]);
        int i = this.f53227a;
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
        return mo61297l();
    }

    private ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.f53227a = i;
        this.end = i2;
    }
}
