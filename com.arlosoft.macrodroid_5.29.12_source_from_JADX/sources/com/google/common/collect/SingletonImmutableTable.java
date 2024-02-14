package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    SingletonImmutableTable(R r, C c, V v) {
        this.singleRowKey = Preconditions.m5392s(r);
        this.singleColumnKey = Preconditions.m5392s(c);
        this.singleValue = Preconditions.m5392s(v);
    }

    /* renamed from: p */
    public ImmutableMap<C, Map<R, V>> mo34742l() {
        return ImmutableMap.m27353n(this.singleColumnKey, ImmutableMap.m27353n(this.singleRowKey, this.singleValue));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ImmutableSet<Table.Cell<R, C, V>> mo34714c() {
        return ImmutableSet.m27507I(ImmutableTable.m27645i(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public ImmutableTable.SerializedForm mo34965r() {
        return ImmutableTable.SerializedForm.m27667a(this, new int[]{0}, new int[]{0});
    }

    public int size() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public ImmutableCollection<V> mo34717d() {
        return ImmutableSet.m27507I(this.singleValue);
    }

    /* renamed from: x */
    public ImmutableMap<R, Map<C, V>> mo34741j() {
        return ImmutableMap.m27353n(this.singleRowKey, ImmutableMap.m27353n(this.singleColumnKey, this.singleValue));
    }
}
