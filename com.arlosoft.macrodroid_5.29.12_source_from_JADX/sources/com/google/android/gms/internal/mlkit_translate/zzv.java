package com.google.android.gms.internal.mlkit_translate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public abstract class zzv extends zzr implements List, RandomAccess {

    /* renamed from: c */
    private static final zzan f44517c = new zzt(zzad.f43087g, 0);

    zzv() {
    }

    /* renamed from: k */
    public static zzs m62252k() {
        return new zzs(4);
    }

    /* renamed from: l */
    static zzv m62253l(Object[] objArr) {
        return m62254m(objArr, objArr.length);
    }

    /* renamed from: m */
    static zzv m62254m(Object[] objArr, int i) {
        if (i == 0) {
            return zzad.f43087g;
        }
        return new zzad(objArr, i);
    }

    /* renamed from: n */
    public static zzv m62255n(Object[] objArr) {
        if (objArr.length == 0) {
            return zzad.f43087g;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzac.m61562b(objArr2, length);
        return m62254m(objArr2, length);
    }

    /* renamed from: p */
    public static zzv m62256p(Object obj) {
        Object[] objArr = {obj};
        zzac.m61562b(objArr, 1);
        return m62254m(objArr, 1);
    }

    /* renamed from: q */
    public static zzv m62257q(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzac.m61562b(objArr, 2);
        return m62254m(objArr, 2);
    }

    /* renamed from: t */
    public static zzv m62258t(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, "en", obj3};
        zzac.m61562b(objArr, 3);
        return m62254m(objArr, 3);
    }

    /* renamed from: u */
    public static zzv m62259u(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {"merged_dict_%1$s_%2$s_update.bin", "merged_dict_%1$s_%2$s_both.bin", "merged_dict_%1$s_%2$s_from_%3$s.bin", "merged_dict_%1$s_%2$s_from_%4$s.bin"};
        zzac.m61562b(objArr, 4);
        return m62254m(objArr, 4);
    }

    /* renamed from: w */
    public static zzv m62260w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        zzac.m61562b(objArr, 10);
        return m62254m(objArr, 10);
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
    public int mo52031c(Object[] objArr, int i) {
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
                        if (zze.m61775a(get(i), list.get(i))) {
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
                            if (!zze.m61775a(it.next(), it2.next())) {
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

    /* renamed from: h */
    public final zzam mo52023h() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
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

    /* renamed from: j */
    public zzv subList(int i, int i2) {
        zzj.m61892e(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzad.f43087g;
        }
        return new zzu(this, i, i3);
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

    /* renamed from: z */
    public final zzan listIterator(int i) {
        zzj.m61889b(i, size(), "index");
        if (isEmpty()) {
            return f44517c;
        }
        return new zzt(this, i);
    }
}
