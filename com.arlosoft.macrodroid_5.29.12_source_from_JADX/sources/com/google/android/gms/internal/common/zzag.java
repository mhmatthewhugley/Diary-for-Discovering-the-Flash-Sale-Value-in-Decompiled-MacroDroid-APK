package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class zzag extends zzac implements List, RandomAccess {

    /* renamed from: c */
    private static final zzak f39288c = new zzae(zzai.f39289g, 0);

    zzag() {
    }

    /* renamed from: m */
    static zzag m55887m(Object[] objArr, int i) {
        if (i == 0) {
            return zzai.f39289g;
        }
        return new zzai(objArr, i);
    }

    /* renamed from: n */
    public static zzag m55888n(Collection collection) {
        if (collection instanceof zzac) {
            zzag h = ((zzac) collection).mo48620h();
            if (!h.mo48623j()) {
                return h;
            }
            Object[] array = h.toArray();
            return m55887m(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzah.m55897a(array2, length);
        return m55887m(array2, length);
    }

    /* renamed from: p */
    public static zzag m55889p() {
        return zzai.f39289g;
    }

    /* renamed from: q */
    public static zzag m55890q(Object obj) {
        Object[] objArr = {obj};
        zzah.m55897a(objArr, 1);
        return m55887m(objArr, 1);
    }

    /* renamed from: t */
    public static zzag m55891t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.m55897a(objArr, 2);
        return m55887m(objArr, 2);
    }

    @DoNotCall
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo48616c(Object[] objArr, int i) {
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
                        if (zzr.m55917a(get(i), list.get(i))) {
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
                            if (!zzr.m55917a(it.next(), it2.next())) {
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

    @InlineMe
    @Deprecated
    /* renamed from: h */
    public final zzag mo48620h() {
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
    public final zzaj mo48621i() {
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
    public zzag subList(int i, int i2) {
        zzs.m55920c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzai.f39289g;
        }
        return new zzaf(this, i, i3);
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

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: u */
    public final zzak listIterator(int i) {
        zzs.m55919b(i, size(), "index");
        if (isEmpty()) {
            return f39288c;
        }
        return new zzae(this, i);
    }
}
