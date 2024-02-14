package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: s */
    private static final Object[] f17097s;

    /* renamed from: z */
    static final RegularImmutableSet<Object> f17098z;
    @VisibleForTesting

    /* renamed from: d */
    final transient Object[] f17099d;

    /* renamed from: f */
    private final transient int f17100f;
    @VisibleForTesting

    /* renamed from: g */
    final transient Object[] f17101g;

    /* renamed from: o */
    private final transient int f17102o;

    /* renamed from: p */
    private final transient int f17103p;

    static {
        Object[] objArr = new Object[0];
        f17097s = objArr;
        f17098z = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f17099d = objArr;
        this.f17100f = i;
        this.f17101g = objArr2;
        this.f17102o = i2;
        this.f17103p = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public ImmutableList<E> mo35439B() {
        return ImmutableList.m27305m(this.f17099d, this.f17103p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo35028D() {
        return true;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f17101g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int d = Hashing.m27250d(obj);
        while (true) {
            int i = d & this.f17102o;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        System.arraycopy(this.f17099d, 0, objArr, i, this.f17103p);
        return i + this.f17103p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo35356f() {
        return this.f17099d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo35357h() {
        return this.f17103p;
    }

    public int hashCode() {
        return this.f17100f;
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

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return mo35029c().iterator();
    }

    public int size() {
        return this.f17103p;
    }
}
