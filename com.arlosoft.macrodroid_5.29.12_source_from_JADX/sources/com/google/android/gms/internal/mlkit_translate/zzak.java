package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzak {
    /* renamed from: a */
    static int m61585a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
