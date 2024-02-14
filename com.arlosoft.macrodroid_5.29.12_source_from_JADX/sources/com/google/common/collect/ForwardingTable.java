package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    protected ForwardingTable() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Table<R, C, V> mo22325Q();

    public void clear() {
        mo22325Q().clear();
    }

    public boolean containsValue(Object obj) {
        return mo22325Q().containsValue(obj);
    }

    public boolean equals(Object obj) {
        return obj == this || mo22325Q().equals(obj);
    }

    public int hashCode() {
        return mo22325Q().hashCode();
    }

    /* renamed from: j */
    public Map<R, Map<C, V>> mo34741j() {
        return mo22325Q().mo34741j();
    }

    /* renamed from: l */
    public Map<C, Map<R, V>> mo34742l() {
        return mo22325Q().mo34742l();
    }

    /* renamed from: m */
    public Set<Table.Cell<R, C, V>> mo34723m() {
        return mo22325Q().mo34723m();
    }

    public int size() {
        return mo22325Q().size();
    }

    public Collection<V> values() {
        return mo22325Q().values();
    }
}
