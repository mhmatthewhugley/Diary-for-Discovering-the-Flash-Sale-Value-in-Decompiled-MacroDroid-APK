package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfwe extends zzfxh {
    zzfwe() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map mo46202c();

    public final void clear() {
        mo46202c().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object a = zzfwi.m51186a(mo46202c(), key);
        if (!zzfss.m50929a(a, entry.getValue())) {
            return false;
        }
        if (a != null || mo46202c().containsKey(key)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return mo46202c().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return mo46202c().keySet().remove(((Map.Entry) obj).getKey());
    }

    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return zzfxi.m51245d(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzfxi.m51246e(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzfum.m51030a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return mo46202c().keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo46202c().size();
    }
}
