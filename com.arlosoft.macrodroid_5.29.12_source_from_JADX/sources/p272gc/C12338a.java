package p272gc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* renamed from: gc.a */
/* compiled from: collections.kt */
public final class C12338a {
    /* renamed from: a */
    public static final <T> void m83071a(Collection<T> collection, T t) {
        C13706o.m87929f(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    private static final int m83072b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: c */
    public static final <T> List<T> m83073c(ArrayList<T> arrayList) {
        C13706o.m87929f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C13614t.m87748j();
        }
        if (size == 1) {
            return C13612s.m87736e(C13566b0.m87422W(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* renamed from: d */
    public static final <K> Map<K, Integer> m83074d(Iterable<? extends K> iterable) {
        C13706o.m87929f(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m83075e(int i) {
        return new HashMap<>(m83072b(i));
    }

    /* renamed from: f */
    public static final <E> HashSet<E> m83076f(int i) {
        return new HashSet<>(m83072b(i));
    }

    /* renamed from: g */
    public static final <E> LinkedHashSet<E> m83077g(int i) {
        return new LinkedHashSet<>(m83072b(i));
    }
}
