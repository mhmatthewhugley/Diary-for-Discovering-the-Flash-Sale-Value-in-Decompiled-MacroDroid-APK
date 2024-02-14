package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    HashMultiset(int i) {
        super(i);
    }

    /* renamed from: l */
    public static <E> HashMultiset<E> m27243l(int i) {
        return new HashMultiset<>(i);
    }

    /* renamed from: m */
    public static <E> HashMultiset<E> m27244m(Iterable<? extends E> iterable) {
        HashMultiset<E> l = m27243l(Multisets.m28380i(iterable));
        Iterables.m27674a(l, iterable);
        return l;
    }

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
        return new ObjectCountHashMap<>(i);
    }
}
