package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzba {
    /* renamed from: a */
    static int m61196a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
