package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfvt {
    /* renamed from: a */
    public static boolean m51171a(Iterable iterable, zzfsy zzfsy) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            Objects.requireNonNull(zzfsy);
            boolean z = false;
            while (it.hasNext()) {
                if (zzfsy.mo45704a(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Objects.requireNonNull(zzfsy);
        return m51173c((List) iterable, zzfsy);
    }

    /* renamed from: b */
    private static void m51172b(List list, zzfsy zzfsy, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfsy.mo45704a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private static boolean m51173c(List list, zzfsy zzfsy) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfsy.mo45704a(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        m51172b(list, zzfsy, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m51172b(list, zzfsy, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
