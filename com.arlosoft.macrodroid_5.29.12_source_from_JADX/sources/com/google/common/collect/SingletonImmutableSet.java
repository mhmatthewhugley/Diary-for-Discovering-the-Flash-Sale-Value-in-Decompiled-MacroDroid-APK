package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: d */
    final transient E f17151d;

    SingletonImmutableSet(E e) {
        this.f17151d = Preconditions.m5392s(e);
    }

    /* renamed from: c */
    public ImmutableList<E> mo35029c() {
        return ImmutableList.m27302F(this.f17151d);
    }

    public boolean contains(Object obj) {
        return this.f17151d.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        objArr[i] = this.f17151d;
        return i + 1;
    }

    public final int hashCode() {
        return this.f17151d.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return false;
    }

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return Iterators.m27700G(this.f17151d);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f17151d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
