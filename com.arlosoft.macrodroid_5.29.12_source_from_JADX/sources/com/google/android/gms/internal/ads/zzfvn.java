package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfvn extends zzfvi implements List, RandomAccess {

    /* renamed from: c */
    private static final zzfxn f36473c = new zzfvl(zzfww.f36502g, 0);

    zzfvn() {
    }

    /* renamed from: B */
    public static zzfvn m51125B(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfwu.m51206b(objArr, 2);
        return m51131p(objArr, 2);
    }

    /* renamed from: D */
    public static zzfvn m51126D(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfwu.m51206b(objArr, 3);
        return m51131p(objArr, 3);
    }

    /* renamed from: F */
    public static zzfvn m51127F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfwu.m51206b(objArr, 5);
        return m51131p(objArr, 5);
    }

    /* renamed from: I */
    public static zzfvn m51128I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfwu.m51206b(objArr, 6);
        return m51131p(objArr, 6);
    }

    /* renamed from: m */
    public static zzfvk m51129m() {
        return new zzfvk(4);
    }

    /* renamed from: n */
    static zzfvn m51130n(Object[] objArr) {
        return m51131p(objArr, objArr.length);
    }

    /* renamed from: p */
    static zzfvn m51131p(Object[] objArr, int i) {
        if (i == 0) {
            return zzfww.f36502g;
        }
        return new zzfww(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfvn m51132q(java.lang.Iterable r0) {
        /*
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzfvn r0 = m51133t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfvn.m51132q(java.lang.Iterable):com.google.android.gms.internal.ads.zzfvn");
    }

    /* renamed from: t */
    public static zzfvn m51133t(Collection collection) {
        if (collection instanceof zzfvi) {
            zzfvn h = ((zzfvi) collection).mo46418h();
            if (!h.mo46421j()) {
                return h;
            }
            Object[] array = h.toArray();
            return m51131p(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfwu.m51206b(array2, length);
        return m51131p(array2, length);
    }

    /* renamed from: u */
    public static zzfvn m51134u(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfww.f36502g;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfwu.m51206b(objArr2, length);
        return m51131p(objArr2, length);
    }

    /* renamed from: w */
    public static zzfvn m51135w() {
        return zzfww.f36502g;
    }

    /* renamed from: z */
    public static zzfvn m51136z(Object obj) {
        Object[] objArr = {obj};
        zzfwu.m51206b(objArr, 1);
        return m51131p(objArr, 1);
    }

    /* renamed from: J */
    public final zzfxn listIterator(int i) {
        zzfsx.m50937b(i, size(), "index");
        if (isEmpty()) {
            return f36473c;
        }
        return new zzfvl(this, i);
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
    public int mo46413c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
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
                        if (zzfss.m50929a(get(i), list.get(i))) {
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
                            if (!zzfss.m50929a(it.next(), it2.next())) {
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
    public final zzfvn mo46418h() {
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
    public final zzfxm mo46419i() {
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
    public zzfvn subList(int i, int i2) {
        zzfsx.m50942g(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzfww.f36502g;
        }
        return new zzfvm(this, i, i3);
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
}
