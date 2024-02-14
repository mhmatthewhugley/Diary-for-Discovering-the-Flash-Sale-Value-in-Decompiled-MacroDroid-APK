package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends ImmutableList<E> {

    /* renamed from: g */
    static final ImmutableList<Object> f17077g = new RegularImmutableList(new Object[0], 0);
    @VisibleForTesting

    /* renamed from: d */
    final transient Object[] f17078d;

    /* renamed from: f */
    private final transient int f17079f;

    RegularImmutableList(Object[] objArr, int i) {
        this.f17078d = objArr;
        this.f17079f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        System.arraycopy(this.f17078d, 0, objArr, i, this.f17079f);
        return i + this.f17079f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo35356f() {
        return this.f17078d;
    }

    public E get(int i) {
        Preconditions.m5390q(i, this.f17079f);
        E e = this.f17078d[i];
        Objects.requireNonNull(e);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo35357h() {
        return this.f17079f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo35358i() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return false;
    }

    public int size() {
        return this.f17079f;
    }
}
