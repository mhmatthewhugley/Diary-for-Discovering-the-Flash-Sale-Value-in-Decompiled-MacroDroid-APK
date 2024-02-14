package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    @DoNotMock
    public static final class Builder<R, C, V> {

        /* renamed from: a */
        private final List<Table.Cell<R, C, V>> f16736a = Lists.m27832h();
    }

    static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final Object[] cellValues;
        private final Object[] columnKeys;
        private final Object[] rowKeys;

        private SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        /* renamed from: a */
        static SerializedForm m27667a(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.mo35594w().toArray(), immutableTable.mo35591n().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return ImmutableTable.m27646u();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.m27647v(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            while (true) {
                Object[] objArr2 = this.cellValues;
                if (i >= objArr2.length) {
                    return RegularImmutableTable.m28682A(builder.mo35398k(), ImmutableSet.m27518z(this.rowKeys), ImmutableSet.m27518z(this.columnKeys));
                }
                builder.mo35365e(ImmutableTable.m27645i(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                i++;
            }
        }
    }

    ImmutableTable() {
    }

    /* renamed from: i */
    static <R, C, V> Table.Cell<R, C, V> m27645i(R r, C c, V v) {
        return Tables.m28966c(Preconditions.m5393t(r, "rowKey"), Preconditions.m5393t(c, "columnKey"), Preconditions.m5393t(v, "value"));
    }

    /* renamed from: u */
    public static <R, C, V> ImmutableTable<R, C, V> m27646u() {
        return SparseImmutableTable.f17163d;
    }

    /* renamed from: v */
    public static <R, C, V> ImmutableTable<R, C, V> m27647v(R r, C c, V v) {
        return new SingletonImmutableTable(r, c, v);
    }

    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ Object mo34718e(Object obj, Object obj2) {
        return super.mo34718e(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo34720f() {
        return super.mo34720f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Iterator<V> mo34721g() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final UnmodifiableIterator<Table.Cell<R, C, V>> mo34712a() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k */
    public ImmutableSet<Table.Cell<R, C, V>> mo34723m() {
        return (ImmutableSet) super.mo34723m();
    }

    /* renamed from: n */
    public ImmutableSet<C> mo35591n() {
        return mo34742l().keySet();
    }

    /* renamed from: p */
    public abstract ImmutableMap<C, Map<R, V>> mo34742l();

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract ImmutableSet<Table.Cell<R, C, V>> mo34714c();

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract SerializedForm mo34965r();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract ImmutableCollection<V> mo34717d();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: w */
    public ImmutableSet<R> mo35594w() {
        return mo34741j().keySet();
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return mo34965r();
    }

    /* renamed from: x */
    public abstract ImmutableMap<R, Map<C, V>> mo34741j();

    /* renamed from: y */
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }
}
