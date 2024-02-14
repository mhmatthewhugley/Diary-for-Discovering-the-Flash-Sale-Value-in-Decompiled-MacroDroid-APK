package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    /* renamed from: B */
    public UnmodifiableListIterator<E> listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public ImmutableCollection<E> mo35325P() {
        return this.delegate;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        return this.delegateList.mo35355d(objArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo35356f() {
        return this.delegateList.mo35356f();
    }

    public E get(int i) {
        return this.delegateList.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo35357h() {
        return this.delegateList.mo35357h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo35358i() {
        return this.delegateList.mo35358i();
    }
}
