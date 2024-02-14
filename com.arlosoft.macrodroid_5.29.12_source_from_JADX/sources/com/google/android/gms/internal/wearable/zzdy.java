package com.google.android.gms.internal.wearable;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdy extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ zzea f45716a;

    /* synthetic */ zzdy(zzea zzea, zzdx zzdx) {
        this.f45716a = zzea;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f45716a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f45716a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f45716a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new zzdw(this.f45716a, (zzdv) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f45716a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f45716a.size();
    }
}
