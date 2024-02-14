package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {

    /* renamed from: p */
    static final RegularImmutableMultiset<Object> f17093p = new RegularImmutableMultiset<>(ObjectCountHashMap.m28477b());

    /* renamed from: f */
    final transient ObjectCountHashMap<E> f17094f;

    /* renamed from: g */
    private final transient int f17095g;
    @LazyInit

    /* renamed from: o */
    private transient ImmutableSet<E> f17096o;

    private final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
        }

        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        /* access modifiers changed from: package-private */
        public E get(int i) {
            return RegularImmutableMultiset.this.f17094f.mo36252i(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        public int size() {
            return RegularImmutableMultiset.this.f17094f.mo36246C();
        }
    }

    @GwtIncompatible
    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        SerializedForm(Multiset<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry next : multiset.entrySet()) {
                this.elements[i] = next.mo35049b();
                this.counts[i] = next.getCount();
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return builder.mo35477h();
                }
                builder.mo35476g(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
        this.f17094f = objectCountHashMap;
        long j = 0;
        for (int i = 0; i < objectCountHashMap.mo36246C(); i++) {
            j += (long) objectCountHashMap.mo36253k(i);
        }
        this.f17095g = Ints.m73622k(j);
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        return this.f17094f.mo36250f(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return false;
    }

    /* renamed from: n */
    public ImmutableSet<E> mo34642C() {
        ImmutableSet<E> immutableSet = this.f17096o;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.f17096o = elementSet;
        return elementSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Multiset.Entry<E> mo34983q(int i) {
        return this.f17094f.mo36251g(i);
    }

    public int size() {
        return this.f17095g;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
