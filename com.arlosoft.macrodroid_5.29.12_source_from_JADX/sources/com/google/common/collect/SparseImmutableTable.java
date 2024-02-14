package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Immutable
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* renamed from: d */
    static final ImmutableTable<Object, Object, Object> f17163d = new SparseImmutableTable(ImmutableList.m27301D(), ImmutableSet.m27506F(), ImmutableSet.m27506F());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;

    SparseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap<R, Integer> u = Maps.m28106u(immutableSet);
        LinkedHashMap C = Maps.m28060C();
        UnmodifiableIterator<R> k = immutableSet.iterator();
        while (k.hasNext()) {
            C.put(k.next(), new LinkedHashMap());
        }
        LinkedHashMap C2 = Maps.m28060C();
        UnmodifiableIterator<C> k2 = immutableSet2.iterator();
        while (k2.hasNext()) {
            C2.put(k2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell cell = immutableList.get(i);
            Object a = cell.mo34747a();
            Object b = cell.mo34748b();
            Object value = cell.getValue();
            Integer num = u.get(a);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) C.get(a);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i] = map2.size();
            mo36324z(a, b, map2.put(b, value), value);
            Map map3 = (Map) C2.get(b);
            Objects.requireNonNull(map3);
            map3.put(a, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(C.size());
        for (Map.Entry entry : C.entrySet()) {
            builder.mo35338g(entry.getKey(), ImmutableMap.m27351d((Map) entry.getValue()));
        }
        this.rowMap = builder.mo35337d();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(C2.size());
        for (Map.Entry entry2 : C2.entrySet()) {
            builder2.mo35338g(entry2.getKey(), ImmutableMap.m27351d((Map) entry2.getValue()));
        }
        this.columnMap = builder2.mo35337d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Table.Cell<R, C, V> mo34962B(int i) {
        Map.Entry entry = this.rowMap.entrySet().mo35029c().get(this.cellRowIndices[i]);
        Map.Entry entry2 = (Map.Entry) ((ImmutableMap) entry.getValue()).entrySet().mo35029c().get(this.cellColumnInRowIndices[i]);
        return ImmutableTable.m27645i(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public V mo34963C(int i) {
        int i2 = this.cellRowIndices[i];
        return this.rowMap.values().mo35029c().get(i2).values().mo35029c().get(this.cellColumnInRowIndices[i]);
    }

    /* renamed from: p */
    public ImmutableMap<C, Map<R, V>> mo34742l() {
        return ImmutableMap.m27351d(this.columnMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public ImmutableTable.SerializedForm mo34965r() {
        ImmutableMap u = Maps.m28106u(mo35591n());
        int[] iArr = new int[mo34723m().size()];
        UnmodifiableIterator k = mo34723m().iterator();
        int i = 0;
        while (k.hasNext()) {
            Integer num = (Integer) u.get(((Table.Cell) k.next()).mo34748b());
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.m27667a(this, this.cellRowIndices, iArr);
    }

    public int size() {
        return this.cellRowIndices.length;
    }

    /* renamed from: x */
    public ImmutableMap<R, Map<C, V>> mo34741j() {
        return ImmutableMap.m27351d(this.rowMap);
    }
}
