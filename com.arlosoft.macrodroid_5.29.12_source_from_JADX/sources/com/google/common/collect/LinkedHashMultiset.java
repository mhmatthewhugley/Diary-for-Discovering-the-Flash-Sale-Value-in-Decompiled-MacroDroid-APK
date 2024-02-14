package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    /* renamed from: C */
    public /* bridge */ /* synthetic */ Set mo34642C() {
        return super.mo34642C();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public ObjectCountHashMap<E> mo34610k(int i) {
        return new ObjectCountLinkedHashMap(i);
    }
}
