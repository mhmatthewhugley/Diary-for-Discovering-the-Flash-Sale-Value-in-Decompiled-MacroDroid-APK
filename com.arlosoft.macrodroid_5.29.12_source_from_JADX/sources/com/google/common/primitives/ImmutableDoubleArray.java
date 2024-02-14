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
public final class ImmutableDoubleArray implements Serializable {

    /* renamed from: c */
    private static final ImmutableDoubleArray f53224c = new ImmutableDoubleArray(new double[0]);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient int f53225a;
    /* access modifiers changed from: private */
    public final double[] array;
    private final int end;

    static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        /* renamed from: c */
        public Double get(int i) {
            return Double.valueOf(this.parent.mo61265f(i));
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
            int b = this.parent.f53225a;
            for (Object next : list) {
                if (next instanceof Double) {
                    int i = b + 1;
                    if (ImmutableDoubleArray.m73568d(this.parent.array[b], ((Double) next).doubleValue())) {
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
            if (obj instanceof Double) {
                return this.parent.mo61266g(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.mo61269j(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int size() {
            return this.parent.mo61270k();
        }

        public List<Double> subList(int i, int i2) {
            return this.parent.mo61271l(i, i2).mo61263e();
        }

        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.parent = immutableDoubleArray;
        }
    }

    @CanIgnoreReturnValue
    public static final class Builder {
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m73568d(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    /* renamed from: i */
    private boolean m73569i() {
        return this.f53225a > 0 || this.end < this.array.length;
    }

    /* renamed from: e */
    public List<Double> mo61263e() {
        return new AsList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (mo61270k() != immutableDoubleArray.mo61270k()) {
            return false;
        }
        for (int i = 0; i < mo61270k(); i++) {
            if (!m73568d(mo61265f(i), immutableDoubleArray.mo61265f(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public double mo61265f(int i) {
        Preconditions.m5390q(i, mo61270k());
        return this.array[this.f53225a + i];
    }

    /* renamed from: g */
    public int mo61266g(double d) {
        for (int i = this.f53225a; i < this.end; i++) {
            if (m73568d(this.array[i], d)) {
                return i - this.f53225a;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public boolean mo61267h() {
        return this.end == this.f53225a;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f53225a; i2 < this.end; i2++) {
            i = (i * 31) + Doubles.m73541d(this.array[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public int mo61269j(double d) {
        int i = this.end;
        while (true) {
            i--;
            if (i < this.f53225a) {
                return -1;
            }
            if (m73568d(this.array[i], d)) {
                return i - this.f53225a;
            }
        }
    }

    /* renamed from: k */
    public int mo61270k() {
        return this.end - this.f53225a;
    }

    /* renamed from: l */
    public ImmutableDoubleArray mo61271l(int i, int i2) {
        Preconditions.m5397x(i, i2, mo61270k());
        if (i == i2) {
            return f53224c;
        }
        double[] dArr = this.array;
        int i3 = this.f53225a;
        return new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
    }

    /* renamed from: m */
    public double[] mo61272m() {
        return Arrays.copyOfRange(this.array, this.f53225a, this.end);
    }

    /* renamed from: n */
    public ImmutableDoubleArray mo61273n() {
        return m73569i() ? new ImmutableDoubleArray(mo61272m()) : this;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return mo61267h() ? f53224c : this;
    }

    public String toString() {
        if (mo61267h()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(mo61270k() * 5);
        sb.append('[');
        sb.append(this.array[this.f53225a]);
        int i = this.f53225a;
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
        return mo61273n();
    }

    private ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.array = dArr;
        this.f53225a = i;
        this.end = i2;
    }
}
