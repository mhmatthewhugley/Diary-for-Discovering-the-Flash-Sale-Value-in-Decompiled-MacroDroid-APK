package com.google.android.gms.internal.nearby;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzsq extends zzsn implements List, RandomAccess {

    /* renamed from: c */
    private static final zzsz f45107c = new zzso(zzsv.f45111g, 0);

    zzsq() {
    }

    /* renamed from: m */
    static zzsq m63011m(Object[] objArr) {
        return m63012n(objArr, objArr.length);
    }

    /* renamed from: n */
    static zzsq m63012n(Object[] objArr, int i) {
        if (i == 0) {
            return zzsv.f45111g;
        }
        return new zzsv(objArr, i);
    }

    /* renamed from: p */
    public static zzsq m63013p(Collection collection) {
        if (collection instanceof zzsn) {
            zzsq h = ((zzsn) collection).mo53243h();
            if (!h.mo53246j()) {
                return h;
            }
            Object[] array = h.toArray();
            return m63012n(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzsu.m63032b(array2, length);
        return m63012n(array2, length);
    }

    /* renamed from: q */
    public static zzsq m63014q() {
        return zzsv.f45111g;
    }

    /* renamed from: t */
    public static zzsq m63015t(Object obj) {
        Object[] objArr = {obj};
        zzsu.m63032b(objArr, 1);
        return m63012n(objArr, 1);
    }

    @SafeVarargs
    /* renamed from: u */
    public static zzsq m63016u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = new Object[18];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, 6);
        zzsu.m63032b(objArr2, 18);
        return m63012n(objArr2, 18);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo53239c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzsb.m62978a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzsb.m62978a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: h */
    public final zzsq mo53243h() {
        return this;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final zzsy mo53244i() {
        return listIterator(0);
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public zzsq subList(int i, int i2) {
        zzsg.m62989g(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzsv.f45111g;
        }
        return new zzsp(this, i, i3);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public final zzsz listIterator(int i) {
        zzsg.m62984b(i, size(), "index");
        if (isEmpty()) {
            return f45107c;
        }
        return new zzso(this, i);
    }
}
